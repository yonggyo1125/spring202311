package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        System.out.print("�ƹ��ų� �Է� : ");
       // char ch = (char)System.in.read();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char ch = (char)br.read();
        //char ch = (char)isr.read();
        //char ch = (char)System.in.read();

        System.out.println(ch);
    }
}
