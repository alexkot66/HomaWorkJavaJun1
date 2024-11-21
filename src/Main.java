import java.util.Arrays;
import java.util.List;

/*

Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.

 */

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Инициализируем массив

        double average = numbers.stream() // double так как функция average возвращает double из-за операции деления
                .filter(n -> n % 2 == 0) // Фильтруем четные числа в массиве
                .mapToInt(Integer::intValue) // Преобразуем поток объектов Integer в поток примитивных int.
                .average() // Вычисляем среднее
                .orElse(0.0); // Если нет четных чисел, возвращаем 0.0

        System.out.println("Среднее значение четных чисел: " + average);
    }
}
