public class SelectionSort2 {
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void sort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            int last = nums.length - 1 - i;
            for (int j = 1; j <= last; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int swap = nums[last];
            nums[last] = nums[max];
            nums[max] = swap;
            max=0;
            
        }
    }
}
