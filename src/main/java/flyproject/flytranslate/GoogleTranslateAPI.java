package flyproject.flytranslate;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class GoogleTranslateAPI {
    //GoogleAPI地址
    private static final String PATH="https://translate.googleapis.com/translate_a/single";
    //客户端类型
    private static final String CLIENT="gtx";
    //浏览器协议
    private static final String USER_AGENT="Mozilla/5.0";//"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36";



    private static GoogleTranslateAPI _instance = null;

    public static GoogleTranslateAPI getInstance() {
        if( null == _instance){
            _instance = new GoogleTranslateAPI();
        }
        return _instance;
    }
    public String translateText(String text, String targetLang) throws Exception{


        String retStr="";
        //初始化
        List<NameValuePair> nvps = new ArrayList();
        nvps.add(new BasicNameValuePair("client", CLIENT));
        nvps.add(new BasicNameValuePair("sl", "auto"));
        nvps.add(new BasicNameValuePair("tl", targetLang));
        nvps.add(new BasicNameValuePair("dt", "t"));
        nvps.add(new BasicNameValuePair("q", text));
        String resp =  postHttp(PATH,nvps);
        if( null == resp ){
            throw  new Exception("网络异常");
        }
        //解析Json
        retStr = JsonAPI.getTranslateWord(resp);
        return retStr;
    }

    private String postHttp(String url , List<NameValuePair> nvps){
        String responseStr = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("User-Agent",USER_AGENT);
        CloseableHttpResponse response2 = null;
        try {
            httpPost.setEntity( new UrlEncodedFormEntity(nvps, Charset.forName("UTF-8"))  );
            response2 = httpclient.execute(httpPost);
            HttpEntity entity2 = response2.getEntity();
            responseStr = EntityUtils.toString(entity2);
            EntityUtils.consume(entity2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != response2) {
                try {
                    response2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if( null != httpclient ){
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return responseStr;
    }

}
