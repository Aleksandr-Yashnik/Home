public class FigureCalculator {
    public static void main(String[] args) {
        try {
            double[] circleSides = {5.20};
            double circleArea = calculateArea(circleSides);
            System.out.println("Площадь круга: " + circleArea);

            double[] rectangleSides = {25.0, 6.0};
            double rectangleArea = calculateArea(rectangleSides);
            System.out.println("Площадь прямоугольника: " + rectangleArea);

            double[] triangleSides = {30.0, 4.0, 50.0};
            double triangleArea = calculateArea(triangleSides);
            System.out.println("Площадь треугольника: " + triangleArea);
        } catch (IncorrectFigureSizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double calculateArea(double[] sides) throws IncorrectFigureSizeException {
        if (sides == null || sides.length < 1) {
            throw new IncorrectFigureSizeException("Некорректные значения сторон фигуры");
        }

        if (sides.length == 1) {
            // Площадь круга: π * r^2
            double radius = sides[0];
            return Math.PI * Math.pow(radius, 2);
        } else if (sides.length == 2) {
            // Площадь прямоугольника: a * b
            double sideA = sides[0];
            double sideB = sides[1];
            return sideA * sideB;
        } else if (sides.length == 3) {
            // Площадь треугольника по формуле Герона
            double a = sides[0];
            double b = sides[1];
            double c = sides[2];

            if (a + b > c && a + c > b && b + c > a) {
                // Проверка на существование треугольника
                double s = (a + b + c) / 2;
                return Math.sqrt(s * (s - a) * (s - b) * (s - c));
            } else {
                throw new IncorrectFigureSizeException("Треугольник с такими сторонами не существует");
            }
        } else {
            throw new IncorrectFigureSizeException("Некорректное количество сторон для фигуры");
        }
    }
}



