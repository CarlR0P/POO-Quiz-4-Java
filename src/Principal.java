/**
 * Clase Principal
 */

import java.util.Date;
public class Principal {
        /**
         * Método inicial que es ejecutado
         * @param args
         * Complejidad temporal: O(1) Tiempo constante.
         */
        public static void main (String[] args) {

                Date fechaNacimiento = new Date(2000, 0, 1);

                Estudiante elvio = new Estudiante ("Elvio Lao", 1995, 9, 22, 4,3,5);
                Estudiante elma = new Estudiante("Elma Lote", 2000,2,3,5,3,3);
                Estudiante debora = new Estudiante("Debora Melo", 1990, 10, 15, 3, 2, 4 );
                Estudiante alma = new Estudiante("Alma Marcela Gozo", 2008, 5,30,5, 5, 4  );

                 /**
                 * Metodo para imprimir la edad y el promedio del estudiante.
                  * Para ello es necesario crear otra variable de nombre y promedio para poder obtener la edad y el promedio requeridos.
                 */
                String nombre = elvio.getnombre();
                int edad = elvio.getEdad();
                System.out.println("La edad del estudiante "+ nombre + " es " + edad );
                double promedio = elvio.getPromedio();
                System.out.println("El promedio de notas del estudiante es: " + promedio);

                nombre = elma.getnombre();
                edad = elma.getEdad();
                System.out.println("\nLa edad del estudiante "+ nombre + " es " + edad );
                promedio = elma.getPromedio();
                System.out.println("El promedio de notas del estudiante es: " + promedio);

                nombre = debora.getnombre();
                edad = debora.getEdad();
                System.out.println("\nLa edad del estudiante "+ nombre + " es " + edad );
                promedio = debora.getPromedio();
                System.out.println("El promedio de notas del estudiante es: " + promedio);

                nombre = alma.getnombre();
                edad = alma.getEdad();
                System.out.println("\nLa edad del estudiante "+ nombre + " es " + edad );
                promedio = alma.getPromedio();
                System.out.println("El promedio de notas del estudiante es: " + promedio);
        }
}