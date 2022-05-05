package Scanner;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String [] args) throws IOException {
        String fileName = "arquivo.txt";
        Scanner scan = new Scanner(new File(fileName), ("UTF-8"));
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
    }
}