package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("同一インスタンス");
        } else {
            System.out.println("異なるインスタンス");
        }

        System.out.println("end.");

        Triple alpha = Triple.getInstance("ALPHA");
        Triple alpha2 = Triple.getInstance("ALPHA");

    }
}
