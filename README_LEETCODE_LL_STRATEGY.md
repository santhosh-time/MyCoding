# 🚀 MyCoding - Data Structures & Algorithms in Java

Welcome to **MyCoding**! 👋

This repository contains my complete journey of learning **Data Structures & Algorithms (DSA)** in **Java**. The goal is to master DSA concepts from scratch, understand how things work internally, and prepare for coding interviews at top product-based companies.

---

# 📚 Topics Covered

## ✅ LeetCode Strategies

This section contains common problem-solving patterns that frequently appear in coding interviews. Instead of memorizing solutions, learning these strategies helps you identify the correct approach for different problems.

---

# 🐢🐇 Strategy 1: Find Middle Node (Slow & Fast Pointer)

## 📖 Problem

Given the head of a singly linked list, find and return the **middle node**.

If the linked list has an **even number of nodes**, return the **second middle node**.

---

## 💡 Approach

Use the **Slow and Fast Pointer Technique**, also known as **Floyd's Tortoise and Hare Algorithm**.

The idea is simple:

* Move the **slow pointer** one step at a time.
* Move the **fast pointer** two steps at a time.
* When the fast pointer reaches the end of the list, the slow pointer will be exactly at the middle.

This approach allows us to find the middle node in a **single traversal** without first counting the total number of nodes.

---

## 🖼 Visualization

### Example 1 (Odd Number of Nodes)

```
Head

↓

10 → 20 → 30 → 40 → 50 → null
```

Movement

```
Step 1

Slow → 20
Fast → 30

-------------------

Step 2

Slow → 30
Fast → 50

-------------------

Step 3

Fast reaches null

Slow is at 30 ✅
```

Middle Node

```
30
```

---

### Example 2 (Even Number of Nodes)

```
Head

↓

10 → 20 → 30 → 40 → 50 → 60 → null
```

Movement

```
Step 1

Slow → 20
Fast → 30

-------------------

Step 2

Slow → 30
Fast → 50

-------------------

Step 3

Slow → 40
Fast → null
```

Returned Middle Node

```
40
```

Notice that for an even-length list, the algorithm returns the **second middle node**, which matches the requirement of many LeetCode problems.

---

## 💻 Java Solution

```java
public Node findMiddleNode() {

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
```

---

## ⚙️ Algorithm

1. Initialize both **slow** and **fast** pointers at the head.
2. Move **slow** one node at a time.
3. Move **fast** two nodes at a time.
4. Continue until **fast** reaches the end of the linked list.
5. Return the **slow** pointer.

---

## ⏱ Time Complexity

```
O(n)
```

The linked list is traversed only once.

---

## 💾 Space Complexity

```
O(1)
```

Only two pointers are used regardless of the size of the linked list.

---

## 🎯 Why This Approach?

Instead of:

1. Counting the total number of nodes.
2. Traversing again to reach the middle.

which requires **two traversals**, the Slow & Fast Pointer approach finds the middle in **one traversal**, making it more efficient and elegant.

---

## 📌 Interview Tip

Whenever you hear questions like:

* Find the middle node
* Split a linked list into two halves
* Check if a linked list is a palindrome
* Detect a cycle
* Find the starting point of a cycle

Think about the **Slow & Fast Pointer Technique** first. It is one of the most common Linked List patterns asked in coding interviews.

---

