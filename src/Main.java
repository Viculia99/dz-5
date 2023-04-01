public class Main {
    public static void main(String[] args) {
    int a = 9;
    int b = 20;
    int c = 10;
    int d = 17;

    int sum1 = a + b;
    int sum2 = c + d;
    System.out.println(sum1 > sum2);

    sum1 ++;
    sum2 -= 2;

    System.out.println(sum1 > sum2);

    int result1 = sum1 % 2;
    int result2 = sum2 % 2;

    String generalResult = result1 == 0  || result2 == 0 ? "True" : "False";
    System.out.println(generalResult);

    }
}