   import java.util.Scanner;

   public class TaskOne {

   public static void main (String [] args) {

   Scanner inputCollector = new Scanner(System.in);

   
int grade = 0;
int score = 1;

while (score <= 10) {
System.out.print("enter your grade: ");
int graded = inputCollector.nextInt();
grade = graded + grade;
score = score + 1;
}

int sum = grade;

System.out.println("The  class sum is: " + sum);

                 
}

}
