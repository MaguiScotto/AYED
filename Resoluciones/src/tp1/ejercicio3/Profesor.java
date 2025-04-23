package tp1.ejercicio3;

public class Profesor extends Persona{
    private String catedra;
    private String facu; 

    public Profesor(String catedra, String facu, String nombre, String apelido, String email) {
        super(nombre, apelido, email);
        this.catedra = catedra;
        this.facu = facu;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }

    public String tusDatos(){
        return super.toString() + " catedra: "+ this.getCatedra() + " trabaja en " + this.getFacu();
    }
}
