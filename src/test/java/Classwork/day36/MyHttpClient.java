package Classwork.day36;


import io.cucumber.java.eo.Se;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;


public class MyHttpClient {
    public static void main(String[] args) throws URISyntaxException, IOException {
        MyHttpClient myHttpClient = new MyHttpClient();
//        myHttpClient.httpGet();
        myHttpClient.search(new Search("a", true));

    }

    public void httpGet() throws URISyntaxException, IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("https://www.nbrb.by/api/exrates/currencies/1");
        HttpGet request = new HttpGet(builder.build());
        HttpResponse httpResponse = client.execute(request);
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
    }
    public void search(Search search) throws IOException, URISyntaxException {

        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("http://178.124.206.46:8001/app/ws/");
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(MyParser.fromGSON(search)));
        HttpResponse response = client.execute(request);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }
}
