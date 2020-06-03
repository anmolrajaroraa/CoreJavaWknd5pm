import java.io.PrintStream;

class FirstClass{

    static void show(){
        System.out.println("This is my feature!!");
    }

    // single line comment
    /*
    Multi - line comment
    1. void -> main doesn't return anything coz it's the starting as well as ending point
    2. public -> so that my main fn is accessible to javac and java command files which are sitting in some other directory
    3. static -> main fn is the first thing to get loaded so it can be accessed only via the class so we need to make it static
    */
    public static void main( String args[]){
        // PrintStream out = new PrintStream();  -> error
        int a = 10;
        System.out.println("Hello world" + a);
        FirstClass object = new FirstClass();
        FirstClass.show();
        System.out.println("I finally know the basics of java!!");
        //syso sop
        // System.out.print("Hello world)
        // System.outprint("Hello world);
    }
}

class SecondClass{
    
}
