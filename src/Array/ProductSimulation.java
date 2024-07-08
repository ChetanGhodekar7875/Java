package Array;

public class ProductSimulation {
    static String[] productName={"CAMERA","MOBILE","LAPTOP","MOUSE"};
    static double[] productPrice={24999.99,39999.99,45999.99,1999.99};
    static int[] productQty={10,15,20,18,10};
    static String pName;
    static double pPerUnitPrice;
    static int pQty;
    static  int num=0;
    public static void displayProduct() {
        System.out.println("NAME\tPRICE\tQTY");
        for(int i=0;i<productName.length;i++){
            System.out.println(productName[i]+"\t"+productPrice[i]+"\t"+productQty[i]);
        }
    }

    public static void purchaseProduct(String name, int qty) {
        String str="abc";
        boolean status=false;
        for(int i=0;i<productName.length;i++){
            if(productName[i].equals(name) && (productQty[i]>=qty)) {

                productQty[i]=productQty[i]-qty;
                pName=productName[i];
                pPerUnitPrice=productPrice[i];
                pQty=qty;
                status=true;
            }
        }
        if(status==true){
            System.out.println("PRODUCT PURCHASE SUCCESSFULLY");
            num=1;
        }else {
            System.out.println("INVALID PRODUCT OR QTY");
        }
    }

    public static void displayBill() {
        if(num!=0) {
            System.out.println("PRODUCT NAME " + pName);
            System.out.println("PRODUCT PER UNIT PRICE " + pPerUnitPrice);
            System.out.println("QUANTITY " + pQty);
            System.out.println("TOTAL AMOUNT IS " + (pPerUnitPrice * pQty));
            double gst = (pPerUnitPrice * pQty) * 0.18;
            System.out.println("GST AMOUNT IS " + gst);
            System.out.println("PAYABLE AMOUNT IS " + ((pPerUnitPrice * pQty) + gst));
        }else {
            System.out.println("PRODUCT IS NOT PURCHASE YET!");
        }
    }
}
