// Write a program that displays  number from (1-100), print the even, odd number, and number divisible by 4 print "Hurray"

public class ClassWork {

public static void main(String [] args) {

int number = 1;

for (number = 1; number <= 100; number++) {
   if (number % 2 == 0) {
    System.out.println("even: "+ number);
          }
  if (number % 2 == 1) {
    System.out.println("odd: "+ number);
      }
  if (number % 4 == 0) {
    System.out.println(number + " Hurray, It is a multiple of 4");
      }
    }

 }
}
