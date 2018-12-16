import java.util.Scanner;
import java.util.UUID;

public class Earnings {
    String id_Earn;
    String Earn_Cate;
    double EarningsAmount;
    String name;

    public Earnings(int amount) {
        id_Earn = UUID.randomUUID().toString();
        String Earn_Cate = "default";
        String name = "NA";
        EarningsAmount = amount;
        System.out.println("DEBUG: id : " + id_Earn);
    }

    public double getEarningsAmount() {
        System.out.println("The amount of your earning is : " + this.EarningsAmount);
        return EarningsAmount;
    }

    public void setEarningsAmount(int earningsAmount) {
        System.out.println("Enter your Earning's amount: ");
        Scanner scanner = new Scanner(System.in);
        EarningsAmount = scanner.nextDouble();
        System.out.println("Your Earning: " + EarningsAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEarn_Cate() {
        return Earn_Cate;
    }

    public void setEarn_Cate(String earn_Cate) {
        Earn_Cate = earn_Cate;
    }
}
