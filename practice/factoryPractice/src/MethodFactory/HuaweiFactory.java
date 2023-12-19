package MethodFactory;

public class HuaweiFactory extends Factory{
    @Override
    public Phone generatePhone() {
        return new HuaWeiPhone();
    }
}
