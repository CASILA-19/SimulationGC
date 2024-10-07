package Model;

public class MemoryModel {

    /*
    Método para obtener información de memoria en MB
     */
    public String obtenerMemoria() {
        long memoriaTotal = Runtime.getRuntime().totalMemory();
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaUsada = memoriaTotal - memoriaLibre;

        return "Memoria total en JVM: " + memoriaTotal / 1024 / 1024 + " MB\n"
                + "Memoria libre en JVM: " + memoriaLibre / 1024 / 1024 + " MB\n"
                + "Memoria usada en JVM: " + memoriaUsada / 1024 / 1024 + " MB\n";
    }

    /*
    Método para asignar memoria creando objetos grandes

     */
    public void asignarMemoria() {
        int[][] arreglo = new int[10000][10000]; // Crear arreglo para ocupar memoria

        // Asignar valores
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = i + j;
            }
        }

        // Hacer que el arreglo sea elegible para recolección de basura
        arreglo = null;
    }

    /*
    Método para ejecutar la recolección de basura
     */
    public void recolectarBasura() {
        System.gc(); // Ejecutar el recolector de basura
        try {
            Thread.sleep(2000); // Pausa para dar tiempo al Garbage Collector
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
