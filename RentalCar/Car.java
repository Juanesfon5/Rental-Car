public abstract class Car{

    protected String placa;
    protected String cilindraje;
    protected String marca;
    protected String color;
    protected String transmicion;
    protected int nroPuestos;
    protected static int stock;
    protected int valHora;
    protected String tipo;

    public Car(String placa, String cilindraje, String marca, String color, String transmision, int nroPuestos){
        super();
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.marca = cilindraje;
        this.color = color;
        this.transmicion = transmision;
        this.nroPuestos = nroPuestos;
    }

    //public void setStock(int stock){
        //this.stock = stock;
    //}

    public abstract void addStock();
    public abstract void restStock();
    public abstract int getStock();
    public abstract int getValHora();
    
}