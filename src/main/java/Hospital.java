import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hospital {
    private List <Paciente> pacientes;
    private List <Medico> medicos;

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public Hospital() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
    }

    public boolean registrarPaciente(String nombre, int edad, String rut){
        if (buscarPaciente(nombre, edad, rut) == null) {
            Paciente paciente = new Paciente(nombre, edad, rut);
            this.pacientes.add(paciente);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contratarMedicos(String nombre, int edad, String rut, Especialidad especialidad){
        if (buscarMedico(nombre, edad, rut, especialidad) == null) {
            Medico medico = new Medico(nombre, edad, rut, especialidad);
            this.medicos.add(medico);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean despedirMedico(String nombre, int edad, String rut, Especialidad especialidad){
        Medico medico = new Medico(nombre, edad, rut, especialidad);
        if (Objects.equals(buscarMedico(nombre, edad, rut, especialidad), medico)) {
            this.medicos.remove(medico);
            return true;
        }
        else {
            return false;
        }
    }



    public Paciente buscarPaciente(String nombre, int edad, String rut){
        for (Paciente paciente : this.pacientes){
            if (paciente.getNombre().equals(nombre) && paciente.getEdad() == edad){
                return paciente;
            }
        }
        return null;
    }

    public Medico buscarMedico(String nombre, int edad, String rut, Especialidad especialidad){
        for (Medico medico : this.medicos){
            if (medico.getNombre().equals(nombre) && medico.getEdad() == edad){
                return medico;
            }
        }
        return null;
    }
}