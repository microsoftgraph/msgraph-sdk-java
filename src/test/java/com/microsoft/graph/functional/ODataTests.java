package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.ExtensionSchemaProperty;
import com.microsoft.graph.models.SchemaExtension;
import com.microsoft.graph.requests.GroupDeltaCollectionPage;
import com.microsoft.graph.models.GroupDeltaParameterSet;

@Disabled
public class ODataTests {

    private TestBase testBase;

    @BeforeEach
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
                fail("Patch failed on Schema Extension");
            }
        } catch (Exception e) {
            fail("Patch failed on Schema Extension");
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
       GroupDeltaCollectionPage deltas = testBase.graphClient.groups().delta().buildRequest().get();

       assertNotNull(deltas.getCurrentPage());
       for (final Group group : deltas.getCurrentPage()) {
           final String s = group.description;
       }

       while(deltas.getNextPage() != null) {
           deltas = deltas.getNextPage().buildRequest().get();
           assertNotNull(deltas.getCurrentPage());
       }

       final GroupDeltaCollectionPage deltas2 = testBase.graphClient.groups().delta().buildRequest().deltaLink(deltas.deltaLink()).get();
       assertNotNull(deltas2);
    }
}
