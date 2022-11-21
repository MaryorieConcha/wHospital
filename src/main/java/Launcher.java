import java.io.IOException;

public class Launcher {
	public static void main(String[] args) throws IOException {
		Launcher launcher = new Launcher();
		launcher.menu();
	}

	public void menu() throws IOException {
		GestorDatos datos = new GestorDatos();
		GestorPDF gestorPDF = new GestorPDF();
		Paciente paciente = new Paciente("Jane", 1);
		Medico medico = new Medico("Nemo",27, Especialidad.Pediatria);
		gestorPDF.generarPDF(paciente, medico);

		Hospital hospital = new Hospital();
		hospital.registrarPaciente("Jane", 1);
		hospital.contratarMedicos ("Nemo",27, Especialidad.Pediatria);
		hospital.despedirMedico("Nemo",27, Especialidad.Pediatria);
	}
}