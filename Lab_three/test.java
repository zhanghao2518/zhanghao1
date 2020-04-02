package Lab_three;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
    	// initialize util
        sqlUtil util = new Sql();

        // test query1
        System.out.println("This is test1 : ");
        User user = new User();
        user.setId(175);
        System.out.println(util.query(user));
        // print: SELECT * FROM user WHERE id = 175

        // test query2
        System.out.println("This is test2 : ");
        user = new User();
        user.setUsername("ʷ����");
        System.out.println(util.query(user));
        // print: SELECT * FROM `user` WHERE `username` LIKE 'ʷ����';

        // test insert
        System.out.println("This is test3 : ");
        user = new User();
        user.setUsername("user");
        user.setTelephone("12345678123");
        user.setEmail("user@123.com");
        user.setAge(20);
        System.out.println(util.insert(user));
        // print: INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES ('user', '12345678123', 'user@123.com', 20)
        
        // test insert list
        System.out.println("This is test4 : ");
        User user2 = new User();
        user2.setUsername("user2");
        user2.setTelephone("12345678121");
        user2.setEmail("user2@123.com");
        user2.setAge(20);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        System.out.println(util.insert(list));
        // print: INSERT INTO `user` (`username`, `telephone`, `email`, `age`) VALUES ('user', '12345678123', 'user@123.com', 20), ('user2', '12345678121', 'user2@123.com', 20)
        
        // test update
        System.out.println("This is test5 : ");
        user = new User();
        user.setId(1);
        user.setEmail("change@123.com");
        System.out.println(util.update(user));
        // print: UPDATE `user` SET `email` = 'change@123.com' WHERE `id` = 1;
        
        // test delete
        System.out.println("This is test6 : ");
        user = new User();
        user.setId(1);
        System.out.println(util.delete(user));
        // print: DELETE FROM `user` WHERE `id` = 1;

	}
}
