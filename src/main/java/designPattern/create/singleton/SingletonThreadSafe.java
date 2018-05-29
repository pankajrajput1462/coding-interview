package designPattern.create.singleton;

public class SingletonThreadSafe {

private static volatile SingletonThreadSafe instance;
    
    private SingletonThreadSafe(){}
    
    public static synchronized SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
    
    //DoubleLock
    public static SingletonThreadSafe getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (SingletonThreadSafe.class) {
                if(instance == null){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
    
}
