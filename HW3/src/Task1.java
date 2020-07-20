public class Task1 {
    public static void main(String[] args) {

        int num[] = {12, 45, 87, 56, 122, 17, 117, 5, 645, 722, 964};

        for (int i = 0; i < num.length; i++) {
            if ((num[i] % 2) == 0)
                System.out.print(num[i] + " ");

        }
        for (int i = 0; i < num.length; i++) {
            if ((num[i] % 2) != 0)
                System.out.print(num[i] + " ");
        }
    }
}