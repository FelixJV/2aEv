import java.util.Arrays;
import java.util.Scanner;

public class GestorMedicos {
    private Medico []medicos;

    public GestorMedicos(){
        medicos = new Medico[4];
        for (int i = 0; i < medicos.length; i++) {
            if(i%2==0){
                medicos[i] = new MedicoCentroSalud();
            }else{
                medicos[i] = new MedicoAsistenciaDomiciliaria();
            }
        }
    }
    //mostrar
    public String toString(){
        return Arrays.toString(medicos);
    }
    public void mostrarMedicos (int edad){
        for (int i = 0; i < medicos.length; i++) {
            System.out.println();
        }

    }


    public void altaMedico(Medico medico){
        Scanner lectura = new Scanner(System.in);
        int op;
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] == null){

                System.out.println("Quiere dar de alta a un Medico de Asistencia Domiciliaria(1) o de Centro de Salud(2)");
                op = lectura.nextInt();
                if(op==1)
                    medicos[i]= new MedicoAsistenciaDomiciliaria();
                else{
                    medicos[i] = new MedicoCentroSalud();
                }
            }else{
                System.out.println("El cupo de Medicos está lleno");

            }

        }
    }
    public void bajaMedico(String nombre){
        boolean salir = false;
        for (int i = 0; i < medicos.length && salir==true; i++) {
            if (medicos[i].getNombre().equals(nombre)){
                medicos[i] = null;
                salir=true;
            }
            else if(i== medicos.length){
                System.out.println("No hay ningún medico con ese nombre");
            }

        }
    }
    //baja
    //modificar algo común
    //modificar algo particular
    public boolean existe(String nif){ //evitar duplicados
        return false;
    }

}
