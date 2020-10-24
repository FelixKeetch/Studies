package com.company;

public class Main {

    public static void main(String[] args) {

        Punkt A = new Punkt(2,2);
        Punkt B = new Punkt(3,4);
        Punkt C = new Punkt(-2,-7);
        Odcinek odc = new Odcinek(B,C);
        Trojkat tr = new Trojkat(A,B,C);
        Prosta pr = new Prosta(2,3,-3);
        Wektor wek = new Wektor(2,2);
        Wektor wek2 = new Wektor(-2,-2);

        System.out.println(A.toString());
        A.odbij(pr);
        System.out.println(A.toString());
        A.odbij(pr);

        System.out.println("-------");

        System.out.println(tr.toString());
        tr.odbij(pr);
        System.out.println(tr.toString());
        tr.odbij(pr);

        System.out.println("-------");

        System.out.println(pr.toString());
        Prosta pr2 = pr.przesun(wek);
        System.out.println(pr2.toString());

        try{
            Trojkat tr2 = new Trojkat(new Punkt(1,4), new Punkt(1,2), new Punkt(1,7));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
