    import java.util.Scanner;

   public class ImpromptuTaskTwo {

   public static void main(String [] args) {

   Scanner inputCollector = new Scanner(System.in);

   int multiple = 0;

   System.out.print("Enter your number: ");
   int sumtoAdd = inputCollector.nextInt ();
  for (;sumtoAdd > 0;) {
    int square = sumtoAdd % 10;
    multiple = square * square;
    System.out.println(multiple);

    sumtoAdd = sumtoAdd / 10;
}   
  

}

}


  

     

