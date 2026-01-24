import java.util.Scanner;
public class SmFor {
public static void main(String[] args) {
int math, phy, chem, studentNumber;
double finalScore;
Scanner marks = new Scanner(System.in);
System.out.print("Enter number of students: ");
studentNumber = marks.nextInt();
for (int i = 0; i < studentNumber; i++) {
System.out.println("\nStudent " + (i + 1));
System.out.print("Enter marks for Math: ");
math = marks.nextInt();
System.out.print("Enter marks for Physics: ");
phy = marks.nextInt();
System.out.print("Enter marks for Chemistry: ");
chem = marks.nextInt();
finalScore = (math + phy + chem) / 3.0;
if (finalScore > 90)
System.out.println("Excellent");
else if (finalScore > 80)
System.out.println("Very Good");
else if (finalScore > 60)
System.out.println("Good");
else if (finalScore > 40)
System.out.println("Average");
else
System.out.println("Poor");
}
marks.close();
}
}
