package first_module12;

public class UserBeanImp implements UserBean{
    User[] users;

    public UserBeanImp() {
    }

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if(name.equals(users[i].getName())){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }

    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if(surname.equals(users[i].getSurname())){
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }
}
