package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Product;

public class SpringApp
{
public static void main(String[] args)
{
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Product product = context.getBean("products", Product.class);

    System.out.println(Product.getProductName());

    context.close();


}



}
