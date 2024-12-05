import Controllers.*;
import Views.View;

public class App {
    public static void main(String[] args) {
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchingMethods searchMethods = new SearchingMethods();
        Controller controller = new Controller(view, sortingMethods, searchMethods);
        controller.start();
    }
}
