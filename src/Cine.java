public class Cine {

    private String pelicula;
    private String horario;

    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }
    public String getPelicula() {
        return pelicula;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public String obtenerCartelera() {
        return this.getPelicula() + " => "  + this.getHorario();
    }
}
