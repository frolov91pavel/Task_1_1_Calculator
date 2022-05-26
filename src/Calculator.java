import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    BinaryOperator<Integer> pow = (x, y) -> x * x;
    BinaryOperator<Integer> abs = (x, y) -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
