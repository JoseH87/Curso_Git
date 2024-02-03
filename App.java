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
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class App {
    public static void main(String[] args) throws Exception {
    //Colecciones

    //Arrays: son datos del mismo tipo y no se pueden añadir o eliminar
    
    String [] arrayCadenas = {"pollo","pizza","huevo","morcilla","pasta"};
    System.out.println(arrayCadenas[0]);
    System.out.println(arrayCadenas[1]);
    System.out.println(arrayCadenas[2]);
    System.out.println(arrayCadenas[3]);
    System.out.println(arrayCadenas[4]);
    Arrays.sort(arrayCadenas);
    System.out.println(Arrays.asList(arrayCadenas).indexOf("morcilla"));

    //Listas: son datos del mismo tipo y si se pueden añadir o eliminar

    List<Integer> numbers = new ArrayList<Integer>(List.of(1,2,3,4));
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));
    System.out.println(numbers.get(3));
    numbers.set(0, 100);
    numbers.add(387);
    numbers.add(5,78);
    numbers.size();
    System.out.println(numbers.contains(387));
    numbers.remove(1);
    numbers.clear();

    //Diccionarios: Compuestos por una clave y un valor asociado. La clave no puede repetirse.
    HashMap<String, Integer> agendaContactos = new HashMap<String, Integer>();
    agendaContactos.put("Andres", 676763434);
    System.out.println(agendaContactos.size());
    System.out.println(agendaContactos.get("Andres"));
    System.out.println(agendaContactos.containsKey("Andres"));
    System.out.println(agendaContactos.containsValue(23232442));
    agendaContactos.remove("Andres");
    System.out.println(agendaContactos.size());
    agendaContactos.clear();
    }

    
}
