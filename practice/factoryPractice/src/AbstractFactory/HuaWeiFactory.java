package AbstractFactory;

public class HuaWeiFactory extends Factory{
    @Override
    public Phone generatePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public PC generatePC() {
        return new HuaWeiPC();
    }
}
