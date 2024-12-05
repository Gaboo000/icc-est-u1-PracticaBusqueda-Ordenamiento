package Controllers;

import Models.Person;
import Views.View;

public class Controller {
    private View view;
    private Person[] persons;
    private SortingMethods sortingMethods;
    private SearchingMethods searchMethods;

    public Controller(View view, SortingMethods sortingMethods, SearchingMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.persons = new Person[0];
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    view.displayPersons(persons);
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    sortPersons();
                    break;
                case 5:
                    searchPerson();
                    break;
                case 6:
                    searchPerson();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (option != 7);
    }

    public void inputPersons() {
        Person person = view.inputPerson();
        addPersons(person);
    }

    public void addPersons(Person person) {
        Person[] newPersons = new Person[persons.length + 1];
        System.arraycopy(persons, 0, newPersons, 0, persons.length);
        newPersons[persons.length] = person;
        persons = newPersons;
    }

    public void sortPersons() {
        int method = view.selectSortingMethod();
        switch (method) {
            case 1:
                sortingMethods.sortByNameWithBubble(persons);
                break;
            case 2:
                sortingMethods.sortByNameWithSelectionDes(persons);
                break;
            case 3:
                sortingMethods.sortByAgeWithInsertion(persons);
                break;
            case 4:
                sortingMethods.sortByNameWithInsertion(persons);
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }

    public void searchPerson() {
        int criterion = view.selectSearchCriterion();
        switch (criterion) {
            case 1:
                if (searchMethods.isSortedByName(persons)) {
                    String name = view.inputName();
                    Person result = searchMethods.binarySearchByName(persons, name);
                    view.displaySearchResult(result);
                } else {
                    System.out.println("La lista no está ordenada por nombre. No se puede realizar la búsqueda.");
                }
                break;
            case 2:
                if (searchMethods.isSortedByAge(persons)) {
                    int age = view.inputAge();
                    Person result = searchMethods.binarySearchByAge(persons, age);
                    view.displaySearchResult(result);
                } else {
                    System.out.println("La lista no está ordenada por edad. No se puede realizar la búsqueda.");
                }
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }
}
