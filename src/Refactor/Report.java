package Refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    public void printTitu() {
        // imprimir título
        System.out.println("Título del Reporte");

    }

    public void printReport(){
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...
    }

    public void printConclu(){
        // imprimir conclusión
        System.out.println("Conclusión del Reporte");

    }
}
