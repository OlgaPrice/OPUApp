package opunivrapp;

import java.util.List;
import java.util.Scanner;

public class Welcome {
    private void printWelcomeMessage() {
        System.out.println("        Welcome to OPUnivercity!");
        System.out.println();
    }

    private void singUp() {
        Admin.addAdmin(new Admin("Ivan", "Sidorov"));
        Admin.printAdmins();

        System.out.println();
        System.out.println("Enter 'Q' for quit OR");
        System.out.println();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = in.nextLine();

        if (input.equals("Q") || input.equals("q")) {
            System.out.println("Goodbye");
            System.exit(0);
        }

        String userName = input;

        System.out.print("Enter password: ");
        input = in.nextLine();
        if (input.equals("Q") || input.equals("q")) {
            System.out.println("Goodbye");
            System.exit(0);
        }
        String password = input;

        checkCredentials(userName, password);
    }

    private void checkCredentials(String userName, String password) {
        List<Admin> adminsList = Admin.getAdmins();
        for (Admin admin : adminsList) {
            if (admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {
                System.out.println("Welcome, " + admin.getFirsName() + " " + admin.getLastName() + "!");
                admin.runAdmin();
            } else {
                System.out.println("");
                System.out.println("Goodbye");
                System.exit(0);
            }
        }
    }

    public void runOPUApp() {
        printWelcomeMessage();
        singUp();
    }
}
