public class Customer{
    private String id;
    private String nombre;
    private String genero;
    private String tipo;

    public Customer(String id, String nombre, String genero, String tipo){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getId(){
        return id;
    }
}