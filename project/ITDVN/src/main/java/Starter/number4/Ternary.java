package Starter.number4;

public class Ternary {
    // Тернарный (троичный) оператор [?:] .
    // Тернарный оператор [?:], является сокращенной формой конструкции if ... else.
    // [?:] - include operand - ( indecators ? if true : if false )

    // Алгоритм работы тернарной операции: (логическое выражение) ? выражение 1 : выражение 2
    //    1. Вычисляется логическое выражение (условие).
    //    2. if true , =1, if false — =2.
    public static void main(String[] args) {
        int a = 1, b = 2, max = 0;
        // Переменной max, присваиваем возвращаемое значение тернарного оператора.
        max = (a > b) ? a : b;
        System.out.println( max );
    }
}
