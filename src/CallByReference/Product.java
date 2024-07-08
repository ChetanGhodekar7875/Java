package CallByReference;

public class Product {
    String productName;
    final double perUnitPrice=24999.99;
    int qty;

    void demo(String pName,double price,int qty){
        System.out.println("CALL BY VALUE");
        System.out.println("PRODUCT NAME IS "+pName);
        System.out.println("PRODUCT PRICE IS "+price);
        System.out.println("PRODUCT QTY IS "+qty);
    }

    void purchaseProduct(Product p){
        System.out.println("CALL BY REFERENCE");
        System.out.println("PRODUCT NAME IS "+p.productName);
        System.out.println("PRODUCT QTY IS "+p.qty);
        System.out.println("PRODUCT FINAL PRICE IS "+(p.qty*p.perUnitPrice));
    }

}
