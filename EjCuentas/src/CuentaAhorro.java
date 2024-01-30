public class CuentaAhorro extends CuentaCorriente{
    private double Interes;

    public CuentaAhorro(){}

    public CuentaAhorro(Titular titular1, String numeroCuenta, double saldo, double interes){

    }
    public CuentaAhorro(Titular titular1, String numeroCuenta, double interes){
        super.setSaldo(15.13);
    }
    public CuentaAhorro(Titular titular1, String numeroCuenta){
        super.setSaldo(15.13);
        this.Interes = 2.5;
    }

    public void saldoInteres(){
        double interestotal = Interes/12;
        super.setSaldo(super.getSaldo()-(interestotal/100));   }
    public double getInteres() {
        return Interes;
    }

}
