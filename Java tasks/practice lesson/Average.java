import java.util.Scanner;

public class Average {

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

int grade = 0;
int score = 1;

while (score <= 10) {
System.out.print("enter your grade: ");
int graded = input.nextInt();
grade = graded + grade;
score = score + 1;
}

int average = grade / 10;

System.out.println("The average class score is: " + average);
}

}

