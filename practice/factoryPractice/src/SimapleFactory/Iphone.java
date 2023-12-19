package SimapleFactory;

public class Iphone implements Phone{
    public Iphone() {
        System.out.println("iphone created");
    }

    @Override
    public void phone() {
        System.out.println("iphone call>>>>>>>");
    }
}
