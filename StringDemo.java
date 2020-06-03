class StringDemo{
    public static void main(String args[]){
        // Way 1 - literal way -uses pool
        // either 1 or 0 object is created
        String s = "Ram";
        String s2 = "Ram";
        // int a = 10;
        // int b = 100;
        //System.out.println(a == b);   //comparison operator
        System.out.println(s == s2);  //compare memory addresses stored in s and s2

        // Way 2 - using new keyword - not uses pool
        // either 1 or 2 objects are created
        // 1 object is guaranteed in pool but the 2nd object is created if the string is not already present in pool
        // if 2 objects are created, then also variable will point to the object existing in heap( outside pool )
        // the object present in pool can be used by some other variable created using literal way
        String s3 = new String("Ram"); // 1 object was created coz Ram already exists in pool
        String s4 = new String("Shyam"); // 2 objects are created
        String s5 = "Shyam"; // this s5 variable will start pointing to the object in pool created by the upper line
        //new keyword is always going to create a new object
        // but string pool has a rule that one string can exist only once
        System.out.println("s==s3 " + (s == s3) );
        System.out.println("s.equals(s3) " +  s.equals(s3) );  // used to compare values of objects
        System.out.println("s4 == s5 " + (s4 == s5) );
        System.out.println("s4.equals(s5) " + s4.equals(s5));

        Runtime obj = Runtime.getRuntime();
        System.out.println("Total memory is " + obj.totalMemory());
        System.out.println("Free memory is " + obj.freeMemory());
        System.out.println("Used memory is " +  ( obj.totalMemory() - obj.freeMemory() ) );

        String s10;

        for(int i = 0; i < 100000; i++){
            // s10 = "Anna";
            // s10 = new String("Anna")
            s10 = new String("Anna" + i);
            //Anna0
            //Anna1
            //Anna2
            //Anna99999
        }

        System.out.println("Total memory is " + obj.totalMemory());
        System.out.println("Free memory is " + obj.freeMemory());
        System.out.println("Used memory is " +  ( obj.totalMemory() - obj.freeMemory() ) );

        //String is immutable
    }
}