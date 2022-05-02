public class CuartoEjercicio {
    public static void main(String args[]) {
        cliente nCliente = new cliente(25, "Federico Gaviria", 3173792377L, 2233);
        System.out.println(nCliente.getEdad() + " " + nCliente.getNombre() + " " + nCliente.getTelefono() + " "
                + nCliente.getCredito());
        trabajador nTrabajador = new trabajador(25, "Federico Gaviria", 3173792377L, 2233);
        System.out.println(nTrabajador.getEdad() + " " + nTrabajador.getNombre() + " " + nTrabajador.getTelefono() + " "
                + nTrabajador.getSalario() + " USD");
    }

}

class persona {
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int e) {
        this.edad = e;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setTelefono(long t) {
        this.telefono = t;
    }

    public int getEdad() {
        return edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }
}

class cliente extends persona {
    private int credito;

    public cliente(int e, String n, long t, int c) {
        setEdad(e);
        setNombre(n);
        setTelefono(t);
        setCredito(c);
    }

    public void setCredito(int c) {
        this.credito = c;
    }

    public int getCredito() {
        return credito;
    }
}

class trabajador extends persona {
    private int salario;

    public trabajador(int e, String n, long t, int c) {
        setEdad(e);
        setNombre(n);
        setTelefono(t);
        setSalario(c);
    }

    public void setSalario(int s) {
        salario = s;
    }

    public int getSalario() {
        return salario;
    }
}