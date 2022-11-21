public class Medico extends Persona {
	private Especialidad especialidad;

	public Medico(String nombre, int edad, Especialidad especialidad) {
		super(nombre,edad);
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
		return "Medico{" + "nombre='" + super.getNombre() + '\'' + ", edad=" + super.getEdad() +
		", especialidad=" + especialidad + '}';
	}
}