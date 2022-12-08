public class LargestNumber {

    public static void main(String[] args) {
     int[] arr={2,524,132,528,125,45,8};
     int maxNum = arr[0];

     for (int i=0; i< arr.length;i++){

         if (arr[i] > maxNum){

             maxNum = arr[i];

         }
     }
     System.out.println("largest number" +maxNum);
    }
}
