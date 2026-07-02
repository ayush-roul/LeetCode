class Solution {
   public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits; // No carry needed, bail out
        }
        digits[i] = 0; // It was a 9, so it becomes a 0. Carry continues to next loop.
    }
    
    // Handle the all-9s edge case
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
}
}