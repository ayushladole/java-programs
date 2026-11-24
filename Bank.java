import java.util.Scanner;

public class Bank {

static double balance=1000;
    public static void main(String[] args) {

    int choice;
    Scanner scan = new Scanner(System.in);

    System.out.println("**********");
    System.out.println("-----BANKING PROGRAM-----");
    System.out.println("**********");

    System.out.println("1. Show Balance");
    System.out.println("2. Deposit money");
    System.out.println("3. Withdraw money");
    System.out.println("4. Exit\n");

    System.out.println("**********\n");

   

    while(true){

    System.out.print("Enter your choice: (1-4): ");
    choice = scan.nextInt();

    switch(choice){
    case 1: {
        ShowBalance();
        break;
    }
    case 2: {
        DepositMoney(scan);
        break;
    }
    case 3: {
        WithdrawMoney(scan);
        break;
    }
    case 4: {
        System.out.println("Exiting....");
        System.exit(0);
    }
    default:{
        System.out.println("INVALID CHOICE!!");
    }
}
    
    
}
}

static double ShowBalance(){
    System.out.println("Your balance is: $" + balance);
    return 0;
}
    
static double DepositMoney(Scanner scan){
    
    System.out.print("Enter amount to deposit: ");
    double depositMoney = scan.nextDouble();
    balance = balance + depositMoney;
    System.out.println("The amount of " + depositMoney + " is deposited!");
    System.out.println("Total balance : $" + balance);
    
    return 0;
}
static double WithdrawMoney(Scanner scan){
    
    System.out.print("Enter money to withdraw: ");
    double withdraw = scan.nextDouble();
    if(withdraw>balance){
        System.out.println("You have insufficient funds. You only have $" + balance );
    }
    else{
    System.out.println("$" + withdraw + " has been withdraw");
    double newbal = balance - withdraw;
    System.out.println("Your new balance is: $" + newbal);
    }
    
    return 0;
}
}
