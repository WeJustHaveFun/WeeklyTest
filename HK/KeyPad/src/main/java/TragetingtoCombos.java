package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TragetingtoCombos {
	
    public static void main(String[] args) throws IOException {
       
    	BufferedReader buf =  new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Input 8-digital phone number: ");
    	String phone = buf.readLine();
        List<String> combos = PhoneNumberProcessing.generateCombos(phone);

        for (String s : combos) {
            System.out.println(s);
        }
    }
}
