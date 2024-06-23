package homework.service;

import homework.model.User;
import java.util.ArrayList;
import java.util.List;

public class Persister{
    //наверное, это имитация работы DB
    //Тогда конструктор вроде как не нужен, а аргумент передаём в метод
    private static final List<User> usersDB = new ArrayList<>();

    public int saveUser(User user){
        int id = usersDB.size();
        usersDB.add(user);
        System.out.println("Saved user: " + user + " assigned id="+id);
        return id;
    }

    public int findUser(User user){
        return usersDB.indexOf(user);
    }
}
