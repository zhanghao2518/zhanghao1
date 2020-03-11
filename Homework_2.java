package Homework;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Homework_2 {
    public static void main(String[] args) {
    	
    	//Case one
    	System.out.println("Case 1 :");
    	Map<String,Integer> map = new HashMap<String,Integer>();
    	for(int i=0;i<args.length;i++) {
    		if(map.containsKey(args[i])) {
    			map.put(args[i], map.get(args[i])+1);
    		}
    		else {
    			map.put(args[i], 1);
    		}
    	}
    	for(String s : map.keySet()) {
    		System.out.println(s + " = " +map.get(s));
    	}
    	
    	//Case two
    	System.out.println("Case 2 :");
    	Set<String> set = new HashSet<String>();
    	for(int i=0;i<args.length;i++) {
    		set.add(args[i]);
    	}
    	String[] s = new String[set.size()];
    	int[] snum = new int[set.size()];
    	Iterator it = set.iterator();
    	for(int i=0;it.hasNext();i++) {
    		s[i] = (String) it.next();
    	}
    	for(int i=0;i<args.length;i++) {
    		int j;
    		for(j=0;j<s.length;j++) {
    			if(args[i].equals(s[j])) {
    				break;
    			}
    		}
    		snum[j]++;
    	}
    	for(int i=0;i<s.length;i++) {
    		System.out.println(s[i] + " = " + snum[i]);
    	}
    	
    	//Case three
    	System.out.println("Case 3 :");
    	List<String> list = new ArrayList<String>();
    	List<Integer> list1 = new ArrayList<Integer>();
    	for(int i=0;i<args.length;i++) {
    		if(list.contains(args[i])) {
    			list1.set(list.indexOf(args[i]), list1.get(list.indexOf(args[i])) + 1);
    		}
    		else {
    			list.add(args[i]);
    			list1.add(1);
    		}
    	}
    	Iterator it1 = list.iterator();
    	Iterator it2 = list1.iterator();
    	while(it1.hasNext() && it2.hasNext()) {
    		System.out.println(it1.next() + " = " + it2.next());
    	}
    }
}
