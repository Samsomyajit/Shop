package com.shop.product;
import java.util.*;

public class productIo {
    static productDao list = new productDao();
    static productController product = new productController();
    
    public void createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name:");
        String str = sc.nextLine();
        product.setName(str);
        System.out.println("Enter Product Price:");
        int price = sc.nextInt();
        product.setPrice(price);
        list.addProduct(product);
    }

    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name for Removal:");
        String name = sc.nextLine();
        list.deleteProduct(product, name);
    }

    public void list(){
        list.display();
    }
    
}
