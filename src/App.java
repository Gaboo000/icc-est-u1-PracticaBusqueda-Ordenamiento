
import Controllers.Controller;
import Controllers.SearchingMethods;
import Controllers.SortingMethods;
import Views.View;
// 

public class App {
    public static void main(String[] args) throws Exception {
        View vista = new View();

        ///crear las clsaes con los metodos de ordenamiento y busqueda 

        SortingMethods sortingMethods = new SortingMethods();
        SearchingMethods searchingMethods = new SearchingMethods();


        //crear el controlador 
        Controller controller = new Controller(vista, sortingMethods, searchingMethods);


        
      

    }
}
