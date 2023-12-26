package exam03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.dat");
            DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeBoolean(true);
            dos.writeInt(100);
            dos.writeUTF("æ»≥Á«œººø‰.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
