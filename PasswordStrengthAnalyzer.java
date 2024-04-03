import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PasswordStrengthAnalyzer extends JFrame {

    private JPasswordField passwordField;
    private JLabel strengthLabel;

    public PasswordStrengthAnalyzer() {
        setTitle("Password Strength Analyzer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);

        JLabel passwordLabel = new JLabel("Enter Password:");
        passwordField = new JPasswordField(20);
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        JButton analyzeButton = new JButton("Analyze");
        JButton forgotPasswordButton = new JButton("Forgot Password");
        strengthLabel = new JLabel("Password Strength: ");

        setLayout(new GridLayout(6, 1));

        add(passwordLabel);
        add(passwordField);
        add(showPasswordCheckBox);
        add(analyzeButton);
        add(forgotPasswordButton);
        add(strengthLabel);

        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                analyzePasswordStrength();
            }
        });

        showPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                togglePasswordVisibility();
            }
        });

        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PasswordStrengthAnalyzer.this,
                        "Please contact support for assistance.");
            }
        });
    }

    private void analyzePasswordStrength() {
        String password = new String(passwordField.getPassword());
        int strength = calculatePasswordStrength(password);

        String strengthText;
        if (strength >= 70) {
            strengthText = "Strong";
        } else if (strength >= 40) {
            strengthText = "Moderate";
        } else if (strength >= 10) {
            strengthText = "Weak";
        } else {
            strengthText = "Enter The Password";
        }

        strengthLabel.setText("Password Strength: " + strengthText);
    }

    private int calculatePasswordStrength(String password) {
        int length = password.length();
        int complexity = 0;

        if (length >= 8) {
            complexity += 30;
        } else if (length >= 5) {
            complexity += 10;
        }

        if (password.matches(".*[a-zA-Z].*")) {
            complexity += 20;
        }
        if (password.matches(".*\\d.*")) {
            complexity += 20;
        }

        return complexity;
    }

    private void togglePasswordVisibility() {
        if (passwordField.getEchoChar() == '*') {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordStrengthAnalyzer().setVisible(true);
            }
        });
    }
}
