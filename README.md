**Problem #0001**

The initial solution used a nested loop with O(n^2) complexity. With a hint about using HashMap, the algorithm was optimized to O(n).

*Best result before hint: 103ms (beats 5.02%), 39.50MB (beats 30.24%)*  
*Best result after hint: 2ms (beats 99.97%), 39.36MB (beats 35.96%)*

**Problem #0009**

The first attempt was based on `x.toString() == x.toString().reversed()`, but it was later optimized to the current
version.

A better solution was found online:

```kotlin
fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false
    var half = 0
    var base = x
    while (base > half) {
        half = (half * 10) + (base % 10)
        base /= 10
    }
    return base == half || base == half / 10
}
```

*Best result: 7ms (beats 61.00%), 37.59MB (beats 63.43%)*  
*Best of found online solution: 5ms (beats 99.94%), 37.44MB (beats 68.47%)*

**Problem #0013**

The method converts a Roman numeral to an integer by iterating the string in reverse and applying addition or
subtraction based on the values of the symbols.

*Best result: 3ms (beats 99.92%), 37.56MB (beats 90.26%)*

**Problem #0014**

The solution is based on gradually increasing the size of the prefix starting from the first word and ensuring that the
other words begin with this prefix.

A more optimized solution found online works by comparing the strings character by character.

```kotlin
fun longestCommonPrefix(strs: Array<String>): String {
    for (baseIndex in strs[0].indices) {
        for (otherIndex in 1..<strs.size) {
            if (baseIndex == strs[otherIndex].length || strs[otherIndex][baseIndex] != strs[0][baseIndex]) {
                return strs[0].substring(0, baseIndex)
            }
        }
    }
    return strs[0]
}
```

*Best result: 12ms (beats 44.15%), 38.98MB (beats 19.73%)*  
*Best of found online solution: 1ms (beats 99.16%), 35.65MB (beats 85.54%)*

**Problem #0020**

The first solution was based on replacing "()", "[]", and "{}" with an empty string while the string contained any of
these pairs. If the string was empty at the end, the brackets were valid; otherwise, they were not.

After receiving a hint about using a stack, the algorithm was optimized to its current state.

*Best result before hint: 45ms (beats 5.94%), 38.90MB (beats 22.38%)*  
*Best result after hint: 3ms (beats 97.03%), 35.15MB (beats 80.66%)*

**Problem #0021**

At each step, it selects the smaller value between the heads of the two lists, creates a new node, and continues merging the remaining parts.

A better solution was found online that optimizes memory by avoiding the creation of new ListNode objects.

*Best result: 0ms (beats 100%), 38.18MB (beats 5.37%)*  
*Best of found online solution: 0ms (beats 100%), 36.47MB (beats 59.47%)*

**Problem #0026**

The algorithm iterates through the array, comparing each element with the previous one. If a unique element is found, it is placed at the next available position in the array, and the count of unique elements is incremented.

*Best result: 1ms (beats 100%), 41.17MB (beats 85.31%)*

**Problem #0027**

The algorithm iterates through the array, counting elements not equal to the target value (val). These elements are moved to the front of the array while maintaining their relative order, and the counter tracks their count.

*Best result: 0ms (beats 100%), 41.17MB (beats 62.04%)*

**Problem #0028**

The algorithm searches for the first occurrence of the string needle in the string haystack by sequentially comparing the characters of substrings with needle. If a full match is found, it returns the starting index of the match; otherwise, it returns -1.

*Best result: 1ms (beats 93.88%), 34.51MB (beats 83.79%)*

**Problem #0704**

This is a binary search algorithm that finds the index of a target value in a sorted integer array. It repeatedly divides the search range in half, adjusting the left or right pointer based on the comparison of the target with the middle element, until the target is found or the range is empty.

*Best result: 0ms (beats 100%), 39.89MB (beats 61.87%)*


**Problem #1108**

Using a loop, iterate through the string. If a period (.) is encountered, append "[.]" to the result string. For any other character, append it as is.

*Best result: 122ms (beats 98.18%), 34.50MB (beats 72.73%)*

**Problem #2469**

The algorithm converts a given temperature in Celsius to both Kelvin and Fahrenheit by applying the respective formulas and returns the results in a DoubleArray.

*Best result: 0ms (beats 100%), 35.13MB (beats 64.29%)*  