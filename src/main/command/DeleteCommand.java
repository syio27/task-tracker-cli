package main.command;

import main.service.TaskService;

public class DeleteCommand implements Command {

    private final CommandContext context;
    private final TaskService service;

    public DeleteCommand(CommandContext context, TaskService service) {
        this.context = context;
        this.service = service;
    }

    @Override
    public void execute() {

    }
}
