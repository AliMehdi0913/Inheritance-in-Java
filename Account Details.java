class Accounts {
protected double balance; public Accounts(double b) { balance=b;}
public void debit(double amount) { if (amount > balance) {
System.out.println("Insufficient balance.");} else {
balance -= amount; System.out.println("Debited: " + amount);}} public void credit(double amount) {
balance += amount; System.out.println("Credited: " + amount);} public double getBalance() {
return balance;}}
class Sav_Account extends Accounts { private double interestRate = 0.06; private int timeSpan;
public Sav_Account(double balance, int ts) { super(balance);
timeSpan=ts;}
public double calculateInterest() {
return balance * interestRate * (timeSpan / 365.0); }@Override public void credit(double amount) {
double interest = calculateInterest(); balance += amount + interest;
System.out.println("Credited: " + amount + " + Interest: " + interest);}}
 
public class BankingApplication {
public static void main(String[] args) { Accounts account = new Accounts(5000); account.credit(1000); account.debit(2000);
System.out.println("Account Balance: " + account.getBalance()); System.out.println("\nSaving Account Transactions:");
Sav_Account savingAcc = new Sav_Account(5000, 30); savingAcc.credit(1000);
savingAcc.debit(500);
System.out.println("Saving Account Balance: " + savingAcc.getBalance());}}
