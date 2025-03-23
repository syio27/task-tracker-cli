package main.domain;

public enum Status {
    IN_PROGRESS("in-progress"),
    TODO("todo"),
    DONE("done");

    private final String text;

    Status(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
