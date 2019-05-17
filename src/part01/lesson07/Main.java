package part01.lesson07;

public class Main {

    /**
     * Дан массив случайных чисел. Написать программу для вычисления факториалов всех элементов массива. Использовать пул потоков для решения задачи.
     *
     * Особенности выполнения:
     * - Для данного примера использовать рекурсию - не очень хороший вариант, т.к. происходит большое выделение памяти, очень вероятен StackOverFlow.
     * Лучше перемножать числа в простом цикле при этом создавать объект типа BigInteger
     * По сути, есть несколько способа решения задания:
     * 1) распараллеливать вычисление факториала для одного числа
     * 2) распараллеливать вычисления для разных чисел
     * 3) комбинированный
     * При чем вычислив факториал для одного числа, можно запомнить эти данные и использовать их для вычисления другого, что будет гораздо быстрее
     * */

    public static void main(String[] args) {
        
    }
}
