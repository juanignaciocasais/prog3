public class Ninja {

    private String arteMarcial;
    private String arma;
    private Integer fuerza;
    private Integer salto;

    public void setArteMarcial(String arteMarcial){
        this.arteMarcial = arteMarcial;
    }

    public String getArteMarcial(){
        return this.arteMarcial;
    }

    public void setArma(String arma){
        this.arma = arma;
    }

    public String getArma(){
        return this.arma;
    }

    public void setFuerza(Integer fuerza){
        this.fuerza = fuerza;
    }

    public Integer getFuerza(){
        return this.fuerza;
    }

    public void setSalto(Integer salto){
        this.salto = salto;
    }

    public Integer getSalto(){
        return this.salto;
    }

    public void saltar(Integer multiplicador){
        System.out.println(this.salto * multiplicador);
    }

    public void ataque(){
        System.out.println(this.arma + "  " + this.arteMarcial);
    }
}
