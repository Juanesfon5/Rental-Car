import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;


public class RentalTransaccion{

    private String id;
    private String fecha;
    private String pickupDate;
    private String returnDate;
    private int valHora;
    private int valTotal;
    private String customerId;
    private String seguro;

    public RentalTransaccion(String id, String fecha, String pickupDate, String returnDate, Customer customer, Car car){
        this.id = id;
        this.fecha = fecha;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.valHora = car.getValHora();
        this.valTotal = 0;
        this.customerId = customer.getId();
    }

    public long tiempoPrestamo(){
        long diferencia = 0;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date pickupD = formato.parse(pickupDate);
            Date returnD = formato.parse(returnDate);
            diferencia = returnD.getTime() - pickupD.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TimeUnit.HOURS.convert(diferencia, TimeUnit.MILLISECONDS);
    }

    public int renta(int seguro, Car car){
        if(seguro==2){
            valTotal+=2000;
        } else{
            valTotal+=1000;
        }
        //CarFactoryMethod factory = new CarFactory();
        //Car car = factory.getType(tipo);
        int stock = car.getStock();
        if (stock > 0){
            int totalHoras = (int) tiempoPrestamo();
            valTotal += (totalHoras*car.getValHora()); 
            this.valTotal = valTotal; 
            return valTotal;
        } else {
            System.out.println("Este tipo no está disponible en el momento");
            return -1;
        }
    }
}