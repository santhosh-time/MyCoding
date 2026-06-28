# 🚀 MyCoding - Data Structures & Algorithms in Java

Welcome to **MyCoding**! 👋

This repository contains my complete journey of learning **Data Structures & Algorithms (DSA)** in **Java**. The goal is to master DSA concepts from scratch, understand how things work internally, and prepare for coding interviews at top product-based companies.

---

# 📚 Topics Covered

## 1. Time Complexity (Big O)

Learn how to analyze the efficiency of an algorithm.

Topics Covered:
- What is Time Complexity?
- Why Big O is important?
- Best Case
- Average Case
- Worst Case
- Space Complexity

Example:

```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
```

Time Complexity: **O(n)**

---

## 2. Worst Case → Big O

Big O always represents the **Worst Case Time Complexity**.

Example:

Searching in an array

Best Case

```
Target found at index 0
O(1)
```

Worst Case

```
Target found at last index
O(n)
```

Since Big O always considers the worst case:

```
Time Complexity = O(n)
```

---

## 3. Drop Constants

Ignore constant values while calculating complexity.

Example

```java
for(int i=0;i<n;i++){}
for(int i=0;i<n;i++){}
```

Complexity

```
O(2n)
```

After dropping constants

```
O(n)
```

---

## 4. Drop Non-Dominant Terms

Always keep the fastest growing term.

Example

```
O(n² + n)
```

After removing non-dominant term

```
O(n²)
```

Another Example

```
O(n³ + n² + n + 1)
```

Final Complexity

```
O(n³)
```

---

## 5. Different Terms of Input

When multiple inputs are involved, don't combine them.

Example

```java
for(int i=0;i<a;i++){}

for(int j=0;j<b;j++){}
```

Complexity

```
O(a + b)
```

Nested Loops

```java
for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){}
}
```

Complexity

```
O(a × b)
```

---

## 6. Common Time Complexities

| Complexity | Name | Example |
|------------|------|----------|
| O(1) | Constant | Access Array Element |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Traversing Linked List |
| O(n log n) | Linearithmic | Merge Sort |
| O(n²) | Quadratic | Bubble Sort |
| O(n³) | Cubic | Triple Nested Loops |
| O(2ⁿ) | Exponential | Recursive Fibonacci |
| O(n!) | Factorial | Traveling Salesman |

---

# 🔍 Under The Hood

Before learning Data Structures, it's important to understand how Java stores data in memory.

Topics Covered

- Stack Memory
- Heap Memory
- References
- Objects
- Primitive Types
- Pointers (References)
- Garbage Collection

---

# 📌 Linked List

A Linked List is a linear data structure where each element (Node) stores:

- Data
- Reference (Pointer) to the next node

Unlike arrays, Linked Lists are **not stored in contiguous memory**.

Example

```
Head
 ↓

10 → 20 → 30 → 40 → null

                     ↑
                    Tail
```

---

# 📦 LinkedList Class Variables

```java
private Node head;
private Node tail;
private int length;
```

Variable | Description
---------|------------
head | Points to first node
tail | Points to last node
length | Stores total number of nodes

---

# 📦 Node Class

```java
class Node{

    int value;
    Node next;

    Node(int value){
        this.value = value;
    }

}
```

Each node contains:

- Value
- Pointer to next node

Example

```
+-------+-------+
|  10   |   •---|---->
+-------+-------+
```

---

# 🏗 LinkedList Constructor

```java
public LinkedList(int value){
    Node newNode = new Node(value);

    head = newNode;
    tail = newNode;
    length = 1;
}
```

Creates the first node and initializes

- Head
- Tail
- Length

---

# 📖 Utility Methods

### printList()

Prints every node in the list.

Time Complexity

```
O(n)
```

---

### getHead()

Returns the first node.

```
O(1)
```

---

### getTail()

Returns the last node.

```
O(1)
```

---

### getLength()

Returns the size of Linked List.

```
O(1)
```

---

# ➕ append()

Adds a node at the end.

```
10 → 20 → 30

↓

10 → 20 → 30 → 40
```

Complexity

```
Time : O(1)

Space : O(1)
```

---

# ➖ removeLast()

Removes the last node.

Before

```
10 → 20 → 30 → 40
```

After

```
10 → 20 → 30
```

Complexity

```
Time : O(n)

Space : O(1)
```

Reason

Need to traverse till second-last node.

---

# ⬅ prepend()

Adds node at beginning.

Before

```
20 → 30
```

After

```
10 → 20 → 30
```

Complexity

```
Time : O(1)

Space : O(1)
```

---

# ➡ removeFirst()

Removes first node.

Before

```
10 → 20 → 30
```

After

```
20 → 30
```

Complexity

```
Time : O(1)

Space : O(1)
```

---

# 🎯 get(index)

Returns node at given index.

Example

```
0   1   2

10→20→30
```

```
get(1)

returns

20
```

Complexity

```
O(n)
```

---

# ✏ set(index, value)

Updates node value.

Before

```
10 → 20 → 30
```

```
set(1,50)
```

After

```
10 → 50 → 30
```

Complexity

```
O(n)
```

---

# ➕ insert(index, value)

Insert node at any position.

Before

```
10 → 20 → 40
```

Insert

```
30 at index 2
```

After

```
10 → 20 → 30 → 40
```

Complexity

```
O(n)
```

---

# ❌ remove(index)

Remove node by index.

Before

```
10 → 20 → 30 → 40
```

Remove index

```
2
```

After

```
10 → 20 → 40
```

Complexity

```
O(n)
```

---

# 🔄 reverse()

Reverses entire linked list.

Before

```
Head

↓

10 → 20 → 30 → 40

                ↑

              Tail
```

After

```
Head

↓

40 → 30 → 20 → 10

                ↑

              Tail
```

Complexity

```
Time : O(n)

Space : O(1)
```

---

# 📊 Time Complexity Summary

| Method | Time Complexity |
|---------|-----------------|
| append() | O(1) |
| removeLast() | O(n) |
| prepend() | O(1) |
| removeFirst() | O(1) |
| get() | O(n) |
| set() | O(n) |
| insert() | O(n) |
| remove() | O(n) |
| reverse() | O(n) |

---

# 🎯 Goals

- Learn DSA from Scratch
- Understand Internal Working
- Crack Product-Based Company Interviews
- Improve Problem Solving
- Master Java Collections Framework
- Build Strong Coding Fundamentals

---

# 📅 Upcoming Topics

- Doubly Linked List
- Stacks
- Queues
- Trees
- Binary Search Trees
- Heaps
- Hash Tables
- Graphs
- Recursion
- Dynamic Programming
- Sorting Algorithms
- Searching Algorithms
- LeetCode Problems
- Interview Questions

---

## ⭐ If you find this repository useful, don't forget to star it!

Happy Coding! 🚀