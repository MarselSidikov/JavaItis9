package ru.itis;

public class Main {

    // функция, от которой мы считаем интеграл
    // формальный параметр x - точка, в которой нужно вычислить
    // значение функции, в данном случае рассматриваем функцию
    // x^2, следовально f(2) = 4
    public static double f(double x) {
        return x * x;
    }

    // функция, которая вычисляет определенный интеграл
    // параметры a и b - это отрезок, на котором необходимо
    // вычислить интеграл, n - количество разбиений, которые
    // необходимо сделать для расчета
    public static double integralByRectangles(double a, double b, int n) {
        // h - шаг разбиения (ширина одного прямоугольника)
        double h = (b - a) / n;

        double result = 0;
        for (double x = a; x <= b; x = x + h) {
            // площадь текущего прямоугольника
            double areaOfCurrentRectangle = h * f(x);
            result += areaOfCurrentRectangle;
        }

        return result;
    }

    public static double integralBySimpson(double a, double b, int n) {
        // h - шаг разбиения (ширина одного прямоугольника)
        double h = (b - a) / n;

        double result = 0;

        // f(x - h) + 4 * f(x) + f(x + h);

        // x = a + h

        // f(a + h - h) + 4 * f(a + h) + f(a + h + h)

        // f(a + h + h + h - h) + 4 * f(a + h + h + h) + f(a + h + h + h +h)
        for (double x = a + h; x <= b; x = x + 2 * h) {
            double currentValue = f(x - h) + 4 * f(x) + f(x + h);
            result = result + currentValue;
        }

        return (h / 3) * result;
    }
    public static void main(String[] args) {
	    double integral = integralByRectangles(0, 2, 100000);
	    double integral2 = integralBySimpson(0, 2, 5000);
        System.out.println(integral);
        System.out.println(integral2);
    }
}
