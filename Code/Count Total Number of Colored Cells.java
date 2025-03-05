class Solution {
    public long coloredCells(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        // Calculate the number of blue cells using the formula
        return (long) n * n + (long) (n - 1) * (n - 1);
    }
}
