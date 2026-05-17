import java.util.*;
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}
public class LibrarySystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        books.add(new Book(title));
        System.out.println("Book added successfully!");
    }

    static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    static void searchBook() {
        System.out.print("Enter title to search: ");
        String search = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(search)) {
                System.out.println("Book found!");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void removeBook() {
        System.out.print("Enter title to remove: ");
        String remove = sc.nextLine();
        Iterator<Book> it = books.iterator();

        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equalsIgnoreCase(remove)) {
                it.remove();
                System.out.println("Book removed!");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addBook(); break;
                case 2: displayBooks(); break;
                case 3: searchBook(); break;
                case 4: removeBook(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
