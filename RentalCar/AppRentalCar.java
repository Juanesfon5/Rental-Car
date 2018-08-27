import java.util.Scanner;
import java.util.*;
import java.text.*;
public class AppRentalCar{

    public static void main(String[] args) {
        String tipo = "";
        while (!tipo.contains("terminar")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a Rental Car");
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese su género");
            String genero = sc.nextLine();
            System.out.println("¿Es usted un cliente Estandar o VIP?");
            String tipoCliente = sc.nextLine();
            Random random = new Random();
            String id = String.format("%04d", random.nextInt(10000));
            Customer cliente = new Customer(id, nombre, genero, tipoCliente);
            System.out.println("Nuestros tipos de autos disponibles son:");
            System.out.println("Familiar");
            System.out.println("Deportivo");
            System.out.println("Estandar");
            System.out.println("Seleccione el tipo que desea");    
            System.out.println("O escriba \"terminar\" para salir" );
            tipo = sc.nextLine();
            Random random2 = new Random();
            String idTrans = String.format("%04d", random2.nextInt(10000));
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println("Ingrese la fecha actual (MM-DD-AAAA)");
            String date = sc.nextLine();
            System.out.println("Ingrese la fecha en la que será regresado el auto (MM-DD-AAAA)");
            String date2 = sc.nextLine();
            CarFactoryMethod factory = new CarFactory();
            Car car = factory.getType(tipo);
            System.out.println(car.getStock());
            RentalTransaccion rental = new RentalTransaccion(id, date, date, date2, cliente, car);
            System.out.println("Ingrese el numero del seguro que desea. (1: Standard o 2: Todo Riesgo)");
            int seguro = sc.nextInt();
            int valTotal = rental.renta(seguro, car);
            if (valTotal == -1){
                continue;
            }
            System.out.println("El valor total de la renta es " + valTotal);
        } 
    }
}