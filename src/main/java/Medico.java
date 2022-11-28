public class Medico extends Persona {
	private Especialidad especialidad;

	public Medico(String nombre, int edad, String rut, Especialidad especialidad) {
		super(nombre,edad, rut);
		this.especialidad = especialidad;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Medico{nombre: "+super.getNombre()+", edad: "+super.getEdad()+", rut: "+super.getRut()+
		", especialidad: " + especialidad + '}';
	}

	public String getTipo() {
		return "Medico";
	}
}