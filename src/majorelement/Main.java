package majorelement;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}
