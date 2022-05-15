// package specified what package this class belongs to.
package com.Clayton;

import java.awt.*;
import java.util.Date;

public class Main {
//  'Public' means accessible from other parts of this program
//  The "main" class in your program should always be "static"
    public static void primitiveTypes (String[] args) {
//        int is a primitive variable type
        int myAge = 25;
        int temperature = 90;
        int herAge = myAge;

//        since ints take up 4 bytes of memory, it's better to declare these numbers like this:

        byte myAge_byte = 25;
        byte temperature_byte = 90;
        byte herAge_byte = myAge_byte;

//        separate commas of big numbers with "_" underscore char
//        use "L" at end of long number to signify it's a "long" number
        long viewsCount = 3_123_456_789L;

//        just as with "long" variable types, float types requre a "F" char at end to signify it's a "float" number
        float price = 10.99F;

//        'char' types for single character require '' single quotes
        char letter = 'A';

//        "String" types for a string of characters require "" double quotes
        String letter_2 = "A";

        boolean isEligible = false;

//      println is a method
        System.out.println(herAge);
    }
    public static void main_old_1 (String[] args) {
        Date now = new Date();
        System.out.println(now);
    }
    public static void referenceTypes_Points (String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;

        System.out.println(y);
//        this will return 1 because y is has its own instance in memory


        Point point_1 = new Point(1, 1);
        Point point_2 = point_1;
        point_1.x = 2;
//        point_2 is a reference type, because there is only one instance of the Point object.
//        point_1 is the new object and point_2 is 'referencing' point_1's value at point_1's location in memory

        System.out.println(point_2.x);
//        this will return 2 because point_2 doesn't have its own instance in memory. It's only referencing point_1, so whenever any value from point_2 changes, point_2 values will change respectively.
    }
    public static void referenceTypes_Strings (String[] args) {
//        Strings are reference types in Java
//        normally you would instantiate a reference type with the 'new' keyword
        String message_1 = new String("Hello World 1");

//        but since Strings are used often in Java, we can use this shorthand version
        String message_2 = "Hello World 2";

//        concatenate Strings with '+' operator
        String message_3 = message_2 + "!!";

//        use String methods
        boolean isThisTrue = message_2.endsWith("!!");
        int message_length = message_3.length();
        int findIndex = message_3.indexOf("fuck");
        String replacement = message_3.replace("Hello", "Goodbye");
//        since Strings are "immutable", every method will return a new String object.
//        the original string will remain unchanged. (not able to be mutated)


        System.out.println(message_1);
    }
    public static void main(String[] args) {

    }
}