package exam03;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test4.txt")) {
            fw.write("�ȳ��ϼ���.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
