package flyproject.flytranslate;

public class Test {
    public static void main(String[] args) {
        GoogleTranslateAPI translateAPI = new GoogleTranslateAPI();
        try {
            String trans = translateAPI.translateText("你好","en");
            System.out.println(trans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
