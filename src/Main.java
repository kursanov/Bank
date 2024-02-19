import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int cod = 4526;

        System.out.println("Сыр созунузду жазыныз: ");
        int s = scanner.nextInt();
        if (s != cod) {
            System.out.println("Cыр соз! туура эмес!");

        } else if (cod == s) {




        while (true) {
            System.out.println("""
                    1.Балансты  текшеруу.
                    2.Балансты толуктоо.
                    3.Накталай алуу.
                    4.Акча которуулар.
                    """);



            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.print("Сиздин Балансыныз: " );
                    account.getBalances();
                    System.out.println();
                }
                case 2 ->{
                    System.out.println("Баланс толуктоо учун сумманы жазыныз: ");
                    double san = scanner.nextDouble();
                    account.balances = account.addBalances (account.balances,san);
                    System.out.println("Балансыныз " +san +" корсотулгон суммага толукталды!" );
                }
                case 3 ->{
                    System.out.print("Чечип алынуучу сумманы жазыныз: ");
                    double sum = scanner.nextByte();
                    account.withdrawMoney(sum);
                    System.out.print("Чечилип алынгандан сонку балансыныз: ");
                    account.getBalances();
                }
                case 4 ->{

                    System.out.print("Кимге перевод жасайсыз? Аты фамилиясын жазыныз: " + scanner.nextLine());
                    switch (scanner.nextLine()){
                        case "AzamatAzimovich" ->{
                            System.out.print("Сумманы жазыныз: ");
                            double summa = scanner.nextDouble();
                            account.transaction(summa);
                            System.out.print("Транзакция ийгиликтуу ишке ашырылды! \n");

                        }
                        case "DonaldTrump" ->{
                            System.out.print("Сумманы жазыныз: ");
                            double summa = scanner.nextDouble();
                            account.transaction(summa);
                            System.out.print("Транзакция ийгиликтуу ишке ашырылды! \n");

                        }
                    }




                }

            }
        }

    }

}}