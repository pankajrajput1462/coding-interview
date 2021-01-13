package serialisation;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private int one;
    private String onew = "one";
    private transient String fun = "ooo";

    public Employee() {
    }

    public String getOnew() {
        return onew;
    }

    public void setOnew(String onew) {
        this.onew = onew;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public String getFun() {
        return fun;
    }
}
