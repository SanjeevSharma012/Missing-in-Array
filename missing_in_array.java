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
