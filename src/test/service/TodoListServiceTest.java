package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        //testShowViewTodoList();
        //testAddTodoList();

        testRemoveTodoList();


    }

    public static void testShowViewTodoList(){

        //TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListRepositoryImpl repo = new TodoListRepositoryImpl();
        repo.data[0] = new TodoList("Belajar Bahasa Java Dasar");
        repo.data[1] = new TodoList("Belajar Bahasa Java OOP");
        repo.data[2] = new TodoList("Belajar Bahasa Java Classes Standard");

        TodoListService todoService = new TodoListServiceImpl(repo);
        todoService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository repo = new TodoListRepositoryImpl();

        TodoListService todoService = new TodoListServiceImpl(repo);
        todoService.addTodoList("Add Beljar bahasa java dasar");
        todoService.addTodoList("Add Beljar bahasa java oop");
        todoService.addTodoList("Add Beljar bahasa java class standard");
        todoService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListService todoService = new TodoListServiceImpl(repo);

        todoService.addTodoList("Add Beljar bahasa java dasar");
        todoService.addTodoList("Add Beljar bahasa java oop");
        todoService.addTodoList("Add Beljar bahasa java class standard");

        todoService.showTodoList();

        todoService.removeTodoList(1);

        todoService.showTodoList();

        todoService.removeTodoList(5);

        todoService.showTodoList();
    }

    public static void testViewTodoList(){

    }
}
