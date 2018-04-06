package com.microsoft.graph.serializer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.models.extensions.PlannerAssignment;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerTask;
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
	public void testSkipTransientData() {
		Entity entity = new Entity();
		entity.id = "1";
		
		entity.additionalDataManager().put("@odata.type", new JsonPrimitive("entity"));
		entity.additionalDataManager().put("@odata.nextLink", new JsonPrimitive("1"));
		
		String serializedObject = serializer.serializeObject(entity);
		
		assertEquals("{\"id\":\"1\",\"@odata.type\":\"entity\"}", serializedObject);
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
		
		assertEquals("{\"assignments\":{\"id\":{\"@odata.type\":\"#microsoft.graph.plannerAssignment\",\"orderHint\":\"!\",\"additionalData\":\"additionalValue\"}},\"@odata.type\":\"#microsoft.graph.plannerTask\"}", serializedObject);
	}
}
