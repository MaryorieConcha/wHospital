public enum Especialidad {
    Pediatria("Pediatría"),
    Traumatologia("Traumatología"),
    Dermatologia("Dermatología"),
    Oftalmologia("Oftalmología");

    private String especialidad;

    Especialidad (String especialidad){
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }
}
