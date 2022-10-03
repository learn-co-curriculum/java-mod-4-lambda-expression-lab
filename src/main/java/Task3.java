
public class Task3 {

    public static MyIntOperator nextOdd = null; //replace null with lambda expression

    public static void main(String[] args) {
        System.out.println(nextOdd.apply(6)); //7
        System.out.println(nextOdd.apply(13)); //15
        System.out.println(nextOdd.apply(-5)); //-3
        System.out.println(nextOdd.apply(0)); //1
    }
}
