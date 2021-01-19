package com.microsoft.graph.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.OffsetDateTime;

import org.junit.Ignore;
import org.junit.Test;

import com.microsoft.graph.models.extensions.Subscription;

@Ignore
public class WebhooksTests {

    @Test
    public void testCreateSubscription() {
        TestBase testBase = new TestBase();
        Subscription sub = new Subscription();
        sub.changeType = "created,updated";
        sub.notificationUrl = "https://webhook-sub-test.azurewebsites.net/api/WebhookTrigger";
        sub.resource = "/me/mailfolders('inbox')/messages";
        OffsetDateTime cal = OffsetDateTime.now().plusHours(1);
        sub.expirationDateTime = cal;
        Subscription subscription = testBase.graphClient.subscriptions().buildRequest().post(sub);
        assertNotNull(subscription);
        assertEquals(sub.resource, subscription.resource);
    }
}
