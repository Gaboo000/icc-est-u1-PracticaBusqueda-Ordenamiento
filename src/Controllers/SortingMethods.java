package Controllers;

import Models.Person;

public class SortingMethods {
    public void sortByNameWithBubble(Person[] persons) {
        int n = persons.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (persons[j].getName().compareTo(persons[j + 1].getName()) > 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void sortByNameWithSelectionDes(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (persons[j].getName().compareTo(persons[maxIdx].getName()) > 0) {
                    maxIdx = j;
                }
            }
            Person temp = persons[maxIdx];
            persons[maxIdx] = persons[i];
            persons[i] = temp;
        }
    }

    public void sortByAgeWithInsertion(Person[] persons) {
        int n = persons.length;
        for (int i = 1; i < n; i++) {
            Person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getAge() > key.getAge()) {
                persons[j + 1] = persons[j];
                j = j - 1;
            }
            persons[j + 1] = key;
        }
    }

    public void sortByNameWithInsertion(Person[] persons) {
        int n = persons.length;
        for (int i = 1; i < n; i++) {
            Person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getName().compareTo(key.getName()) > 0) {
                persons[j + 1] = persons[j];
                j = j - 1;
            }
            persons[j + 1] = key;
        }
    }
}
