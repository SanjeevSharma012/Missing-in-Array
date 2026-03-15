# Missing Number in Array (Cyclic Sort Approach)

## Problem
Given an array containing `n-1` distinct numbers from the range `1` to `n`, find the missing number.

Example:  
Input: `[1, 2, 4, 5]`  
Output: `3`

The array contains numbers from `1` to `n`, but one number is missing.

---

## Approach

This solution uses the **Cyclic Sort technique**.

### Steps
1. The correct position of each number `x` is `x - 1`.
2. Traverse the array and place each element at its correct index using swapping.
3. Ignore numbers equal to `n` because `n` does not have a valid index in the array.
4. After placing numbers correctly, iterate through the array.
5. The first index `i` where `arr[i] != i + 1` gives the missing number `i + 1`.
6. If all positions are correct, then the missing number is `n`.

---

## Time Complexity
`O(n)`

Each element is placed in its correct position at most once.

## Space Complexity
`O(1)`

No extra space is used.

---

## Java Implementation

```java
class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        int i = 0;

        while(i < arr.length){
            if(arr[i] == i + 1 || arr[i] == n) i++;
            else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }

        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1) return i + 1;
        }

        return n;
    }

    void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
Example

Input:

arr = [3, 1, 2, 5]

After cyclic sort:

[1, 2, 3, 5]

Index 3 should contain 4, so the missing number is:

4
Author

Sanjeev Sharma
