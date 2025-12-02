package OOPs;

class Account {
    int accountNo;
    double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest + " | Balance: " + balance);
    }
}

class SalaryAccount extends Account {
    double monthlySalary;

    public SalaryAccount(int accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited: " + monthlySalary + " | Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {

        System.out.println("---- Savings Account ----");
        SavingsAccount sa = new SavingsAccount(101, 5000, 5);
        sa.deposit(1000);
        sa.addInterest();
        sa.withdraw(2000);

        System.out.println("\n---- Salary Account ----");
        SalaryAccount sal = new SalaryAccount(202, 2000, 30000);
        sal.creditSalary();
        sal.withdraw(5000);
    }
}
