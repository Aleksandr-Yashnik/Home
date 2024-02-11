public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void generateReport() {
        System.out.println("Generating report: " + title);
        // Генерация отчёта
    }

    public void printReport() {
        System.out.println("Printing report: " + title);
        System.out.println("Content: " + content);
        // Печать отчёта
    }
}
