public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("12345678", "Juan", "Perez", "123456789", "juan@mail.com");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
                "Banco Nación",
                "1234-5678-9012-3456",
                15000,
                titular,
                EntidadFinanciera.Visa
        );

        Posnet posnet = new Posnet();

        Ticket ticket = posnet.efectuarPago(tarjeta, 10000, 5);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("Pago rechazado");
        }
    }
}