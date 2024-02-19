public class Account {
    double[] balances;

    public Account() {
        this.balances = new double[0];
    }



    public double[] addBalances(double[] massiv, double balance) {
        double[] newBalance = new double[massiv.length + 1];
        for (int i = 0; i < massiv.length; i++) {
            newBalance[i] = massiv[i];
        }
        newBalance[massiv.length] = balance;
        return newBalance;
    }

    public void getBalances() {
        double count = 0;
        for (double v : balances) {
            count += v;

        }
        System.out.println(count);
    }
    public double[] withdrawMoney(double balance){
        double[] neqBalance = new double[balances.length];
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] >= balance){
                balances[i] -= balance;
                neqBalance[i] = balances[i];
                return neqBalance;
            }else System.out.println("Балансыныз корсотулгон суммадана аз! " + balance);
        }
        return balances;
    }

    public double[] transaction(double sum) {
        double[] balanceRecipient = new double[balances.length];
        boolean transactionSuccess = false;
        double sumTransaction = 0;

        for (int i = 0; i < balances.length; i++) {
            if (balances[i] >= sum) {
                balanceRecipient[i] += sum;
                sumTransaction += sum;
                transactionSuccess = true;
                break;
            }
        }

        if (transactionSuccess) {
            for (int i = 0; i < balances.length; i++) {
                balances[i] -= sumTransaction;
            }
            return balanceRecipient;
        } else {
            System.out.println("Балансынызда мындай сумма жок!");
            return new double[0];
        }}

}
