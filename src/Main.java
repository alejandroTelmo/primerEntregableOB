
import mesa.Coche;

public class Main {

    public static void main(String[] args){
        System.out.println(suma(10,11,12));
        Coche miCoche=new Coche();
        miCoche.agregarPuerta(1);

        miCoche.getNumeroDePuertas();
    }
    public static int suma(int a, int b,int c){
        return a + b +c;
    }


}
