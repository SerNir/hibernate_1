import javax.persistence.*;

@Entity
@Table(name="product_list")
public class Product {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name="title")
    private String title;
    @Column(name="price")
    private float price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
