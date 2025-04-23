package tp1.ejercicio3;

public class Test {

    public static void main(String[] args) {
        Estudiante [] e = new Estudiante [2];
        Profesor [] p = new Profesor [3];
        
        e[0]= new Estudiante(1,"La Plata","Luli","Gonzales","lulu@gmail");
        e[1]= new Estudiante(2,"La Plata","Toti","Gonzales","toti@gmail");
        
        p[0] = new Profesor("Taller","UNLP","Osi","Gonzales","Osi@gmail");
        p[1] = new Profesor("OC","UNLP","Mag","Scotto","mag@gmail");
        p[2]= new Profesor("Arqui","UNLP","Yaha","Lopez","lopez@gmail");
        
        for (int i=0;i<2;i++){
            System.out.println(e[i].tusDatos());
        }
        for (int j=0;j<3;j++){
            System.out.println(p[j].tusDatos());
        }
    }
    
}
