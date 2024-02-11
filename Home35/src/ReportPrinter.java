public class ReportPrinter {
    private String title;
    private String content;

    public ReportPrinter(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void printReport() {
        System.out.println("Printing report: " + title);
        System.out.println("Content: " + content);
        // Печать отчёта
    }
}

