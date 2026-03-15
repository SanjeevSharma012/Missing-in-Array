1.Solution
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 1 ;
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == count){
                count++;
            }else {
                return count ;
                
            }
        }
        return count ;
    }
}

2.Solution
    class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        long n = arr.length+1;
        long actual = n*(n+1) / 2;
        long ans = actual - sum ;
        return (int)ans;
    }
}

3.Solution
    class Solution {
    int missingNum(int arr[]) {
        // code here
       int n = arr.length + 1 ;
       int i = 0 ;
       while(i < arr.length){
           if(arr[i] == i + 1 || arr[i] == n) i++;
           else {
               int idx = arr[i] - 1 ;
               swap(arr,i,idx);
           }
       }
       for(i = 0 ; i < arr.length ; i++){
           if(arr[i] != i + 1) return i + 1; 
       }
       return n ;
    }
    void swap(int[] arr ,int i , int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp ;
    }
}
