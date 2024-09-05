import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp2_NoComments {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}