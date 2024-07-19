import java.util.Scanner;

public class DisplayScores{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        int score1 = scanner.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = scanner.nextInt();
        System.out.print("Enter score 3: ");
        int score3 = scanner.nextInt();
        System.out.print("Enter score 4: ");
        int score4 = scanner.nextInt();
        System.out.print("Enter score 5: ");
        int score5 = scanner.nextInt();
        System.out.print("Enter score 6: ");
        int score6 = scanner.nextInt();
        System.out.print("Enter score 7: ");
        int score7 = scanner.nextInt();
        System.out.print("Enter score 8: ");
        int score8 = scanner.nextInt();
        System.out.print("Enter score 9: ");
        int score9 = scanner.nextInt();
        System.out.print("Enter score 10: ");
        int score10 = scanner.nextInt();

        
System.out.println("The scores you entered are:"+score1+"\t"+ score2+"\t"+ score3+"\t"+ score4+"\t"+ score5+"\t"+score6+"\t"+score7+"\t"+score8+"\t"+score9+"\t"+score10+"\t");
System.out.println();
System.out.println("These are the even numbers from the user input");
if(score1%2==0)System.out.print(score1+"\t");
if(score2%2==0)System.out.print(score2+"\t");
if(score3%2==0)System.out.print(score3+"\t");
if(score4%2==0)System.out.print(score4+"\t");
if(score5%2==0)System.out.print(score5+"\t");
if(score6%2==0)System.out.print(score6+"\t");
if(score7%2==0)System.out.print(score7+"\t");
if(score8%2==0)System.out.print(score8+"\t");
if(score9%2==0)System.out.print(score9+"\t");
if(score10%2==0)System.out.print(score10+"\t");
           
    }
}
