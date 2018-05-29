package pan.map;

public class MyKey {
    /*
     For single value example

     private int id;

     public MyKey(int id, String firstKey) {
         this.id=id;
     }

     @Override
     public int hashCode() {
         System.out.println("Calling hashcode method() : "+id);
         return id;
     }*/
    private String name;
    private int id;

    public MyKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // standard getters and setters

    @Override
    public int hashCode() {
        System.out.println("Calling hashCode()");
        return id;
    }

    // toString override for pretty logging
}
