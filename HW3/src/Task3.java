public class Task3 {

    public static void main (String [] args) {

        int [] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            if (i < 2) {
                nums [i] = 1;
            }
            else {
                nums [i] = nums [i-2] + nums [i-1];
            }
            System.out.print(nums [i] + " ");
        }
    }
}