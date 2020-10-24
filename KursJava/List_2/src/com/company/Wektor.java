package com.company;

public class Wektor {
    public final double dx;
    public final double dy;

    public Wektor(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }
    public static Wektor add(Wektor w, Wektor v){
        return new Wektor(w.dx + v.dx, w.dy + v.dy);
    }

    @Override
    public String toString() {
        return "Wektor{" +
                "[ " + dx +
                ", " + dy +
                "] }";
    }
}
