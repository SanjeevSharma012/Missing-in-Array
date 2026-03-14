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
