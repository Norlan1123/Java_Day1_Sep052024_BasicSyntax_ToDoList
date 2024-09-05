//Project Overview
//Create a console-based To-Do List application that allows users to add, view, and remove tasks. This project will help you practice using variables, data types, control structures (if statements, loops), and basic object-oriented programming concepts.

//Features
//1. Add a Task: Users can input a new task.
//2. View Tasks: Users can see all the current tasks in the list.
//3. Remove a Task: Users can delete a specific task by its number.
//4. Exit the Application: Users can exit the application gracefully.

//Before building this To-Do List application, here are the basic syntax a java developer needs to know:
//BASIC SYNTAX IN JAVA
//1. Variables and Data Types:
//Variables are used to store data, and each variable has a specific data type.
//Common data types include:
//a) int: for integers (e.g., int age = 25;)
//b) double: for decimal numbers (e.g., double price = 19.99;)
//c) String: for text (e.g., String name = "John";)
//d) boolean: for true/false values (e.g., boolean isActive = true;)

//2. Control Structures:
//If Statements: Used for decision-making
//EXAMPLE:
//if (age >= 18) {
//    System.out.println("You are an adult.");
//} else {
//    System.out.println("You are not an adult.");
//}

//Switch Statements: A way to handle multiple conditions based on the value of a variable.
//EXAMPLE:
// switch (choice) {
//    case 1:
//        // Option 1 code
//        break;
//    case 2:
//        // Option 2 code
//        break;
//    default:
//        // Default code
//}

//3. Loops:
//Loops allow you to execute a block of code repeatedly.
//For Loop: Typically used when the number of iterations is known.
//EXAMPLE:
//for (int i = 0; i < 5; i++) {
//    System.out.println("Iteration: " + i);
//}

//While Loop: Used when the number of iterations is not known
//EXAMPLE:
//int i = 0;
//while (i < 5) {
//    System.out.println("Iteration: " + i);
//    i++;
//}

//4. Methods:
//Methods are blocks of code that perform a specific task and can be reused.
//EXAMPLE:
//public static void greet() {
//    System.out.println("Hello!");
//}

//5. Input and Output
//Use System.out.println() for output.
//Use Scanner class for input.
//EXAMPLE:
//Scanner scanner = new Scanner(System.in);
//System.out.print("Enter your name: ");
//String name = scanner.nextLine();

//Project: To-Do-List App starts here...
//BREAKDOWN OF THE CODE WITH EXPLANATIONS:
//1. Import Statements:
import java.util.ArrayList;
import java.util.Scanner;
//Purpose: These lines import the ArrayList and Scanner classes.
//ArrayList: A resizable array that can hold a list of tasks.
//Scanner: A utility for reading user input from the console.
//2. Main Class Declaration:
public class ToDoListApp {
    //Purpose: Declares the ToDoList class, which contains our main method and application logic.
//3. Main Method:
    public static void main(String[] args) {
//4. Variables and Data Types:
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
//tasks: An ArrayList to store the list of tasks. It uses the String data type for task descriptions.
//scanner: An instance of Scanner for reading input from the user.
//running: A boolean flag to control the loop, indicating whether the application should continue running.
//5. While Loop for Menu
        while (running) {
//Purpose: This loop continues until the user chooses to exit the application by setting running to false.
//6. Displaying the Menu
            System.out.println("Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
//Purpose: These lines print the menu options to the console for the user to choose from.
//7. Reading User Input:
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
//Purpose: scanner.nextInt() reads the user’s choice as an integer.
//scanner.nextLine(): This line consumes the newline character left by nextInt() to prevent issues when reading subsequent string input.
//8. Control Structures: Switch Statement
            switch (choice) {
//Purpose: This switch statement evaluates the user's input and directs the program flow based on the selected option.
//Case 1: Add Task:
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
//Purpose: Prompts the user to enter a task, adds it to the tasks list, and confirms the addition.
//Case 2: View Tasks:
                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
//Purpose: Displays the list of current tasks. The for loop iterates through the tasks list, printing each task with its corresponding index.
//Case 3: Remove Task:
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
//Purpose: Prompts the user to enter a task number to remove. It checks if the number is valid and removes the task from the list if it is.
//Case 4: Exit:
                case 4:
                    running = false;
                    break;
//Purpose: Sets running to false, which exits the while loop and ends the application.
//Default Case:
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
//9. Closing the Scanner
        scanner.close();
        System.out.println("Goodbye!");
//Purpose: Closes the Scanner to free resources and prints a goodbye message when exiting the application.
    }
}
//Summary:
//This To-Do List application covers basic syntax and programming concepts in Java, including:
//* Variables and Data Types: Managing task data using an ArrayList.
//* Control Structures: Using loops and switch statements for program flow.
//* Methods and Input/Output: Reading user input and displaying information to the console.