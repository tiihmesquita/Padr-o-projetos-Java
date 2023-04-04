import dio.digitalinnovation.gof.SingletonEager1;
import dio.digitalinnovation.gof.SingletonLazy;

public class Main {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager1 eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);
        eager1 = SingletonEager1.getInstancia();
        System.out.println(eager1);
    }
}