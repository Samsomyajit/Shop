package build;
import java.util.Scanner;

import com.shop.product.*;

public class App {
    public static void main(String args []) {
        boolean condition = true;
        productIo item  = new productIo();
        while(condition == true){
            System.out.println("Press Number \n 1. Create Product \n 2. Delete Product \n 3. Display Product List \n 4. Exit \n Choice:");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch(option){
                case 1:
                    item.createProduct();
                    break;

                case 2:
                    item.removeProduct();
                    break;

                case 3:
                    item.list();
                    break;

                case 4:
                    condition = false;
                    break;

                default:
                    System.out.println("Wrong Choice");

            
            }
        }
        
    }
    
}
