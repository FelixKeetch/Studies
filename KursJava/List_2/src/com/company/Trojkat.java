package com.company;

public class Trojkat {
    private Punkt A;
    private Punkt B;
    private Punkt C;

    public void przesun(Wektor w){
        A.przesun(w);
        B.przesun(w);
        C.przesun(w);
    }
    public void obroc(Punkt p, double kat){
        A.obroc(p, kat);
        B.obroc(p, kat);
        C.obroc(p, kat);
    }
    public void odbij(Prosta p){
        A.odbij(p);
        B.odbij(p);
        C.odbij(p);
    }
    public Trojkat(Punkt A, Punkt B, Punkt C){
        boolean aC = areCollinear(A.getX(), A.getY(),
                                  B.getX(), B.getY(),
                                  C.getX(), C.getY());
        if(aC)
            throw new IllegalArgumentException("Punkty są kolinearne.");

        this.A = A;
        this.B = B;
        this.C = C;
    }
    static boolean areCollinear(double x1, double y1, double x2,
                                double y2, double x3, double y3){
        double a = x1 * (y2 - y3) +
                   x2 * (y3 - y1) +
                   x3 * (y1 - y2);
        if (a == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}
