package Builder;

import java.util.Locale;

public class Director {
    private Bulider bulider;
    public Director(Bulider bulider){
        this.bulider=bulider;
    }
    public  House dirct(){
        bulider.paintWall();
        bulider.installDoor();
        return  bulider.getHouse();
    }
//    public  void dirct(){
//        bulider.paintWall();
//        bulider.installDoor();
//        return  bulider.getHouse();
//    }
}
