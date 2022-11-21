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

    public boolean registrarPaciente(String nombre, int edad){
        if (buscarPaciente(nombre, edad) == null) {
            Paciente paciente = new Paciente(nombre, edad);
            this.pacientes.add(paciente);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contratarMedicos(String nombre, int edad, Especialidad especialidad){
        if (buscarMedico(nombre, edad, especialidad) == null) {
            Medico medico = new Medico(nombre, edad, especialidad);
            this.medicos.add(medico);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean despedirMedico(String nombre, int edad, Especialidad especialidad){
        Medico medico = new Medico(nombre, edad, especialidad);
        if (Objects.equals(buscarMedico(nombre, edad, especialidad), medico)) {
            this.medicos.remove(medico);
            return true;
        }
        else {
            return false;
        }
    }



    public Paciente buscarPaciente(String nombre, int edad){
        for (Paciente paciente : this.pacientes){
            if (paciente.getNombre().equals(nombre) && paciente.getEdad() == edad){
                return paciente;
            }
        }
        return null;
    }

    public Medico buscarMedico(String nombre, int edad, Especialidad especialidad){
        for (Medico medico : this.medicos){
            if (medico.getNombre().equals(nombre) && medico.getEdad() == edad){
                return medico;
            }
        }
        return null;
    }
}