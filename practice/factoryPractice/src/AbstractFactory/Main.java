package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory f1 =new XiaoMiFactory();
        Factory f2 =new HuaWeiFactory();
        System.out.println("8888888888888888888888");
        PC huaweiPc = f2.generatePC();
        huaweiPc.music();
        f1.generatePC().music();
        System.out.println("8888888888888888888888");
        System.out.println("9999999999999999999");
        Phone xiaomi = f1.generatePhone();
        xiaomi.call();
        f2.generatePhone().call();

    }
}
