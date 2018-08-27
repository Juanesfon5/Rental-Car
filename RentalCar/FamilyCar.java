public class FamilyCar extends Car{
    
    private int valHora;
    private static int stock = 20;
    private String tipo = "Family";

    public FamilyCar(String placa, String cilindraje, String marca, String color, String transmision, int nroPuestos){
        super(placa, cilindraje, marca, color, transmision, nroPuestos);
        this.valHora=10;
        System.out.println("Mira el stock");
        System.out.println(stock);
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