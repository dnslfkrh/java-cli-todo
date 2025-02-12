public class ToDo {
    private String task;
    private boolean isDone;

    public ToDo(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setAsDone() {
        this.isDone = true;
    }

    public void setAsPending() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return (isDone ? "DONE" : "PENDING") + ": " + task;
    }
}
