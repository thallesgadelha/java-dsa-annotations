# Big O Basic Concepts

Big O notation is used to describe how the performance of an algorithm changes as the input size grows.

When we talk about performance, we usually mean:

- **Time complexity**: how long an algorithm takes to run.
- **Space complexity**: how much memory an algorithm uses.

The variable `n` usually represents the size of the input data.

For example, if you have an array with 100 elements, then:

```txt
n = 100
```

---

## O(1) — Constant Time

An algorithm has **O(1)** complexity when its execution time does **not depend on the size of the input**.

No matter if the data set has 10 items, 1,000 items, or 1,000,000 items, the operation takes approximately the same amount of time.

### Example

Accessing an array element by its index:

```js
const numbers = [10, 20, 30, 40, 50];

console.log(numbers[2]);
```

In this example, the program directly accesses the element at index `2`.

It does not need to loop through the entire array.

### Why it is O(1)

The operation takes one direct step:

```txt
Go directly to index 2
```

So the complexity is:

```txt
O(1)
```

---

## O(log n) — Logarithmic Time

An algorithm has **O(log n)** complexity when it reduces the amount of work by splitting the data at each step.

This usually happens in algorithms that follow the **divide and conquer** strategy.

Instead of checking every item one by one, the algorithm eliminates a large portion of the data at each step.

### Example

Binary search is a common example of **O(log n)**.

Binary search works on a sorted list. It checks the middle element and decides whether to continue searching on the left side or the right side.

```js
const numbers = [1, 3, 5, 7, 9, 11, 13];

function binarySearch(array, target) {
  let left = 0;
  let right = array.length - 1;

  while (left <= right) {
    const middle = Math.floor((left + right) / 2);

    if (array[middle] === target) {
      return middle;
    }

    if (array[middle] < target) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
  }

  return -1;
}
```

### Why it is O(log n)

At each step, the algorithm cuts the search area in half.

For example, if you have 16 items:

```txt
16 → 8 → 4 → 2 → 1
```

The number of operations grows slowly compared to the input size.

So the complexity is:

```txt
O(log n)
```

---

## O(n) — Linear Time

An algorithm has **O(n)** complexity when its execution time grows directly in proportion to the size of the input.

If the input size doubles, the number of operations also roughly doubles.

### Example

Looping through an array:

```js
const names = ["Anna", "John", "Maria", "Peter"];

for (const name of names) {
  console.log(name);
}
```

### Why it is O(n)

The loop visits each element once.

If the array has 4 elements, the loop runs 4 times.

If the array has 1,000 elements, the loop runs 1,000 times.

So the complexity is:

```txt
O(n)
```

---

## O(n log n) — Linearithmic Time

An algorithm has **O(n log n)** complexity when it combines linear work with logarithmic behavior.

This is common in efficient sorting algorithms that repeatedly split data and then process or merge it.

### Examples

Common algorithms with **O(n log n)** complexity include:

- Merge sort
- Quick sort, on average
- Heap sort

### Example: Merge Sort Concept

Merge sort works by splitting the array into smaller parts, sorting those parts, and then merging them back together.

```txt
[8, 4, 2, 6]

Split:
[8, 4] [2, 6]

Split again:
[8] [4] [2] [6]

Merge sorted:
[4, 8] [2, 6]

Merge again:
[2, 4, 6, 8]
```

### Why it is O(n log n)

The algorithm splits the data multiple times, which creates a logarithmic behavior.

Then it processes all elements during the merge steps, which creates linear behavior.

Together, this gives:

```txt
O(n log n)
```

---

## O(n²) — Quadratic Time

An algorithm has **O(n²)** complexity when the number of operations grows with the square of the input size.

This often happens when there are nested loops.

### Example

Comparing every element with every other element:

```js
const numbers = [1, 2, 3, 4];

for (let i = 0; i < numbers.length; i++) {
  for (let j = 0; j < numbers.length; j++) {
    console.log(numbers[i], numbers[j]);
  }
}
```

### Why it is O(n²)

