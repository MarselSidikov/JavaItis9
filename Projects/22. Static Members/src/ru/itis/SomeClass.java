package ru.itis;

/**
 * 07.03.2019
 * SomeClass
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SomeClass {
    int value;
    static int staticValue;

    // статический инициализатор
    static {
        staticValue = 777;
    }

    void changeSign() {
        this.value = -value;
    }

    static void changeStaticSign() {
//        value = -value; - нельзя
        staticValue = -staticValue;
    }
}
