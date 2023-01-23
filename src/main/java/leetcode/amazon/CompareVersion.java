package leetcode.amazon;


public class CompareVersion {
    public static void main(String[] args) {
        System.out.println(compareVersion("1.0.1", "1"));
    }

    public static int compareVersion(String version1, String version2) {
        String[] nums1 = splitVersion(version1);
        String[] nums2 = splitVersion(version2);
        int len = Math.max(nums1.length, nums2.length);

        for (int index = 0; index < len; index++) {
            int num1 = 0;
            int num2 = 0;

            if(nums1.length > index) num1 = Integer.parseInt(nums1[index]);
            if(nums2.length > index)  num2 = Integer.parseInt(nums2[index]);

            if (num1 < num2) return -1;
            if (num2 < num1) return 1;
        }

        return 0;
    }

    static String[] splitVersion(String version) {
        return version.split("\\.");
    }
}
