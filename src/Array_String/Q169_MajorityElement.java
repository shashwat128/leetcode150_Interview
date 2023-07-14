package Array_String;


public class Q169_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {5, 8, 5, 5, 3, 2, 3, 1, 4, 5, 1, 3, 6};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }

    private static int findMajorityElement(int[] nums) {
        int len = nums.length;
        int num = len/2;
        int result = 0;
        int count = 1;
        int i = 0;
        int currentCount = 1;

        for(i = 1; i< len; i++) {
            for(int j = 1; j < len - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if(len == i) {
            return nums[0];
        }

        while((len - i) != 0) {
            if(nums[i] == nums[i + i]) {
                currentCount++;
                i++;
                len--;
            } else if (nums[i] != nums[i + 1]) {
                currentCount = 1;
                i++;
                len--;
            }
            if(currentCount > num) {
                count = currentCount;
                result = nums[i];
            }
        }

        return  result;
    }
}