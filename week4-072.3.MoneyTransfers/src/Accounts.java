
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account aAccountt = new Account("A", 100);
        Account bAccountt = new Account("B", 0);
        Account cAccountt = new Account("C", 0);
        transfer(aAccountt, bAccountt, 50);
        transfer(bAccountt, cAccountt, 25);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
