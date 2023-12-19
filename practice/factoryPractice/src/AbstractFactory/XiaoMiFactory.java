package AbstractFactory;

public class XiaoMiFactory extends Factory{
    @Override
    public Phone generatePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public PC generatePC() {
        return new XiaoMiPC();
    }
}
