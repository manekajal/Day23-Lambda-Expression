package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Regex{

    String details(String input);
}

public class RegexLambdaExpression {

    public static void main(String[] args){

        System.out.println(" Lambda Expression ");
        Regex regex =(input)->{
            String pattern= "^[A-z]{3,}";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(input);


            if(m.matches()){
                System.out.println("First Name Matched :" );

            }else
            {
                System.out.println(" First Name No Matched :");
            }

            return pattern;
        };
        System.out.println("First Name Pattern :" +regex.details("Kajal"));

        System.out.println();

        regex=(input) ->{
            String pattern = "^[A-Z][a-zA-Z]{3,}";

            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(input);

            if (m.matches()) {
                System.out.println(" Last Name is matched ");
            } else {
                System.out.println(" Not Matched ");
            }

            return pattern;
        };


        System.out.println("Last Name Pattern :" +regex.details("Mane"));

        System.out.println();

        regex=(input) -> {
            String pattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            Pattern r = Pattern.compile(pattern);

            Matcher m = r.matcher(input);


            if (m.matches()) {
                System.out.println(" email Matched :");

            } else {
                System.out.println("email  No Matched :");
            }
            return pattern;
        };
        System.out.println("Email Pattern :" +regex.details("manekajal2014@gmail.com"));

        System.out.println();

        regex=(input) ->{
            String pattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
            Pattern r = Pattern.compile(pattern);

            Matcher m;
            m = r.matcher(input);

            if (m.matches()) {
                System.out.println(" Mobile Number is Matched :");

            } else {
                System.out.println("  Mobile Number is Not Matched :");
            }
            return pattern;
        };
        System.out.println("Mobile Pattern :" +regex.details("91-9765326068"));
    }
}
