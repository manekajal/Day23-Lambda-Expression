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


    }
}
