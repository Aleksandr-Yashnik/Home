public class Printer implements Machine {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void fax() {
        // Пустая реализация, так как принтер не умеет факсировать
    }

    @Override
    public void scan() {
        // Пустая реализация, так как принтер не умеет сканировать
    }
}
