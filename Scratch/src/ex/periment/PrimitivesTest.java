package ex.periment;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 37;
        System.out.println("The value of age is: " + age);
        long population = 8_000_000_000L;
        System.out.println("The population is: " + population);

        double weight = 135.5;
        System.out.println(" Weight is: " + weight);

        boolean hasTwins = true;
        System.out.println("I have twins: " + hasTwins);

        char shirtSize = 'L';
        System.out.println("The shirt Size is: " + shirtSize);

        String name = "Raylan";
        System.out.println("My name is : " + name);

        // print the following sentence (as a string)
        // the word "belly" makes me laugh

        System.out.println("the word \"belly\" makes me laugh");

        System.out.println();

        int i = 18;
        int j = i;
        i++;

        System.out.println("jay is " + j);
        System.out.println();

        int x = 3;

        System.out.println("x is: " + ++x);
    }
}