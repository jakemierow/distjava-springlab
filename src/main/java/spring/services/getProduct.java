package spring.services;

public class getProduct implements ProductService {

    @Override
    public String getProduct(String ProductName) {
        return ProductName;
    }
}
