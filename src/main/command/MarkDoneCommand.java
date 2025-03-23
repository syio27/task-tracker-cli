package main.command;

import main.service.TaskService;

public class MarkDoneCommand implements Command {

    private final CommandContext context;
    private final TaskService service;

    public MarkDoneCommand(CommandContext context, TaskService service) {
        this.context = context;
        this.service = service;
    }

    @Override
    public void execute() {

    }
}
