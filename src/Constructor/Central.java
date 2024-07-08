package Constructor;

public class Central {
    Central(){
        this('A');
        System.out.println("1");
    }
    Central(int a){
        this(3.14);
        System.out.println("2");
    }
    Central(char ch){
        this(10);
        System.out.println("3");
    }
    Central(double d){
        System.out.println("4");
    }
    public static void main(String[] args) {
        Central c1=new Central();
    }
}
