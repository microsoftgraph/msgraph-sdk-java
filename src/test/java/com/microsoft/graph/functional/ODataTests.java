package com.microsoft.graph.functional;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.ExtensionSchemaProperty;
import com.microsoft.graph.models.extensions.SchemaExtension;

@Ignore
public class ODataTests {

    private TestBase testBase;

    @Before
    public void setUp() {
       testBase = new TestBase();

        // There's a current limitation of two extensions per user. If there's two extensions in the collection,
        // delete the latest one
        List<Extension> extensions = testBase.graphClient.me().extensions().buildRequest().get().getCurrentPage();
        if (extensions.size() >= 2) {
            testBase.graphClient.me().extensions(extensions.get(1).id).buildRequest().delete();
        }
    }

    @Test
    public void testOpenExtensions() {
        Extension extension = new Extension();

        extension.additionalDataManager().put("theme", new JsonPrimitive("dark"));
        extension.additionalDataManager().put("extensionName", new JsonPrimitive("Extension1"));
        Extension newExtension = testBase.graphClient.me().extensions().buildRequest().post(extension);
        assertEquals(extension.additionalDataManager().get("theme"), newExtension.additionalDataManager().get("theme"));

        testBase.graphClient.me().extensions(newExtension.id).buildRequest().delete();
    }

    @Test
    public void testSchemaExtensions() {
        SchemaExtension extension = new SchemaExtension();
        extension.id = "schematest";
        extension.description = "Android Graph SDK test";
        List<String> targets = new ArrayList<>();
        targets.add("Group");
        extension.targetTypes = targets;

        ExtensionSchemaProperty prop = new ExtensionSchemaProperty();
        prop.name = "courseId";
        prop.type = "Integer";

        ExtensionSchemaProperty prop2 = new ExtensionSchemaProperty();
        prop2.name = "courseName";
        prop2.type = "String";

        List<ExtensionSchemaProperty> properties = new ArrayList<>();
        properties.add(prop);
        properties.add(prop2);
        extension.properties = properties;

        SchemaExtension newExtension = testBase.graphClient.schemaExtensions().buildRequest().post(extension);
        assertEquals(extension.description, newExtension.description);

        try {
            SchemaExtension patchExtension = new SchemaExtension();
            List<ExtensionSchemaProperty> patchProperties = new ArrayList<>();
            ExtensionSchemaProperty patchProperty = new ExtensionSchemaProperty();
            patchProperty.name = "newItem";
            patchProperty.type = "String";
            patchProperties.add(prop);
            patchProperties.add(prop2);
            patchProperties.add(patchProperty);

            patchExtension.properties = patchProperties;

            testBase.graphClient.schemaExtensions(newExtension.id).buildRequest().patch(patchExtension);
            SchemaExtension updatedExtension = testBase.graphClient.schemaExtensions(newExtension.id).buildRequest().get();

            boolean foundUpdatedProperty = false;
            for (ExtensionSchemaProperty updatedProperty : updatedExtension.properties) {
                if (updatedProperty.name.equals(patchProperty.name)) {
                    assertEquals(patchProperty.type, updatedProperty.type);
                    foundUpdatedProperty = true;
                    break;
                }
            }
            if (!foundUpdatedProperty) {
                Assert.fail("Patch failed on Schema Extension");
            }
        } catch (Exception e) {
            Assert.fail("Patch failed on Schema Extension");
        } finally {
            testBase.graphClient.schemaExtensions(newExtension.id).buildRequest().delete();
        }
    }

    @Test
    public void testEnumFlags() {
//        EnumSet<MailTipsType> mailTips = EnumSet.noneOf(MailTipsType.class);
//        mailTips.add(MailTipsType.automaticReplies);
//        mailTips.add(MailTipsType.customMailTip);
//        mailTips.add(MailTipsType.recipientScope);
//        List<String> emailAddresses = new ArrayList<String>();
//        emailAddresses.add("katiej@mod810997.onmicrosoft.com");
//        emailAddresses.add("garthf@mod810997.onmicrosoft.com");
//        emailAddresses.add("admin@mod810997.onmicrosoft.com");
//
//        IUserGetMailTipsCollectionPage mailTipsCollection = testBase.graphClient.getMe().getGetMailTips(emailAddresses, mailTips).buildRequest().post();
//
//        assertNotNull(mailTipsCollection);
//
//        List<MailTips> mailTipsPage = mailTipsCollection.getCurrentPage();
//        EnumSet<RecipientScopeType> recipientScopeTypes = EnumSet.allOf(RecipientScopeType.class);
//        for (int i = 0; i< mailTipsPage.size(); i++) {
//            if (mailTipsPage.get(i).recipientScope != null) {
//                assertTrue(mailTipsPage.get(i).recipientScope.getClass().isInstance(mailTips));
//            }
//        }
    }

    @Test
    public void testDeltaQuery() {
//        testBase.graphClient.setServiceRoot("https://graph.microsoft.com/beta");
//        IGroupDeltaCollectionPage deltas = testBase.graphClient.getGroups().getDelta().buildRequest().get();
//
//        assertNotNull(deltas.getCurrentPage());
//        for (int i = 0; i < deltas.getCurrentPage().size(); i++) {
//            Group group = deltas.getCurrentPage().get(i);
//            String s = group.description;
//        }
//
//        while(deltas.getNextPage() != null) {
//            deltas = deltas.getNextPage().buildRequest().get();
//            assertNotNull(deltas.getCurrentPage());
//        }
//
//        IGroupDeltaCollectionPage deltas2 = testBase.graphClient.getGroups().getDelta(deltas.getDeltaLink()).buildRequest().get();
//        assertNotNull(deltas2);
    }

    @Test
    public void testDeletedItem() {
    }
}
