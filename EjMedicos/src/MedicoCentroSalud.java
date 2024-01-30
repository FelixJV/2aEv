public class MedicoCentroSalud extends Medico {
    private CentroSalud CentroSal;

    public MedicoCentroSalud(CentroSalud cS){
        super();
        this.CentroSal = cS;
    }
    public MedicoCentroSalud(String nombre, int edad, boolean sexo, int horas, int salarioHoras, CentroSalud cs) {
        super(nombre,edad,sexo,horas,salarioHoras);
        this.CentroSal = cs;
    }

    public MedicoCentroSalud(){
        super();
        this.CentroSal = new CentroSalud();
    }


    @Override
    public String toString() {
        return super.toString()+
                "CentroSal=" + CentroSal +
                '}';
    }
}
