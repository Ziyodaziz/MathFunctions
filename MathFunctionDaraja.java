package Math;

public class MathFunctionDaraja {


    int daraja;
    double s = 1;

    static double e = 2.71;

    public MathFunctionDaraja(int n) {
        this.daraja = n;
    }

    public void Daraja(){
        for (int i = 0; i < daraja; i++) {
            s *= e;
        }
    }

    public void print() {
        System.out.println(e +" sonini "+ daraja +" darajasi "+ s +" ga teng");
    }
}
