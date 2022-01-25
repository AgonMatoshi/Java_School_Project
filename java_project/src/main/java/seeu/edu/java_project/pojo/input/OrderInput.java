package seeu.edu.java_project.pojo.input;

import seeu.edu.java_project.pojo.entity.User;

public class OrderInput {
    private Integer id;
    private String status;
    private String created_at;
    private User user;

    public OrderInput() {
    }

    public OrderInput(Integer id, String status, String created_at, User user) {
        this.id = id;
        this.status = status;
        this.created_at = created_at;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
