import java.util.Arrays;

public class MedicoAsistenciaDomiciliaria extends Medico{

    private int [] kmVisitas ;
    private double tarifaKm;

    public MedicoAsistenciaDomiciliaria(String nombre, int edad, boolean sexo, int horas, int salarioHoras, int[] kmVisitas) {
        super(nombre,edad,sexo,horas,salarioHoras);
        this.kmVisitas = kmVisitas;
        tarifaKm = 4;
    }

    public MedicoAsistenciaDomiciliaria(){
        super();
        this.kmVisitas = new int[7];
        tarifaKm = 4;
    }

    public double calcularSalario(){
        int kmvisitados=0;
        for (int i = 0; i < kmVisitas.length; i++) {
            kmvisitados += kmVisitas[i];
        }
        return  super.calcularSalario() + (kmvisitados*tarifaKm);
    }
    @Override
    public String mostrarDatos() {
        return super.toString()+
                "kmVisitas=" + Arrays.toString(kmVisitas) +
                ", tarifaKm=" + tarifaKm +
                ", salarioFin=" + calcularSalario() +
                '}';
    }
}
