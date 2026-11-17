# INVERTIS UNIVERSITY, BAREILLY
## Department of Computer Science & Engineering
### INTRODUCTION TO PROGRAMMING USING JAVA LAB (BCS351)
#### B.Tech CSE – 3rd Semester / Second Year

---

| **Submitted To:** | **Submitted By:** |
| :--- | :--- |
| **Mr. Arsh Singh** | **Akash Kumar** |
| Assistant Professor | Roll No.: 2510303060 |
| Dept. of Computer Science & Engineering | Section: B |

---

## INDEX

| SN. | Program Name | Date of Performance | Status |
| :---: | :--- | :---: | :---: |
| 1 | [Hello World, Variables and Arithmetic Operations](#experiment-no-1) | 02-09-2026 | Completed |
| 2 | [Decisions and Loops with Numbers](#experiment-no-2) | 02-09-2026 | Completed |
| 3 | [Star and Number Patterns using Nested Loops](#experiment-no-3) | 09-09-2026 | Completed |
| 4 | [Writing Functions (nCr, nPr, maxOf)](#experiment-no-4) | 09-09-2026 | Completed |
| 5 | [Arrays: Traversal, Sum, Max, and Count Conditions](#experiment-no-5) | 16-09-2026 | Completed |
| 6 | [Arrays: Reverse Printing, Min Value, and Duplicates](#experiment-no-6) | 16-09-2026 | Completed |
| 7 | [Counting Steps and Time Complexity Analysis](#experiment-no-7) | 23-09-2026 | Completed |
| 8 | [Matrices: Transpose and Row Sums](#experiment-no-8) | 23-09-2026 | Completed |
| 9 | [Matrices: Rows and Columns Operations](#experiment-no-9) | 07-10-2026 | Completed |
| 10 | [Switch Statement and ArrayList Manipulation](#experiment-no-10) | 07-10-2026 | Completed |
| 11 | [Bubble Sort and Selection Sort Algorithms](#experiment-no-11) | 21-10-2026 | Completed |
| 12 | [Insertion Sort and Shift Counting](#experiment-no-12) | 21-10-2026 | Completed |
| 13 | [Strings: Built-in Methods, Reversal, and Palindromes](#experiment-no-13) | 28-10-2026 | Completed |
| 14 | [Characters: Counting Vowels, Letters and Positions](#experiment-no-14) | 28-10-2026 | Completed |
| 15 | [StringBuilder Class Methods (append, insert, delete)](#experiment-no-15) | 04-11-2026 | Completed |

---

## EXPERIMENT NO. 1

- **Date of Performance:** 02-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Hello World, Variables and Arithmetic Operations  

### 1. Aim
To print text, store values in variables and calculate with arithmetic operators.

### 2. Software / Tools Required
Java Development Kit (JDK 8 or higher); an IDE (Eclipse / IntelliJ IDEA / VS Code / NetBeans) or the command line (`javac` and `java`).

### 3. Theory
Every Java program starts execution from the `main` method inside a class. `System.out.println()` prints text followed by a new line. A variable stores a value and has a data type such as `int`, `double`, `char` or `String`. The arithmetic operators are `+`, `-`, `*`, `/` and `%` (remainder); dividing two `int` values gives an `int` result. The `final` keyword creates a constant whose value cannot be changed.

### 4. Algorithm / Procedure
- **Task 1:** Start $\rightarrow$ Print "Hello World" $\rightarrow$ Print "Welcome to Java" $\rightarrow$ Stop.
- **Task 2:** Start $\rightarrow$ Declare `roll`, `percentage`, `section`, and `name` with sample values $\rightarrow$ Print each value with label $\rightarrow$ Stop.
- **Task 3:** Start $\rightarrow$ Declare `a = 17`, `b = 5` $\rightarrow$ Calculate `a + b`, `a - b`, `a * b`, `a / b`, `a % b` $\rightarrow$ Print results $\rightarrow$ Stop.
- **Task 4:** Start $\rightarrow$ Declare `final double PI = 3.14`, `radius = 7` $\rightarrow$ Calculate Area and Perimeter $\rightarrow$ Print results $\rightarrow$ Stop.

### 5. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_01/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_01/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_01/Task3.java)
- [Task4.java](file:///c:/Users/ASUS/Downloads/java/Experiment_01/Task4.java)

```java
// Task 1
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Welcome to Java");
    }
}

// Task 2
public class Task2 {
    public static void main(String[] args) {
        int roll = 101;
        double percentage = 84.5;
        char section = 'B';
        String name = "Asha";
        System.out.println("Roll: " + roll);
        System.out.println("Percentage: " + percentage);
        System.out.println("Section: " + section);
        System.out.println("Name: " + name);
    }
}

// Task 3
public class Task3 {
    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}

// Task 4
public class Task4 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int radius = 7;
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
    }
}
```

### 6. Input & Output
- **Input:** Hardcoded values (`roll = 101`, `percentage = 84.5`, `section = 'B'`, `name = "Asha"`, `a = 17, b = 5`, `radius = 7, PI = 3.14`).
- **Output:**
```
Task 1:
Hello World
Welcome to Java

Task 2:
Roll: 101
Percentage: 84.5
Section: B
Name: Asha

Task 3:
Sum: 22
Difference: 12
Product: 85
Quotient: 3
Remainder: 2

Task 4:
Area: 153.86
Perimeter: 43.96
```

### 7. Result
The programs were written, compiled, and executed successfully. Basic output printing, data types, arithmetic operators, and constants were demonstrated.

### 8. Viva-Voce Questions & Answers
1. **What is the role of the main method in Java?**  
   *Answer:* It serves as the standard entry point for any standalone Java application. JVM invokes `public static void main(String[] args)` to begin execution.
2. **Name the primitive data types used in this experiment.**  
   *Answer:* `int`, `double`, and `char` (`String` is a reference type/class).
3. **Why is 17 / 5 equal to 3 and not 3.4?**  
   *Answer:* In Java, integer division between two `int` operands truncates any fractional portion and returns an integer quotient.
4. **What does the % operator do?**  
   *Answer:* It is the modulus operator, which returns the remainder of the integer division.
5. **What is the use of the final keyword?**  
   *Answer:* When applied to a variable, `final` makes it a constant whose assigned value cannot be re-assigned or altered.

---

## EXPERIMENT NO. 2

- **Date of Performance:** 02-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Decisions and Loops with Numbers  

### 1. Aim
To use `if`, `else if` and loops to make decisions and repeat steps with whole numbers.

### 2. Software / Tools Required
Java Development Kit (JDK 8 or higher); IDE or terminal.

### 3. Theory
Conditional statements control the execution path depending on Boolean evaluations. Logical operators `&&` (AND) and `||` (OR) combine conditions. A `for` loop executes a block repeatedly while its condition is satisfied.

### 4. Algorithm / Procedure
- **Task 1:** Check if `n % 2 == 0`; if true print "is even", else "is odd".
- **Task 2:** Grade evaluation with `marks >= 90` (A), `marks >= 75` (B), else (C).
- **Task 3:** Leap year: `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`.
- **Task 4:** Loop `i` from 1 to 5, calculating `fact = fact * i`.

### 5. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_02/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_02/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_02/Task3.java)
- [Task4.java](file:///c:/Users/ASUS/Downloads/java/Experiment_02/Task4.java)

### 6. Output
```
Task 1: 27 is odd
Task 2: Grade: B
Task 3: Leap year
Task 4: Factorial of 5 is 120
```

### 7. Viva-Voce Questions & Answers
1. **What is the difference between if-else and an else-if ladder?**  
   *Answer:* `if-else` provides a two-way choice, while an `else-if` ladder tests multiple mutually exclusive conditions sequentially.
2. **State the condition for a leap year.**  
   *Answer:* Divisible by 4 and not divisible by 100, OR divisible by 400.
3. **What are the three parts of a for loop?**  
   *Answer:* Initialization, condition/termination check, and update/increment expression.
4. **What is 0! and why?**  
   *Answer:* 0! is 1, by mathematical definition as the empty product and to keep identities like $n! = n \times (n-1)!$ consistent.
5. **What is the difference between && and ||?**  
   *Answer:* `&&` evaluates to true only when both conditions are true; `||` evaluates to true if at least one condition is true. Both are short-circuit operators.

---

## EXPERIMENT NO. 3

- **Date of Performance:** 09-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Star and Number Patterns using Nested Loops  

### 1. Aim
To use a loop inside another loop to print stars and numbers in rows.

### 2. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_03/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_03/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_03/Task3.java)
- [Task4.java](file:///c:/Users/ASUS/Downloads/java/Experiment_03/Task4.java)

### 3. Output
```
Task 1:
****
****
****
****

Task 2:
*
**
***
****

Task 3:
1 
1 2 
1 2 3 
1 2 3 4 

Task 4:
****
***
**
*
```

### 4. Viva-Voce Questions & Answers
1. **What is a nested loop?**  
   *Answer:* A loop defined inside the body of another loop.
2. **What is the difference between print() and println()?**  
   *Answer:* `print()` prints text without adding a newline; `println()` prints and appends a line break at the end.
3. **Which loop controls rows and which controls columns in your programs?**  
   *Answer:* The outer loop controls rows; the inner loop controls column printing.
4. **How did you change the right triangle into an inverted triangle?**  
   *Answer:* By initializing the outer loop counter at 4 and decrementing it down to 1 (`for (int i = 4; i >= 1; i--)`).
5. **How many times does the inner loop body run in Task 1?**  
   *Answer:* $4 \times 4 = 16$ times.

---

## EXPERIMENT NO. 4

- **Date of Performance:** 09-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Writing Functions (nCr, nPr, maxOf)  

### 1. Aim
To write functions with parameters and return values, and call them from `main`.

### 2. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_04/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_04/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_04/Task3.java)

### 3. Output
```
Task 1: 5C2 = 10
Task 2: 5P2 = 20
Task 3: Larger: 14
```

### 4. Viva-Voce Questions & Answers
1. **What is a function and why do we use it?**  
   *Answer:* A method is a self-contained reusable block of code that performs a specific task, avoiding code duplication.
2. **What is the difference between parameters and a return value?**  
   *Answer:* Parameters are inputs passed into a function; the return value is the output yielded by the function back to the caller.
3. **What does the keyword static mean for a method?**  
   *Answer:* It belongs to the class itself rather than instances of the class and can be invoked without instantiating an object.
4. **How is nCr different from nPr?**  
   *Answer:* nCr represents combinations (selection without order: $n! / (r!(n-r)!)$), while nPr represents permutations (ordered arrangement: $n! / (n-r)!$).
5. **What is the return type of maxOf and why?**  
   *Answer:* `int`, because it evaluates two integer inputs and returns the greater integer value.

---

## EXPERIMENT NO. 5

- **Date of Performance:** 16-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Arrays: Traversal, Sum, Max, and Count Conditions  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_05/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_05/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_05/Task3.java)

### 2. Output
```
Task 1:
Index 0: 3
Index 1: 4
Index 2: 5

Task 2:
Sum: 118
Largest: 45

Task 3:
Count greater than 10: 2
```

### 3. Viva-Voce Questions & Answers
1. **What is an array and what is the index of its first element?**  
   *Answer:* An array is a fixed-size homogeneous collection of elements in contiguous memory. Its first index is always 0.
2. **What is the difference between arr.length and arr.length()?**  
   *Answer:* `arr.length` is a public final field on array instances; `.length()` is a method on `String` objects.
3. **What exception occurs if you access arr[arr.length]?**  
   *Answer:* `java.lang.ArrayIndexOutOfBoundsException`.
4. **Why do we initialise largest with arr[0]?**  
   *Answer:* To ensure correctness even when all array values are negative.
5. **What is the time complexity of finding the largest element?**  
   *Answer:* $O(n)$, since each of the $n$ elements must be visited once.

---

## EXPERIMENT NO. 6

- **Date of Performance:** 16-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Arrays: Reverse Printing, Min Value, and Duplicates  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_06/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_06/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_06/Task3.java)

### 2. Output
```
Task 1:
50
40
30
20
10

Task 2:
Smallest: 1 at index 2

Task 3:
Repeated value: 9
```

### 3. Viva-Voce Questions & Answers
1. **How do you traverse an array in reverse order?**  
   *Answer:* With a loop starting at `arr.length - 1` and decrementing down to `0`.
2. **Why do we store the index of the minimum along with its value?**  
   *Answer:* To keep track of the element's position within the array for reporting or swapping.
3. **Why does the inner loop start from i + 1?**  
   *Answer:* To avoid comparing an element with itself or redundantly repeating previously checked pairs.
4. **What is the time complexity of the duplicate check using nested loops?**  
   *Answer:* $O(n^2)$.
5. **Name another way to find duplicates faster.**  
   *Answer:* Using a `HashSet` which achieves $O(n)$ time complexity, or sorting first ($O(n \log n)$).

---

## EXPERIMENT NO. 7

- **Date of Performance:** 23-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Counting Steps and Time Complexity Analysis  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_07/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_07/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_07/Task3.java)

### 2. Output
```
Task 1: Steps: 10
Task 2: Steps: 100
Task 3: Halving steps: 10
```

### 3. Viva-Voce Questions & Answers
1. **What is time complexity?**  
   *Answer:* A theoretical measure of how an algorithm's execution time scales with the input size $n$.
2. **What does Big-O notation represent?**  
   *Answer:* An asymptotic upper bound on the growth rate of runtime or space requirements.
3. **Why is the halving loop O(log n)?**  
   *Answer:* Because the input size is divided by 2 at each step; $2^k = n \implies k = \log_2 n$.
4. **What is the time complexity of two nested loops of size n?**  
   *Answer:* $O(n^2)$.
5. **What is the difference between time complexity and space complexity?**  
   *Answer:* Time complexity measures execution steps/time; space complexity measures extra memory/storage consumed.

---

## EXPERIMENT NO. 8

- **Date of Performance:** 23-09-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Matrices: Transpose and Row Sums  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_08/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_08/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_08/Task3.java)

### 2. Output
```
Task 1:
1 2 3 4 
5 6 7 8 
9 10 11 12 

Task 2:
1 4 7 
2 5 8 
3 6 9 

Task 3:
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

### 3. Viva-Voce Questions & Answers
1. **How is a two-dimensional array declared in Java?**  
   *Answer:* `int[][] arr = new int[rows][cols];`
2. **What do m.length and m[0].length give?**  
   *Answer:* `m.length` gives the total number of rows; `m[0].length` gives the number of columns in row 0.
3. **What is the transpose of a matrix?**  
   *Answer:* A matrix formed by interchanging rows with columns ($t[j][i] = m[i][j]$).
4. **How many nested loops are needed to print a matrix and why?**  
   *Answer:* Two: the outer loop iterates over rows and the inner loop iterates over columns.
5. **What is the time complexity of the transpose operation?**  
   *Answer:* $O(r \times c)$, where $r$ is rows and $c$ is columns.

---

## EXPERIMENT NO. 9

- **Date of Performance:** 07-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Matrices: Rows and Columns Operations  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_09/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_09/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_09/Task3.java)

### 2. Output
```
Task 1:
First row: 1 2 3
Last row: 7 8 9

Task 2:
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18

Task 3:
Values greater than 5: 4
```

### 3. Viva-Voce Questions & Answers
1. **How do you access the first and last row of a matrix?**  
   *Answer:* First row: `m[0]`, Last row: `m[m.length - 1]`.
2. **How does the loop order differ for row sums and column sums?**  
   *Answer:* For row sums, row loop is outside and col loop is inside. For column sums, col loop is outside and row loop is inside.
3. **How many elements does a 3x3 matrix have?**  
   *Answer:* $3 \times 3 = 9$ elements.
4. **What is the time complexity of visiting all elements of an n x n matrix?**  
   *Answer:* $O(n^2)$.
5. **What is a jagged array?**  
   *Answer:* An array of arrays in which member arrays can have different lengths.

---

## EXPERIMENT NO. 10

- **Date of Performance:** 07-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Switch Statement and ArrayList Manipulation  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_10/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_10/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_10/Task3.java)

### 2. Output
```
Task 1:
Wednesday

Task 2:
[10, 20, 30, 40]
Size: 4
Item at index 2: 30

Task 3:
[10, 25, 30]
Size: 3
```

### 3. Viva-Voce Questions & Answers
1. **What is the purpose of break in a switch statement?**  
   *Answer:* It terminates the switch block immediately, preventing fall-through execution into subsequent cases.
2. **What is the use of the default case?**  
   *Answer:* It executes when none of the specified case constants match the evaluated expression.
3. **What is the difference between an array and an ArrayList?**  
   *Answer:* Arrays have a fixed length and can store primitives directly; `ArrayList` is resizable and stores object references.
4. **Why do we write ArrayList<Integer> and not ArrayList<int>?**  
   *Answer:* Java generics require reference types (wrapper classes); primitive types cannot be used as type arguments.
5. **What do set() and remove() do?**  
   *Answer:* `set(index, element)` replaces the item at that position; `remove(index)` deletes the item and shifts subsequent elements left.

---

## EXPERIMENT NO. 11

- **Date of Performance:** 21-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Bubble Sort and Selection Sort Algorithms  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_11/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_11/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_11/Task3.java)

### 2. Output
```
Task 1: Sorted: [1, 2, 4, 5, 8]
Task 2: Sorted: [11, 12, 22, 25, 64]
Task 3: Swaps: 4
```

### 3. Viva-Voce Questions & Answers
1. **How does bubble sort work?**  
   *Answer:* Compares adjacent items and swaps them if out of order, bubbling the largest item to the end in each pass.
2. **How does selection sort differ from bubble sort?**  
   *Answer:* Selection sort repeatedly finds the minimum element in the unsorted suffix and places it in position with at most one swap per pass.
3. **What is the time complexity of both algorithms?**  
   *Answer:* Both have $O(n^2)$ average and worst-case time complexity, with $O(1)$ auxiliary space.
4. **How many swaps did bubble sort make on {5, 1, 4, 2, 8}?**  
   *Answer:* Exactly 4 swaps.
5. **What is the best-case time complexity of bubble sort with an early-exit flag?**  
   *Answer:* $O(n)$, when the array is already sorted.

---

## EXPERIMENT NO. 12

- **Date of Performance:** 21-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Insertion Sort and Shift Counting  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_12/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_12/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_12/Task3.java)

### 2. Output
```
Task 1: Sorted: [1, 3, 5, 7]
Task 2: Sorted: [3, 6, 9, 14, 21]
Task 3: Shifts: 15
```

### 3. Viva-Voce Questions & Answers
1. **How does insertion sort work?**  
   *Answer:* Takes one key element at a time, shifts larger elements in the sorted prefix to the right, and inserts the key into its correct spot.
2. **What is the best-case and worst-case time complexity of insertion sort?**  
   *Answer:* Best case: $O(n)$ (already sorted); Worst case: $O(n^2)$ (reverse sorted).
3. **What is a "shift" in insertion sort?**  
   *Answer:* Moving an element one index to the right (`arr[j+1] = arr[j]`) to make space for the key.
4. **Why are there 15 shifts for six elements in reverse order?**  
   *Answer:* $\sum_{k=1}^{n-1} k = \frac{n(n-1)}{2} = \frac{6 \times 5}{2} = 15$.
5. **Is insertion sort a stable sorting algorithm?**  
   *Answer:* Yes, because equal elements maintain their original relative order (it uses `arr[j] > key`, not `>=`).

---

## EXPERIMENT NO. 13

- **Date of Performance:** 28-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Strings: Built-in Methods, Reversal, and Palindromes  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_13/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_13/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_13/Task3.java)
- [Task4.java](file:///c:/Users/ASUS/Downloads/java/Experiment_13/Task4.java)

### 2. Output
```
Task 1:
Length: 11
Position of g: 3
Upper case: PROGRAMMING

Task 2:
Reversed: avaJ

Task 3:
racecar is a palindrome

Task 4:
a
ab
abc
b
bc
c
```

### 3. Viva-Voce Questions & Answers
1. **What does it mean that a String is immutable?**  
   *Answer:* Once created, its character contents cannot be modified. Any modification creates a new `String` object.
2. **What is the difference between == and equals() for strings?**  
   *Answer:* `==` checks reference equality (memory address), while `.equals()` compares actual character sequence values.
3. **What does indexOf return when the character is not found?**  
   *Answer:* It returns `-1`.
4. **What is a palindrome? Give two examples.**  
   *Answer:* A sequence that reads the same forwards and backwards. Examples: "madam", "racecar".
5. **What are the arguments of substring(start, end) and is end included?**  
   *Answer:* `start` index (inclusive) and `end` index (exclusive). `end` is NOT included.

---

## EXPERIMENT NO. 14

- **Date of Performance:** 28-10-2026  
- **Course Code:** BCS351  
- **Experiment Title:** Characters: Counting Vowels, Letters and Positions  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_14/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_14/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_14/Task3.java)

### 2. Output
```
Task 1: Vowels: 3
Task 2: Count of g: 2
Task 3:
0: h
1: e
2: l
3: l
4: o
```

### 3. Viva-Voce Questions & Answers
1. **What does charAt() return and what is the index of the first character?**  
   *Answer:* It returns the `char` at the given index. The first character is at index `0`.
2. **What exception occurs for an invalid index in charAt()?**  
   *Answer:* `java.lang.StringIndexOutOfBoundsException`.
3. **What is the difference between 'a' and "a" in Java?**  
   *Answer:* `'a'` is a primitive character (`char`); `"a"` is a `String` object.
4. **How would you make the vowel count work for capital letters too?**  
   *Answer:* Convert the string/char to lower case first with `Character.toLowerCase(ch)` or `s.toLowerCase()`, or add uppercase checks in the `if` condition.
5. **What is the time complexity of counting characters in a string of length n?**  
   *Answer:* $O(n)$, because each of the $n$ characters is inspected once.

---

## EXPERIMENT NO. 15

- **Date of Performance:** 04-11-2026  
- **Course Code:** BCS351  
- **Experiment Title:** StringBuilder Class Methods (append, insert, delete)  

### 1. Source Code
- [Task1.java](file:///c:/Users/ASUS/Downloads/java/Experiment_15/Task1.java)
- [Task2.java](file:///c:/Users/ASUS/Downloads/java/Experiment_15/Task2.java)
- [Task3.java](file:///c:/Users/ASUS/Downloads/java/Experiment_15/Task3.java)

### 2. Output
```
Task 1:
Hello World
Length: 11

Task 2:
1,2,3,4,5

Task 3:
Hello Java
```

### 3. Viva-Voce Questions & Answers
1. **What is the difference between String and StringBuilder?**  
   *Answer:* `String` is immutable; `StringBuilder` is mutable and modifies character sequences in-place without creating redundant objects.
2. **Why is StringBuilder preferred for repeated modifications?**  
   *Answer:* It avoids creating intermediate garbage objects, making string manipulation significantly faster with $O(1)$ amortized append.
3. **What does insert(0, "text") do?**  
   *Answer:* Inserts the text at the beginning (index 0), shifting existing characters to the right.
4. **How do you remove the last character of a StringBuilder?**  
   *Answer:* Using `sb.deleteCharAt(sb.length() - 1);`.
5. **What is the difference between StringBuilder and StringBuffer?**  
   *Answer:* `StringBuffer` is synchronized (thread-safe, slower); `StringBuilder` is non-synchronized (faster, used in single-threaded contexts).
