import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);//Ошибка в результате деления на ноль.
        // Исправил переменную devide в классе Calculator
        calc.println.accept(a);
        calc.println.accept(c);

    }
}
