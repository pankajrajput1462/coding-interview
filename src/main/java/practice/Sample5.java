package practice;

import javainaction.javaone.Sample;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class ABC{
    public ABC() {
//        System.out.println("constructor");
    }
    static {
//        System.out.println("Inside Static");
    }
    {
//        System.out.println("Inside Block ");
    }
    public void funABC(){
//        System.out.println("FunABC");
    }
}

public class Sample5 extends ABC {

    public Sample5() {
//        System.out.println("Sample5 Cons");
    }
    {
//        System.out.println("Sample5 Normal Block");
    }

    static {
//        System.out.println("Sample5 static block");
    }

    public static String on;

    public  void funSample5(){
//        System.out.println("Sammple5");
    }


    public static void main(String[] args) {
        Sample5 sample5= new Sample5();
        ABC abc= new Sample5();
        abc.funABC();
        Map<String,String> map=new HashMap<>();
        map.put(null,"p");
        System.out.println(map.get(null));
        map.put(null,"99");
        System.out.println(map.get(null));

        Map<String,String> map1= new LinkedHashMap<>();
        map1.put(null,"pa");
        System.out.println("map1.get(null) = " + map1.get(null));
//        Map<String,String> map2= new ConcurrentHashMap<>();
//        map2.put(null,"l");
//        System.out.println("map2.get(null) = " + map2.get(null));
//        Map<String,String> map3= new TreeMap<>();
//        map3.put(null,"pankj");
//        System.out.println("map3.get(null) = " + map3.get(null));
//        Hashtable hashtable= new Hashtable();
//        hashtable.put(null,"pakaj");
//        System.out.println("hashtable.get() = " + hashtable.get(null));

        String s = exeptuonSample();
        System.out.println("s = " + s);

    }

    private static String exeptuonSample() {
        String pathname = "One.js";
        File file = new File(pathname); // java.io.File
        InputStream in = null; // java.io.InputStream
        try {
            in = new FileInputStream(file);
            return "p";
        } catch (FileNotFoundException e) {
            System.out.println("Catch Block = " + e.getMessage());
           // return "cat";
        }
        finally {
            System.out.println("Finally");
//            return "One";
        }

//        BufferedReader reader=new BufferedReader(new InputStreamReader(in));
        return "Default";
    }
}
