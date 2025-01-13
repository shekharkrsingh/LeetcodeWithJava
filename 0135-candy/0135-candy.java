class Solution {
    public int candy(int[] ratings) {
        int size = ratings.length;
        if (size == 0)
            return 0;
        int[] candy = new int[size];
        for (int i = 0; i < size; i++)
            candy[i] = 1;
        for (int i = 1; i < size; i++)
            if (ratings[i] > ratings[i - 1])
                candy[i] = candy[i - 1] + 1;
        for (int i = size - 2; i >= 0; i--)
            if (ratings[i] > ratings[i + 1])
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
        int totalCandy = 0;
        for (int i = 0; i < size; i++)
            totalCandy += candy[i];
        return totalCandy;
    }
}
