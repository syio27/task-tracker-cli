package main.command;

public class CommandContext {

    private final String taskId;
    private final String taskDescription;
    private final String taskStatus;

    public CommandContext(String taskId, String taskName, String taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskName;
        this.taskStatus = taskStatus;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }
}
