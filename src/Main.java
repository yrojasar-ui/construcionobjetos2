public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Romario", "Salas Aguero", "123456789", "Masculino", "San José");
        Cliente cliente2 = new Cliente("Ana", "Pérez", "987654321", "Heredia");
        Cliente cliente3 = new Cliente(); // Constructor por defecto
        cliente3.setNombre("Maria");
        cliente3.setApellidos("Chavarria Perez");
        cliente3.setCedula("555555555");
        cliente3.setSexo("Femenina");
        cliente3.setUbicacion("Heredia");

        Suscripcion sus1 = new Suscripcion("Premium", 150.00, 12);
        Suscripcion sus2 = new Suscripcion("Básica", 9.99, 2);

        cliente1.suscribirse(sus1);
        cliente2.suscribirse(sus2);
        
        cliente3.suscribirse(new Suscripcion("Estándar", 2500, 1));

        System.out.println();
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();
        cliente3.mostrarInfo();

        // ----------------------
        // PRUEBAS DE EQUALS
        // ----------------------
        System.out.println("Pruebas de comparación con equals:");

        Cliente cliente4 = new Cliente("Otro", "Cliente", "123456789", "Masculino", "Cartago");
<<<<<<< HEAD
        System.out.println("¿cliente1 es igual a cliente4? " + cliente1.equals(cliente4)); // true, misma cédula
        System.out.println("¿cliente1 es igual a cliente2? " + cliente1.equals(cliente2)); // false

        // Comparación de suscripciones por tipo y periodicidad
        Suscripcion sus3 = new Suscripcion("Premium", 500.00, 12); // mismo tipo y meses que sus1
        System.out.println("¿sus1 es igual a sus3? " + sus1.equals(sus3)); // true
        System.out.println("¿sus1 es igual a sus2? " + sus1.equals(sus2)); // false

        // ----------------------
        // PRUEBAS DE toString
        // ----------------------
        System.out.println("\nPruebas de toString():");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(sus1);
        System.out.println(sus2);
=======
        System.out.println("¿cliente1 es igual a cliente4? " + cliente1.equals(cliente4)); 
        System.out.println("¿cliente1 es igual a cliente2? " + cliente1.equals(cliente2)); 
    
        Suscripcion sus3 = new Suscripcion("Premium", 500.00, 12); 
        System.out.println("¿sus1 es igual a sus3? " + sus1.equals(sus3)); 
        System.out.println("¿sus1 es igual a sus2? " + sus1.equals(sus2)); 
>>>>>>> 6468cfa5706f624d641953450fa4ae4bc459e220
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

    public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        setNombre(nombre);
        setApellidos(apellidos);
        setCedula(cedula);
        setSexo(sexo);
        setUbicacion(ubicacion);
    }

    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        setNombre(nombre);
        setApellidos(apellidos);
        setCedula(cedula);
        setUbicacion(ubicacion);
        this.sexo = "No especificado";
    }

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.cedula = "";
        this.sexo = "No especificado";
        this.ubicacion = "";
    }

    public void suscribirse(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
        System.out.println(nombre + " " + apellidos +
                " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }
<<<<<<< HEAD
    
=======

>>>>>>> 6468cfa5706f624d641953450fa4ae4bc459e220
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ubicación: " + ubicacion);
        if (suscripcion != null) {
            suscripcion.mostrarInfo();
        } else {
            System.out.println("No tiene suscripción activa.");
        }
        System.out.println("----------------------------");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Desconocido";
    }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) {
        this.apellidos = (apellidos != null && !apellidos.isBlank()) ? apellidos : "Desconocido";
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) {
        this.cedula = (cedula != null && cedula.matches("\\d+")) ? cedula : "000000000";
    }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) {
        if (sexo == null || sexo.isBlank()) {
            this.sexo = "No especificado";
        } else {
            this.sexo = sexo;
        }
    }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = (ubicacion != null && !ubicacion.isBlank()) ? ubicacion : "No registrada";
    }

    public Suscripcion getSuscripcion() { return suscripcion; }
    public void setSuscripcion(Suscripcion suscripcion) { this.suscripcion = suscripcion; }

<<<<<<< HEAD

=======
>>>>>>> 6468cfa5706f624d641953450fa4ae4bc459e220
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return cedula.equals(cliente.cedula); // comparamos por cédula
    }

    @Override
    public int hashCode() {
        return cedula.hashCode();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", sexo='" + sexo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", suscripcion=" + (suscripcion != null ? suscripcion.getTipo() : "Sin suscripción") +
                '}';
    }
}

// ----------------------
// Clase Suscripcion
// ----------------------
class Suscripcion {
    private String tipo;
    private double costo;
    private int periodicidadMeses;

    public Suscripcion(String tipo, double costo, int periodicidadMeses) {
        setTipo(tipo);
        setCosto(costo);
        setPeriodicidadMeses(periodicidadMeses);
    }

    public void mostrarInfo() {
        System.out.println("Tipo de suscripción: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Periodicidad del pago: cada " + periodicidadMeses + " meses");
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) {
        this.tipo = (tipo != null && !tipo.isBlank()) ? tipo : "Sin tipo";
    }

    public double getCosto() { return costo; }
    public void setCosto(double costo) {
        this.costo = (costo >= 0) ? costo : 0.0;
    }

    public int getPeriodicidadMeses() { return periodicidadMeses; }
    public void setPeriodicidadMeses(int periodicidadMeses) {
        this.periodicidadMeses = (periodicidadMeses > 0) ? periodicidadMeses : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;
        Suscripcion that = (Suscripcion) obj;
        return periodicidadMeses == that.periodicidadMeses &&
                tipo.equalsIgnoreCase(that.tipo); // igualdad por tipo y meses
    }

    @Override
    public int hashCode() {
        return tipo.toLowerCase().hashCode() + periodicidadMeses;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "tipo='" + tipo + '\'' +
                ", costo=" + costo +
                ", periodicidadMeses=" + periodicidadMeses +
                '}';
    }
}
