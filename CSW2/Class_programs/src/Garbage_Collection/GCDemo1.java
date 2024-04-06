package Garbage_Collection;

public class GCDemo1 {
    private String myObject;

    public static void main(String[] args) {
        testMethod1();
        System.gc();
        System.runFinalization();
    }

    public GCDemo1(String myObject) {
        this.myObject = myObject;
    }

    private static void testMethod1() {
        GCDemo1 myObjectTest1 = new GCDemo1("myObjectTest1");
        testMethod2();
    }

    private static void testMethod2() {
        GCDemo1 myObjectTest2 = new GCDemo1("myObjectTest2");
    }

    protected void finalize() throws Throwable {
        System.out.println(String.format("Garbage collection is successful for %1$s", this.myObject));
    }
}
// public class UnreachableObjectsExample {
//     private String myObject; 
//     public static void main(String args[])
//     {
//      // Executing testMethod1 method
//       testMethod1(); 
//      // Requesting garbage collection
//       System.gc();
//     }
//     public UnreachableObjectsExample(String myObject) 
//     {
//      this.myObject = myObject;
//     }
//     private static void testMethod1()
//     {
//      // After existing testMethod1(), the object myObjectTest1 becomes unreachable 
//       UnreachableObjectsExample myObjectTest1 = new 
//    UnreachableObjectsExample("myObjectTest1"); 
//      testMethod2(); 
//     }
//     private static void testMethod2()
//     {
//      // After existing testMethod2(), the object myObjectTest2 becomes unreachable 
//       UnreachableObjectsExample myObjectTest2 = new 
//    UnreachableObjectsExample("myObjectTest2"); 
//     }
//     @Override
//      protected void finalize() throws Throwable 
//     {
//        // following line will confirm the garbage collected method name
//      System.out.println("Garbage collection is succcessful for " + this.myObject);
//     }
//    }