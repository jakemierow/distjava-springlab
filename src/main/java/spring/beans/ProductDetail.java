package spring.beans;

public class ProductDetail {
    private int CategoryID;
    private int Price;
    private spring.services.ProductService ProductService;

    public ProductDetail() {

    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
