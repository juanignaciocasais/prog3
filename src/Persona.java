public class Persona {

    private String nombre;
    private String apellido;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String presentarse(){
        return this.getNombre() + " " + this.apellido;
    }
}
