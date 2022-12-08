public class SecondMax {

    public static void main(String[] args) {

        int a[]= {10,50,80,60,100};

        int max=0;
        int secondmax=0;

        for(int i=0; i<a.length; i++){

            if(max<a[i]) {
                secondmax = max;
                max = a[i];

            } else if(max!=a[i] && secondmax<a[i]){
                secondmax = a[i];




            }
        }
System.out.println(secondmax);
    }

}
