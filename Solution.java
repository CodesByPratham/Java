public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.mySqrt(2147395599));// 46339
    }

    public int mySqrt(int x) {
        int start = 1, end = 2, i = 2;
        while ((end * end) <= x && (end * end) > 0) {
            i = i + i;
            start = end + 1;
            end = start + i - 1;
            System.out.println("Start: " + start);
            System.out.println("End: " + end);
            System.out.println("Square: " + end * end);
        }

        while (start <= end) {
            int middle = start + (end - start) / 2;
            System.out.println("mid dle: " + middle * middle);

            if (x < (middle * middle)) {
                end = middle - 1;
            } else if (x > (middle * middle)) {
                start = middle + 1;
            } else {
                return middle;
            }

        }

        return end;
    }
}