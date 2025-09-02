package com.pedro;

public class QuickEmiQuote {
    public static void main(String[] args) {
        // 1. Randomize inputs(Use Random/ RandomGenerator API)
        int P = RandomNumbers.getRandomInt(5000, 25000); // principal
        int n = RandomNumbers.getRandomInt(6, 36);  // Tenure(months)
        int decimalValue = RandomNumbers.getRandomInt(35, 115);
        double APR = decimalValue/10.0; // Annual Interest Rate

        // 2. Compute EMI (Equated Monthly Installment – Use Math API)
        double r = APR / 12 / 100;  // montly rate
        double EMI = (P * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1)); // Equated Monthly Installment
        double totalPayment = (EMI * n);
        double totalInterest = (totalPayment - P);

        // 3. Show multiple integer views of the EMI
        int truncatedEMI = (int) EMI;
        int roundedEMI = (int) Math.round(EMI);

        // 4. Format the output nicely all the 1 to 3 steps of computations and the inputs
        System.out.println("\n----- Quick EMI Quote Summary -----");
        System.out.printf("Principal: $%,d%n", P);
        System.out.printf("Tenure: %d months%n", n);
        System.out.printf("APR: %.1f%%%n", APR);
        System.out.printf("EMI: $%.2f%n", EMI);
        System.out.printf("Total Payment: $%.2f%n", totalPayment);
        System.out.printf("Total Interest: $%.2f%n", totalInterest);
        System.out.println("Truncated EMI: $" + truncatedEMI);
        System.out.println("Rounded EMI: $" + roundedEMI);
        System.out.println("-----------------------------------");
    }
}
