public abstract class Medico {
    protected String nombre;
    protected int edad;
    protected boolean sexo;
    protected int horas;
    protected int SalarioHoras;

    public Medico(String nombre, int edad, boolean sexo, int horas, int salarioHoras) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        SalarioHoras = salarioHoras;
    }

    public Medico() {
        nombre = Utilidades.dameNombre();
        edad = (int) Math.random()*50+18;
        sexo = false;
        horas = (int) Math.random()*120+100;
        SalarioHoras = 10;
    }

    public String mostrarDatos(){
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", horas=" + horas +
                ", SalarioHoras=" + SalarioHoras +
                '}';
    }
    public double calcularSalario(){
        return horas * SalarioHoras;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + dameSexo() +
                ", horas=" + horas +
                ", SalarioHoras=" + SalarioHoras +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSalarioHoras() {
        return SalarioHoras;
    }

    public void setSalarioHoras(int salarioHoras) {
        SalarioHoras = salarioHoras;
    }

    public String dameSexo(){
        return (sexo)?"femenino":"masculino";
    }
}
