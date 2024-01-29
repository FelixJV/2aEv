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
}
