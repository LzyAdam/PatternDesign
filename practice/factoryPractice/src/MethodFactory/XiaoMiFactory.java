package MethodFactory;

public class XiaoMiFactory extends Factory{
    @Override
    public Phone generatePhone() {
        return new XiaoMiPhone();
    }
}
