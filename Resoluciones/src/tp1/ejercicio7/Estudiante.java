package tp1.ejercicio7;

public class Estudiante {
    private String nomb;
    private String ape;
    private String facu;
    private int legajo;

    public Estudiante(String nomb, String ape, String facu, int legajo) {
        this.nomb = nomb;
        this.ape = ape;
        this.facu = facu;
        this.legajo = legajo;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nomb=" + nomb + ", ape=" + ape + ", facu=" + facu + ", legajo=" + legajo + '}';
    }
}
