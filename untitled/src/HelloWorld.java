import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 10;
        int max = 30;

        System.out.println(rand.nextInt((max - min) + 1) + min);   // 10 이상 30 이하의 랜덤한 값
    }
}