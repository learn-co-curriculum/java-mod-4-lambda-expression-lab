
public class Task2 {

    public static MyIntPredicate isEven = null ; //replace null with lambda expression

    public static void main(String[] args) {
        System.out.println(isEven.test(6)); //true
        System.out.println(isEven.test(13)); //false
        System.out.println(isEven.test(-5)); //false
        System.out.println(isEven.test(0)); //true
    }
}
