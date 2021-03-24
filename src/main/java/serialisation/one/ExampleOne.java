package serialisation.one;

import java.io.*;

public class ExampleOne {
    public static void main(String[] args) {
//        toSeraialize();
        toDeSeraialize();
    }

    private static void toDeSeraialize() {
        try (FileInputStream fileInputStream = new FileInputStream("stu.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            Student student = (Student) objectInputStream.readObject();
            System.out.println("student = " + student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void toSeraialize() {
        Student student = new Student();
        student.setCountry("India");
        student.setStuId(3);
        student.setStuName("Pankaj");
        try (FileOutputStream fileOutputStream = new FileOutputStream("stu.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
