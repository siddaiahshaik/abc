public class EvenAndOddNum   {
    public static void main(String[] args) {
        int num[] = {1,2,5,4,8,44,32,25,10,99,9};

        System.out.println("Even Number");

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
        System.out.println("Odd Number");

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }
    }
}