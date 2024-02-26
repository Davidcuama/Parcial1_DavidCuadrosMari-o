public class ObjetosDePersona {

    public static void main(String[] args) {
        // Instanciacion de la clase Persona
        // herencia de la clase persona
        // cada una de estas llama a los metodos y propiedades de la clase persona y le
        // asigna unos valores.
        Persona persona1 = new Persona("Docente", "Masculino", "Blanco", "Juan", "Mexico");
        persona1.edad = 32;
        persona1.peso = 75.7;
        persona1.vivo = true;
        System.out.println("Profesion: " + persona1.getProfession());
        System.out.println("Genero: " + persona1.getGenero());
        System.out.println("Color: " + persona1.getColor());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Pais: " + persona1.getPais());
        System.out.println("Edad: " + persona1.edad + " años");
        System.out.println("Peso: " + persona1.peso + " kg");
        System.out.println("Vivo: " + persona1.vivo);
        System.out.println("");

        Persona persona2 = new Persona("Estudiante", "Femen", "naranja", "Zara", "Nepal");
        persona2.edad = 25;
        persona2.peso = 60.5;
        persona2.vivo = false;
        System.out.println("Profesion: " + persona2.getProfession());
        System.out.println("Genero: " + persona2.getGenero());
        System.out.println("Color: " + persona2.getColor());
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Pais: " + persona2.getPais());
        System.out.println("Edad: " + persona2.edad + " años");
        System.out.println("Peso: " + persona2.peso + " kg");
        System.out.println("Vivo: " + persona2.vivo);
        System.out.println("");

        Persona persona3 = new Persona("Administrativo", "Masculino", "Negro", "David", "Colombia");
        persona3.edad = 45;
        persona3.peso = 70.0;
        persona3.vivo = true;
        System.out.println("Profesion: " + persona3.getProfession());
        System.out.println("Genero: " + persona3.getGenero());
        System.out.println("Color: " + persona3.getColor());
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Pais: " + persona3.getPais());
        System.out.println("Edad: " + persona3.edad + " años");
        System.out.println("Peso: " + persona3.peso + " kg");
        System.out.println("Vivo: " + persona3.vivo);

    }

}