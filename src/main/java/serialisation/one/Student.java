package serialisation.one;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private int stuId;
    private String stuName;
    private String country;
}
