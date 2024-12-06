package factory_method.user;

public class UserFactory {
    public User getUser(UserType userType){
        if (userType.equals(UserType.TEACHER))
            return new Teacher();
        if (userType.equals(UserType.EMPLOYEE)){
            return new Employee();
        }
        return null;
    }
}
