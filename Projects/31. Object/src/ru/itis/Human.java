package ru.itis;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Human)) {
            return false;
        }
        if (this == obj) {
            return true;
        }

        // явное преобразование стронней переменной
        Human that = (Human) obj;
        return this.age == that.age && this.name.equals(that.name);
    }
}
