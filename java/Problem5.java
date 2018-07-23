class Problem5 {
    public static void main(String[] args) {
        System.out.println(helper(20, 19));
    }


    static long helper(long a, long b) {
        if(b == 1) {
            return a;
        }
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        return helper(lcm(a, b), b - 1);
    }
    //assume a is the larger number
    static long euclid(long a, long b) {
        if(b == 0) {
            return a;
        }
        long tmp = b;
        b = a % b;
        a = tmp;
        return euclid(a, b);
    }        

    static long lcm(long a, long b) {
        return (a * b) / euclid(a, b);
    }
}