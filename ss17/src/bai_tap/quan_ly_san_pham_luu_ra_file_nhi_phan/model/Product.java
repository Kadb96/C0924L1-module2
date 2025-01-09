package bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productID;
    private String productName;
    private String price;
    private String factory;
    private String productDescription;

    public Product(int productID, String productName, String price, String factory, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.factory = factory;
        this.productDescription = productDescription;
    }

    public Product() {
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                ", factory='" + factory + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
