public class Fruta {
    private String color;
    private Integer peso;
    private boolean esEstacional;
    private Integer PESO_MAX_ESTACION = 200;

    public Fruta (String color, Integer peso, boolean esEstacional){
        this.color = color;
        this.peso = peso;
        this.esEstacional = esEstacional;
    }

    public Fruta (){
        color = "";
        peso = 0;
        esEstacional = false;
    }
    public void setColor(String color){

        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setEsEstacional(boolean state) {
        this.esEstacional = state;
    }

    public boolean getEsEstacional() {
        return esEstacional;
    }

    public boolean esComestible() {
        return (this.peso < this.PESO_MAX_ESTACION && this.esEstacional);
    }


}
