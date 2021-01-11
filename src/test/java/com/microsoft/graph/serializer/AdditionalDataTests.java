package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import okhttp3.Request;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.functional.TestBase;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.ChatMessageMention;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.DriveItemCreateUploadSessionParameterSet;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.PlannerAssignment;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.User;

import java.util.Collections;

public class AdditionalDataTests {
	public DefaultSerializer serializer;

	@Before
	public void setUp() {
		serializer = new DefaultSerializer(new DefaultLogger());
	}

	@Test
	public void testAddAdditionalData() {
		Entity entity = new Entity();
		entity.id = "1";

		entity.additionalDataManager().put("additionalData", new JsonPrimitive("additionalValue"));

		String serializedObject = serializer.serializeObject(entity);

		assertEquals("{\"id\":\"1\",\"additionalData\":\"additionalValue\"}", serializedObject);
	}

	@Test
	public void testChildAdditionalData() {
		User manager = new User();
		manager.id = "1";
		manager.additionalDataManager().put("additionalData", new JsonPrimitive("additionalValue"));

		User user = new User();
		user.id = "2";

		user.manager = manager;

		String serializedObject = serializer.serializeObject(user);

		assertEquals("{\"manager\":{\"id\":\"1\",\"additionalData\":\"additionalValue\"},\"id\":\"2\"}", serializedObject);
	}

	@Test
	public void testSkipTransientData() {
		Entity entity = new Entity();
		entity.id = "1";

		entity.additionalDataManager().put("@odata.type", new JsonPrimitive("entity"));
		entity.additionalDataManager().put("@odata.nextLink", new JsonPrimitive("1"));

		String serializedObject = serializer.serializeObject(entity);

		assertEquals("{\"id\":\"1\",\"@odata.nextLink\":\"1\",\"@odata.type\":\"entity\"}", serializedObject);
  }

  @Test
	public void testPropsAdditionalDataOnNonIJSONObjects() {
		final DriveItemUploadableProperties upProps = new DriveItemUploadableProperties();
        upProps.name = "vacation.gif";
		upProps.additionalDataManager().put("@microsoft.graph.conflictBehavior", new JsonPrimitive("rename"));
		final DriveItemCreateUploadSessionParameterSet body = DriveItemCreateUploadSessionParameterSet.newBuilder().withItem(upProps).build();
		String serializedObject = serializer.serializeObject(body);
		assertEquals("{\"item\":{\"name\":\"vacation.gif\",\"@microsoft.graph.conflictBehavior\":\"rename\"}}", serializedObject);
	}

	@Test
	public void testHashMapChildAnnotationData() {
		PlannerTask task = new PlannerTask();
		task.assignments = new PlannerAssignments();
		PlannerAssignment assignment = new PlannerAssignment();
		assignment.orderHint = "!";
		assignment.additionalDataManager().put("additionalData", new JsonPrimitive("additionalValue"));
		task.assignments.put("id", assignment);

		String serializedObject = serializer.serializeObject(task);

		assertEquals("{\"assignments\":{\"id\":{\"orderHint\":\"!\",\"additionalData\":\"additionalValue\"}}}", serializedObject);
	}

	@Test
	public void testHashMapChildAdditionalData() {
		String input = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#planner/tasks('8kUva3lOqkKZ-4_u5tkIC8kAFv2c')/details/$entity\",\"@odata.etag\":\"W/\\\"JzEtVGFza0RldGFpbHMgQEBAQEBAQEBAQEBAQEBAYCc=\\\"\",\"description\":null,"
				+ "\"previewType\":\"automatic\",\"id\":\"8kUva3lOqkKZ-4_u5tkIC8kAFv2c\","
				+ "\"references\":{\"https%3A//testurl/\":{\"@odata.type\":\"#microsoft.graph.plannerExternalReference\",\"alias\":\"test_alias\",\"type\":null,\"previewPriority\":\"8586538193086391421\",\"lastModifiedDateTime\":"
				+ "\"2019-01-18T04:59:36.8384386Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}}},\"checklist\":{\"1234\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\","
				+ "\"isChecked\":false,\"title\":\"Test title\",\"orderHint\":\"8586538194441079237\",\"lastModifiedDateTime\":\"2019-01-18T04:57:21.369657Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}},"
				+ "\"66442\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\",\"isChecked\":false,\"title\":\"checklist item 3\",\"orderHint\":\"8586539618F3\",\"lastModifiedDateTime\":\"2019-01-16T13:24:11.4732273Z\",\"lastModifiedBy\":"
				+ "{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}},\"83642\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\",\"isChecked\":false,\"title\":\"checklist item 1\",\"orderHint\":\"8586539619030374725P_\","
				+ "\"lastModifiedDateTime\":\"2019-01-16T13:24:02.4557738Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}},\"84724\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\","
				+ "\"isChecked\":false,\"title\":\"checklist item 2\",\"orderHint\":\"8586539618YD\",\"lastModifiedDateTime\":\"2019-01-16T13:24:07.113845Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":"
				+ "\"ec786dee-da15-4896-8e73-57141477bae7\"}}}}}" ;

		PlannerTaskDetails deserializedObject = serializer.deserializeObject(input, PlannerTaskDetails.class);

		assertNull(deserializedObject.additionalDataManager().get("1234"));
		assertNull(deserializedObject.additionalDataManager().get("66442"));
		assertNull(deserializedObject.additionalDataManager().get("83642"));
		assertNull(deserializedObject.additionalDataManager().get("84724"));
		assertNull(deserializedObject.additionalDataManager().get("https%3A//testurl/"));

		String serialized = serializer.serializeObject(deserializedObject);

		JsonObject jsonObject = JsonParser.parseString(serialized).getAsJsonObject();
		assertNotNull(jsonObject.get("checklist").getAsJsonObject().get("1234"));
		assertNull(jsonObject.get("checklist").getAsJsonObject().get("1234").getAsJsonObject().get("1234"));
		assertNull(jsonObject.get("checklist").getAsJsonObject().get("1234").getAsJsonObject().get("66442"));
	}

