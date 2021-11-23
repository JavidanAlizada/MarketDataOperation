package example.marketData.fileFormatHandle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import example.marketData.model.Market;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MarketFileFormatHandler {
    private static final String PATH = "/home/javidan/Documents/tutorials/javaTutorials/tutorial/src/";
    private static List<Market> csvToMarketObject() {
        try {
            return new CsvToBeanBuilder(new FileReader(PATH + "MarketData.csv"))
                    .withType(Market.class).build().parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String convertMarketObjectToJSON() {
        File file = new File(PATH + "marketProducts.json");
        if (file.exists())
            return null;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(csvToMarketObject());
        try (FileWriter fileWriter = new FileWriter(file)) {
             fileWriter.write(json);
             fileWriter.flush();
        } catch (IOException e) {
             e.printStackTrace();
        }
        return json;
    }

    public static List<Market> getMarketListObject() {
        convertMarketObjectToJSON();
        return csvToMarketObject();
    }


}
