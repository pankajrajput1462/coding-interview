package customexeption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService2 {

    public void analyze(List<String> data) {


        if (data.size() > 50) {
            throw new ListTooLargeException("List can't exceed 50 items!");
        } else if (data.size()< 30) {
            throw new TooLargeException("This is also too large");
        }

    }

    public static void main(String[] args) {

        CustomerService2 obj = new CustomerService2();

        // create 100 size
        List<String> data1 = new ArrayList<String>(Collections.nCopies(100, "mkyong"));
        List<String> data2 = new ArrayList<String>(Collections.nCopies(20, "mkyong"));
        //obj.analyze(data1);
        obj.analyze(data2);

    }

}