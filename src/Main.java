import java.util.Scanner;

public class Main {

    public static ReceiptManager receiptManager = new ReceiptManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Add new receipt");
            System.out.println("2. Get total money by client id");
            System.out.println("3. Display all");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter number of receipt you want to add");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        addNewReceipt();
                    }
                    break;
                case 2:
                    System.out.println("Enter client id");
                    int clientId = Integer.parseInt(scanner.nextLine());
                    int result = receiptManager.getTotalMoneyById(clientId);
                    System.out.println(result);
                    break;
                case 3:
                    receiptManager.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);

    }

    public static void addNewReceipt() {

        System.out.println("Enter customer 's name");
        String name = scanner.nextLine();
        System.out.println("Enter house id");
        int houseNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter client id");
        int clientId = Integer.parseInt(scanner.nextLine());

        int oldIndex;
        do {
            System.out.println("Enter old index");
            oldIndex = Integer.parseInt(scanner.nextLine());
        } while (oldIndex < 0);

        int newIndex;
        do {
            System.out.println("Enter new index");
            newIndex = Integer.parseInt(scanner.nextLine());
        } while (oldIndex > newIndex);

        Customer customer = new Customer(name, houseNumber, clientId);
        Receipt receipt = new Receipt(customer, oldIndex, newIndex);
        receiptManager.addNewReceipt(receipt);
    }
}
