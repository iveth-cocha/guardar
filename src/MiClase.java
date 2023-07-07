import java.io.Serializable;

public class MiClase implements Serializable { //imple.. seri.... pasa de bites a strings


    //dato que guarda el objeto y permite guardar en disco
    //long serialVersionUID=1L >> long =tipo dato,>>serial....=nombre de variacle
    private static final long serialVersionUID=1L;

     private int edad;
     private String nombre;

    public MiClase(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    //cambiar algo a una cadena de cararteres
    public String toString(){
        return "Nombre: "+nombre+" , edad: "+edad;
    }
}
