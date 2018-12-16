import java.util.UUID;

public class Bank {
    private int totalSavings = -999;
    private int currentMonthIncome = -999;
    private int MonthlyIncomeDefault = -999;
    private String id_bank;
//    private int earning = 0;
//    private int spending = 0;

    public Bank(){
        this.totalSavings = 0;
        this.currentMonthIncome = 0;
        this.id_bank = UUID.randomUUID().toString();
    }

    public Bank(int totalSavings, int currentMonthIncome){
        this.totalSavings = totalSavings;
        this.currentMonthIncome = currentMonthIncome;
    }

    public void resetBank(){
        totalSavings = 0;
        currentMonthIncome = 0;

        System.out.println("Your account has been reset!");
        System.out.println("Your total amount is 0 now!");

    }

    public int getcurrentMonthIncome() {
        System.out.println("Your Income for the current month is : " + this.currentMonthIncome);
        return currentMonthIncome;
    }

    public void setcurrentMonthIncome(int currentMonthIncome) {
        System.out.println("Enter your income for this month");
        this.currentMonthIncome = currentMonthIncome;
    }
}
