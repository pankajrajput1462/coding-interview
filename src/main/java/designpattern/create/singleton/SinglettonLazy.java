package designpattern.create.singleton;

public class SinglettonLazy {
    //http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#eager-initialization
    private static SinglettonLazy singlettonLazy;

    private SinglettonLazy() {
    }

    public static SinglettonLazy getSinglettonLazy() {
        if (singlettonLazy == null) {
            singlettonLazy = new SinglettonLazy();
        }
        return singlettonLazy;
    }


}
