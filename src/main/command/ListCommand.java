package main.command;

import main.service.TaskService;

public class ListCommand implements Command {

    private final CommandContext context;
    private final TaskService service;

    public ListCommand(CommandContext context, TaskService service) {
        this.context = context;
        this.service = service;
    }

    @Override
    public void execute() {

    }
}
