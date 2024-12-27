import java.util.*;

public class BankSystem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int balance = 0;
        boolean run = true;
            System.out.println("--------------------------------------------------");
            System.out.println("              FEDERAL BANK OF ZURGEN");
        while(run){
            System.out.println("--------------------------------------------------");
            System.out.println("1. WITHDRAW");
            System.out.println("2. DEPOSIT");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            System.out.println("--------------------------------------------------");
            System.out.print("INPUT: ");
            int input = scan.nextInt();
            System.out.println("--------------------------------------------------");
            switch(input){
                case 1:
                    System.out.print("HOW MUCH WOULD YOU LIKE TO WITHDRAW?: ");
                    int withdraw = scan.nextInt();
                    if(balance > 0 && withdraw <= balance){
                        balance -= withdraw;
                    }
                    else{
                        System.out.println("--------------------------------------------------");
                        System.out.println("INVALID INPUT");
                    }
                    break;
                case 2:
                    System.out.print("HOW MUCH WOULD YOU LIKE TO DEPOSIT?: ");
                    int deposit = scan.nextInt();
                    if(deposit >= 0){
                        balance += deposit;
                    }
                    else{
                        System.out.println("--------------------------------------------------");
                        System.out.println("INVALID INPUT");
                    }
                    break;
                case 3: 
                    System.out.println("CURRENT BALANCE: $" + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default: 
                    System.out.println("INVALID INPUT");
            }
        }
    }
}
