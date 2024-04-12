
import java.util.*;
import java.util.Random;
public class guess {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String play= "yes";
    int round= 0;
    int totalscore=0;
    int totaltries=0;
    System.out.println();

    System.out.println("a number is choosen between1 to 100. guess the number within 7 tries");
    while(play.equals("yes")){;
round++;

int guess;
int t=7;
int i;
int tries=0;
int score= 5;
Random rand=new Random();
int num=rand.nextInt(100);
for(i=0;i<t;i++){
    System.out.println();
    System.out.println("guess the number: ");
    guess=sc.nextInt();
    if(num==guess){
        tries++;
        System.out.println("yeahh!you guess the right number");
        System.out.println();
        System.out.println("score ="+score);
        System.out.println("tries ="+tries);
        totalscore=score;
        totaltries =tries;
        System.out.println();
        System.out.println("do u want to continue playing ? yes/no");
        play=sc.next().toLowerCase() ;
        break;
    }else if(num>guess && i!=t-1){
        System.out.println("the number is greater than"+guess);
        tries++;
        score--;
    }else{
        System.out.println("the number is less than"+guess);
        tries++;
        score--;
    }}


if(i==t){
System.out.println("limit exceed");
System.out.println("real number is"+num);
totalscore=+score;
totaltries=+tries;
System.out.println("score->"+score);
System.out.println("tries->"+tries);
System.out.println();
System.out.println("want to play again ? yes/no");
play=sc.next().toLowerCase();
}}
System.out.println("total rounds"+round);
System.out.println("no.of tries"+totaltries);
System.out.println("totalscore"+totalscore);

}}



