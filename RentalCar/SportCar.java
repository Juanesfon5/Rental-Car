public class SportCar extends Car{
    
    private int valHora;
    private static int stock= 20;
    private String tipo = "Sport";

    public SportCar(String placa, String cilindraje, String marca, String color, String transmision, int nroPuestos){
        super(placa, cilindraje, marca, color, transmision, nroPuestos);
        this.valHora=30;

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