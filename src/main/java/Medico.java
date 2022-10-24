public class Medico {
	private String nombre;
	private int edad;

	public Medico(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Medico{" +
				"nombre='" + nombre + '\'' +
				", edad=" + edad +
				'}';
	}
}