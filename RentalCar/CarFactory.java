import java.util.Random;
import java.nio.charset.Charset;
public class CarFactory implements CarFactoryMethod{

    public enum CType{
        Familiar,Deportivo,Estandar
    }

    public String genPlaca(){
        Random r = new Random();
        int p2 = r.nextInt(900) + 100;
        String placa = "KGV"+"-"+p2;
        System.out.println("Placa: "+placa);
        return placa;
    }

    public Car getType(String type){
        String placa = genPlaca();
        System.out.println("Entro");
        String [] trans = {"Automatico", "Manual"};
        String [] color = {"Negro", "Blanco", "Rojo"};
        String [] cilindraje = {"Alto", "Medio", "Bajo"};
        String [] marca = {"Ford", "Audi","Toyota"};
        Random random = new Random();
        int selectTrans = random.nextInt(trans.length);
        Random random2 = new Random();
        int selectColor = random2.nextInt(color.length);
        Random random3 = new Random();
        int selectCil = random3.nextInt(cilindraje.length);
        Random random4 = new Random();
        int selectMarca = random4.nextInt(marca.length);
        switch(type){
            case "Familiar":
                System.out.println("Es familiar");
                return new FamilyCar(placa, cilindraje[selectCil], marca[selectMarca], color[selectColor], trans[selectTrans], 6);
            case "Deportivo":
                int puestos = (int)(Math.floor(Math.random()+1.5));
                return new SportCar(placa, "Alto", marca[selectMarca], color[selectColor], trans[selectTrans], puestos);
            case "Estandar":
                return new StandardCar(placa, cilindraje[selectCil], marca[selectMarca], color[selectColor], trans[selectTrans], 4);
            default:
                throw new IllegalArgumentException("Tipo de carro no disponible");
        }
    }
}