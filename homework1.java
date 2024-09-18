class homework1 {
    public static void main(String[] args) {
        int a;
        int n = 10; 
        String c = "";
        while (n > 0) {
            a = n % 2;
            n = n / 2;
            c = a + c;
        }
        System.out.println(c);
    }
}