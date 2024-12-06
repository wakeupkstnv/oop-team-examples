package singleton.uni_database;

public class Database {
    private static Database databaseInstance;

    public static Database getInstanceOfDatabse(){
        if (Database.databaseInstance == null)
            return new Database();
        return new Database();
    }

    private Database(){

    }

    public void getCourses(){
        // some method
    }

    // some methods...
}
