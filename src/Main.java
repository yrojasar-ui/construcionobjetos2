public class Main {
    public static void main(String[] args) {
        // Crear clientes con los distintos constructores
        Cliente cliente1 = new Cliente("Romario", "Salas Aguero", "123456789", "Masculino", "San José");
        Cliente cliente2 = new Cliente("Ana", "Pérez", "987654321", "Heredia");
        Cliente cliente3 = new Cliente(); // Constructor por defecto
        cliente3.setNombre("Maria");
        cliente3.setApellidos("Chavarria Perez");
        cliente3.setCedula("555555555");
        cliente3.setSexo("Femenina");
        cliente3.setUbicacion("Heredia");

        // Crear suscripciones "normales"
        Suscripcion sus1 = new Suscripcion("Premium", 150.00, 12);
        Suscripcion sus2 = new Suscripcion("Básica", 9.99, 2);

        // Clientes adquieren suscripciones
        cliente1.suscribirse(sus1);
        cliente2.suscribirse(sus2);

        // Suscripción pasada de forma anónima
        cliente3.suscribirse(new Suscripcion("Estándar", 2500, 1));

        // Mostrar información de todos los clientes
        System.out.println();
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();
        cliente3.mostrarInfo();
    }
}
// ----------------------
// Clase Cliente
// ----------------------
class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String sexo;
    private String ubicacion;
    private Suscripcion suscripcion; // Asociación con Suscripcion
    // Constructor 1: inicializa todos los atributos
    public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }
    // Constructor 2: inicializa todos menos el sexo
    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
        this.sexo = "No especificado";
    }
    // Constructor 3
    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.cedula = "";
        this.sexo = "";
        this.ubicacion = "";
    }
    public void suscribirse(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
        System.out.println(nombre + " " + apellidos +
                " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ubicación: " + ubicacion);
        if (suscripcion != null) {
            System.out.println("Suscripción actual: " + suscripcion.getTipo());
        } else {
            System.out.println("Sin suscripción activa.");
        }
        System.out.println("----------------------------");
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public Suscripcion getSuscripcion() { return suscripcion; }
    public void setSuscripcion(Suscripcion suscripcion) { this.suscripcion = suscripcion; }
}
// ----------------------
// Clase Suscripcion
// ----------------------
class Suscripcion {
    private String tipo;
    private double costo;
    private int periodicidadMeses;

    // Constructor completo
    public Suscripcion(String tipo, double costo, int periodicidadMeses) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidadMeses = periodicidadMeses;
    }
    public void mostrarInfo() {
        System.out.println("Tipo de suscripción: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Periodicidad del pago: cada " + periodicidadMeses + " meses");
        System.out.println("----------------------------");
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public int getPeriodicidadMeses() { return periodicidadMeses; }
    public void setPeriodicidadMeses(int periodicidadMeses) { this.periodicidadMeses = periodicidadMeses; }
}

