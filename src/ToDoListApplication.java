import java.util.Scanner;

public class ToDoListApplication {
    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        viewShowTodoList();
    }

    /**
     * method untuk show todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i=0; i<model.length; i++){
            var todo = model[i];
            var no = i+1;

            if (todo != null){
                System.out.println(no+". "+todo);
            }
        }
    }

    /**
     * method untuk test showTodoList
     */
    public static void testShowTodoList(){
        model[0] = "Belajar Matematika";
        model[1] = "Belajar Bahasa Indonesia";
        showTodoList();
    }


    /**
     *  method untuk add to do list
     */
    public static void addTodoList(String todo){

        boolean isFull = false;
        for (var i=0; i<model.length; i++){
            if (model[i] != null){
               // list penuh
                isFull = true;
            }

        }

        if (isFull){
            String[] temp = model;
            model = new String[model.length*2];
            for (var i=0; i<temp.length; i++) {
                model[i] = temp[i];

            }
        }

        // menambahkan todo list
        for (var i=0; i<model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }

        }

    }


    public static void testAddTodoList(){
        for (var i =0; i<25; i++ ){
            addTodoList(    "contoh to do list ke "+i);
        }

        showTodoList();


    }

    /**
     * delete to do list
     */
    public static boolean  deleteTodoList(Integer number){
        if ((number -1) > model.length){
            return false;
        }else if (model[number-1] == null){
            return false;
        }else {
            for (var i = (number-1) ; i< model.length;i++){
                if (i == (model.length-1)){
                    model[i] = null;
                }else{
                    model [i] = model[i+1];
                }
            }
            return true;
        }

    }

    /**
     * delete to do list
     */
    public static void  testDeleteTodoList(){
        addTodoList(    "todoList 1");
        addTodoList(    "todoList 2");
        addTodoList(    "todoList 3");
        var result = deleteTodoList(1);
        System.out.println(result);

        result = deleteTodoList(4);
        System.out.println(result);

        showTodoList();

    }

    public static String  input( String info){
        System.out.print(info+": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    public static void viewShowTodoList(){
        while(true){
            showTodoList();
            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            var input = input("Pilih");
            
            if (input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewDeleteTodoList();
            }else if(input.equals("x")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        viewShowTodoList();

    }
    public static void viewAddTodoList(){
        System.out.println("Menambahkan TODOLIST");
        var todo = input("Todo (x jika batal)");
        if (todo.equals("x")){
            //batal
        }else{
            addTodoList(todo);
        }

    }
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
       viewAddTodoList();
       showTodoList();

    }
    public static void viewDeleteTodoList(){
        System.out.println("Menghapus TODOLIST");
        var number = input("Nomor yang Dihapus: ");
        if (number.equals("x")){
            //batal
        }else{
            boolean success = deleteTodoList(Integer.valueOf(number));
            if (success){
                System.out.println("berhasil menghapus todolist: "+number);
            }else{
                System.out.println("gagal menghapus todolist: "+number);
            }
        }

    }

    public static void testViewDeleteTodoList(){
        addTodoList("Satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");

        showTodoList();
        viewDeleteTodoList();
        showTodoList();

    }
}