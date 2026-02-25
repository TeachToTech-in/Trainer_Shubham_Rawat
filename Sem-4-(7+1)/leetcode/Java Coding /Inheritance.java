
public class Inheritance {
    public static void main(String[] args) {
       

    }

}

class Account {
    public double balance;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
