class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television("Sony", 0);
        System.out.println(tv);
        tv.setVolume(100);
        System.out.println(tv);
        tv.setVolume(-1);
        System.out.println(tv);
        tv.setVolume(101);
        System.out.println(tv);

        System.out.println();

        tv.setBrand("Samsung");
        System.out.println(tv);
        tv.setBrand("TCL");
        System.out.println(tv);

    }
}