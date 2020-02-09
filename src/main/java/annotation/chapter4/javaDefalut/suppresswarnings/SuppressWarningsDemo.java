package annotation.chapter4.javaDefalut.suppresswarnings;

public class SuppressWarningsDemo {

    @Deprecated
    @SuppressWarnings("deprecation")
    public static void say() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        SuppressWarningsDemo.say();
    }
}