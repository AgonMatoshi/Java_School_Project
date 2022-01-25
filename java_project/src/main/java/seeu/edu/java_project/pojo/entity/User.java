package seeu.edu.java_project.pojo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private String date_of_birth;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "gender")
    private String gender;

   @OneToMany(mappedBy = "user")
   private List<Order> orders;

    public User() {
    }

    public User(Integer id, String full_name, String email, String password, String date_of_birth, String created_at, String gender) {
        this.id = id;
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

//    public List<Order> getOrders() {
//        return orders;
//    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
