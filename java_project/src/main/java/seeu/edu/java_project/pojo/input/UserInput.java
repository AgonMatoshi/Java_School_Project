package seeu.edu.java_project.pojo.input;

public class UserInput {
    private Integer id;
    private String full_name;
    private String email;
    private String password;
    private String date_of_birth;
    private String created_at;
    private String gender;

    public UserInput() {
    }

    public UserInput(Integer id) {
        this.id = id;
    }

    public UserInput(String full_name, String email, String password, String date_of_birth, String created_at, String gender) {
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.date_of_birth = date_of_birth;
        this.created_at = created_at;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
