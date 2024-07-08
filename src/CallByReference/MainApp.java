package CallByReference;

public class MainApp {
    public static void main(String[] args) {
        Product p=new Product();
        p.qty = 10;
        p.productName="MOBILE";

        p.demo("LAPTOP",34999.99,50);
        System.out.println("=========================");
        p.purchaseProduct(p);
    }

}
