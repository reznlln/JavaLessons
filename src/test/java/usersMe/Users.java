package usersMe;

public class Users {
    private String name;
    private String about;

    public Users(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
