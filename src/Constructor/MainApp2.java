package Constructor;

public class MainApp2 {
    int plusOne;
    void plusONe(){
        plusOne++;
    }
    public static void main(String[] args) {
        MainApp2 m1=new MainApp2();
        MainApp2 m2=new MainApp2();

        m1.plusONe();
        m2.plusONe();

        System.out.println(m1.plusOne+m2.plusOne);
    }
}
