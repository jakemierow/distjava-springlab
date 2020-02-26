package spring.beans;

import spring.services.ProductService;

public class Product {
    private static String productName;
    private int productID;
    private ProductDetail detail;
    private spring.services.ProductService ProductService;

    public Product() {

    }

    public Product(ProductService ProductService)
    {
        this.ProductService = ProductService;
    }

    public void setProductService(spring.services.ProductService productService) {
        ProductService = productService;
    }

    public ProductDetail getDetail() {
        return detail;
    }

    public void setDetail(ProductDetail detail) {
        this.detail = detail;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public static String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProduct(String product) {
    }
}