class Test {
    static int x = 10;
    int y = 5;
    void change() {
        try {
            x += 5;
            y += 10;
            int z = 10 / (y - 15);
            System.out.println(z);
        }
        catch (ArithmeticException e) {
            x--;
            y--;
            System.out.println(x + " " + y);
        }
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.change();
        t2.change();
        System.out.println(Test.x);
        System.out.println(t1.y + " " + t2.y);
    }
 }