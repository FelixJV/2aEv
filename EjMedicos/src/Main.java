import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        CentroSalud Cs = new CentroSalud();

       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int opcion = 0;
        /*do {
            System.out.println("1.-Mostrar datos de un Medico de centro de salud \n 2.- Crear Medico de Asistencia Domiciliaria \n 3.- Crear listado de medicos");
         //   opcion = br.read();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    MedicoCentroSalud Mcs1 = new MedicoCentroSalud();
                    System.out.println(Mcs1);
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                default:
                    System.out.println("default");
            }
        } while (exit == false);
        */
        //menú Gestor
        GestorMedicos gestorMedicos= new GestorMedicos();

        System.out.println(gestorMedicos);


        //Menú con 5 opciones los métodos del gestorMedicos alta, baja, modi

        int [] numbs = {5,3,8,2,8,7,9,1};
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i]);
        }
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs.length-1; j++) {
                if (numbs[i]<numbs[j]) {
                    int aux = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = aux;
                }
            }

        }
        System.out.println("\n");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i]);
        }
    }
}
