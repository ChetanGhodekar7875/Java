package Constructor;

public class Product {
    int productId;
    String productName;
    double productPrice;

    Product(int productId,String productName,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    Product(Product p1){
        productId=p1.productId;
        productName=p1.productName;
        productPrice=p1.productPrice;
    }
    void display(){
        System.out.println("PRODUCT ID "+productId);
        System.out.println("PRODUCT NAME "+productName);
        System.out.println("PRODUCT PRICE "+productPrice);
    }

    public static void main(String[] args) {
        //call by value
        Product p1=new Product(101,"LAPTOP",34999.99);
        //call by reference
        Product p2=new Product(p1);

        p1.display();
        System.out.println("=============================");
        p2.display();
    }
}
