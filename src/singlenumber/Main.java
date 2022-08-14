package singlenumber;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {1, 2, 3, 4, 1, 6, 3, 4, 6};
        int result = solution.singleNumber(nums);
        System.out.println(result);

    }
}
