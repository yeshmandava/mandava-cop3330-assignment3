package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.ArrayList;

public class Item
{
    //Constructor
    public static class Struct
    {
        public String name;
        public double price;
        public int quantity;
    }

    private ArrayList<Struct> ProductStruct = new ArrayList<>();
    public void ScanProduct() throws FileNotFoundException
    {
        File ifp = new File("src/main/java/ex44/exercise44_input.json");
        JsonElement Elem = JsonParser.parseReader(new FileReader(ifp));
        JsonObject Obj = Elem.getAsJsonObject();
        JsonArray prodArr = Obj.get("products").getAsJsonArray();

        for(JsonElement prodElem: prodArr)
        {
            Struct newStruct = new Struct();
            JsonObject prodObjJson = prodElem.getAsJsonObject();
            newStruct.name = prodObjJson.get("name").getAsString();
            newStruct.price = prodObjJson.get("price").getAsDouble();
            newStruct.quantity = prodObjJson.get("quantity").getAsInt();
            ProductStruct.add(newStruct);
        }
    }

    public boolean RetrieveItem(String name)
    {
        for(Struct temp:ProductStruct)
        {
            if(temp.name.equalsIgnoreCase(name)){
                System.out.printf("Name: %s\n",temp.name);
                System.out.printf("Price: %.2f\n",temp.price);
                System.out.printf("Quantity: %d\n",temp.quantity);
                return true;
            }
        }
        return false;
    }

}
