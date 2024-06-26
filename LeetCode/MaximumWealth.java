package LeetCode;

public class MaximumWealth {
    public static void main(String[] args) {

        //Richest Customer Wealth

        //1672

        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        int richestOne = 0;

        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }

            if (richestOne < wealth)
                richestOne = wealth;
        }
        
        System.out.println(richestOne);
    }
}