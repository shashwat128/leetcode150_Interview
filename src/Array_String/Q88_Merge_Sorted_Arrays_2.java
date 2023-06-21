package Array_String;

//bad solution
public class Q88_Merge_Sorted_Arrays_2 {
    public static void main(String[] args) {
        // Test input arrays
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1;
        int n1 = n - 1;

        while (n1 >= 0) {
            int targetIndex = m1 + n1 + 1;
            if (m1 < 0 || nums2[n1] >= nums1[m1]) {
                nums1[targetIndex] = nums2[n1];
                n1--;
            } else {
                nums1[targetIndex] = nums1[m1];
                m1--;
            }
        }
    }
}
