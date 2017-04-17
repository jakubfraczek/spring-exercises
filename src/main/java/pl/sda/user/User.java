package pl.sda.user;

public class User {
    private String login;
    private String name;
    private String surname;
    private int age;

    public User(){}

    public User(String login, String name, String surname, int age) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
