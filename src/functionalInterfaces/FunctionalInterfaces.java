package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
/**
 * Not doing anything..Just simple examples of functional interfaces
 * with anonymous classes, lambdas, and method references
 **/

public class FunctionalInterfaces {

    public static void main (String [] args){
        //Supplier
        Supplier<String> supplier = new Supplier<String>(){
            @Override
            public String get(){
                return new String("supplier");
            }
        };
        Supplier<String> supplier2 = () -> new String();
        Supplier<String> supplier3 = String::new;


        //Consumer
        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        };
        Consumer<String> consumer2 = s -> System.out.println(s);
        Consumer<String> consumer3 = System.out:: println;


        //BiConsumer
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer= new BiConsumer<String, Integer>(){
            @Override
            public void accept(String key, Integer value){
                map.put(key, value);
            }
        };
        BiConsumer<String, Integer> biConsumer2 = (k,v) -> map.put(k,v);
        BiConsumer<String, Integer> biConsumer3 = map::put;


        //Predicate
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        Predicate<String> predicate1 = x -> x.isEmpty();
        Predicate<String> predicate2 = String::isEmpty;


        //BiPredicate
        BiPredicate<String, String> biPredicate = new BiPredicate<String,String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.startsWith(s2);
            }
        };
        BiPredicate<String,String> biPredicate1 = (x, y) -> x.startsWith(y);
        BiPredicate<String,String> biPredicate2 = String::startsWith;


        //Function
        Function<String, Integer> function = new Function<String, Integer>(){
            @Override
            public Integer apply(String s){
                return s.length();
            }
        };
        Function<String, Integer> function1 = s ->  s.length();
        Function<String, Integer> function2 = String::length;


        //BiFunction
        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>(){
            @Override
            public String apply(String s1,String s2){
                return s1.concat(s2);
            }
        };
        BiFunction<String, String, String> biFunction2 = (x,y) ->  x.concat(y);
        BiFunction<String, String, String> biFunction3 = String::concat;


        //UnaryOperator
        UnaryOperator<String> unaryOperator = new UnaryOperator<String>(){
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }
        };
        UnaryOperator<String> unaryOperator2 = x ->  x.toUpperCase();
        UnaryOperator<String> unaryOperator3 = String::toUpperCase;


        //BinaryOperator
        BinaryOperator<String> binaryOperator = new BinaryOperator<String>(){
            @Override
            public String apply(String s1, String s2){
                return s1.concat(s2);
            }
        };
        BinaryOperator<String> binaryOperator2 = (s1,s2) ->  s1.concat(s2);
        BinaryOperator<String> binaryOperator3 = String::concat;
    }
}
