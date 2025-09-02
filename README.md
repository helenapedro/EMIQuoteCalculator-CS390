# EMI Quote Calculator

## 📌 Problem Statement
A local bank wants a **console-based Quick EMI Quote Calculator**.  
Each time a visitor taps **“Try a sample quote”**, the kiosk should simulate a loan offer and show a clean summary.

---

## 🎯 Requirements

### 1. Randomize Inputs (using `Random` / `RandomGenerator` API)
- **Principal (P):** random integer in **[5,000 .. 25,000]** dollars  
- **Tenure (n):** random integer months in **[6 .. 36]**  
- **Annual Interest Rate (APR%):** random one-decimal value in **[3.5 .. 11.5]** (e.g., 7.2%)  

---

### 2. Compute EMI (Equated Monthly Installment – using `Math` API)
- **Monthly rate (r):**
  r = APR / 12 / 100

- **EMI formula:**
  EMI = P * r * (1 + r)^n / (1 + r)^n - 1
  

- **Total Payment:**
  Total = EMI * n

- **Total Interest:**
  Interest = Total - P
---

## 🏗️ Implementation
Create a class **`QuickEmiQuote`** with a `main` method that:
1. Generates randomized inputs.  
2. Calculates EMI, Total Payment, and Total Interest.  
3. Prints a clean summary in the console.

---
