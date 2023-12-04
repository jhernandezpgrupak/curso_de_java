package org.alberttcode.java8.lambda;

import org.alberttcode.java8.lambda.models.Usuario;

import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        //Devuelve un boolean
        Predicate<Integer> test = numero -> numero > 85;
        boolean result = test.test(33);
        System.out.println("El resultado es = " + result);

        Predicate<String> test2 = role -> role.equals("Admin");
        boolean result2 = test2.test("Admin");
        System.out.println("result2 = " + result2);

        BiPredicate<Integer, Integer> test3 = (a,b) -> a > b;
        boolean result3 = test3.test(5,9);
        System.out.println(result3);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Roberto");
        b.setNombre("ROberto");

        BiPredicate<Usuario, Usuario> test4 = (ua, ub) -> ua.getNombre().equalsIgnoreCase(ub.getNombre());
        System.out.println(test4.test(a,b));
    }
}
