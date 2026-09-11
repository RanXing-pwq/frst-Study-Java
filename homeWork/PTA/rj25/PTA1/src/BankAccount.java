/*设计一个BankAccount类，这个类包括：

（1）一个int型的balance变量表示账户余额。

（2）一个无参数构造方法，将账户余额初始化为0。

（3）一个带一个参数的构造方法，将账户余额初始化为输入的参数。

（4）一个int型的accountNumber变量表示开户数量，每创建一个BankAccount对象就自动加1。

（5）一个getBalance()方法：返回账户余额。

（6）一个withdraw()方法：带一个int型的amount参数，从账户余额中提取amount指定的款额。
如果amount<0或者大于当前账户余额，则输出“Invalid Amount”。

（7）一个deposit()方法：带一个int型的amount参数，将amount指定的款额存储到该银行账户上。
如果amount<0，则输出“Invalid Amount”。
 */
public class BankAccount {
    private int balance;
    public  static int accountNumber = 0;

    public BankAccount() {
        this.balance = 0;
        this.accountNumber += 1;
    }

    public BankAccount(int balance) {
        this.balance = balance;
        this.accountNumber += 1;
    }

    public int getBalance() {
        return this.balance;
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Invalid Amount");
        } else {
            this.balance -= amount;
        }
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else {
            this.balance += amount;
        }
    }
}
