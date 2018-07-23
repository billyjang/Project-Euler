class Problem7 {
    public static void main(String[] args) {
        boolean goalFound = false;
        int counter = 3;
        int primesFound = 1;
        while(!goalFound) {
            if(isPrime(counter)) {
                primesFound += 1;
            }
            if(primesFound == 10001) {
                System.out.println(counter);
                goalFound = true;
            }
            counter = counter + 1;
        }
    }

    static boolean isPrime(int a) {
        int limit = (int) (Math.sqrt(a) + 1);
        for(int i = 2; i <= limit; i ++) {
            if(a%i == 0) {
                return false;
            }
        }
        return true;
    }
}