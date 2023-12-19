package Builder;

public class Abuilder implements Bulider{
    private House house=new House();
    //private House house;



    @Override
    public void paintWall() {
        house.setWall("green");
    }

    @Override
    public void installDoor() {
        house.setDoor(new Door("Red","wood"));
    }

    public House getHouse() {
        return house;
    }
}
