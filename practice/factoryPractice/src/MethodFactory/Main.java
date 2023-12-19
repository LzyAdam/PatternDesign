package MethodFactory;

public class Main {
    public static void main(String[] args) {
        Factory hwfactory= new HuaweiFactory();
        Factory xmfactory= new XiaoMiFactory();
        hwfactory.generatePhone().call();
        Phone xiaomiphone = xmfactory.generatePhone();
        xiaomiphone.call();


    }
}
