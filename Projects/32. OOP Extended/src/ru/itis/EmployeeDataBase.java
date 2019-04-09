package ru.itis;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataBase {
    // поле, тип поля - интерфейс List
    // контейнер, который может содержать
    // объекты типа PassCard
    private List<PassCard> cards;

    public EmployeeDataBase() {
        // создание контейнера на основе массива
        this.cards = new ArrayList<>();
    }

    public void registration(PassCard card) {
        // добавляем в список карту
        this.cards.add(card);
    }

    public boolean contains(PassCard passCard) {
        // запускаем цикл от 0 до индекса последнего элемента списка
        for (int i = 0; i < cards.size(); i++) {
            // забираем i-ый элемент списка
            // сравниваем с нашей картой
            if (cards.get(i).equals(passCard)) {
                return true;
            }
        }
        return false;
    }
}
