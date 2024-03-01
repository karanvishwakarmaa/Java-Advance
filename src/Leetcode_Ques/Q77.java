public class Q77 {
    public static void main(String[] args) {
        int arr[] = {14, 15, 30, 45, 56, 58, 69, 100};
        boolean ans = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
