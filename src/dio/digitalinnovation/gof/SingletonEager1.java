package dio.digitalinnovation.gof;
/*
Singleton "apressado"
@author tiihmesquita
 */
public class SingletonEager1 {
    private static SingletonEager1 instancia = new SingletonEager1();

    private SingletonEager1(){
        super();
    }

    public static SingletonEager1 getInstancia(){

        return instancia;
    }
}
