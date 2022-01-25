package seeu.edu.java_project.pojo.input;

public class ProductInput {
    private String name;
    private Integer price;
    private String status;
    private String created_at;

    public ProductInput() {
    }

    public ProductInput(String name, Integer price, String status, String created_at) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.created_at = created_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
}
