import java.math.BigInteger;
import java.math.BigDecimal;

class DataTypes{
    public static void main(String args[]){
        // Primitive data types they store the value directly
        // Reference types don't store the data but instead they store the memory address / memory location where the data is sitting

        // Integers - 
        // byte (1 byte)

        // 1 byte -> 8 bits
        // 2^8 

        // short (2 bytes)
        // int (4 bytes) 
        // long (8 bytes)
        // single character - char, 
        // boolean - true / false
        // numbers with decimal values - 
        //float - 4 bytes of memory - it can store upto max 7 digits after decimal point
        //double - 8 bytes of memory - it can store upto max 17 digits after decimal point
        //by default, java considers each number having decimal places to be of double type
        // wrapper classes - Byte, Short, Integer, Long

        //10 -> by default java thinks that this is integer

        // int ->type of data which is stored inside the variable
        // a -> variable name
        // 10 -> actual data
        // = -> assignment operator
        int a = 10;
        System.out.println("a is " + a);
        byte b = 10;  // implicipit type casting
        // implicittype conversion
        System.out.println("b is " + b);
        // byte c = -129;
        byte d = (byte)130;
        // explicit type casting
        // int l = 92147483647;
        long l = 9223372036854775807L;
        System.out.println("l is " + l);
        // String num1 = "99223372036854775807";
        // String num2 = "99223372036854775807";
        // System.out.println("num1 is " + num1);
        // System.out.println("num2 is " + num2);
        // System.out.println("Sum of num1 and num2 is " + (num1 + num2));

        BigInteger num1 = new BigInteger("99223372036854775807");
        BigInteger num2 = new BigInteger("99223372036854775807");
        System.out.println( "Sum is " + num1.add(num2) );

        // System.out.println("c is " + c);
        System.out.println("d is " + d);
        // + is used for concatenation in print method
        System.out.println("Min value of byte is " + Byte.MIN_VALUE);
        System.out.println("Max value of byte is " + Byte.MAX_VALUE);
        System.out.println("Min value of short is " + Short.MIN_VALUE);
        System.out.println("Max value of short is " + Short.MAX_VALUE);
        System.out.println("Min value of int is " + Integer.MIN_VALUE);
        System.out.println("Max value of int is " + Integer.MAX_VALUE);
        System.out.println("Min value of long is " + Long.MIN_VALUE);
        System.out.println("Max value of long is " + Long.MAX_VALUE);

        boolean x = true;
        boolean y = false;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        //In C/C++, char takes memory space of 1 byte
        //8 bits -> 2^8 -> 256 unique values
        /*0-255
        A -> 65
        B -> 66
        Y -> 89
        Z -> 90
        a -> 97
        b -> 98
        y -> 121
        z -> 122
        0 -> 48
        1 -> 49
        9 -> 57
        Ascii codes
        In java, char will take memory space of 2 bytes
        16 bits -> 2 ^ 16 -> 65536 values
        */

        char z = 'a';
        char z2 = '!';
        char z3 = '1';
        // char z4 = 'अ';
        String z4 = "अ"
        System.out.println("z is " + z);
        System.out.println("z2 is " + z2);
        System.out.println("z3 is " + z3);
        System.out.println("z4 is " + z4);

        //this string will consume 32 bytes of memory
        String s = "some random text"; //character array
        System.out.println("s is " + s);

        System.out.println("Max value of double is " + Double.MAX_VALUE);

        double m = 10000000.267282;
        System.out.println("m is " + m);

        float n = 123.12f;
        System.out.println("n is " + n);

        BigDecimal num3 = new BigDecimal("992233720368.547758079789000");
        BigDecimal num4 = new BigDecimal("992233720368.547758079789000");
        System.out.println( "Sum is " + num3.add(num4) );
    }
}