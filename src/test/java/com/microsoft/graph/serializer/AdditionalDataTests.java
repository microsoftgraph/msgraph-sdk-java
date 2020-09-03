package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.PlannerAssignment;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.User;

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
		
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = parser.parse(serialized).getAsJsonObject();
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
}
