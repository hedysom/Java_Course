import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        do {
            do {
                System.out.println("Inserisci un numero da 1 a 6: ");
                predictedValue = in.nextInt();
                System.out.println("Inserisci quanto vuoi scommetere, hai a disposizione: "+ playerAccount.getBalance());
                bet = in.nextDouble();
                if( (bet > playerAccount.getBalance()) || bet > 5 * casinoAccount.getBalance()) {
                    System.out.println("non abbastanza soldi sul tuo conto o su quello del casino!");
                }
            }   while((bet > playerAccount.getBalance()) || bet > 5 * casinoAccount.getBalance());
            actualValue = 1+random.nextInt(6);
            System.out.println("il dado ha restituito " + actualValue);
            if(predictedValue == actualValue){
                System.out.println("Hai vinto!");
                casinoAccount.withdraw(5*bet);
                playerAccount.deposit(5*bet);
            }
            else{
                System.out.println("Hai perso!");
                playerAccount.withdraw(bet);
                casinoAccount.deposit(bet);
            }
            System.out.print("Vuoi scommetere anora? Digita 'si': ");
            choice = in.next();
        } while(choice.equals("si"));
    }
}