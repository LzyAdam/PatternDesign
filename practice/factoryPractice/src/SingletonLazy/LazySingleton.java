package SingletonLazy;

public class LazySingleton {
    private LazySingleton(){

    }

    private static volatile LazySingleton instance =null;
    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return  instance;
    }

}
