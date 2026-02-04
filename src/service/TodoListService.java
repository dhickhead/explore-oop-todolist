package service;

import entity.TodoList;

public interface TodoListService {

    public void showTodoList();

    public boolean removeTodoList(Integer number);

    public void addTodoList(String todo);

}
