package net.flix;

enum Genre {

    ROMANCE("Romance"),
    SCI_FI("Sci -Fi"),
    COMEDY("Comedy"),
    HORROR("HORROR"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    // Everything below here is class definition stuff ...(fields, ctors, methods)
    private final String display;

    // constructor - implicitly private, only called from inside( 8 times above)
    Genre(String display) {
        //System.out.println("Genre ctor called");
        this.display = display;
    }

    // accessor methods - here we proived "read -only" access to the display property

    public String display() {    //getter - changed the name because there is no setter.
        return display;
    }
    public String toString() {
        return display(); //generally better to call your own method
    }
}