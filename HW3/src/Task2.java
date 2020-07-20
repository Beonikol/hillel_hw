public class Task2 {

    public static void main(String[] args) {
        int nums[] = {12, 45, 87, 56, 122, 17, 117, 5, 645, 722, 964, 7};

        for (int i = 0; i < nums.length; i++) {
            if (PrimeN (nums[i]) == 1){
                System.out.print(nums[i]+ " ");
            }
        }
    }

    private static int PrimeN(int nums) {
        for (int i = 2; i < nums; i++) {
            if (nums %i == 0) {
                return 0;
            }
            if ((i == nums) || (i > Math.sqrt(nums)))
            {
                return 1;
            }
        }
        return 0;
    }
}
