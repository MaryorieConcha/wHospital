public class Paciente extends Persona {
    public Paciente(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public String toString() {
        return "Paciente{" + "nombre='" + super.getNombre() + '\'' + ", edad=" + super.getEdad() + '}';
    }
}
