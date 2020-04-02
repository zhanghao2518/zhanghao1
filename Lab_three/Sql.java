package Lab_three;

import java.lang.reflect.Field;
import java.util.List;

public class Sql implements sqlUtil{
	public String addString(String string,User user) {
    	Field[] fields = user.getClass().getDeclaredFields();
        boolean b = false;
        try {
        	for(Field field : fields) {
        		field.setAccessible(true);
            	if(field.getName() == "id" && !field.get(user).equals(null) && !field.get(user).equals(0)) {
            	    Column column = field.getAnnotation(Column.class);
            	    string += column.value() + " = " + field.get(user);
            	    b = true;
            	}
            	if(field.getName() == "username" && field.get(user) != null && !field.get(user).equals(0)) {
            	    Column column = field.getAnnotation(Column.class);
            	    if(b) {
            	    	string += " and "; 
            	    }
            	    string += column.value() + " like \"" + field.get(user) + "\"";
            	    b = true;
            	}
            	if(field.getName() == "age" && !field.get(user).equals(null) && !field.get(user).equals(0)) {
            	    Column column = field.getAnnotation(Column.class);
            	    if(b) {
            	    	string += " and "; 
            	    }
            	    string += column.value() + " = " + field.get(user);
            	    b = true;
            	}
            	if(field.getName() == "email" && field.get(user) != null && !field.get(user).equals(0)) {
            	    Column column = field.getAnnotation(Column.class);
            	    if(b) {
            	    	string += " and "; 
            	    }
            	    string += column.value() + " like \"" + field.get(user) + "\"";
            	    b = true;
            	}
            	if(field.getName() == "telephone" && field.get(user) != null && !field.get(user).equals(0)) {
            	    Column column = field.getAnnotation(Column.class);
            	    if(b) {
            	    	string += " and "; 
            	    }
            	    string += column.value() + " like " + field.get(user);
            	}
            }
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        return string;
	}
    public String query(User user) {
        String string = "";
        Table table = user.getClass().getAnnotation(Table.class);
        string += "select * from " + table.value() + " where ";
    	return addString(string, user) + "\n";
    }
    
    public String insert(User user) {
    	Field[] fields = user.getClass().getDeclaredFields();
        String string = "";
        boolean b = false;
        Table table = user.getClass().getAnnotation(Table.class);
        string += "insert  into " + table.value()  + " ( ";
        try {
        	for(Field field : fields) {
        		field.setAccessible(true);
                if(!field.get(user).equals(null) && !field.get(user).equals(0)) {
                	if(b) {
                		string += ",";
                	}
                	Column column = field.getAnnotation(Column.class);
                	string += column.value();
                    b = true;
                }
            }
        	b = false;
        	string += " ) values ( ";
        	for(Field field : fields) {
        		field.setAccessible(true);
        		if(!field.get(user).equals(null) && !field.get(user).equals(0)) {
        			if(b) {
        				string += ",";
        			}
        			if(field.getType().equals(String.class)) {
        				string += "\"";
        			}
        			string += field.get(user);
        			if(field.getType().equals(String.class)) {
        				string += "\"";
        			}
                    b = true;
        		}
        	}
        	string += " ) \n";
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        return string;
    }
    public String insert(List<User> users) {
    	String string = "";
    	for(User user : users) {
    		string += insert(user);
    	}
    	return string;
    }
    public String delete(User user) {
        String string = "";
        Table table = user.getClass().getAnnotation(Table.class);
        string += "delete from " + table.value() + " where ";
    	return addString(string, user) + "\n";
    }
    public String update(User user) {
        String string = "";
        boolean b = false;
        Field[] fields = user.getClass().getDeclaredFields();
        Table table = user.getClass().getAnnotation(Table.class);
        string += "update " + table.value() + " set ";
        try {
        	for(Field field : fields) {
        		field.setAccessible(true);
            	if(field.get(user) != null && !field.get(user).equals(0) && !field.getName().equals("id")) {
            		if(b) {
            			string += " and ";
            		}
            		Column column = field.getAnnotation(Column.class);
            		string += column.value() + " = ";
            		if(field.getType().equals(String.class)) {
            			string += "\"";
            		}
            		string += field.get(user);
            		if(field.getType().equals(String.class)) {
            			string += "\"";
            		}
            		b = true;
            	}
        	}
        	Field field = user.getClass().getDeclaredField("id");
        	field.setAccessible(true);
        	string += " where " + field.getAnnotation(Column.class).value() + " = " + field.get(user);
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
        return string + "\n";
    }
}
