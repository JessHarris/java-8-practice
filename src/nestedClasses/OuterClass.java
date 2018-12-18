package nestedClasses;

/**
 * Class to demonstrate basic nested classes:
 * Member Inner Classes, Local Inner Classes, and Anonymous Classes cannot have static members
 * All three can access outer class members directly
 * Anonymous Class must extend or implement existing class/interface
 * Local Inner Class can access effectively final local variables in outer method
 *
 * Member Static Classes can have both static and non static members
 * Member Static Classes can only access outer class static members directly
 * Must create instance of outer class to access non static members
 **/

public class OuterClass {
    private int outerVariable;
    private static int outerStaticVariable;

    public class InnerClass {
        private int innerClassVariable;

        public void go() {
            System.out.println("Inner Class Method");
            System.out.println("Inner Class can access Outer Class variable" + outerVariable);
            System.out.println("Inner Class can access Outer Class static variable" + outerStaticVariable);
        }
    }

    public static class MemberStaticClass {
        private int memberStaticClassVariable;
        private static int memberStaticClassStaticVariable;

        public void go() {
            System.out.println("Member Static Class Method");
            System.out.println("Member Static Class can access Outer Class static variable" + outerStaticVariable);
        }

        public static void goStatic() {
            System.out.println("Member Static Class Static Method");
            System.out.println("Member Static Class Static Method can access Outer Class static variable" + outerStaticVariable);
            OuterClass outer = new OuterClass();
            System.out.println(outer.outerVariable);

        }
    }

    public interface AnonymousClass {
        public abstract void innerInterfaceMethod();
    }

    public void outerClassMethod() {
        final int localVariable = 5;

        class localInnerClass {

            public void go() {
                System.out.println("Local Inner Class Method");
                System.out.println("Local Inner Class Can Access " +
                        "Effectively Final Method Variables: " + localVariable);

                System.out.println("Local Inner Class can access Outer Class variable" + outerVariable);
                System.out.println("Local Inner Class can access Outer Class  static variable" + outerStaticVariable);
            }
        }

        AnonymousClass anonymousClass = new AnonymousClass(){
            @Override
            public void innerInterfaceMethod() {
                System.out.println("Anonymous Class method");
                System.out.println("Anonymous Class can access Outer Class variable" + outerVariable);
                System.out.println("Anonymous Class can access Outer Class  static variable" + outerStaticVariable);
            }
        };
    }
}
