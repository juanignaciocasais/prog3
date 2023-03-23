public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");

        Persona juan = new Persona();

        juan.nombre = "Juan";
        juan.apellido = "Perez";

        System.out.println("Nombre:" + juan.nombre);
        System.out.println("Apellido:" + juan.apellido);

        System.out.println("-------------------------  Ejercicio 2  --------------------------");

        Vehiculo auto = new Vehiculo();

        auto.marca = "Fiat";
        auto.modelo = "Uno";
        auto.setPatente("ab 123 ac");

        System.out.println("Marca:" + auto.marca);
        System.out.println("Modelo:" + auto.modelo);
        System.out.println("Patente:" + auto.getPatente());

        System.out.println("-------------------------  Ejercicio 3  --------------------------");

        Articulo notebook = new Articulo();

        notebook.setMarca("HP");
        notebook.setModelo("Probook");

        System.out.println("Marca: " + notebook.getMarca());
        System.out.println("Modelo: " + notebook.getModelo());

        System.out.println("-------------------------  Ejercicio 4  --------------------------");

        Cine savoy = new Cine();

        savoy.setPelicula("Volver al futuro");
        savoy.setHorario("22hs");

        System.out.println(savoy.obtenerCartelera());

    }
}