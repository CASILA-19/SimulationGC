import Presenter.MemoryController;
import Model.MemoryModel;
import View.View;

public class Main {

    public static void main(String[] args) {

        // Crear instancias del modelo y la vista
        MemoryModel modelo = new MemoryModel();
        View vista = new View();

        // Crear el controlador pasándole el modelo y la vista
        MemoryController controlador = new MemoryController(modelo, vista);

        // Ejecutar la simulación de administración de memoria
        controlador.simularAdministracionDeMemoria();
    }
}
