// Вывести все простые числа от 1 до 1000

public class set12 {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < (i / 2) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
