package Math;

public class MathFunctions {

    double radius;
    double yuzi = 0;

    static double p = 3.14;


    public MathFunctions(int r) {
        this.radius = r;
    }

    public void yuzi(){
        yuzi = p * (radius*radius);

    }

    public void print(){
        System.out.println("Aylana yuzi " + yuzi);
    }

}
