package com.siftscience;

import static java.net.HttpURLConnection.HTTP_OK;

import com.siftscience.model.DecisionStatusFieldSet;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class SessionDecisionStatusTest {


    @Test
    public void testSessionDecisionStatus() throws Exception {
        MockWebServer server = new MockWebServer();
        MockResponse response = new MockResponse();
        response.setResponseCode(HTTP_OK);

        String rspBody = "{\n" +
            "  \"decisions\": {\n" +
            "    \"account_takeover\": {\n" +
            "      \"decision\": {\n" +
            "        \"id\": \"session_decision\"\n" +
            "      },\n" +
            "      \"time\": 1461963429151,\n" +
            "      \"webhook_succeeded\": true\n" +
            "    }\n" +
            "  }\n" +
            "}";

        response.setBody(rspBody);
        server.enqueue(response);
        server.start();

        // Create a new client and link it to the mock server.
        SiftClient client = new SiftClient("YOUR_API_KEY", "YOUR_ACCOUNT_ID",
            new OkHttpClient.Builder()
                .addInterceptor(OkHttpUtils.urlRewritingInterceptor(server))
                .build());
        // Build and execute the request against the mock server.
        DecisionStatusRequest request = client.buildRequest(
            new DecisionStatusFieldSet()
                .setUserId("someuser")
                .setEntity(DecisionStatusFieldSet.ENTITY_SESSIONS)
                .setEntityId("someid"));
        DecisionStatusResponse siftResponse = request.send();

        // Verify the request.
        RecordedRequest request1 = server.takeRequest();
        Assert.assertEquals("GET", request1.getMethod());
        Assert.assertEquals("/v3/accounts/YOUR_ACCOUNT_ID/users/someuser/sessions/someid/decisions",
            request1.getPath());
        Assert.assertEquals(request1.getHeader("Authorization"), "Basic WU9VUl9BUElfS0VZOg==");

        // Verify the response was parsed correctly.
        Assert.assertEquals(HTTP_OK, siftResponse.getHttpStatusCode());
        JSONAssert.assertEquals(response.getBody().readUtf8(),
            siftResponse.getBody().toJson(), false);
    }
}
