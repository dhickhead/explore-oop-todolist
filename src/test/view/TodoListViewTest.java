package test.view;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        //testTodoListView();
        //testAddTodoListView();
        testRemoveTodoListView();
    }

    public static void testTodoListView(){
        TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repo);
        TodoListView view = new TodoListView(service);

        service.addTodoList("Hayu Belajar Java");
        service.addTodoList("Hayu Belajar Ngoding");
        service.addTodoList("Hayu Belajar Modol");

        view.viewTodoList();

    }

    public static void testAddTodoListView (){
        TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repo);
        TodoListView view = new TodoListView(service);

        view.addTodoList();
       service.showTodoList();
        view.addTodoList();
        service.showTodoList();
    }

    public static void testRemoveTodoListView(){
        TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repo);
        TodoListView view = new TodoListView(service);
        view.addTodoList();
        view.addTodoList();
        view.addTodoList();
        view.addTodoList();
        view.removeTodoList();
        service.showTodoList();
    }
}
