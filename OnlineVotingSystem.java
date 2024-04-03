import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class OnlineVotingSystem extends JFrame implements ActionListener {
    private Map<String, Integer> candidateVotes;
    private JLabel titleLabel;
    private Map<String, JTextField> candidateTextFields;
    private JButton voteButton;
    private JTextArea resultArea;

    public OnlineVotingSystem() {
        setTitle("Online Voting System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        candidateVotes = new HashMap<>();
        candidateVotes.put("Ganesh", 0);
        candidateVotes.put("Vinay", 0);
        candidateVotes.put("Abbu", 0);

        titleLabel = new JLabel("Enter votes for each candidate:");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        JPanel candidatesPanel = new JPanel(new GridLayout(0, 2));
        candidateTextFields = new HashMap<>();
        for (String candidate : candidateVotes.keySet()) {
            JLabel candidateLabel = new JLabel(candidate + ":");
            JTextField votesTextField = new JTextField(5);
            candidatesPanel.add(candidateLabel);
            candidatesPanel.add(votesTextField);
            candidateTextFields.put(candidate, votesTextField);
        }
        add(candidatesPanel, BorderLayout.CENTER);

        voteButton = new JButton("Vote");
        voteButton.addActionListener(this);
        add(voteButton, BorderLayout.EAST);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Map.Entry<String, JTextField> entry : candidateTextFields.entrySet()) {
            String candidate = entry.getKey();
            JTextField textField = entry.getValue();
            try {
                int votes = Integer.parseInt(textField.getText());
                candidateVotes.put(candidate, votes);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for " + candidate + ". Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        updateResults();
    }

    private void updateResults() {
        resultArea.setText("Voting Results:\n");
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            resultArea.append(entry.getKey() + ": " + entry.getValue() + " votes\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(OnlineVotingSystem::new);
    }
}
