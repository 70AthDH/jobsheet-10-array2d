import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String name, choice;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    while (true) {
                        System.out.print("Enter row (1-" + audience.length + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter column (1-" + audience[0].length + "): ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length || col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Warning: Seat (" + row + ", " + col + ") is already taken by " + audience[row - 1][col - 1] + ". Please choose another seat.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    choice = sc.nextLine();

                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.print(seat + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}