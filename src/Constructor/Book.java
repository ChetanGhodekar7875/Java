package Constructor;

public class Book {
    String bookName;
    double bookPrice;
    Book(String name,double price){
        bookName=name;
        bookPrice=price;
    }
    void display(){
        System.out.println("BOOK NAME IS "+bookName);
        System.out.println("BOOK PRICE IS "+bookPrice);
    }
    public static void main(String[] args) {

        Book b1=new Book("JAVA",899.99);//USER DEFINED CONSTRUCTOR
        b1.display();
    }
}
