public class Guardia extends Persona{
    @Override
    public java.lang.String presentarse() {
        return "Hola, mi nombre es " + super.presentarse() + " y soy el guardia.";
    }

    public String controlarDocumento(Integer dni) {
        return "Adelante persona con dni " + dni;
    }

    //AL pasar el objeto se pueden utilizar los setters y cambiar el valor al retornar al main, en
    // cambio al pasarle los valores por separado no pueden modificar el objeto. Solo las variables
    // que utiliza dentro de esta función
    public String controlarDocumentoEj12(String nombre, String apellido, Integer dni) {
        return "Adelante " + nombre + " " + apellido + " con dni " + dni;
    }
}
