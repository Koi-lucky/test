package niuke.面经;

import org.junit.Test;

public class BinarySearch_105 {

    int n = 100;
    int v = 97;
    int[] a = { 3,3,4,4,4,5,6,6,6,7,8,8,12,13,15,16,21,21,22,24,24,27,28,32,34,35,35,36,36,39,40,41,41,42,44
            ,44,45,45,47,47,47,47,48,48,50,51,51,53,53,53,54,54,54,56,56,57,59,60,60,60,60,61,62,63,65,65,65
            ,65,67,67,68,70,71,71,74,75,75,79,81,84,84,86,86,87,90,90,90,90,91,92,93,94,94,94,95,97,97,98,98,99};

    @Test
    public void upper_bound_() {
        // 如果数组的最大的数都小于指定值V，那么前面的所有数一定都小于指定值，因为数组是有序数组
        if(v > a[n - 1]) {
            System.out.println(n + 1);
        }
        // 定义两个指针，做数组的左右指针
        int left = 0;
        int right = n;
        // 遍历数组，查找大于等于指定值的数
        while(left < right) {
            // 定义一个中间指针
            int mid = left + (right - left) / 2;
            if(v > a[mid]) {
                left = mid + 1;
            } else {
                // 因为它要返回大于等于的第一个位置，所以这里只有两个判断，是大于，还是小于等于
                right = mid;
            }
        }
        System.out.println(left + 1);
    }
}
