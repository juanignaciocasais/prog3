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
        System.out.println("-------------------------  Ejercicio 5  --------------------------");

        Cine atlas = new Cine();

        atlas.setPelicula("Esperando la Carroza");
        atlas.setHorario("19hs");

        System.out.println(atlas.obtenerCartelera());

        savoy.setPelicula("Rocky 4");
        savoy.setHorario("20hs");

        System.out.println(savoy.obtenerCartelera());

        System.out.println("-------------------------  Ejercicio 6  --------------------------");

        Fruta manzana = new Fruta("Roja", 180, true);
        Fruta banana = new Fruta();

        banana.setColor("Amarillo");
        banana.setPeso(300);
        banana.setEsEstacional(true);

        System.out.print("Manzana :");
        System.out.println(manzana.esComestible());
        System.out.print("Banana :");
        System.out.println(banana.esComestible());

        System.out.println("-------------------------  Ejercicio 7  --------------------------");

        Ninja maestro = new Ninja();
        Ninja alumno = new Ninja();

        maestro.setArteMarcial("Karate");
        maestro.setArma("Katana");
        maestro.setFuerza(400);
        maestro.setSalto(50);

        alumno.setArteMarcial("Karate");
        alumno.setArma("Nunchakus");
        alumno.setFuerza(300);
        alumno.setSalto(35);

        System.out.println(maestro.saltar(3));
        System.out.println(alumno.saltar(3));
        System.out.println(maestro.ataque());
        System.out.println(alumno.ataque());


    }

}