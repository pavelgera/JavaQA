public class FizzBuzz
{
    private static int counter;
    private static boolean thisFizz(int i) {
        return i % 3 == 0;
    }
    private static boolean thisBuzz(int i) {
        return i % 5 == 0;
    }
    public static void main(String[] args) {
        for (counter = 1; counter <= 100; ++counter) {
            if (thisFizz(counter) && thisBuzz(counter)) {
                System.out.println("FizzBuzz");
            } else if (thisFizz(counter)) {
                System.out.println("Fizz");
            } else if (thisBuzz(counter)) {
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
        }
    }
}
