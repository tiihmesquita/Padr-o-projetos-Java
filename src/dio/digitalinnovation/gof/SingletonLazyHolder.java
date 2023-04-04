package dio.digitalinnovation.gof;
/**
*Singleton "apressado"
*@author tiihmesquita
 **/
public class SingletonLazyHolder {
    private static class Holder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){

        return Holder.instancia;
    }
}
