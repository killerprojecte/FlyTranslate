package flyproject.flytranslate;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class JsonAPI {
    //解析json
    public static String getTranslateWord(String json){
        String resultStr = json;
        JsonParser jp = new JsonParser();
        JsonArray ja = jp.parse(resultStr).getAsJsonArray();
        String word = ja.get(0).getAsJsonArray().get(0).getAsJsonArray().get(0).getAsString();
        return word;
    }
}
