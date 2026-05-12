    import java.util.Scanner;

   public class ImpromptuTask {

   public static void main(String [] args) {

   Scanner inputCollector = new Scanner(System.in);

   int sum = 0;

   System.out.print("Enter your number: ");
   int sumtoAdd = inputCollector.nextInt ();
  while (sumtoAdd > 0) {
    int rem = sumtoAdd % 10;
    sum = rem + sum;

    sumtoAdd = sumtoAdd / 10;
}   
  System.out.println("The sum is: " + sum);

}

}


  

     

