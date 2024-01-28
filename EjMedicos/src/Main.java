import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        CentroSalud Cs = new CentroSalud();

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        boolean exit = false;
        int opcion = 0;
        do {
            System.out.println("1.-Mostrar datos de un Medico de centro de salud \n 2.- Crear Medico de Asistencia Domiciliaria \n 3.- Crear listado de medicos");
            opcion = br.read();
            switch (opcion) {
                case 1:
                    MedicoCentroSalud Mcs1 = new MedicoCentroSalud();
                    System.out.println(Mcs1.toString());

                    ;

            }
        }while(exit==false);
        }
    }
