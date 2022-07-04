import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        float num = 0.15f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");

        int number = sc.nextInt();
        System.out.println("Сумма вашего вклада: " + (number+(number*(365*2)*num/365)));


    }
}

