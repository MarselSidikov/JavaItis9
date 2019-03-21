package ru.itis.generics;

public class MainStackExample {
    public static void main(String[] args) {
        // '(' -> ')'
        char brackets[] = "(()(()((())))())".toCharArray();
        // стек для хранения скобок
        Stack<Character> stack = new ArrayList<>();
        // флаг, говорит обработана ли строка польностью или нет
        boolean isProcessed = true;
        // идем по всем скобкам
        for (int i = 0; i < brackets.length; i++) {
            // если скобка OPEN
            if (brackets[i] == '(') {
                // кладем в стек
                stack.push(brackets[i]);
            } else {
                // если скобка CLOSE и стек непустой, забираем последнюю скобку из стека
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // если в момент работы стек оказался пустым
                    // останавливаем цикл, сделав
                    // соотвествуюшую замену значения флага
                    isProcessed = false;
                    // оператор остановки цикла
                    break;
                }
            }
        }

        if (stack.isEmpty() && isProcessed) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }
}
