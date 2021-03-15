package com.microsoft.graph.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.models.PlannerAssignment;
import com.microsoft.graph.models.PlannerAssignments;
import com.microsoft.graph.models.PlannerBucket;
import com.microsoft.graph.models.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.models.PlannerCategoryDescriptions;
import com.microsoft.graph.models.PlannerChecklistItem;
import com.microsoft.graph.models.PlannerExternalReference;
import com.microsoft.graph.models.PlannerPlanDetails;
import com.microsoft.graph.models.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.models.PlannerTask;
import com.microsoft.graph.models.PlannerTaskDetails;
import com.microsoft.graph.models.User;
import com.microsoft.graph.requests.PlannerBucketRequest;
import com.microsoft.graph.requests.PlannerPlanDetailsRequest;
import com.microsoft.graph.requests.PlannerRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskDetailsRequest;
import com.microsoft.graph.requests.PlannerTaskRequest;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.DefaultSerializer;

@Disabled
public class PlannerTests {
    private TestBase testBase;
    // For now, you must specify a specific plan ID since the test cannot
    // clean up after itself
    private String planId = "f1WS2LJ4_k2G-KXzHwH-lGUABSKq";
    private PlannerBucket planBucket;
    private PlannerTask planTask;
    private PlannerRequestBuilder prb;

    @BeforeEach
    public void setUp() {
        testBase = new TestBase();
        prb = testBase.graphClient.planner();

        PlannerBucket newBucket = new PlannerBucket();
        newBucket.name = "Test Bucket";
        newBucket.planId = planId;

        planBucket = prb.buckets().buildRequest().post(newBucket);

        PlannerTask newTask = new PlannerTask();
        newTask.title = "Test Task";
        newTask.planId = planId;
        newTask.bucketId = planBucket.id;

        planTask = prb.tasks().buildRequest().post(newTask);
    }

    //@Test
    public void testPostTask() {
        PlannerTask newTask = new PlannerTask();
        newTask.title = "Test1";
        newTask.planId = planId;
        newTask.bucketId = planBucket.id;

        PlannerTask task = prb.tasks().buildRequest().post(newTask);
        assertNotNull(task);
    }

    @Test
    public void testBucketTaskBoardFormat() {
        PlannerBucketTaskBoardTaskFormat format = prb
        		.tasks(planTask.id)
        		.bucketTaskBoardFormat()
        		.buildRequest()
        		.get();
        assertNotNull(format);
    }

    @Test
    public void testAssignedToTaskBoardFormat() {
        PlannerAssignedToTaskBoardTaskFormat format = prb
        		.tasks(planTask.id)
        		.assignedToTaskBoardFormat()
        		.buildRequest()
        		.get();
        assertNotNull(format);
    }

    @Test
    public void testProgressTaskBoardFormat() {
        PlannerProgressTaskBoardTaskFormat format = prb
        		.tasks(planTask.id)
        		.progressTaskBoardFormat()
        		.buildRequest()
        		.get();
        assertNotNull(format);
    }

    @Test
    public void testGetTaskDetails() {
        PlannerTaskDetails details = prb
        		.tasks(planTask.id)
        		.details()
        		.buildRequest()
        		.get();
        assertNotNull(details);
    }

    // https://developer.microsoft.com/en-us/graph/docs/api-reference/beta/resources/plannerAssignments
    @Test
    public void testUpdateTask() throws InterruptedException {
        PlannerTask task = new PlannerTask();

        User me = testBase.graphClient.me().buildRequest().get();

        PlannerAssignment assignment = new PlannerAssignment();
        assignment.orderHint = " !";
        PlannerAssignments a2 = new PlannerAssignments();
        a2.put(me.id, assignment);
        task.assignments = a2;

        PlannerTaskRequest req = prb
        		.tasks(planTask.id)
        		.buildRequest();
        req.addHeader("If-Match", planTask.additionalDataManager().get("@odata.etag").getAsString());
        req.patch(task);

        Thread.sleep(4000);

        PlannerTask updatedTask = prb
        		.tasks(planTask.id)
        		.buildRequest()
        		.get();
        JsonElement createdAssignment = updatedTask.additionalDataManager().get("assignments").getAsJsonObject().get(me.id);

        assertNotNull(createdAssignment);
    }

