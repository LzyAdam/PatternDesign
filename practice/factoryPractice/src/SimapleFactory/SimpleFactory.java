package SimapleFactory;

public class SimpleFactory {
    Phone generatePhone(String phone){
        if("HuaWei".equals(phone)){
            return new HuaWeiPhone();
        } else if ("XiaoMi".equals(phone)) {
            return new XioaMiPhone();
        } else if ("Iphone".equals(phone)) {
            return new Iphone();
        }
        return null;
    }
}
