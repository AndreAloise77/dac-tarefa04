package pkg.hellobean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Andre
 */
@LocalBean
@Stateless
public class Tarefa04Bean {

    public String getMessageFor(String caller) {
        return "hello to you, " + caller + " !";
    }//func
}//class
