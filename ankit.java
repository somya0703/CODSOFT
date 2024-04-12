import java.util.Scanner;
public class ankit {
    public static void main(String[]args){
     
    int marks[]=new int[100];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks of each subject out of 100:");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        System.out.println(" marks of physics = " +marks[0]);
        System.out.println(" marks of chemistry = " +marks[1]);
        System.out.println(" marks of maths = " +marks[2]);
        System.out.println(" marks of sst = " +marks[3]);
        System.out.println(" marks of english = " +marks[0]);
        int sum = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        System.out.println("sum of the marks of subject out of 100 ="+sum);
        int average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println(" the average percentage is = "+average);
        if(average>90){
            System.out.println("grade A");
        }if(average> 80){
            System.out.println("grade B");
        }else{
            System.out.println("grade C");
        }
    }
}
