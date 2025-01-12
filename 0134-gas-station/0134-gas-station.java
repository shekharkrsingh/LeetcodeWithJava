class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost)
            return -1;
        int[] fuel = new int[n];
        for (int i = 0; i < n; i++)
            fuel[i] = gas[i] - cost[i];
        int totalFuel = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            totalFuel += fuel[i];
            if (totalFuel < 0) {
                idx = i + 1;
                totalFuel = 0;
            }
        }
        return idx;
    }
}