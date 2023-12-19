package SimapleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.generatePhone("Iphone").phone();
        new SimpleFactory().generatePhone("HuaWei").phone();

        System.out.println("Hello world!");
    }
}