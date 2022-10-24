public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.menu();
	}

	public void menu(){
		Hospital hospital = new Hospital();
		hospital.registrarPaciente("Jane", 1);
		hospital.contratarMedicos ("Nemo",27);
		hospital.despedirMedico("Nemo",27);
	}
}