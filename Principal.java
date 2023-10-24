public class Principal {
    public static void main(String[] args) {
        

        Carro car = new Carro();
        Carro carAro = new Carro(14);
        Carro carTresParametros= new Carro(14, "HB20 2021 sense", 66600);
        Carro carQuatroParamentros = new Carro(17, "Jetta GLi 2023", 232390, "cinza");

        System.out.println(carAro.getAro());
        System.out.println(carTresParametros.getAro() + " " + carTresParametros.getModelo() 
        + " " + carTresParametros.getValorCarro());
        System.out.println(carQuatroParamentros.getAro() 
        + " " + carQuatroParamentros.getModelo() + " " + carQuatroParamentros.getValorCarro() 
        + " " + carQuatroParamentros.getCor()); 
    }
}
