package Presenter;

import Model.MemoryModel;
import View.View;

public class MemoryController {

    private MemoryModel modelo;
    private View vista;

    /*
    Constructor del controlador que recibe el modelo y la vista
     */
    public MemoryController(MemoryModel modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    /*
    Método que coordina la operación de simulación de administración de memoria
     */
    public void simularAdministracionDeMemoria() {
        // Mostrar memoria antes de la asignación de objetos
        vista.mostrarMemoria("Antes de la asignación de objetos", modelo.obtenerMemoria());

        // Asignar memoria
        modelo.asignarMemoria();

        // Mostrar memoria después de la asignación
        vista.mostrarMemoria("Después de la asignación de objetos", modelo.obtenerMemoria());

        // Intentar recolectar basura
        modelo.recolectarBasura();

        // Mostrar memoria después de la recolección de basura
        vista.mostrarMemoria("Después de la recolección de basura", modelo.obtenerMemoria());
    }
}
