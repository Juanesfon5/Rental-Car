public class StandardCar extends Car{
    
    private int valHora;
    private static int stock = 20;
    private String tipo = "Standar";

    public StandardCar(String placa, String cilindraje, String marca, String color, String transmision, int nroPuestos){
        super(placa, cilindraje, marca, color, transmision, nroPuestos);
        this.valHora=20;
    }

    public int getStock(){
        return stock;
    }

    public void addStock(){
        this.stock += 1;
    }

    public void restStock(){
        this.stock -= 1;
    }

    public int getValHora(){
        return valHora;
    }

}