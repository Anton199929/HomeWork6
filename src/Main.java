//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        for ( int i = 1; i <= 10; i ++ ){
            System.out.println(i);
        }

        System.out.println("Задача 2");

        for (int i = 10; i > 0; i --){
            System.out.println(i);
        }

        System.out.println("Задача 3");

        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }

        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i --){
            System.out.println(i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }

        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        System.out.println("Задача 8, 9");

        int contribution = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i ++){
            savings = savings + savings/100;
            savings = savings + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("Задача 10");

        int equally = 0;
        for (int i = 1; i <= 10; i ++){
            equally = equally + 2;
            System.out.println("2 * " + i + " = " + equally);
        }

    }
}