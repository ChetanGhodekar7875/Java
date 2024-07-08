package Test;

import java.util.Arrays;

public class Main1 {
    static int revNumber = 0;

    public static void main(String[] args) {
        int num = 123;

        System.out.println(revNumber(num));
    }

    public static int revNumber(int num) {
        if (num != 0) {
            int rem = num % 10;
            revNumber = revNumber * 10 + rem;
            num=num/10;
            revNumber(num);
        }
        return revNumber;
    }

}
