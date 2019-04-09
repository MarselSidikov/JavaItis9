package ru.itis;

// класс-пропуск
public class PassCard {
    // сотрудник, привязанный к карте
    private Employee employee;
    // код карты
    private String code;

    public PassCard(String code) {
        // вызов внутреннего метода для проверки кода
        checkCode(code);
        this.code = code;
    }

    private void checkCode(String code) {
        if (code.length() < 7) {
            throw new IllegalArgumentException();
        }
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getInformationAboutEmployee() {
        return this.employee.getName();
    }

    public boolean equals(Object object) {
        if (object instanceof PassCard) {
            PassCard that = (PassCard)object;
            return this.code == that.code;
        } else return false;
    }
}
