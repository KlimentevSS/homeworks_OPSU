package N3;

import java.util.ArrayList;

public class ObjMass {
    static User[] mas =new User[999];
}
class User{
    String login;
    String password;
    ArrayList<Integer> basket;

    public User (String login, String password, ArrayList<Integer> basket){
        this.login=login;
        this.password=password;
        this.basket=basket;
    }
}
