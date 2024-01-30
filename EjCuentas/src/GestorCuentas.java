public class GestorCuentas {
    private CuentaCorriente [] ListaCuentas;

    public GestorCuentas(){
    ListaCuentas = new CuentaCorriente[4];
        for (int i = 0; i < ListaCuentas.length; i++) {
            if(i%2==0){
                ListaCuentas[i] = new CuentaCorriente();
            }else{
                ListaCuentas[i] = new CuentaAhorro();
            }
        }
    }
}
