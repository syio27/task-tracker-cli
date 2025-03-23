package main.service;

import main.domain.Status;

public interface TaskService {

    void list();
    void listByStatus(Status status);
    void add(String description);
    void update(Long id, String description);
    void delete(Long id);
    void mark(Status status);
}
