import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while (true) {
            System.out.println("\n===ToDO LIST===");
            System.out.println("1. ADD TASK");
            System.out.println("2. REMOVE TASK");
            System.out.println("3. SET Done TASK");
            System.out.println("4. SHOW TASKS");
            System.out.println("0. OFF");
            System.out.print("ENTER YOUR OPTION: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("ADD TASK");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.println("REMOVE TASK");
                    manager.showTasks();
                    int removeIndex = scanner.nextInt();
                    manager.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.println("SET DONE TASK");
                    manager.showTasks();
                    int doneIndex = scanner.nextInt();
                    manager.setTaskCompleted(doneIndex);
                    break;
                case 4:
                    manager.showTasks();
                    break;
                case 0:
                    System.out.println("OFF");
                    scanner.close();
                    return;
                default:
                    System.out.println("INVALID OPTION");
            }
        }
    }
}
