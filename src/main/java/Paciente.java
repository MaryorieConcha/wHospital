public class Paciente extends Persona {
    public Paciente(String nombre, int edad, String rut) {
        super(nombre, edad, rut);
    }
    @Override
    public String toString() {
        return "Paciente{nombre: "+super.getNombre()+", edad: "+super.getEdad()+", rut: "+super.getRut()+'}';
    }

    public String getTipo(){
        return "Paciente";
    }
}
