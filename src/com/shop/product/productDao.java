package com.shop.product;
import java.util.*;

public class productDao {
    ArrayList<productController> productList = new ArrayList<>(); // mock databse

    public void addProduct(productController product){
        productList.add(product);
    }

    public void deleteProduct(productController product, String name){
        if(name == product.getName()){
            productList.remove(product);
        }
    }

    public void display(){
        for(int i = 0; i<productList.size(); i++){
            System.out.println(productList.get(i).getName());
            System.out.println(productList.get(i).getPrice());
        }
    }

    
}
