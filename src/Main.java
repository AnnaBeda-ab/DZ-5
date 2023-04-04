public class Main {
    public static void main(String[] args) {
        int a = 11;
        int b = 20;
        int c = 30;
        int d = 40;
        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println(sum1 > sum2);
        sum1 = ++sum1;
        sum2 -= 2;
        System.out.println(sum1 > sum2);
        int ev1 = sum1 % 2;
        int ev2 = sum2 % 2;
        System.out.println(ev1 != ev2);
    }
}