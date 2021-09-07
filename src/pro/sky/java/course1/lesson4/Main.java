package pro.sky.java.course1.lesson4;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int maxPayment = 0;
        int minPayment = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPayment) {
                maxPayment = arr[i];
            }
            if (arr[i] < minPayment) {
                minPayment = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " руб.");
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " руб.");


        float averagePayment = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " руб.");


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}
