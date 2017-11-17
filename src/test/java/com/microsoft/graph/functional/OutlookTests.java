package com.microsoft.graph.functional;

import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.User;

import org.junit.Test;

//import com.microsoft.graph.extensions.IDirectoryDeletedItemsCollectionPage;
import com.microsoft.graph.models.extensions.*;

import org.junit.Assert;
import org.junit.Ignore;

import static org.junit.Assert.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import java.lang.reflect.Array;

import java.util.ArrayList;

@Ignore
public class OutlookTests {

    @Test
    public void testSendMail() {
        TestBase testBase = new TestBase();
        User me = testBase.graphClient.me().buildRequest().get();
        Recipient r = new Recipient();
        EmailAddress address = new EmailAddress();
        address.address = me.mail;
        r.emailAddress = address;
        Message message = new Message();
        message.subject = "Test E-Mail";
        message.from = r;
        ArrayList<Recipient> recipients = new ArrayList<Recipient>();
        recipients.add(r);
        message.toRecipients = recipients;
        testBase.graphClient.me().sendMail(message, true).buildRequest().post();
    }

    @Test
    public void testGetFindMeetingTimes() {
        TestBase testBase = new TestBase();

        // Get the first user in the tenant
        User me = testBase.graphClient.me().buildRequest().get();
        IUserCollectionPage users = testBase.graphClient.users().buildRequest().get();
        User tenantUser = users.getCurrentPage().get(0);

        //Ensure that the user grabbed is not the logged-in user
        if (tenantUser.mail.equals(me.mail)) {
            tenantUser = users.getCurrentPage().get(1);
        }

        ArrayList<AttendeeBase> attendees = new ArrayList<AttendeeBase>();
        AttendeeBase attendeeBase = new AttendeeBase();
        EmailAddress email = new EmailAddress();
        email.address = tenantUser.mail;
        attendeeBase.emailAddress = email;
        attendees.add(attendeeBase);
        try {
        	DatatypeFactory.newInstance().newDuration("PT30M");
            Duration duration = DatatypeFactory.newInstance().newDuration("PT30M");
            MeetingTimeSuggestionsResult result = testBase.graphClient.me().findMeetingTimes(attendees, null, null, duration, 10, true, false, 10.0).buildRequest().post();
            assertNotNull(result);
        } catch (Exception e) {
            Assert.fail("Duration could not be created from String");
        }

    }
}