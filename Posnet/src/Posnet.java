public class Posnet {

    public static final double RECARGO_CUOTA = 0.03;
    public static final int MIN_CUOTAS = 1;
    public static final int MAX_CUOTAS = 6;

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double monto, int cuotas) {

        if (!datosValidos(tarjeta, monto, cuotas)) {
            return null;
        }

        double montoFinal = monto + recargoCuotas(monto, cuotas);

        if (!tarjeta.tieneSaldo(montoFinal)) {
            return null;
        }

        tarjeta.descontar(montoFinal);

        double montoPorCuota = montoFinal / cuotas;

        return new Ticket(
            tarjeta.getTitular().getNombre(),
            tarjeta.getTitular().getApellido(),
            montoFinal,
            montoPorCuota
        );
    }

    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuotas) {
        return tarjeta != null && monto > 0 && cuotas >= MIN_CUOTAS && cuotas <= MAX_CUOTAS;
    }

    private double recargoCuotas(double monto, int cuotas) {
        if (cuotas == 1) return 0;
        return monto * (cuotas - 1) * RECARGO_CUOTA;
    }
}