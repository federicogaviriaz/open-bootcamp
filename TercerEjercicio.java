public class TercerEjercicio {
    public static void main(String[] args) {
        Persona federico = new Persona();
        federico.setEdad(25);
        federico.setNombre("Federico Gaviria");
        federico.setTelefono(3173792377L);
        System.out.println(
                federico.getNombre() + ". \nEdad: " + federico.getEdad() + ": \nTeléfono: " + federico.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int e) {
        this.edad = e;
    }

    public void setNombre(String s) {
        this.nombre = s;
    }

    public void setTelefono(long t) {
        this.telefono = t;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public long getTelefono() {
        return this.telefono;
    }

}
