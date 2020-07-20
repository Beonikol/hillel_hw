public class Task4 {

        public static void main(String[] args) {

            int[] nums = {58, 6, 11, -86, -785, 6859, 1176, 67, 99632};

            int a = nums[0];
            int b = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= a) {
                a= nums[i];
                }
                if (nums[i] <= b)
                 b = nums[i];
            }
            System.out.println("Max: " + a + " " + "Min: " + b);
        }
}