# 🔢 N to 1 Using Recursion in Java

## 📌 Description

This program explains how to print numbers from **N to 1 using recursion** in Java.

Recursion is a technique where a function calls itself to solve smaller parts of a problem. In this case, the function keeps reducing the value of `n` step by step until it reaches the stopping condition.

---

## ⚙️ How It Works

* The function starts with a number `n`.
* It checks the **base condition**:

  * If `n` becomes `0`, the recursion stops.
* Otherwise:

  * It processes the current value.
  * Then calls itself with a smaller value (`n - 1`).

This creates a sequence of calls that naturally prints numbers in **descending order**.

---

## 🔄 Execution Flow (Example: n = 5)

* Start with 5
* Then 4
* Then 3
* Then 2
* Then 1
* Stop at 0

---

## ✅ Output

5 4 3 2 1

---

## 🧠 Key Concepts

* Recursion
* Base Case
* Function Call Stack
* Problem Reduction

---

## ⏱️ Time Complexity

* O(n) — the function runs n times

## 💾 Space Complexity

* O(n) — due to recursive stack usage

---

## 🚀 Learning Outcome

* Understand recursive thinking
* Learn how function calls are stacked and executed
* Build a foundation for solving complex recursive problems
---

⭐ This example is a basic and important problem for learning recursion in Data Structures and Algorithms.
