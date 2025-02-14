class ProductOfNumbers {
    List<Integer> list;
    int lastZeroIndex;
    int product;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        lastZeroIndex = -1;
        product = 1;
    }

    public void add(int num) {
        list.add(product * num);
        if (num == 0) {
            lastZeroIndex = list.size() - 1;
            product = 1;
        } else
            product *= num;
    }

    public int getProduct(int k) {
        int size = list.size();
        if (size - k <= lastZeroIndex)
            return 0;
        if (k == size || size - k - 1 == lastZeroIndex)
            return list.get(size - 1);
        return list.get(size - 1) / list.get(size - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */