package Builder;

public class Test {
    public static void main(String[] args) {

        Director director=new Director(new Abuilder());
        director.dirct();
        System.out.println(director.dirct());






    }

}
