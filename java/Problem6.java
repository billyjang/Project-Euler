class Problem6 {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println(calcA(limit) + calcB(limit) + calcC(limit));
        System.out.println("a: " + calcA(limit));
        System.out.println("b: " + calcB(limit));
        System.out.println("c: " + calcC(limit));
    }

    static int calcA(int a) {
        return a * (a-1);
    }

    static int calcB(int a) {
        int sum1 = 0;
        for(int i = 3; i <= a; i ++) {
            sum1 += ((int)Math.pow(i, 2));
        }
        sum1 = 3*sum1;
        int sum2 = 0;
        for(int i = 3; i <= a; i ++) {
            sum2 += i;
        }
        sum2 = sum2 * 7;

        return sum1 - sum2 + (4*(a-2)) + 2;
    }

    static int calcC(int a) {
        int sum = 0;
        for(int i = 2; i < a; i ++) {
            sum += ((int)Math.pow(i, 2))*(i-1);
        }
        return sum;
    }
}