package number4;

public class Ternary6 {
    public static void main(String[] args) {
        double quantity = 100;    // Количество единиц товара.
        double price = 100;      // Цена за единицу товара.
        double discount = 0.75;// Скидка на общую стоимость - 25%.
        double discount2 = 0.5;// Скидка на общую стоимость - 50%.
        double cost;             // Общая стоимость.
        // ЕСЛИ: Купили 10 единиц товара и больше. ТО: предоставить скидку в 25%. ИНАЧЕ: Скидку не предоставлять.
        cost = (quantity >= 100) ? (quantity >= 100 ? quantity * price * discount2 : quantity * price) :
                (quantity >= 10 ? quantity * price * discount : quantity * price);

        System.out.println( "Общая стоимость товара составляет: " + cost + " у.е." );
    }
}
