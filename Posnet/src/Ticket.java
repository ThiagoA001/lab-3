
public class Ticket {

    private String nombre;
    private String apellido;
    private double montoTotal;
    private double montoCuota;

    public Ticket(String nombre, String apellido, double montoTotal, double montoCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.montoTotal = montoTotal;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido +
            "\nTotal: $" + montoTotal +
            "\nCuotas: $" + montoCuota;
    }
}