    @Test
    public void testUpdateTaskDetailsChecklist() throws InterruptedException {
        PlannerTaskDetails details = new PlannerTaskDetails();
        String uuid = UUID.randomUUID().toString();
        JsonObject data = new JsonObject();
        Gson gson = new Gson();

        Thread.sleep(2000);

        PlannerChecklistItem checklistItem1 = new PlannerChecklistItem();
        checklistItem1.orderHint = "  !!";
        checklistItem1.isChecked = true;
        checklistItem1.title = "C1";
        JsonElement checklist1Json = gson.toJsonTree(checklistItem1);
        data.add(uuid, checklist1Json);

        PlannerChecklistItem checklistItem2 = new PlannerChecklistItem();
        checklistItem2.orderHint = " !";
        checklistItem2.isChecked = false;
        checklistItem2.title = "C2";
        JsonElement checklist2Json = gson.toJsonTree(checklistItem2);
        data.add(UUID.randomUUID().toString(), checklist2Json);

        PlannerChecklistItem checklistItem3 = new PlannerChecklistItem();
        checklistItem3.orderHint = "   !!!";
        checklistItem3.isChecked = false;
        checklistItem3.title = "C3";
        JsonElement checklist3Json = gson.toJsonTree(checklistItem3);
        data.add(UUID.randomUUID().toString(), checklist3Json);

        AdditionalDataManager dataManager = details.additionalDataManager();
        dataManager.put("checklist", data);

        PlannerTaskDetails d = prb
        		.tasks(planTask.id)
        		.details()
        		.buildRequest()
        		.get();
        PlannerTaskDetailsRequest req = prb
        		.tasks(planTask.id)
        		.details()
        		.buildRequest();
        req.addHeader("If-Match", d.additionalDataManager().get("@odata.etag").getAsString());
        req.addHeader("If-None-Match", d.additionalDataManager().get("@odata.etag").getAsString());
        req.patch(details);

        Thread.sleep(2000);

        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();
        int checklistItemCount = updatedTask.additionalDataManager().get("checklistItemCount").getAsInt();

        assertEquals(3, checklistItemCount);
    }

    // Fails due to delay from service
     @Test
     public void testUpdateTaskDetailsReferences() {
        try {
            PlannerTaskDetails details = new PlannerTaskDetails();
            Gson gson = new Gson();
            JsonObject data = new JsonObject();
            PlannerExternalReference reference = new PlannerExternalReference();

            reference.alias = "Msn";
            reference.previewPriority = " !";
            reference.type = "Other";
            JsonElement referenceJson = gson.toJsonTree(reference);

            data.add("http%3A//www%2Emsn%2Ecom", referenceJson);

            AdditionalDataManager dataManager = details.additionalDataManager();
            dataManager.put("references", data);

            PlannerTaskDetails d = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest()
            		.get();
            PlannerTaskDetailsRequest req = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest();
            req.addHeader("If-Match", d.additionalDataManager().get("@odata.etag").getAsString());
            req.addHeader("If-None-Match", d.additionalDataManager().get("@odata.etag").getAsString());
            req.addHeader("Prefer", "return=representation");
            PlannerTaskDetails updatedTaskDetails = req.patch(details);

            Thread.sleep(4000);

            updatedTaskDetails = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest()
            		.get();
            JsonElement obj = updatedTaskDetails.additionalDataManager().get("references");
            JsonArray array = new JsonArray();
            array.add(obj);
            int referencesCount = array.size();
            assertEquals(1, referencesCount);
        }
        catch (InterruptedException e) {

        }
    }

    @Test
    public void testUpdateTaskCompletion() throws InterruptedException {
        PlannerTask task = new PlannerTask();
        task.percentComplete = 50;

        PlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", planTask.additionalDataManager().get("@odata.etag").getAsString());
        req.patch(task);

        Thread.sleep(4000);

        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();

        assertEquals(task.percentComplete, updatedTask.percentComplete);
    }

    @Test
    public void testUpdateTaskStartDate() throws InterruptedException {
        PlannerTask task = new PlannerTask();
        task.startDateTime = OffsetDateTime.now();

        PlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", planTask.additionalDataManager().get("@odata.etag").getAsString());
        req.patch(task);

        Thread.sleep(2000);

        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();
        updatedTask = prb.tasks(planTask.id).buildRequest().get();
        assertEquals(task.startDateTime, updatedTask.startDateTime);
    }

    //Failing due to millisecond precision off by 1
    @Test
    public void testUpdateTaskDueDate() throws InterruptedException {
        PlannerTask task = new PlannerTask();
        task.dueDateTime = OffsetDateTime.now();

        PlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        planTask = prb.tasks(planTask.id).buildRequest().get();

        req.addHeader("If-Match", planTask.additionalDataManager().get("@odata.etag").getAsString());
        req.patch(task);

        Thread.sleep(6000);

        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();
        updatedTask = prb.tasks(planTask.id).buildRequest().get();
        assertEquals(task.dueDateTime, updatedTask.dueDateTime);
    }

