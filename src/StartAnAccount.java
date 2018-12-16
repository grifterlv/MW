import java.util.Scanner;
import java.util.UUID;

public class StartAnAccount {
    String id_Acc;
    String name;
    Bank bank;

    public static StartAnAccount(String name){
        this.name = name;
        this.id_Acc = UUID.randomUUID().toString();
        this.bank = new Bank();
    }

//    public StartAnAccount startPoint(){
//        System.out.println("You are about to start MoneyWise for the first time !");
//        System.out.println("Enter your name: ");
//        Scanner scanner = new Scanner(System.in);
//        String tmp = scanner.nextLine();
//        StartAnAccount startAcc = new StartAnAccount(tmp);
//        return startAcc;
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setBank (Bank bank){
        this.bank = bank;
   }



}
