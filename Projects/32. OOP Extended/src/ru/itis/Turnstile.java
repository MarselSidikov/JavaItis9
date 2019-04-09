package ru.itis;

// турникет, позволяет пустить или не пустить сотрудника
public class Turnstile {
    // ссылка на хранилище сотрудников
    private EmployeeDataBase employeeDataBase;

    public Turnstile(EmployeeDataBase employeeDataBase) {
        this.employeeDataBase = employeeDataBase;
    }

    public void checkEmployee(Employee employee) {
        PassCard passCard = employee.show();
        // вызов булевской функции
        if (employeeDataBase.contains(passCard)) {
            System.out.println("Все хорошо. Проходите, " + passCard.getInformationAboutEmployee() + ", хорошего дня!");
            // останавливаем выполнение процедуры
            return;
        }
        throw new AccessDeniedException();
    }
}
