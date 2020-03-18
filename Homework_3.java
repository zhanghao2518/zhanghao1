package Homework;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Homework_3 {
    public static void main(String[] args) throws Exception {
    	String name = "了不起的盖茨比英文.txt";
    	File file1 = new File("D:" + File.separator + "out" + File.separator +name);
    	File file2 = new File("D:" + File.separator + "in" + File.separator + file1.getName());
    	if(!file2.getParentFile().exists()) {
    		file2.getParentFile().mkdirs();
    	}
    	Scanner in = new Scanner(file1);
    	PrintWriter out = new PrintWriter(file2);
    	while(in.hasNextLine()) {
    		out.println(in.nextLine());
    	}
    	in.close();
    	out.close();
    }
	
}
