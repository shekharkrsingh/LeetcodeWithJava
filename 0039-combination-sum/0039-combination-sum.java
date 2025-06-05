class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = candidates.length;
        List<Integer> num = new ArrayList<>();
        solution(0, num, 0, target, candidates, result);
        return result;
    }

    private void solution(int index, List<Integer> num, int sum, int target, int[] candidates, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(num));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] <= target) {
                num.add(candidates[i]);
                solution(i, num, sum + candidates[i], target, candidates, result);
                num.remove(num.size() - 1);
            }
        }
    }
}