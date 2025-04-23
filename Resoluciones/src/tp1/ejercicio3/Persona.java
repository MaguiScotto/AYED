package tp1.ejercicio3;

public class Persona {
   private String nombre;
    private String apelido;
    private String email;

    public Persona(String nombre, String apelido, String email) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre +" "+ apelido + ", email: " + email;
    } 
}
