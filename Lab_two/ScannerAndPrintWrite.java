package Lab_two;
import java.util.*;
import java.io.*;

public class ScannerAndPrintWrite {
	public static HashMap<String,Integer> readFromTxt(String filename) throws Exception {
		HashMap<String, Integer> map = new HashMap<>();
		File file = new File(filename);
		try {
			if(!file.canRead()) {
				throw new Exception("�ļ����ɶ�");
			}
			Scanner in = new Scanner(file);
			while(in.hasNext()) {
				String s = in.next();
				if(!s.matches("[a-zA-Z0-9-]+")) {
					throw new Exception("��������");
				}
				if(map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				}
				else {
					map.put(s, 1);
				}
			}
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static void writeToTxt(String filename,HashMap<String, Integer> map) throws Exception {
		File file = new File(filename);
		try {
			PrintWriter out = new PrintWriter(file);			
			ByValueComparator sort = new ByValueComparator(map);
			List<String> keys = new ArrayList<String>(map.keySet());
			Collections.sort(keys,sort);
			for(String s : keys) {
				out.println(s + " " + map.get(s));
			}
			out.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		String fromFile = "D:" + File.separator + "�˲���ĸǴı�Ӣ��.txt";
		String toFile = "D:" + File.separator + "out.txt";
		writeToTxt(toFile,readFromTxt(fromFile));
	}
}

class ByValueComparator implements Comparator<String>{
	HashMap<String, Integer> map;
	
	public ByValueComparator(HashMap<String, Integer> map) {
		this.map = map;
	}
	
	public int compare(String arg1,String arg2) {
		if(!map.containsKey(arg1) || !map.containsKey(arg2)) {
			return 0;
		}
		if(map.get(arg1) > map.get(arg2)) {
			return -1;
		}
		else if(map.get(arg1) == map.get(arg2)) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
