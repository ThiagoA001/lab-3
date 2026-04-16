public class TarjetaDeCredito {

    private String nombreBanco;
    private String numeroTarjeta;
    private Double saldo;
    private Titular titular;
    private EntidadFinanciera entidadFinanciera;

    public TarjetaDeCredito(String nombreBanco, String numeroTarjeta, double saldo, Titular titular, EntidadFinanciera entidadFinanciera){
        this.nombreBanco = nombreBanco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }
    public boolean tieneSaldo(double monto){
        return saldo >= monto;
    }
    public void descontar(double monto){
        saldo -= monto;
    }
    public Titular getTitular(){
        return titular;
    }
}
