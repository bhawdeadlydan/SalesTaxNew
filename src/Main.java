import com.pathshala.Sales.Item;
import com.pathshala.Sales.Parser;
import com.pathshala.Sales.SalesApp;
import com.pathshala.Sales.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        View view = new View(new Scanner(System.in));

        HashMap<String, String[]> masterList = new HashMap<String, String[]>();
        masterList.put("food", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("music CD", new String[]{"", "FALSE"});
        masterList.put("bottle of perfume", new String[]{"", "FALSE"});
        masterList.put("packet of headache pills", new String[]{"FoodBookMedical", "FALSE"});
        masterList.put("box of chocolates", new String[]{"", "FALSE"});
        Parser parser = new Parser(view, masterList);

        ArrayList<Item> itemList = new ArrayList<Item>();
        SalesApp salesApp = new SalesApp(view, parser, itemList);
        salesApp.start();
    }
}
