package Constructor;

public class MainApp {
    int num=0;
    MainApp(int num){
      this.num=num;
    }
    void test(){
        System.out.println("THIS "+this);
    }
    public static void main(String[] args) {
        MainApp m1=new MainApp(10);
        m1.test();
        System.out.println(m1.num);
    }
}
