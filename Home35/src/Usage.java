public class Usage {
    public static void main(String[] args) {
        // Задание 1: Разделение класса Report
        ReportGenerator reportGenerator = new ReportGenerator("Monthly Report");
        reportGenerator.generateReport();

        ReportPrinter reportPrinter = new ReportPrinter("Monthly Report", "This is the content of the report");
        reportPrinter.printReport();

        // Задание 2: Использование интерфейса Shape и классов Circle и Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        Shape[] shapes = {circle, rectangle};
        double totalArea = AreaCalculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);

        // Задание 3: Использование классов Bird, Penguin и Eagle
        Bird bird = new Bird();
        bird.fly();

        Penguin penguin = new Penguin();
        penguin.fly(); // Не должен летать

        Eagle eagle = new Eagle();
        eagle.fly();

        // Задание 4: Использование интерфейса Machine и классов Printer и Photocopier
        Printer printer = new Printer();
        printer.print();

        Photocopier photocopier = new Photocopier();
        photocopier.print();
        photocopier.fax();
        photocopier.scan();

        // Задание 5: Использование интерфейса Database и классов MySQLDatabase и MongoDatabase
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.read();
        mySQLDatabase.write();

        MongoDatabase mongoDatabase = new MongoDatabase();
        mongoDatabase.read();
        mongoDatabase.write();
    }
}
