package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import com.microsoft.graph.content.BatchRequestContent;
import com.microsoft.graph.content.BatchResponseContent;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.httpcore.HttpClients;
import com.microsoft.graph.requests.GraphServiceClient;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.UserRequest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class BatchTests {
    @Test
    public void GetsABatchFromRequests() throws IOException{
        final TestBase testBase = new TestBase();
        final GraphServiceClient<?> graphServiceClient = testBase.graphClient;
        final BatchRequestContent batchContent = new BatchRequestContent();
        final String meGetId = batchContent.addBatchRequestStep(graphServiceClient.me()
                                        .buildRequest());
        assertNotNull(meGetId);
        final String usersGetId = batchContent.addBatchRequestStep(graphServiceClient.users()
                        .buildRequest()
                        .filter("accountEnabled eq true")
                        .expand("manager")
                        .top(5),
                        HttpMethod.GET,
                        null,
                        meGetId);
        final User userToAdd = new User();
        userToAdd.givenName = "Darrel";
        final String userPostId = batchContent.addBatchRequestStep(graphServiceClient.users()
                        .buildRequest(),
                        HttpMethod.POST,
                        userToAdd,
                        usersGetId);

        final BatchResponseContent responseContent = testBase.graphClient.batch().buildRequest().post(batchContent);
        assertEquals(400, responseContent.getResponseById(userPostId).status); //400:we're not providing enough properties for the call to go through
        assertEquals(200, responseContent.getResponseById(meGetId).status);
        assertEquals(200, responseContent.getResponseById(usersGetId).status);
        final User me = responseContent.getResponseById(meGetId).getDeserializedBody(User.class);
        assertNotNull(me.displayName);
    }
}
