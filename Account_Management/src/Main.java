public class Main {
    public static void main(String[] args) {
        PersonalAccount adik = new PersonalAccount(210104044, "Tilek");
        PersonalAccount azar = new PersonalAccount(210104045, "Joseph Stalin");
        adik.deposit(400);
        adik.withdraw(-200);
        adik.printTransactionHistory();
    }
}