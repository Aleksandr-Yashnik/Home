import java.util.Scanner;

// Абстрактный класс фигуры
abstract class Shape {
    // Абстрактный метод для получения периметра фигуры
    abstract double getPerimeter();
}

// Класс Прямоугольник, наследующий класс Shape
class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    // Конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Реализация метода для получения периметра прямоугольника
    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    // Реализация метода изменения размера пропорционально
    @Override
    public void resize(double coefficient) {
        width *= coefficient;
        height *= coefficient;
    }
}

// Класс Круг, наследующий класс Shape
class Circle extends Shape implements Resizable {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода для получения периметра круга
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Реализация метода изменения размера пропорционально
    @Override
    public void resize(double coefficient) {
        radius *= coefficient;
    }
}

// Интерфейс для изменения размера фигуры
interface Resizable {
    void resize(double coefficient);
}

// Основной класс программы
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод формы участка
        System.out.println("Выберите форму участка:");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Круг");
        int choice = scanner.nextInt();

        Shape shape = null;
        double perimeter = 0;

        // Создание фигуры в зависимости от выбора пользователя
        switch (choice) {
            case 1:
                System.out.println("Введите ширину и высоту прямоугольника:");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                perimeter = shape.getPerimeter();
                break;
            case 2:
                System.out.println("Введите радиус круга:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                perimeter = shape.getPerimeter();
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }

        // Вывод периметра и расчет цены забора
        System.out.println("Периметр участка: " + perimeter);
        System.out.println("Введите цену за метр забора:");
        double pricePerMeter = scanner.nextDouble();
        double totalPrice = perimeter * pricePerMeter;
        System.out.println("Цена забора: " + totalPrice);

        // Проверка на желание изменить размер участка
        System.out.println("Хотите изменить размер участка? (да/нет)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("да")) {
            System.out.println("Введите коэффициент изменения размера:");
            double coefficient = scanner.nextDouble();
            ((Resizable) shape).resize(coefficient);
            perimeter = shape.getPerimeter();
            System.out.println("Новый периметр участка: " + perimeter);
            totalPrice = perimeter * pricePerMeter;
            System.out.println("Новая цена забора: " + totalPrice);
        }
    }
}

