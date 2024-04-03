import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class BookStore {
    private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

class BookStoreGUI extends JFrame {
    private BookStore bookStore;
    private JTextArea bookListTextArea;

    public BookStoreGUI(BookStore bookStore) {
        this.bookStore = bookStore;

        setTitle("Online Book Store");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        bookListTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(bookListTextArea);

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshBookList();
            }
        });

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(refreshButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private void refreshBookList() {
        StringBuilder sb = new StringBuilder();
        for (Book book : bookStore.getBooks()) {
            sb.append(book.getTitle()).append(" by ").append(book.getAuthor()).append(" - $").append(book.getPrice()).append("\n");
        }
        bookListTextArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.addBook(new Book("Title 1", "Author 1", 20.0));
        bookStore.addBook(new Book("Title 2", "Author 2", 15.0));
        SwingUtilities.invokeLater(() -> new BookStoreGUI(bookStore));
    }
}