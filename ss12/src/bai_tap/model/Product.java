package bai_tap.model;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + ", price=" + price + "}";
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.price - o.getPrice());
    }
}
