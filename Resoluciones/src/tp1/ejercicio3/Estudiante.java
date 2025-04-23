package tp1.ejercicio3;

public class Estudiante extends Persona {
    private int comision;
    private String dire;

    public Estudiante(int comision, String dire, String nombre, String apelido, String email) {
        super(nombre, apelido, email);
        this.comision = comision;
        this.dire = dire;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String tusDatos(){
        return super.toString() + " comision: "+ this.getComision() + " vive en " + this.getDire();
    } 
}
