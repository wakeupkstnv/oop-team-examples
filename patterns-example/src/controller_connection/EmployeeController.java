package controller_connection;

public class EmployeeController<T extends Employee> extends UserController<T> {

    public EmployeeController(T currentUser) {
        super(currentUser);
    }

    public void getVoice(){
        currentUser.getHello();
    }

    public void sayUhh(){
        currentUser.getEhh();
    }

}