	@Test
	public void testChildAdditionalDataDeserialization() {
		String source = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#drives/$entity\",\"id\":\"8bf6ae90006c4a4c\",\"driveType\":\"personal\",\"owner\":{\"user\":{\"displayName\":\"Peter\",\"id\":\"8bf6ae90006c4a4c\",\"email\":\"petertest@onmicrosoft.com\"}},\"quota\":{\"deleted\":1485718314,\"remaining\":983887466461,\"state\":\"normal\",\"total\":1142461300736,\"used\":158573834275}}";
		Drive result = serializer.deserializeObject(source, Drive.class);
		JsonElement email = result.owner.user.additionalDataManager().get("email");

		assertEquals("\"petertest@onmicrosoft.com\"",email.toString());
	}

	@Test
	public void testHashMapProperties() {
		final String source = "{\"description\": \"Task details properties:\nchecklist:Sub items\nreferences:Related links\",\"previewType\": \"automatic\",\"references\": {\"https%3A//developer%2Emicrosoft%2Ecom/en-us/graph/graph-explorer\": {\"@odata.type\": \"#microsoft.graph.plannerExternalReference\",\"alias\": \"Graph Explorer\",\"type\": \"Other\",\"previewPriority\": \"0009005706180391122\",\"lastModifiedBy\": {\"user\": {\"id\": \"fbab97d0-4932-4511-b675-204639209557\"}},\"lastModifiedDateTime\": \"2017-04-24T22:52:29.814Z\"}},\"checklist\": {\"d280ed1a-9f6b-4f9c-a962-fb4d00dc50ff\": {\"@odata.type\": \"#microsoft.graph.plannerChecklistItem\",\"isChecked\": false,\"title\": \"Try reading task details\",\"orderHint\": \"8587094707721254251P]\",\"lastModifiedBy\": {\"user\": {\"id\": \"e396de0e-4812-4fcb-9f9e-0358744df343\", \"customProp\": \"somestring\"}},\"lastModifiedDateTime\": \"2017-04-14T02:16:14.866Z\"}},\"id\": \"gcrYAaAkgU2EQUvpkNNXLGQAGTtu\"}";
		final PlannerTaskDetails taskDetails = serializer.deserializeObject(source, PlannerTaskDetails.class);
		assertNotNull(taskDetails);
		assertNotNull(taskDetails.checklist);
		assertFalse(taskDetails.checklist.isEmpty());
		assertTrue(taskDetails.checklist.get("d280ed1a-9f6b-4f9c-a962-fb4d00dc50ff").title.equals("Try reading task details"));
		assertTrue(taskDetails.checklist.get("d280ed1a-9f6b-4f9c-a962-fb4d00dc50ff").lastModifiedBy.user.additionalDataManager().get("customProp").getAsString().equals("somestring"));
	}

	@Test
	public void testSerializeAdditionalDataOnCollections() {
		final ChatMessage chatMessage = new ChatMessage();
		final ChatMessageMention chatMessageMention = new ChatMessageMention();
		chatMessageMention.additionalDataManager().put("helloWorld", new JsonPrimitive("3.141516"));
		final IdentitySet identitySet = new IdentitySet();
		identitySet.additionalDataManager().put("identitySetKey", new JsonPrimitive("identitySetValue"));
		chatMessageMention.mentioned = identitySet;
		chatMessage.mentions = Collections.singletonList(chatMessageMention);
		final String output = serializer.serializeObject(chatMessage);
		final JsonObject parsed = JsonParser.parseString(output).getAsJsonObject();
		final JsonObject mentionJsonObject = parsed.get("mentions").getAsJsonArray().get(0).getAsJsonObject();
		assertEquals("3.141516", mentionJsonObject.get("helloWorld").getAsString());
		assertEquals("identitySetValue", mentionJsonObject.get("mentioned").getAsJsonObject().get("identitySetKey").getAsString());
	}
}
