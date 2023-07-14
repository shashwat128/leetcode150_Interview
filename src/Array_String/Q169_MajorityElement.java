package Array_String;

public class Q169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6, 2, 2, 1};
        int majorityElement = majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }

    private static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
