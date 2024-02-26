//Abstraccion
public class Persona {
    private static String profession, genero, color, nombre, pais;
    // Encapsulamiento con parametros private y static
    // metodos
    boolean vivo;
    int edad;
    double peso;

    public Persona(String profession, String genero, String color, String nombre, String pais) {
        this.profession = profession;
        this.genero = genero;
        this.color = color;
        this.nombre = nombre;
        this.pais = pais;
        // aca se demuestra las propiedades de encanzulamiento
    }

    // polimorfismo para las propiedades de la persona
    // se llaman a los getters y setters
    public static String getProfession() {
        return profession;
    }

    public static void setProfession(String profession) {
        Persona.profession = profession;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Persona.genero = genero;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Persona.color = color;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getPais() {
        return pais;
    }

    public static void setPais(String pais) {
        Persona.pais = pais;
    }

}