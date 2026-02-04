import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListApplication2 {
    public static void main(String[] args) {
        TodoListRepository repo = new TodoListRepositoryImpl();
        TodoListService service = new TodoListServiceImpl(repo);
        TodoListView view = new TodoListView(service);

        view.viewTodoList();
    }
}