For each element in the outer loop, the inner loop runs through all elements again.

If the array has 4 elements:

```txt
4 × 4 = 16 operations
```

If the array has 100 elements:

```txt
100 × 100 = 10,000 operations
```

So the complexity is:

```txt
O(n²)
```

### Common Example

Bubble sort is a common algorithm with **O(n²)** time complexity in the average and worst cases.

---

# Omega, Theta, and Big O

Big O is not the only notation used to describe algorithm complexity.

There are three important notations:

- **Omega (Ω)**: best-case scenario
- **Theta (Θ)**: average or tight-case scenario
- **Big O (O)**: worst-case scenario

---

## Omega (Ω) — Best Case

Omega notation describes the **best-case scenario** for an algorithm.

It tells us the fastest possible time an algorithm can run under ideal conditions.

### Simple Explanation

Omega answers the question:

```txt
What is the best performance this algorithm can have?
```

### Example

Imagine searching for a number in an array:

```js
const numbers = [5, 10, 15, 20, 25];
```

If you are searching for `5`, the algorithm finds it immediately at the first position.

That is the best case.

```txt
Ω(1)
```

Because the algorithm only needs one operation.

---

## Theta (Θ) — Average or Tight Case

Theta notation describes the expected or tight bound of an algorithm.

It is used when the best-case and worst-case behavior are closely related, or when we want to describe the general expected performance.

### Simple Explanation

Theta answers the question:

```txt
What performance should I generally expect?
```

### Example

If an algorithm usually needs to check most of the items in an array, we can say its average behavior is linear.

```txt
Θ(n)
```

This means the algorithm generally grows proportionally with the input size.

---

## Big O (O) — Worst Case

Big O notation describes the **worst-case scenario** for an algorithm.

It tells us the slowest an algorithm can run as the input grows.

### Simple Explanation

Big O answers the question:

```txt
What is the maximum amount of work this algorithm might need?
```

### Example

Searching for a number in an unsorted array:

```js
const numbers = [5, 10, 15, 20, 25];
```

If the number is at the last position, or if it does not exist in the array, the algorithm may need to check every element.

So the worst case is:

```txt
O(n)
```

---

# Comparing Common Complexities

From fastest to slowest, common complexities are usually ordered like this:

```txt
O(1) < O(log n) < O(n) < O(n log n) < O(n²)
```

## Summary Table

| Complexity | Name | Description | Example |
|---|---|---|---|
| `O(1)` | Constant Time | Does not depend on input size | Accessing an array element by index |
| `O(log n)` | Logarithmic Time | Cuts the problem size at each step | Binary search |
| `O(n)` | Linear Time | Grows directly with input size | Looping through an array |
| `O(n log n)` | Linearithmic Time | Splits and processes data efficiently | Merge sort, quick sort |
| `O(n²)` | Quadratic Time | Usually caused by nested loops | Bubble sort |

---

# Useful Tips

## 1. Drop Non-Dominant Terms

When analyzing Big O, we focus on the part that grows the fastest as `n` becomes large.

### Example

```txt
O(n² + n)
```

As `n` grows, `n²` becomes much larger than `n`.

So we simplify it to:

```txt
O(n²)
```

### Why?

If `n = 1,000`:

```txt
n² = 1,000,000
n = 1,000
```

The `n²` term dominates the total cost.

---

## 2. Drop Constants

Constants are ignored in Big O notation because Big O focuses on growth rate, not exact operation count.

### Example

```txt
O(2n)
```

This means the algorithm does roughly two operations for every input item.

However, as `n` grows, the important part is still that the algorithm grows linearly.

So we simplify it to:

```txt
O(n)
```

Another example:

```txt
O(5n + 10)
```

This also simplifies to:

```txt
O(n)
```

---

# Final Notes

Big O notation helps us understand how scalable an algorithm is.

It does not tell us the exact running time in seconds. Instead, it tells us how the algorithm behaves as the input size grows.

A good algorithm is not always the one with the smallest Big O notation, but Big O is a very useful tool for comparing algorithms, especially when dealing with large data sets.
