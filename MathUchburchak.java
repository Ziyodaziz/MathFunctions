package Math;

public class MathUchburchak {

    double tomonA;
    double tomonB;
    double tomonC;

    double P;

    double S;
    double s;

    public MathUchburchak(double tomonA, double tomonB, double tomonC) {
        this.tomonA = tomonA;
        this.tomonB = tomonB;
        this.tomonC = tomonC;
    }

    public void yuzi(){
        P = (tomonA+tomonB+tomonC) / 2;
        S = P*((P-tomonA)*(P-tomonB)*(P-tomonC));

    }

    public void print(){
        System.out.println("Uchburchak yuzi "+ Math.sqrt(S));
    }
}
