package ru.itis;

// класс - сотрудник учреждения
public class Employee {
    // поле класса, определяет состояние
    // поле - объектная переменная
    // ссылка на объект - указатель
    // изначально значение этого поле - null
    private PassCard card;

    // поле класса
    private String name;

    // конструктор
    // name - формальный параметр
    public Employee(String name) {
        this.name = name;
    }

    // процедура (метод) которая принимает
    // картку и дает ее сотруднику
    // card - формальный параметр
    public void give(PassCard card) {
        // card справа - формальный параметр
        // card слева - поле
        // this - ссылка объекта на самого себя
        this.card = card;
        // присвоили карту сотруднику
        // и одновременно присвоили карте сотрудника текущего
        this.card.setEmployee(this);
    }

    // позволяет сотруднику предъявить пропуск
    // функция
    public PassCard show() {
        // проверяем, существует ли какое либо значение в поле
        if (this.card == null) {
            // если ничего нет - генерируем ощибку, программа остановится
            throw new NoCardException();
        }
        return this.card;
    }

    // геттер, для получения значения поля
    public String getName() {
        return name;
    }
}
