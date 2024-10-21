package Views;

import java.util.Scanner;

import Models.Person;

public class View {
    private Scanner scanner = new Scanner(System.in);
    public int showMenu(){
        System.out.println("MENU");
        System.out.println("1. Ingresar Personas");

        System.out.println("100. Salir");

        return scanner.nextInt();
    }


    public int inputInt(String message) {
        System.out.println(message);
        return scanner.nextInt(0);
    }

    public Person inputPerson(){
        String name = inputName();
        int age inputAge();
        return new Person(name, age);
    }


    private void inputAge(String message) {
        System.out.println("LOG"+message);
        
    }


    private String inputName(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }


    public int selecSortingMethod() {
        System.out.println("Ingrese la condicion");
        return scanner.nextInt();
    }

    
    
}
