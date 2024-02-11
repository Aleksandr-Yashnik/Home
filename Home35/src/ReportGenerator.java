public class ReportGenerator {
    private String title;

    public ReportGenerator(String title) {
        this.title = title;
    }

    public void generateReport() {
        System.out.println("Generating report: " + title);
        // Генерация отчёта
    }
}

