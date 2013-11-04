/*
 * HashSetTesting.java
 * 
 * Version:
 *      $Id: HashSetTesting.java,v 1.1.1.1 2013/04/11 15:45:19 dnf7976 Exp $
 * 
 * Revisions:
 *      $Log: HashSetTesting.java,v $
 *      Revision 1.1.1.1  2013/04/11 15:45:19  dnf7976
 *      Initial import; really useful, will probably use in CS3 project
 *
 */
package hashsettesting;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author david
 */
public class HashSetTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable hs = new Hashtable();
        for (int i = 0; i < 10; i++) {
            if (hs.containsKey(i % 5)) {
                ArrayList<Integer> temp = (ArrayList<Integer>) hs.get(i % 5);
                temp.add(i);
                hs.put(i % 5, temp);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                hs.put(i % 5, temp);
            }
        }
        System.out.println(hs);
    }
}
