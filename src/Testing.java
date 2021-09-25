import org.codehaus.groovy.runtime.ArrayUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;
import java.io.FileInputStream;


public class Testing {

    public static void main(String[] args) throws IOException {
        COPPER cp = new COPPER();
        SILVER sp = new SILVER();
        GOLD gp = new GOLD();
        PLATINUM pp = new PLATINUM();

        String fileLocation = "ItemList\\ITEMS.xlsx";
        String name;
        String description;
        String rarity;

        File file = new File("ITEMS.xlsx");
        FileInputStream fip = new FileInputStream(file);


        LinkedList<ITEMS> ITEMPOOL = new LinkedList<ITEMS>();
        for(int i = 0 ;i<350 ;i++)
        {
            ITEMPOOL.add(new ITEMS());
            //ITEMPOOL.get(i).main(name,description,rarity);
        }


        gp.setGp(10);
        System.out.println(gp.convertMoney("SILVER"));
        System.out.println("hello");
    }



}
