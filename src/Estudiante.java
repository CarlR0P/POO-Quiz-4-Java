/**
 * La clase Estudiante
 *
 * Se importan las librerias de LocalDate y Period necesarias para realizar el calculo de la edad del estudiante.
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Estudiante {
    /**************************************/
    /************* Atributos **************/
    /**************************************/
    private String nombre;
    private LocalDate fechanacimiento;
    private double notamateria1;
    private double notamateria2;
    private double notamateria3;
    /**
     * CONSTRUCTOR DE LA CLASE
     * @param nombre El nombre del estudiante.
     * @param year El año de nacimiento del estudiante.
     * @param month El mes de nacimiento del estudiante.
     * @param day El dia de nacimiento del estudiante.
     * @param notamateria1 La nota de la primera materia del estudiante.
     * @param notamateria2 La nota de la segunda materia del estudiante.
     * @param notamateria3 La nota de la tercera materia del estudiante.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Estudiante (String nombre, int year, int month, int day, double notamateria1, double notamateria2, double notamateria3) {

        this.nombre = nombre;
        this.fechanacimiento = LocalDate.of(year, month, day);
        this.notamateria1 = notamateria1;
        this.notamateria2 = notamateria2;
        this.notamateria3 = notamateria3;
    }
    /**
     * Metodo que permite obtener el nombre del estudiante, necesario para poder imprimir los mensajes adjuntando el nombre.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getnombre() {
        return nombre;
    }
    /**
     * Metodo para calcular la edad del estudiante, para ello primero se obtiene la fecha de nacimiento de estudiante, despues se obtiene la fecha actual con la ayuda de la libreria LocalDate,
     * despues con la libreria Period se obtiene el calculo de la edad del estudiante para que finalmente con el return, me obtenga el calculo de los años.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public int getEdad() {
        LocalDate fechanacimientoLocal = fechanacimiento;
        LocalDate fechaactual = LocalDate.now();
        Period periodo = Period.between(fechanacimientoLocal, fechaactual);
        return periodo.getYears();
    }
    /**
     * Metodo para calculoar el promedio del estudiante, simplemente se sumaron las notas y se promediaron entre el numero de notas.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getPromedio() {

        return (notamateria1 + notamateria2 + notamateria3) / 3;
    }

}
