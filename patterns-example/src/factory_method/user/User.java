package factory_method.user;

abstract public class User implements IUser{
    @Override
    public void viewNews() {
        System.out.println("View News");
    }

    @Override
    public void liekNews() {
        System.out.println("Like News");
    }

    @Override
    public void login() {
        System.out.println("Login...");
    }
}
