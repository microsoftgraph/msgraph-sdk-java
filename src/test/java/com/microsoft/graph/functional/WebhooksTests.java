package com.microsoft.graph.functional;

import com.microsoft.graph.models.extensions.Subscription;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;

@Ignore
public class WebhooksTests {

    @Test
    public void testCreateSubscription() {
        TestBase testBase = new TestBase();
        Subscription sub = new Subscription();
        sub.changeType = "created,updated";
        sub.notificationUrl = "https://webhook-sub-test.azurewebsites.net/api/WebhookTrigger";
        sub.resource = "/me/mailfolders('inbox')/messages";
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR, 1);
        sub.expirationDateTime = cal;
        Subscription subscription = testBase.graphClient.subscriptions().buildRequest().post(sub);
        assertNotNull(subscription);
        assertEquals(sub.resource, subscription.resource);
    }
}