    @Test
    public void testUpdateTaskCategories() {
        PlannerTask task = new PlannerTask();

        JsonObject data = new JsonObject();

        data.add("category1", new JsonPrimitive(false));
        data.add("category2", new JsonPrimitive(true));
        data.add("category3", new JsonPrimitive(false));
        data.add("category4", new JsonPrimitive(false));
        data.add("category5", new JsonPrimitive(false));
        data.add("category6", new JsonPrimitive(false));

        AdditionalDataManager dataManager = task.additionalDataManager();
        dataManager.put("appliedCategories", data);

        PlannerTask newTask = prb.tasks(planTask.id).buildRequest().get();
        PlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", newTask.additionalDataManager().get("@odata.etag").getAsString());
        req.addHeader("If-None-Match", newTask.additionalDataManager().get("@odata.etag").getAsString());
        req.addHeader("Prefer", "return=representation");
        PlannerTask updatedTask = req.patch(task);

        JsonElement appliedCategories = updatedTask.additionalDataManager().get("appliedCategories");

        assertNotNull(appliedCategories);
    }

    @Test
    public void testUpdatePlanDetails() {
        PlannerPlanDetails planDetails = new PlannerPlanDetails();
        PlannerCategoryDescriptions descriptions = new PlannerCategoryDescriptions();
        descriptions.category2 = "Red";
        planDetails.categoryDescriptions = descriptions;

        PlannerPlanDetails newDetails = prb.plans(planId).details().buildRequest().get();
        PlannerPlanDetailsRequest req = prb.plans(planId).details().buildRequest();
        req.addHeader("If-Match", newDetails.additionalDataManager().get("@odata.etag").getAsString());
        req.addHeader("If-None-Match", newDetails.additionalDataManager().get("@odata.etag").getAsString());
        req.addHeader("Prefer", "return=representation");
        PlannerPlanDetails updatedPlanDetails = req.patch(planDetails);

        assertEquals(planDetails.categoryDescriptions.category2, updatedPlanDetails.categoryDescriptions.category2);
    }

    @Test
    public void testDeleteTask() {
        PlannerTask newTask = new PlannerTask();
        newTask.title = "Delete Me";
        newTask.planId = planId;
        newTask.bucketId = planBucket.id;

        PlannerTask task = prb.tasks().buildRequest().post(newTask);

        PlannerTaskRequest req = testBase.graphClient.planner().tasks(task.id).buildRequest();
        req.addHeader("If-Match", task.additionalDataManager().get("@odata.etag").getAsString());
        req.delete();
    }

    @Test
    public void testCreateBucket() {
        PlannerBucket newBucket = new PlannerBucket();
        newBucket.name = "Create Bucket Test";
        newBucket.planId = planId;

        PlannerBucket createdBucket = prb.buckets().buildRequest().post(newBucket);
        assertEquals(newBucket.name, createdBucket.name);
    }

    @Test
    public void testUpdateBucket() {
        PlannerBucket patchBucket = new PlannerBucket();
        patchBucket.name = "RenamedBucket";

        PlannerBucketRequest req = prb.buckets(planBucket.id).buildRequest();
        req.addHeader("If-Match", planBucket.additionalDataManager().get("@odata.etag").getAsString());

        req.patch(patchBucket);
        PlannerBucket updatedBucket = prb.buckets(planBucket.id).buildRequest().get();

        assertEquals(patchBucket.name, updatedBucket.name);

        patchBucket.name = "Test Bucket";
        PlannerBucketRequest req2 = testBase.graphClient.planner().buckets(planBucket.id).buildRequest();
        req2.addHeader("If-Match", updatedBucket.additionalDataManager().get("@odata.etag").getAsString());
        req2.patch(patchBucket);
    }

    @Test
    public void testDeleteBucket() {
        PlannerBucket newBucket = new PlannerBucket();
        newBucket.name = "Delete Me";
        newBucket.planId = planId;

        PlannerBucket createdBucket = testBase.graphClient.planner().buckets().buildRequest().post(newBucket);

        PlannerBucketRequest req = testBase.graphClient.planner().buckets(createdBucket.id).buildRequest();
        req.addHeader("If-Match", createdBucket.additionalDataManager().get("@odata.etag").getAsString());
        req.delete();
    }

