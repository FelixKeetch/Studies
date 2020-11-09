package obliczenia;
public abstract class Operator1Arg extends Wyrazenie {
    protected String znak;
    protected Wyrazenie w;
    public Operator1Arg(Wyrazenie w){
        this.w = w;
    }
    @Override
    public boolean equals(Object obj) {
        return this.znak == ((Operator2Arg) obj).znak;
    }
}
