public class CuentaCorriente {
    private Titular titular;
    private String numeroCuenta;
    private Double saldo;

    public CuentaCorriente(Titular titular, String cuenta, Double saldo){
        this.titular = titular;
        numeroCuenta = cuenta;
        this.saldo=saldo;
    }
    public CuentaCorriente(Titular titular, String cuenta){
        this.titular = titular;
        numeroCuenta = cuenta;
        saldo = 15.3;
    }

    public void incrementarSaldo(Double incremento){
        saldo = saldo+incremento;
    }
    public void decrementarSaldo(Double decremento){
        saldo = saldo-decremento;
    }
    public String imprimir(){
        return "El numero de cuenta es" + numeroCuenta + ", y su saldo es" + saldo;
    }
    public String comparar(String cuenta2){
       if (numeroCuenta.compareTo(cuenta2) == 0)
           return "Las cuentas son iguales";
       else
           return "Las cuentas son diferentes";
    }
    public Titular getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
