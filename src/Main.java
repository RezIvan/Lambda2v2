import java.util.Scanner;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
//        printUpperCase.accept("hello");

//        Function<Integer, String> convert = x->String.valueOf(x) + " долларов";
//        System.out.println(convert.apply(5));

//        Predicate<Integer> isPositive = x -> x>0;
//        System.out.println(isPositive.test(5));
//        System.out.println(isPositive.test(-7));

        Supplier<Human> human = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Input name");
            String name = in.nextLine();
            return new Human(name);
        };

        Human h1 = human.get();
        Human h2 = human.get();

        System.out.println("Human 1: "+ h1.getName());
        System.out.println("Human 2: "+ h2.getName());

    }
}
