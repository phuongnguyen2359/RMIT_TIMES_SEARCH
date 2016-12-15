package xyz.annt.nytimessearch.network;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;


public class ArticleClient {
    private static final String ARTICLE_SEARCH_API_URI = "https://api.nytimes.com/svc/search/v2/articlesearch.json";
    private static final String ARTICLE_SEARCH_API_KEY = "7b5eed60b0d44d9b80b5d91bd56a60f0";
    //7b5eed60b0d44d9b80b5d91bd56a60f0
    //https://api.nytimes.com/svc/search/v2/articlesearch.json

    //cd397f92c9e19271f233825e99f2a9fb:7:74742640
    //http://api.nytimes.com/svc/search/v2/articlesearch.json
    private AsyncHttpClient client;

    public ArticleClient() {
        this.client = new AsyncHttpClient();
    }

    public void searchArticles(RequestParams params, JsonHttpResponseHandler handler) {
        String url = ARTICLE_SEARCH_API_URI;
        params.put("api-key", ARTICLE_SEARCH_API_KEY);

        client.get(url, params, handler);
    }
}
