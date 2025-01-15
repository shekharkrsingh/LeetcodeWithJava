class Solution {
    public int minimizeXor(int num1, int num2) {
        int x = 0;
        int num2_bit_count = Integer.bitCount(num2);
        int i = 0;
        int currentBit = 31;
        while (i < num2_bit_count) {
            if ((num1 & (1 << currentBit)) != 0 || (num2_bit_count - i > currentBit)) {
                x = x | (1 << currentBit);
                i++;
            }
            currentBit--;
        }
        return x;
    }
}