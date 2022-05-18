package mesa;

public class Coche {
    private int numeroDePuertas;

    public int agregarPuerta( int puertas){
        return this.numeroDePuertas+=puertas;
    }

    public void getNumeroDePuertas() {
        System.out.println(numeroDePuertas); ;
    }
}
