package com.company;

public class Prosta {
    //Ax + By + C = 0
    //y = -Ax/B  - C/B
    public final double A;
    public final double B;
    public final double C;

    public Prosta(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public Prosta przesun(Wektor w){
        return new Prosta(A, B, C - A*w.dx - B*w.dy);
    }
    public boolean saProstopadle(Prosta p1, Prosta p2){
        return (p1.A * p2.A == - (p1.B * p2.B));
    }
    public boolean saRownolegle(Prosta p1, Prosta p2){
        if(p1.B == 0 || p2.B == 0)
            return (p1.B == p2.B);

        return ((p1.A / p1.B == p2.A / p2.B)
             && ((p1.C / p1.B) != (p2.C / p2.B)));
    }

    @Override
    public String toString() {
        return "Prosta{ " +
                A +
                "x + " + B +
                "y + " + C +
                " = 0 }";
    }
}
