import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final List<ToDo> todoList;

    public Manager() {
        this.todoList = new ArrayList<>();
    }

    public void addTask(String task) {
        todoList.add(new ToDo(task));
        System.out.println("Added Task: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Removed Task: " + index);
        } else {
            System.out.println("No Task found");
        }
    }

    public void setTaskCompleted(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.get(index).setAsDone();
            System.out.println("Task Completed");
        } else {
            System.out.println("No Task found");
        }
    }

    public void showTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No Task found");
        } else {
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println(i + ". " + todoList.get(i));
            }
        }
    }
}
