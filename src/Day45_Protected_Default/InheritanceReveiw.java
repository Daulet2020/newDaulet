package Day45_Protected_Default;

class A {
    
    public static void methodA() {
        System.out.println("A");
    }
    
    public static void main(String[] args) {
    //   methodB();  // super class cannot inherit anything from sub class
    //   methodC();  // super class cannot inherit anything from sub class
    }
    
}
class B extends A {
    /*
     public static void methodA() {
        System.out.println("A");
        }
     */
    public static void methodB() {
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        methodA();
        methodB();
    }
}
public class InheritanceReveiw extends B {
    
    /*
     public static void methodA() {
        System.out.println("A");
    }
    
    public static void methodB() {
        System.out.println("B");
    }
     */
    
    public static void methodC() {
        System.out.println("C");
    }
    
    public static void main(String[] args) {
        methodA();
        methodC();
    }

	public int staticNum;
    
    
}
