package com.microsoft.graph.functional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.microsoft.graph.core.Constants;
import com.microsoft.graph.http.CoreHttpProvider;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.httpcore.ICoreAuthenticationProvider;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.core.GraphServiceClient;

import okhttp3.OkHttpClient;
import okhttp3.Request;


public class TestBase {
    private String clientId;
    private String username;
    private String password;
    private String clientSecret;
    // Don't use password grant in your apps. Only use for legacy solutions and automated testing.
    private String grantType = "password";
    private String tokenEndpoint = "https://login.microsoftonline.com/"+ Constants.TENANTID +"/oauth2/v2.0/token";
    private String resourceId = "https%3A%2F%2Fgraph.microsoft.com%2F.default";

    public IGraphServiceClient graphClient = null;

    public TestBase(){
        this(true);
    }
    public TestBase(boolean performAuth)
    {
        clientId = Constants.APPID;
        username = Constants.USERNAME;
        password = Constants.PASSWORD;
        clientSecret = Constants.CLIENTSECRET;
        GetClient(performAuth);
    }
    private void GetClient(boolean authenticate)
    {
        if (graphClient == null) {
            try {
                final OkHttpClient httpClient = HttpClients.createDefault(authenticate ? getAuthenticationProvider() : getUnauthenticationProvider());
                graphClient = GraphServiceClient.builder()
                                                .httpClient(httpClient)
                                                .buildClient();
            }
            catch (Exception e)
            {
                throw new Error("Could not create a graph client: " + e.getLocalizedMessage());
            }
        }
    }
    public ICoreAuthenticationProvider getUnauthenticationProvider() {
        return new ICoreAuthenticationProvider() {
            @Override
            public Request authenticateRequest(Request request) {
                return request;
            }
        };
    }
    public ICoreAuthenticationProvider getAuthenticationProvider() {
        final String accessToken = GetAccessToken().replace("\"", "");
        return new ICoreAuthenticationProvider() {
            @Override
            public Request authenticateRequest(Request request) {
                return request.newBuilder().addHeader("Authorization", "Bearer "+ accessToken).build();
            }
        };
    }

    private String GetAccessToken()
    {

        try {
            final URL url = new URL(tokenEndpoint);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String line;
            final StringBuilder jsonString = new StringBuilder();

            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            try (final OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8")) {
                final String payload = String.format("grant_type=%1$s&scope=%2$s&client_id=%3$s&username=%4$s&password=%5$s&client_secret=%6$s",
                        grantType,
                        resourceId,
                        clientId,
                        username,
                        password,
                        clientSecret);
                writer.write(payload);
            }
            try {
                try (final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    while((line = br.readLine()) != null){
                        jsonString.append(line);
                    }
                }
            } catch (Exception e) {
                throw new Error("Error reading authorization response: " + e.getLocalizedMessage());
            }
            conn.disconnect();

            JsonObject res = new GsonBuilder().create().fromJson(jsonString.toString(), JsonObject.class);
            return res.get("access_token").toString().replaceAll("\"", "");

        } catch (Exception e) {
            throw new Error("Error retrieving access token: " + e.getLocalizedMessage());
        }
    }
}
