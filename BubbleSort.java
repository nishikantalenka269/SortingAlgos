class Solution {
    public void bubbleSort(int[] arr) {
        for (int i = 0 ; i < arr.length-1 ; i++){
            for (int j = 0 ; j < arr.length-i-1 ; j++){
               if (arr[j] > arr[j+1]){ // swap the larger one 
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
               }
            }
        }
        
    }
}

// time Complexity : O(n^2)
// Space Complexity : O(1)
