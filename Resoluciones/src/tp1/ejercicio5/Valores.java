package tp1.ejercicio5;

public class Valores {
    private int max;
    private int min;
    private double prom;

    public Valores(int max, int min, double prom) {
        this.max = max;
        this.min = min;
        this.prom = prom;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "Valores{" + "max=" + max + ", min=" + min + ", prom=" + prom + '}';
    }
}
