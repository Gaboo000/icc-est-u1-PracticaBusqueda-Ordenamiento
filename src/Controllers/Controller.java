package Controllers;

import Models.Person;
import Views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchingMethods searchMethods;

    private Person[] person;

    public Controller(View view, SortingMethods sortingMethods, SearchingMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller Created");
    }

    public void start (){
        int option = 0;
        do{
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersonas();
                    
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPersons();
                case 100:
                    System.out.println("Adios");
            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(option != 0){

        }

    }

    
    public void sortPersons() {
        int sortingOption = view.selecSortingMethod();

        if(sortingOption == 1){
            sortingMethods.sortByNameBubble();

        }else if (sortingOption ==2){
            sortingMethods.sortByAgeWithSelection(person);

        }else{
            view.showMenu("Opcion invalida");
        }
    }

    public void inputPersonas() {
        int numPersonas = view.inputInt("Ingrese el numero de Personas");
        person = new Person [numPersonas];
        
        for(int i=0 ; i <numPersonas;i++){
            person[i]= view.inputPerson();
        }
        
    }
    
    private void addPerson() {
        int numPersonas = view.inputInt("Ingrese el numero de Personas a agregar");

        Person[] personasTotales = new Person[person.length + numPersonas];
        for (int i = 0 ; i <person.length;i++){
            personasTotales[i] = person[i];

        }

        for(int i = person.length; i< personasTotales.length;i++){
            person[i] = view.inputPerson();
        }

        person = personasTotales;


        
        
    }
    
    
}
        