import java .util .Scanner;

public class atm{
    public static void main(String[] args) {
        int balance = 100000, withdraw,deposit;
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("!hello //---welcome to the xyz atm//---");
            System.out.println("choose 1 for withdraw money");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance");
            System.out.println(" choose 4 option for exit");
            System.out.print("choose the operation that you want to perform :  ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter amount that you want to withdraw:  ");

                    withdraw = sc.nextInt();
                    if(balance>=withdraw){
                        balance= balance- withdraw;
                        System.out.println("please collect your money");
                    }
                    else{
                        System.out.println("insufficient balance");
                    }
                    System.out.println("");
                    break;
            case 2: 
            System.out.print("enter the money you wnt to deposit");
            deposit= sc.nextInt();
            balance = balance +deposit;

System.out.println(" your money has been succesfully deposited");
     System.out.println("");
    break;      
        case 3: 
System.out.println(" balance : "+balance);
System.out.println("");
break;
case 4:
 System.exit(0);
    }
}
}}