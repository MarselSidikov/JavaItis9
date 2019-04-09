package ru.itis;

public class Main {

    public static void main(String[] args) {
    	// создали базу данных сотрудников

		// объявление объектной переменной
    	EmployeeDataBase employeeDataBase;

    	// выделение памяти под объект - new (создание объекта)
    	// конструктор - задает начальные значения полям объекта (инициализация)
    	// присваивание объектной переменной ссылка на реальный объект
    	employeeDataBase = new EmployeeDataBase();
    	// создали турникет, передав ему базу данных сотрудников
    	Turnstile turnstile = new Turnstile(employeeDataBase);

    	// создали пропуски
	    PassCard passCard1 = new PassCard("qwerty007");
	    PassCard passCard4 = new PassCard("qwerty007");
	    PassCard passCard2 = new PassCard("qwerty008");
	    PassCard passCard3 = new PassCard("qwerty009");

	    // создали сотрудников
	    Employee employee1 = new Employee("Сидиков Марсель");
	    Employee employee2 = new Employee("Ленар Батдалов");
	    Employee employee3 = new Employee("Надир Садеков");
	    Employee employee4 = new Employee("Игорь Гарин");

	    // передали карты сотрудникам

		// вызов процедуры give и передача ей аргумента - другого объекта
	    employee2.give(passCard1);
	    employee3.give(passCard2);
	    employee4.give(passCard3);

	    // зарегистрировали карты в базе
	    employeeDataBase.registration(passCard4);
	    employeeDataBase.registration(passCard2);

	    // проверяем всех сотрудников
//	    turnstile.checkEmployee(employee1);
	    turnstile.checkEmployee(employee2);
	    turnstile.checkEmployee(employee3);
	    turnstile.checkEmployee(employee4);
    }
}
