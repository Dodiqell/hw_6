public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int n = 1; n <= 10; n = n + 1) {
            System.out.println("Итерация цикла " + n);
        }
        //Задача 2
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.println("Итерация цикла " + b);
        }
        //Задача 3
        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println("Итерация цикла " + c);
        }
        //Задача 4
        for (int a = 10; a >= -10; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
        //Задача 5
        for (int g = 1904; g <= 2096; g = g + 4) {
            System.out.println(g + " год является високосным");
        }
        //Задача 6
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println(e);
        }
        //Задача 7
        for (int v = 2; v <= 512; v = v * 2) {
            System.out.println(v);
        }
        //Задача 8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        //Задача 9
        int salary_2 = 29000;
        int total_2 = 0;
        for (int i = 1; i <= 12; i++) {
            total_2 = total_2 + total_2/100;
            total_2 = total_2 + salary_2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей.");
        }
        //Задача 10
        for (int k = 2 ; k <= 10; k++){
            System.out.println(k * 2);
        }
    }
}
