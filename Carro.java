public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valorCarro;

    public int getAro() {
        return aro;
    }
    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorCarro() {
        return valorCarro;
    }
    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Carro(){
        
    }
    public Carro(int aro){
        this.aro=aro;
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }
    public Carro(int aro, String modelo, double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
    }
    public Carro(int aro, String modelo, double valorCarro, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
        this.cor=cor;
    }

}