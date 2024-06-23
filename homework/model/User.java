package homework.model;

public class User{
    //Одно поле, методов нет кроме геттера, запихал в model
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override //Пусть отображается красиво сразу, чтобы без getName()
    public String toString() {
        return "пользователь "+name;
    }
}
