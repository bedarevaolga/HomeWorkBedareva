public class HomeWorkTwo {
    public static void main(String[] args) {

        int n = 7;
        int sum = 0;
        int first = 0;
        int second = 1;
        for (int j = 2; j < n; j++) {
            int c = first + second;
            if(c % 2 == 0) {
                sum += c;
            }
            first = second;
            second = c;
        }
        System.out.println(sum);
    }
}
