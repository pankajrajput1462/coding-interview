package threading;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class ThreadMain {
    public static void main(String[] args) throws IOException {

        String s = "fav_1";
        System.out.println("s = " + s.contains(String.valueOf(1)));

        LocationList locationList= new LocationList();

        Location location1 = new Location("fav_1", "鞍山");
        Location location4 = new Location("fav_4", "北京");
        Location location2 = new Location("fav_2", "本溪");
        Location location6 = new Location("fav_6", "长沙");
        Location location10 = new Location("fav_10", "大连");

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(location1);
        locations.add(location4);
        locations.add(location6);
        locations.add(location2);
        locations.add(location10);


        ObjectMapper mapper = new ObjectMapper();

        StorageObject storageObject = new StorageObject();
        //storageObject.setKey("favList");
        final String s1 = mapper.writeValueAsString(locations);
        System.out.println("s1 = " + s1);
        final Location[] locationList1 = mapper.readValue(s1, Location[].class);
        for (int i = 0; i < locationList1.length; i++) {
          //  System.out.println("locationList1 = " + locationList1[i].getName());
        }
        //storageObject.setValue(s1);

        final JsonFactory factory = mapper.getFactory();
        JsonParser generator= factory.createParser(s1.getBytes());


        System.out.println("storageObject = " + storageObject);

        mainLL();

      /*  for (int i = 0; i <= 20; i++) {
            boolean isAvailable = false;
            for (int j = 0; j < locations.size(); j++) {
                if (locations.get(j).getId().contains(String.valueOf(i))) {
                    isAvailable = true;
                    break;
                }
            }
            if (!isAvailable) {
                locations.add(new Location("fav_"+i,""));
            }*/


    }
    //locations.forEach(location -> {System.out.println(location.getId());});

        public static void mainLL(){
        byte[] encoding1 = new byte[0];
        try {
            encoding1 = "你好吗".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String string1 = null;
        try {
            string1 = new String(encoding1, "ISO8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (byte b : encoding1) {
                System.out.printf("%2x ", b);
            }
            System.out.println();
        byte[] encoding2 = new byte[0];
        try {
            encoding2 = string1.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for (byte b : encoding2) {
                System.out.printf("%2x ", b);
            }
            System.out.println();
        }
}
