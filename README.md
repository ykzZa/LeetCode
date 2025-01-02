**Problem #0001**

The initial solution used a nested loop with O(n^2) complexity. With a hint, the algorithm was optimized to O(n).

**Problem #0009**

The first attempt was based on `x.toString() == x.toString().reversed()`, but it was later optimized to the current version.


A better solution was found online: 

`fun isPalindrome(x: Int): Boolean {`  
&nbsp;&nbsp;&nbsp;&nbsp;`if (x < 0 || (x != 0 && x % 10 == 0)) return false`  
&nbsp;&nbsp;&nbsp;&nbsp;`var half = 0`  
&nbsp;&nbsp;&nbsp;&nbsp;`var x = x`  
&nbsp;&nbsp;&nbsp;&nbsp;`while (x > half) {`  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`half = (half * 10) + (x % 10)`  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`x /= 10`  
&nbsp;&nbsp;&nbsp;&nbsp;`}`  
&nbsp;&nbsp;&nbsp;&nbsp;`return x == half || x == half / 10`  
`}`