import java.util.Arrays;

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
    public void mostrar (){
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i]!= null)
                System.out.println(medicos[i]);
        }

    }

    public boolean altaMedico(Medico medico){

        return false;
    }
    //baja
    //modificar algo común
    //modificar algo particular
    public boolean existe(String nif){ //evitar duplicados
        return false;
    }

}
