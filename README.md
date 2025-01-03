**Problem #0001**

The initial solution used a nested loop with O(n^2) complexity. With a hint, the algorithm was optimized to O(n).

**Problem #0009**

The first attempt was based on `x.toString() == x.toString().reversed()`, but it was later optimized to the current version.


A better solution was found online: 
```kotlin
fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false  
    var half = 0
    var x = x  
    while (x > half) {  
        half = (half * 10) + (x % 10)  
        x /= 10  
    }  
    return x == half || x == half / 10  
}
```

**Problem #0013**

The method converts a Roman numeral to an integer by iterating the string in reverse and applying addition or subtraction based on the values of the symbols.