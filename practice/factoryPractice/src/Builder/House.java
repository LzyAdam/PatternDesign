package Builder;

public class House {
    private  String wall;
    private Door door;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "wall='" + wall + '\'' +
                ", door=" + door +
                '}';
    }
}
