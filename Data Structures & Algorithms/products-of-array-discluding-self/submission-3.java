class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;

    int[] left = new int[n];
    int[] right = new int[n];
    int[] arr = new int[n];

    left[0] = 1;

    // Har index ke left ka product
    for (int i = 1; i < n; i++) {
        left[i] = left[i - 1] * nums[i - 1];
    }

    right[n - 1] = 1;

    // Har index ke right ka product
    for (int i = n - 2; i >= 0; i--) {
        right[i] = right[i + 1] * nums[i + 1];
    }

    // Left product * Right product
    for (int i = 0; i < n; i++) {
        arr[i] = left[i] * right[i];
    }

    return arr;
}
}  
