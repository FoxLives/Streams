import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

//        transactions.stream()
//        .filter(transaction -> transaction.getYear() == 2011)
//        .sorted(new Comparator<Transaction>() {
//            @Override
//            public int compare(Transaction o1, Transaction o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        }).forEach(System.out::println);

//        transactions.stream()
//                .map(transaction -> transaction.getTrader().getCity()) //Извлекаем город из каждого трейдера
//                .distinct() //Оставляем только уникальные города
//                .sorted() //Опционально: сортируем города в алфавитном порядке
//                .collect(Collectors.toList()).forEach(System.out::println);

//        transactions.stream()
//                .map(Transaction::getTrader) //Извлекаем трейдеров из транзакций
//                .filter(trader -> "Cambridge".equals(trader.getCity())) //Фильтруем трейдеров из Кембриджа
//                .distinct() //Убираем дубликаты трейдеров
//                .sorted(Comparator.comparing(Trader::getName)) //Сортируем по именам
//                .collect(Collectors.toList()).forEach(System.out::println); //Собираем результат в список

//        String traderNames = transactions.stream()
//                .map(transaction -> transaction.getTrader().getName()) // Извлекаем имена трейдеров
//                .distinct() // Убираем дубликаты
//                .sorted() // Сортируем по алфавиту
//                .collect(Collectors.joining(", ")); // Соединяем в одну строку
//        System.out.println("Трейдеры в алфавитном порядке: " + traderNames);

//        boolean hasMilanTrader = transactions.stream()
//                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity())); // Проверяем наличие трейдера из Милана
//        System.out.println("Есть ли трейдеры из Милана? " + hasMilanTrader);

//        int cambridgeTransactionsSum = transactions.stream()
//                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity())) // Фильтруем транзакции из Кембриджа
//                .mapToInt(Transaction::getValue) // Преобразуем в сумму транзакции
//                .sum(); // Суммируем все транзакции
//        System.out.println("Суммы всех транзакций трейдеров из Кембриджа: " + cambridgeTransactionsSum);

//        transactions.stream()
//                .mapToInt(Transaction::getValue) // Преобразуем в суммы транзакций
//                .max()  // Находим максимальную сумму
//                .ifPresent(amount -> System.out.println("Максимальная сумма среди всех транзакций: " + amount));

//        transactions.stream()
//                .min(Comparator.comparingInt(Transaction::getValue)) // Находим транзакцию с минимальной суммой
//                .ifPresent(transaction -> System.out.println("Транзакция с минимальной суммой: " + transaction));
    }
}
