package com.company;

public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void przesun(Wektor w){
        setX(getX()+w.dx);
        setY(getY()+w.dy);
    }
    public void obroc(Punkt p, double kat){
        double s = Math.sin(kat);
        double c = Math.cos(kat);

        setX(getX() - p.getX());
        setY(getY() - p.getY());

        double nowyX = getX()*c - getY() * s;
        double nowyY = getX()*s + getY()*c;

        setX(nowyX + p.getX());
        setY(nowyY + p.getY());
    }
    public void odbij(Prosta p){
        double newA = -(p.B*p.B/p.A);
        double newC = (-newA*getX()) - p.B*getY();
        Prosta np = new Prosta(newA, p.B, newC);

        /* p : y = kx + b // k = - A/B;  b = -C/B
          np : y = lx + n // l = - A/B;  n = -C/B
          kx + b = lx + n
          kx - lx = n - b
          x =(n-b)/(k-l)
        */

        double n = - np.C/np.B;
        double b = - p.C/p.B;
        double k = - p.A/p.B;
        double l = - np.A/np.B;

        double midX = (n - b) / (k - l);
        double midY = -(p.A/p.B) * midX - p.C/p.B;

        setX((midX * 2) - getX());
        setY((midY * 2) - getY());

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt{ ( " +
                x +
                " , " +
                y +
                ") }";
    }
}
