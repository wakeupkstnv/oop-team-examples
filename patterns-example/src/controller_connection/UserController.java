package controller_connection;

import java.util.ArrayList;
import java.util.List;

public class UserController<T extends User> {
    protected T currentUser;
    protected List<T> users;

    public UserController(T currentUser) {
        this.currentUser = currentUser;
        this.users = new ArrayList<>();
    }


    public void listUsers() {
        for (T user : users) {
            user.getHello();
        }
    }

}
