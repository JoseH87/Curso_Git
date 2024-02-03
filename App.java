/* 
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no númericos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
 * */

 import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
    //Colecciones

    //Arrays: son datos del mismo tipo y no se pueden añadir o eliminar
    String cadenaTexto = "Pollo,pizza,patata,pasta,huevo";
    String [] arrayCadenas = cadenaTexto.split(" ");
    System.out.println(arrayCadenas[0]);
    System.out.println(arrayCadenas[1]);
    System.out.println(arrayCadenas[2]);
    System.out.println(arrayCadenas[3]);
    System.out.println(arrayCadenas[4]);
    Arrays.sort(arrayCadenas);
    Arrays.asList(arrayCadenas).indexOf(4);
    }
}
