import java.util.*;

public class StudentsMarkdowhile {
public static void main(String[] args) {
int maths, phy, che, eng, comp;
double finalscore;
boolean result = true;
Scanner marks = new Scanner(System.in);
do {
System.out.println("Enter marks for maths");
maths = marks.nextInt();
System.out.println("Enter marks for physics");
phy = marks.nextInt();
System.out.println("Enter marks for chemistry");
che = marks.nextInt();
System.out.println("Enter marks for english");
eng = marks.nextInt();
System.out.println("Enter marks for computer");
comp = marks.nextInt();
finalscore = (maths + phy + che + eng + comp) / 5.0;
if (finalscore > 90)
System.out.println("excellent");
else if (finalscore > 80)
System.out.println("very good");
else if (finalscore > 60)
System.out.println("good");
else if (finalscore > 40)
System.out.println("average");
else
System.out.println("poor");
System.out.println("Any more students? (true or false)");
result = marks.nextBoolean();
}
while(result);
}
}

