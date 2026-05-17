import java.util.*;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dummy credentials
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("user", "pass");

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid username or password!");
        }

        sc.close();
    }
}
