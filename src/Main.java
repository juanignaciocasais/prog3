public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");

        Persona juan = new Persona();

        juan.setNombre("Juan");
        juan.setApellido("Perez");

        System.out.println("Nombre:" + juan.getNombre());
        System.out.println("Apellido:" + juan.getApellido());

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

        maestro.saltar(3);
        alumno.saltar(3);
        maestro.ataque();
        alumno.ataque();

        System.out.println("-------------------------  Ejercicio 8 y 9 --------------------------");

        Persona empleado1 = new Persona();
        Visitante visita1 = new Visitante();
        Guardia vigilador1 = new Guardia();

        empleado1.setNombre("Juan");
        empleado1.setApellido("Perez");
        visita1.setNombre("Carla");
        visita1.setApellido("Gomez");
        vigilador1.setNombre("Miguel");
        vigilador1.setApellido("López");

        System.out.println(empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println(visita1.getNombre() + " " + visita1.getApellido());
        System.out.println(vigilador1.getNombre() + " " + vigilador1.getApellido());

        System.out.println("-------------------------  Ejercicio 10 --------------------------");

        Persona empleado2 = new Persona();
        Guardia vigilador2 = new Guardia();

        empleado2.setNombre("Luis");
        empleado2.setApellido("Salvio");
        vigilador2.setNombre("Patricio");
        vigilador2.setApellido("Muela");

        System.out.println(empleado2.presentarse());
        System.out.println(vigilador2.presentarse());

        System.out.println("-------------------------  Ejercicio 11 --------------------------");

        Visitante visita2 = new Visitante();

        visita2.setDni(11408789);

        System.out.println(vigilador2.controlarDocumento(visita2.getDni()));

        System.out.println("-------------------------  Ejercicio 12 --------------------------");

        Visitante visita3 = new Visitante();

        visita3.setNombre("Carlos");
        visita3.setApellido("Perez");
        visita3.setDni(11408789);

        System.out.println(vigilador2.controlarDocumentoEj12(
                visita3.getNombre(),
                visita3.getApellido(),
                visita3.getDni()));

        System.out.println(visita3.getApellido());

    }

}