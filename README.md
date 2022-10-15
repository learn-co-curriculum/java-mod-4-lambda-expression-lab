# Lambda Expression Lab

## Instruction

Do not create a new class.  Use a lambda expression to implement the interface.

### TASK #1: 

Functional interface `MyIntOperator` defines an abstract method named `apply`:

```java
@FunctionalInterface
public interface MyIntOperator {
    int apply(int x);
}
```

Task1.java declares a variable named `nextInt` and assigns the variable to `null`:

`public static MyIntOperator nextInt = null ; //replace null with lambda expression`

Edit Task1.java to replace the `null` value with  a lambda expression
that implements `MyIntOperator`. The lambda expression should increment the parameter by 1.

NOTE: The `nextInt` variable is defined as `public static` so the Junit test 
can access and test the lambda expression.

Run the program and confirm the output:

```text
7
14
-4
1
```

Run the Junit test `Task1Test` to confirm your implementation.

### TASK #2: 

Functional interface `MyIntPredicate` defines abstract method `test`:

```java
@FunctionalInterface
public interface MyIntPredicate {
    boolean test(int x);
}
```

Edit Task2.java to replace the `null` value with a lambda expression
that implements `MyIntPredicate`.  
The lambda expression should test whether the parameter is an even number.

`public static MyIntPredicate isEven = null ; //replace null with lambda expression`

Run the program and confirm the output:

```text
true
false
false
true
```

Run the Junit test `Task2Test` to confirm your implementation.

### TASK #3:

Edit Task3.java to replace the `null` value with a lambda expression
that implements `MyIntOperator`.  
The lambda expression should return the next odd number that follows the parameter value.

`public static MyIntOperator nextOdd = null;  //replace null with lambda expression`

Run the program and confirm the output:

```text
7
15
-3
1
```

Run the Junit test `Task3Test` to confirm your implementation.

