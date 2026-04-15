   import java.util.Scanner;

   public class TaskTwo {

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

int average = grade / 10;

System.out.println("The  class Average Score is: " + average);

                 
}

}
