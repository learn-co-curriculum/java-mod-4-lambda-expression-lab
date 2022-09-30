
public class Task1 {

    public static MyIntOperator nextInt = null ; //replace null with lambda expression

    public static void main(String[] args) {
        System.out.println(nextInt.apply(6)); //7
        System.out.println(nextInt.apply(13)); //14
        System.out.println(nextInt.apply(-5)); //-4
        System.out.println(nextInt.apply(0)); //1
    }
}
