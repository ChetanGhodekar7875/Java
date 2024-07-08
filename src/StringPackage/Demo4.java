package StringPackage;

public class Demo4 {
    // SWAPPING OF TWO STRING WITHOUT THIRD VARIABLE
    public static void main(String[] args) {
        String firstName="SACHIN";
        String lastName="TENDULKAR";
        System.out.println("BEFORE SWAPPING");
        System.out.println("FIRST NAME "+firstName);
        System.out.println("LAST NAME "+lastName);

        firstName=firstName+lastName;
        lastName=firstName.substring(0,firstName.length()-lastName.length());
        firstName=firstName.substring(lastName.length());

        System.out.println("AFTER SWAPPING");
        System.out.println("FIRST NAME "+firstName);
        System.out.println("LAST NAME "+lastName);

    }
}
