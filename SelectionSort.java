class Solution {
    void selectionSort(int[] arr) {
       for (int i = 0 ;  i < arr.length ; i++){
           int smallestIdx = i ; // assume
           for (int j = i + 1 ; j < arr.length ; j++){
               if (arr[j] < arr[smallestIdx]){
                   smallestIdx = j ;
               }
           }
           int temp = arr[i];
           arr[i] = arr[smallestIdx];
           arr[smallestIdx]  = temp ;
       }
        
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)
