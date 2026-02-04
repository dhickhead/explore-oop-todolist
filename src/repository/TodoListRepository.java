package repository;

import entity.TodoList;

public interface TodoListRepository {

    public TodoList[] getAll();
    public void add (TodoList todo);
    public  boolean remove(int number);
}
