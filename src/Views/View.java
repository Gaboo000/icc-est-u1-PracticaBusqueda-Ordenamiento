package Views;

import Models.Person;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar persona");
        System.out.println("2. Mostrar personas");
        System.out.println("3. Ordenar por nombre");
        System.out.println("4. Ordenar por edad");
        System.out.println("5. Buscar por nombre");
        System.out.println("6. Buscar por edad");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public Person inputPerson() {
        System.out.print("Ingrese el nombre: ");
        String name = scanner.next();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }

    public int selectSortingMethod() {
        System.out.println("\nSeleccione el método de ordenamiento:");
        System.out.println("1. Ordenar por nombre usando Bubble Sort");
        System.out.println("2. Ordenar por nombre en orden descendente usando Selection Sort");
        System.out.println("3. Ordenar por edad usando Insertion Sort");
        System.out.println("4. Ordenar por nombre usando Insertion Sort");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        System.out.println("\nSeleccione el criterio de búsqueda:");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por edad");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        System.out.println("\nLista de Personas:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("\nPersona encontrada: " + person);
        } else {
            System.out.println("\nPersona no encontrada.");
        }
    }

    public String inputName() {
        System.out.print("Ingrese el nombre: ");
        return scanner.next();
    }

    public int inputAge() {
        System.out.print("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
