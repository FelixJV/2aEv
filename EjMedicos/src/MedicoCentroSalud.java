public class MedicoCentroSalud extends Medico {
    private CentroSalud CentroSal;

    public MedicoCentroSalud(CentroSalud cS){
        super();
        this.CentroSal = cS;
    }
     public int calcularSalario(Medico medico, int horas, int sueldoHoras){
         int sueldoFinal = medico.horas* medico.SalarioHoras;
        return sueldoFinal;
     }

    @Override
    public String toString() {
        return "MedicoCentroSalud{" +
                "CentroSal=" + CentroSal +
                '}';
    }
}
