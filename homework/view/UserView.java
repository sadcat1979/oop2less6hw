package homework.view;

import homework.model.User;
import homework.service.UserService;

public class UserView {

    private final UserService service = new UserService();

    public void start() {
        User user1 = service.createUser("Bob");
        User user2 = service.createUser("Alice");
        service.saveUser(user1);
        service.reportUser(user2);
        service.reportUser(user1);
    }
}
