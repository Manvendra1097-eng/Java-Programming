package java8.exception;

import java.util.List;

public class ExceptionMain {
    public static void main(String[] args) {
        List<String> list = List.of("12", "34", "xyz");

/* *

1) APPROACH
        list.forEach(s -> {
            try {
                System.out.println(Integer.parseInt(s));
            } catch (NumberFormatException ex) {
                System.out.println("Exception : " + ex.getMessage());
            }
        });
*/


//        2) APPROACH
        list.forEach(ExceptionMain::print);


    }

    public static void print(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
    }
}
