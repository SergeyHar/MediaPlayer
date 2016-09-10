package am.ACA.model.bean;


import am.ACA.model.Util.Validate;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String password;

    public User() {
    }

    public User(int id, String name, String lastName, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = Validate.md5(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validate.md5(password);
    }

}