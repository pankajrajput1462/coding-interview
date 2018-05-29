package javainaction;

import java.util.function.Function;

/**
 * Created by psi143 on 2/21/2017.
 */
public class Letter {
    public static String addheder(String text) {
        return "From Raoul, Mario and Alan: " + text;
    }

    public static String addfooter(String text) {

        return text + " Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

    public static void main(String[] args) {
        /**
         * pilpeline
         *            andThen                   andThen
         * addheader ----------> cheackSpelling---------->addFooter
         * 
         */

        Function< String, String> addheder = Letter::addheder;
        //Function<String,String> addFooter=Letter::addfooter;
        Function<String,String>  pipeline=addheder.andThen(Letter::addfooter).andThen(Letter::checkSpelling);
        String s = pipeline.apply("Pankaj");
     //   System.out.println(s);
        String s2 = addheder.andThen(Letter::addfooter).andThen(s1 -> s1.concat("afksdfskl")).apply("Pankaj");
        System.out.println(s2);

    }

}
