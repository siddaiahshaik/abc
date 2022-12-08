public class FibSum {

    public static void main(String[] args) {
        int a=0,b=1;
      int fCount=2;

      String primes="";

      int sum = 0;

      for (int i=0;fCount!=10;i++){
           int c = a+b;
           fCount++;

           a = b;
           b = c;

           int count = 0 ;

        for (int j=1;j<=c;j++){

            if (c%j==0){
                count++;

            }
            if (count==2){
                primes = primes+c+",";
                sum = sum +c;


            }
        }
        System.out.println(primes);
        System.out.println(sum);
      }

    }

}
