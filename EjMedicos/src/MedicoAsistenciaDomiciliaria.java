import java.util.Arrays;

public class MedicoAsistenciaDomiciliaria extends Medico{

    private int [] kmVisitas ;
    private double tarifaKm;

    public MedicoAsistenciaDomiciliaria(int[] kmVisitas) {
        this.kmVisitas = kmVisitas;
        tarifaKm = 4;
    }

    public int calcularSalario(Medico medico, int horas, int sueldoHoras, int kmvisitados){
        return (int) ((medico.horas*medico.SalarioHoras) + (kmvisitados*tarifaKm));
    }
    @Override
    public String mostrarDatos() {
        return "MedicoAsistenciaDomiciliariaa{" +
                "kmVisitas=" + Arrays.toString(kmVisitas) +
                ", tarifaKm=" + tarifaKm +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", horas=" + horas +
                ", SalarioHoras=" + SalarioHoras +
                ", salarioFin=" + salarioFin +
                '}';
    }
}
