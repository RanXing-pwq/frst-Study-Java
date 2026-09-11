import java.util.Scanner;

public class Test {
    /* 请在这里填写答案 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean choice1 = scanner.nextBoolean();
        //是否创建对象
        if (choice1 == true) {
            //账户1
            BankAccount myAccount1 = new BankAccount();
            //账户2
            BankAccount myAccount2 = new BankAccount(100);
            //选择操作类型
            int choice2 = scanner.nextInt();
            switch (choice2) {
                case 0://存款
                    int depositAmount = scanner.nextInt();
                    myAccount2.deposit(depositAmount);
                    break;
                case 1://取款
                    int withdrawAmount = scanner.nextInt();
                    myAccount2.withdraw(withdrawAmount);
                    break;
            }

            System.out.println(myAccount2.getBalance());
        }

        System.out.println(BankAccount.accountNumber);
        scanner.close();
    }

}

