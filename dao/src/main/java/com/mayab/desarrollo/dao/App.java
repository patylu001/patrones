package com.mayab.desarrollo.dao;
import java.util.List;

import com.mayab.desarrollo.entities.User;
import com.mayab.desarrollo.persistencia.UserDAO;
import com.mayab.desarrollo.persistencia.UserDAOImp;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User alumno = new User(1,"Hola","1234567891","pass1234");
        UserDAO dao = new UserDAOImp();
        
        dao.insert(alumno);
        
        List<User> todos = dao.findAll();
        
        for(User u:todos)
        {
        	System.out.println("Nombre = " + u.getName() + " Tel = " + u.getTel());
        }
    }
}
