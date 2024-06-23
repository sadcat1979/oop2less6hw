package homework.service;

import homework.model.User;

public class UserService {

    private final Persister persister = new Persister();

    public User createUser(String name) {
        return new User(name);
    }

    public int saveUser(User user) {
        return persister.saveUser(user);
    }

    public boolean isUserPersisted(User user) {
        return persister.findUser(user) >= 0;
    }

    public void reportUser(User user) {
        String res = "Report for user: " + user + " ";
        if (isUserPersisted(user)) {
            res += "сохранён";
        } else {
            res += "не сохранён";
        }
        System.out.println(res);
    }
}