    @Test
    public void testPlannerChecklistItemDeserialization() throws Exception{
    	String input = "{\"@odata.context\":\"https://graph.microsoft.com/v1.0/$metadata#planner/tasks('433tZlfn_USJwWRL9khDx8kALTM7')/details/$entity\",\"@odata.etag\":\"W/\\\"JzEtVGFza0RldGFpbHMgQEBAQEBAQEBAQEBAQEBAcCc=\\\"\",\"description\":\"This is a test description of test event two.\",\"previewType\":\"automatic\",\"id\":\"433tZlfn_USJwWRL9khDx8kALTM7\",\"references\":{},\"checklist\":{\"55554\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\",\"isChecked\":false,\"title\":\"Test Item 2\",\"orderHint\":\"8586580527[2\",\"lastModifiedDateTime\":\"2018-11-30T05:01:53.0387892Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}},\"91100\":{\"@odata.type\":\"#microsoft.graph.plannerChecklistItem\",\"isChecked\":true,\"title\":\"Test Item 1 \",\"orderHint\":\"8586580528393292964Pc\",\"lastModifiedDateTime\":\"2018-11-30T05:01:47.4138223Z\",\"lastModifiedBy\":{\"user\":{\"displayName\":null,\"id\":\"ec786dee-da15-4896-8e73-57141477bae7\"}}}}}";
    	final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
    	PlannerTaskDetails ptd = serializer.deserializeObject(input, PlannerTaskDetails.class);
    	assertNotNull(ptd);
    	PlannerChecklistItem item1 = ptd.checklist.get("91100");
    	assertEquals(item1.title,"Test Item 1 ");
    	PlannerChecklistItem item2 = ptd.checklist.get("55554");
    	assertEquals(item2.title,"Test Item 2");
    }

    @Test
    public void testPlannerTaskDetailsDeserialization() {
    	String input = "{\r\n" +
    			"	\"references\": {},\r\n" +
    			"	\"@odata.etag\": \"W/\\\"JzEtVGFza0RldGFpbHMgQEBAQEBAQEBAQEBAQEBAUCc=\\\"\",\r\n" +
    			"	\"description\": null,\r\n" +
    			"	\"checklist\": {\r\n" +
    			"		\"42660\": {\r\n" +
    			"			\"lastModifiedDateTime\": \"2018-10-28T14:29:37.7423391Z\",\r\n" +
    			"			\"@odata.type\": \"#microsoft.graph.plannerChecklistItem\",\r\n" +
    			"			\"orderHint\": \"8586608699726429822PK\",\r\n" +
    			"			\"lastModifiedBy\": {\r\n" +
    			"				\"user\": {\r\n" +
    			"					\"displayName\": null,\r\n" +
    			"					\"id\": \"f3a1dfe8-f2ef-4870-9642-413d468c571c\"\r\n" +
    			"				}\r\n" +
    			"			},\r\n" +
    			"			\"title\": \"Ein Checklisteneintrag\",\r\n" +
    			"			\"isChecked\": false\r\n" +
    			"		}\r\n" +
    			"	},\r\n" +
    			"	\"@odata.context\": \"https://graph.microsoft.com/v1.0/$metadata#planner/tasks('C6iIn6oJcEGcLX5XAiKeCZcAOv30')/details/$entity\",\r\n" +
    			"	\"previewType\": \"automatic\",\r\n" +
    			"	\"id\": \"C6iIn6oJcEGcLX5XAiKeCZcAOv30\"\r\n" +
    			"}";
    	final DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
    	PlannerTaskDetails ptd = serializer.deserializeObject(input, PlannerTaskDetails.class);
    	assertNotNull(ptd);
    	PlannerChecklistItem item = ptd.checklist.get("42660");
    	assertEquals(item.title, "Ein Checklisteneintrag");
    	assertEquals(item.isChecked, false);
    }

    @AfterEach
    public void tearDown() throws InterruptedException {

    	Thread.sleep(4000);

        //This may have updated since we last saw it
        PlannerTask task = testBase.graphClient.planner().tasks(planTask.id).buildRequest().get();
        PlannerTaskRequest taskReq = testBase.graphClient.planner().tasks(planTask.id).buildRequest();
        taskReq.addHeader("If-Match", task.additionalDataManager().get("@odata.etag").getAsString());
        taskReq.delete();

        PlannerBucket bucket = testBase.graphClient.planner().buckets(planBucket.id).buildRequest().get();
        PlannerBucketRequest bucketReq = testBase.graphClient.planner().buckets(planBucket.id).buildRequest();
        bucketReq.addHeader("If-Match", bucket.additionalDataManager().get("@odata.etag").getAsString());
        bucketReq.delete();

        //Fails with 403 Forbidden
        // PlannerPlan plan = testBase.graphClient.getPlanner().getPlans(planId).buildRequest().get();
        // IPlannerPlanRequest planReq = testBase.graphClient.getPlanner().getPlans(planId).buildRequest();
        // planReq.addHeader("If-Match", getEtag(plan.getRawObject()));
        // planReq.delete();
    }
}
