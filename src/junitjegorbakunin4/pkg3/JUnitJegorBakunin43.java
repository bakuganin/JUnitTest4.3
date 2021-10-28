package junitjegorbakunin4.pkg3;

import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */

/*
    Начальный вклад в банке равен 1000 eur. 
    Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25). 
    По данному P определить, через сколько месяцев размер вклада превысит 1100 eur., 
    и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
    Напишите JUnit для проверки результата на достоверность.
*/
 
import java.util.Scanner;

public class JUnitJegorBakunin43 {
    
    public static double[] result(double a, double b, double c){
        int countMonths = 0;
        
        while (a < b) {
            a *= 1 + c / 100;
            System.out.println("После " + ++countMonths + " - " + a);
        }

        System.out.println("После " + countMonths + " месяцев вклад будет больше " + b + " и станет = " + a);
            return null;
    }
    
    private static Scanner input = new Scanner(System.in); // создаем и импортируем сканер
 
    public static void main(String[] args) {
    double initialContribution = 1000;
    double finalContribution = 1100;
 

    double persent = 0;
    boolean run = true;
    
    while (run) {
        System.out.print("Введите процент [от 0,01 до 25,00]:");
        persent = input.nextDouble();
        boolean isOkValuePercent;
        if (isOkValuePercent = persent > 0 && persent <= 25) {
            run = false;
        }
        else if (!isOkValuePercent) {
            System.out.println("Введите верное значение!");
        }
    }
       JUnitJegorBakunin43.result(initialContribution,finalContribution,persent);
    }
}
