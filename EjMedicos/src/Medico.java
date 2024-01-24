public abstract class Medico {
    protected String nombre;
    protected int edad;
    protected boolean sexo;
    protected int horas;
    protected int SalarioHoras;
    protected int salarioFin;

    public String mostrarDatos(){
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", horas=" + horas +
                ", SalarioHoras=" + SalarioHoras +
                '}';
    }
    public void calcularSalario(int horas, int SalarioHoras){
        salarioFin = horas * SalarioHoras;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
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
}
