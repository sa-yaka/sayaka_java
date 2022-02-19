package CompoundInterest;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6; // 增长次数
        final int NYEARS = 10;

        // 设置利率为 10% 11% 12% 13% 14% 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        // 最初存款 10000 balances[0 ~ 5] = 10000
        double[][] balances = new double[NYEARS][NRATES];
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // 计算未来的利息
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // 上一年存款
                double oldBalance = balances[i - 1][j];
                // 增长的
                double interest = oldBalance * interestRate[j];
                // 现在的存款
                balances[i][j] = oldBalance + interest;
            }
        }

        // 打印利率
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        // 打印存款
        for (double[] row : balances) {
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }

            System.out.println();
        }
    }
}