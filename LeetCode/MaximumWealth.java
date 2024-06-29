package LeetCode;

public class MaximumWealth {
    public static void main(String[] args) {
        //1672
        
        // Problem: Maximum Wealth of a Customer
        // Given a 2D array 'accounts' where accounts[i] is a list of integers representing the accounts of the ith customer.
        // The wealth of a customer is the sum of their assets (i.e., the sum of all their integers).
        // Your task is to find the maximum wealth among all customers and return it.

        // Example:
        // Input: accounts = [[1,2,3],[3,2,1]]
        // Output: 6
        // Explanation: 
        // The first customer has wealth = 1 + 2 + 3 = 6
        // The second customer has wealth = 3 + 2 + 1 = 6
        // Both customers have the maximum wealth, so return 6.

        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        int richestOne = 0;

        // Iterate through each customer's account
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            // Calculate the wealth of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }

            // Update the richest customer if the current customer's wealth is higher
            if (richestOne < wealth)
                richestOne = wealth;
        }
        
        System.out.println(richestOne);
    }
}