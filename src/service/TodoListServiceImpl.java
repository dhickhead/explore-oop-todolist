package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{
    private TodoListRepository repo;

    public TodoListServiceImpl (TodoListRepository todoListRepository){
        this.repo = todoListRepository;
    }

    @Override
    public void showTodoList() {
        System.out.println("TODOLIST");
        TodoList[] model = repo.getAll();
        for (var i=0; i<model.length; i++){
            var todo = model[i];
            var no = i+1;

            if (todo != null){
                System.out.println(no+". "+todo.getTodo());
            }
        }
    }

    @Override
    public boolean removeTodoList(Integer number) {
        boolean result =  repo.remove(number);

        if (result){
            System.out.println("Berhasil menghapus TODO: "+ number);
        }else{
            System.out.println("GAGAL menghapus TODO: "+ number);
        }

        return result;

    }

    @Override
    public void addTodoList(String  todo) {
        TodoList newTodo = new TodoList(todo);
        repo.add(newTodo);

    }
}
