package SingletonEager;

public class HungrySingleton {

    private HungrySingleton(){

    }
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return instance;
    }


}
