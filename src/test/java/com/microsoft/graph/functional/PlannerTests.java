//package com.microsoft.graph.functional;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonPrimitive;
//import com.microsoft.graph.extensions.IPlannerAssignedToTaskBoardTaskFormatRequest;
//import com.microsoft.graph.extensions.IPlannerBucketRequest;
//import com.microsoft.graph.extensions.IPlannerPlanDetailsRequest;
//import com.microsoft.graph.extensions.IPlannerTaskDetailsRequest;
//import com.microsoft.graph.extensions.IPlannerTaskRequest;
//import com.microsoft.graph.extensions.PlannerAssignedToTaskBoardTaskFormat;
//import com.microsoft.graph.extensions.PlannerAssignment;
//import com.microsoft.graph.extensions.PlannerBucket;
//import com.microsoft.graph.extensions.PlannerBucketTaskBoardTaskFormat;
//import com.microsoft.graph.extensions.PlannerCategoryDescriptions;
//import com.microsoft.graph.extensions.PlannerChecklistItem;
//import com.microsoft.graph.extensions.PlannerExternalReference;
//import com.microsoft.graph.extensions.PlannerPlanDetails;
//import com.microsoft.graph.extensions.PlannerProgressTaskBoardTaskFormat;
//import com.microsoft.graph.extensions.PlannerTask;
//import com.microsoft.graph.extensions.PlannerTaskDetails;
//import com.microsoft.graph.extensions.User;
//import com.microsoft.graph.serializer.AdditionalDataManager;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.Calendar;
//import java.util.UUID;
//
//public class PlannerTests {
//    private TestBase testBase;
//    // For now, you must specify a specific plan ID since the test cannot
//    // clean up after itself
//    private String planId = "ebJ1qqxlQUCwR4Osxm6TzWUAGpq6";
//    private PlannerBucket planBucket;
//    private PlannerTask planTask;
//
//    @Before
//    public void setUp() {
//        testBase = new TestBase();
//
//        PlannerBucket newBucket = new PlannerBucket();
//        newBucket.name = "Test Bucket";
//        newBucket.planId = planId;
//
//        planBucket = testBase.graphClient.getPlanner().getBuckets().buildRequest().post(newBucket);
//
//        PlannerTask newTask = new PlannerTask();
//        newTask.title = "Test Task";
//        newTask.planId = planId;
//        newTask.bucketId = planBucket.id;
//
//        planTask = testBase.graphClient.getPlanner().getTasks().buildRequest().post(newTask);
//    }
//
//    @Test
//    public void testPostTask() {
//        PlannerTask newTask = new PlannerTask();
//        newTask.title = "Test1";
//        newTask.planId = planId;
//        newTask.bucketId = planBucket.id;
//
//        PlannerTask task = testBase.graphClient.getPlanner().getTasks().buildRequest().post(newTask);
//        assertNotNull(task);
//    }
//
//    @Test
//    public void testBucketTaskBoardFormat() {
//        PlannerBucketTaskBoardTaskFormat format = testBase.graphClient.getPlanner().getTasks(planTask.id).getBucketTaskBoardFormat().buildRequest().get();
//        assertNotNull(format);
//    }
//
//    @Test
//    public void testAssignedToTaskBoardFormat() {
//        PlannerAssignedToTaskBoardTaskFormat format = testBase.graphClient.getPlanner().getTasks(planTask.id).getAssignedToTaskBoardFormat().buildRequest().get();
//        assertNotNull(format);
//    }
//
//    @Test
//    public void testProgressTaskBoardFormat() {
//        PlannerProgressTaskBoardTaskFormat format = testBase.graphClient.getPlanner().getTasks(planTask.id).getProgressTaskBoardFormat().buildRequest().get();
//        assertNotNull(format);
//    }
//
//    @Test
//    public void testGetTaskDetails() {
//        PlannerTaskDetails details = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest().get();
//        assertNotNull(details);
//    }
//
//    // https://developer.microsoft.com/en-us/graph/docs/api-reference/beta/resources/plannerAssignments
//    @Test
//    public void testUpdateTask() throws InterruptedException {
//        PlannerTask task = new PlannerTask();
//
//        User me = testBase.graphClient.getMe().buildRequest().get();
//
//        PlannerAssignment assignment = new PlannerAssignment();
//        assignment.orderHint = " !";
//        assignment.oDataType = "#microsoft.graph.plannerAssignment";
//        assignment.getAdditionalDataManager().put("@odata.type", new JsonPrimitive("#microsoft.graph.plannerAssignment"));
//
//        AdditionalDataManager dataManager = task.getAdditionalDataManager();
//        task.oDataType = "#microsoft.graph.plannerTask";
//
//        JsonObject assignments = new JsonObject();
//        Gson gson = new Gson();
//        JsonElement assignmentJson = gson.toJsonTree(assignment);
//        assignments.add(me.id, assignmentJson);
//        dataManager.put("assignments", assignments);
//
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
//        req.patch(task);
//        
//        Thread.sleep(4000);
//
//        PlannerTask updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        JsonElement createdAssignment = updatedTask.getRawObject().get("assignments").getAsJsonObject().get(me.id);
//
//        assertNotNull(createdAssignment);
//    }
//
//    @Test
//    public void testUpdateTaskDetailsChecklist() throws InterruptedException {
//        PlannerTaskDetails details = new PlannerTaskDetails();
//        String uuid = UUID.randomUUID().toString();
//        JsonObject data = new JsonObject();
//        Gson gson = new Gson();
//
//        PlannerChecklistItem checklistItem1 = new PlannerChecklistItem();
//        checklistItem1.orderHint = "  !!";
//        checklistItem1.isChecked = true;
//        checklistItem1.title = "C1";
//        checklistItem1.getAdditionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
//        JsonElement checklist1Json = gson.toJsonTree(checklistItem1);
//        data.add(uuid, checklist1Json);
//
//        PlannerChecklistItem checklistItem2 = new PlannerChecklistItem();
//        checklistItem2.orderHint = " !";
//        checklistItem2.isChecked = false;
//        checklistItem2.title = "C2";
//        checklistItem2.getAdditionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
//        JsonElement checklist2Json = gson.toJsonTree(checklistItem2);
//        data.add(UUID.randomUUID().toString(), checklist2Json);
//
//        PlannerChecklistItem checklistItem3 = new PlannerChecklistItem();
//        checklistItem3.orderHint = "   !!!";
//        checklistItem3.isChecked = false;
//        checklistItem3.title = "C3";
//        checklistItem3.getAdditionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
//        JsonElement checklist3Json = gson.toJsonTree(checklistItem3);
//        data.add(UUID.randomUUID().toString(), checklist3Json);
//
//        AdditionalDataManager dataManager = details.getAdditionalDataManager();
//        details.oDataType = "#microsoft.graph.plannerTaskDetails";
//        dataManager.put("checklist", data);
//
//        PlannerTaskDetails d = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest().get();
//        IPlannerTaskDetailsRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest();
//        req.addHeader("If-Match", getEtag(d.getRawObject()));
//        req.addHeader("If-None-Match", getEtag(d.getRawObject()));
//        req.patch(details);
//
//        Thread.sleep(4000);
//        
//        PlannerTask updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        int checklistItemCount = updatedTask.getRawObject().get("checklistItemCount").getAsInt();
//
//        assertEquals(3, checklistItemCount);
//    }
//
//    // Fails due to delay from service
//    @Test
//     public void testUpdateTaskDetailsReferences() {
//        try {
//            PlannerTaskDetails details = new PlannerTaskDetails();
//            Gson gson = new Gson();
//            JsonObject data = new JsonObject();
//            PlannerExternalReference reference = new PlannerExternalReference();
//
//            reference.getAdditionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerExternalReference"));
//            reference.alias = "Msn";
//            reference.previewPriority = " !";
//            reference.type = "Other";
//            JsonElement referenceJson = gson.toJsonTree(reference);
//
//            data.add("http%3A//www%2Emsn%2Ecom", referenceJson);
//
//            AdditionalDataManager dataManager = details.getAdditionalDataManager();
//            details.oDataType = "#microsoft.graph.plannerTaskDetails";
//            dataManager.put("references", data);
//
//            PlannerTaskDetails d = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest().get();
//            IPlannerTaskDetailsRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest();
//            req.addHeader("If-Match", getEtag(d.getRawObject()));
//            req.addHeader("If-None-Match", getEtag(d.getRawObject()));
//            req.addHeader("Prefer", "return=representation");
//            PlannerTaskDetails updatedTaskDetails = req.patch(details);
//            
//            Thread.sleep(4000);
//            
//            updatedTaskDetails = testBase.graphClient.getPlanner().getTasks(planTask.id).getDetails().buildRequest().get();
//            JsonElement obj = updatedTaskDetails.getRawObject().get("references");
//            JsonArray array = new JsonArray();
//            array.add(obj);
//            int referencesCount = array.size();
//            assertEquals(1, referencesCount);
//        }
//        catch (InterruptedException e) {
//
//        }
//    }
//
//    @Test
//    public void testUpdateTaskCompletion() throws InterruptedException {
//        PlannerTask task = new PlannerTask();
//        task.percentComplete = 50;
//
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
//        req.patch(task);
//        
//        Thread.sleep(4000);
//
//        PlannerTask updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//
//        assertEquals(task.percentComplete, updatedTask.percentComplete);
//    }
//
//    @Test
//    public void testUpdateTaskStartDate() throws InterruptedException {
//        PlannerTask task = new PlannerTask();
//        task.startDateTime = Calendar.getInstance();
//
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
//        req.patch(task);
//
//        Thread.sleep(2000);
//        
//        PlannerTask updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        assertEquals(task.startDateTime, updatedTask.startDateTime);
//    }
//
//    @Test
//    public void testUpdateTaskDueDate() throws InterruptedException {
//        PlannerTask task = new PlannerTask();
//        task.dueDateTime = Calendar.getInstance();
//
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
//        req.patch(task);
//        
//        Thread.sleep(6000);
//
//        PlannerTask updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        updatedTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        assertEquals(task.dueDateTime, updatedTask.dueDateTime);
//    }
//
//    @Test
//    public void testUpdateTaskCategories() {
//        PlannerTask task = new PlannerTask();
//
//        JsonObject data = new JsonObject();
//
//        data.add("category1", new JsonPrimitive(false));
//        data.add("category2", new JsonPrimitive(true));
//        data.add("category3", new JsonPrimitive(false));
//        data.add("category4", new JsonPrimitive(false));
//        data.add("category5", new JsonPrimitive(false));
//        data.add("category6", new JsonPrimitive(false));
//
//        AdditionalDataManager dataManager = task.getAdditionalDataManager();
//        task.oDataType = "#microsoft.graph.plannerTask";
//        dataManager.put("appliedCategories", data);
//
//        PlannerTask newTask = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        req.addHeader("If-Match", getEtag(newTask.getRawObject()));
//        req.addHeader("If-None-Match", getEtag(newTask.getRawObject()));
//        req.addHeader("Prefer", "return=representation");
//        PlannerTask updatedTask = req.patch(task);
//
//        JsonElement appliedCategories = updatedTask.getRawObject().get("appliedCategories");
//
//        assertNotNull(appliedCategories);
//    }
//
//    @Test
//    public void testUpdatePlanDetails() {
//        PlannerPlanDetails planDetails = new PlannerPlanDetails();
//        PlannerCategoryDescriptions descriptions = new PlannerCategoryDescriptions();
//        descriptions.category2 = "Red";
//        planDetails.categoryDescriptions = descriptions;
//
//        PlannerPlanDetails newDetails = testBase.graphClient.getPlanner().getPlans(planId).getDetails().buildRequest().get();
//        IPlannerPlanDetailsRequest req = testBase.graphClient.getPlanner().getPlans(planId).getDetails().buildRequest();
//        req.addHeader("If-Match", getEtag(newDetails.getRawObject()));
//        req.addHeader("If-None-Match", getEtag(newDetails.getRawObject()));
//        req.addHeader("Prefer", "return=representation");
//        PlannerPlanDetails updatedPlanDetails = req.patch(planDetails);
//
//        assertEquals(planDetails.categoryDescriptions.category2, updatedPlanDetails.categoryDescriptions.category2);
//    }
//
//    @Test
//    public void testDeleteTask() {
//        PlannerTask newTask = new PlannerTask();
//        newTask.title = "Delete Me";
//        newTask.planId = planId;
//        newTask.bucketId = planBucket.id;
//
//        PlannerTask task = testBase.graphClient.getPlanner().getTasks().buildRequest().post(newTask);
//
//        IPlannerTaskRequest req = testBase.graphClient.getPlanner().getTasks(task.id).buildRequest();
//        req.addHeader("If-Match", getEtag(task.getRawObject()));
//        req.delete();
//    }
//
//    @Test
//    public void testCreateBucket() {
//        PlannerBucket newBucket = new PlannerBucket();
//        newBucket.name = "Create Bucket Test";
//        newBucket.planId = planId;
//
//        PlannerBucket createdBucket = testBase.graphClient.getPlanner().getBuckets().buildRequest().post(newBucket);
//        assertEquals(newBucket.name, createdBucket.name);
//    }
//
//    @Test
//    public void testUpdateBucket() {
//        PlannerBucket patchBucket = new PlannerBucket();
//        patchBucket.name = "RenamedBucket";
//        patchBucket.oDataType = "#microsoft.graph.plannerBucket";
//
//        IPlannerBucketRequest req = testBase.graphClient.getPlanner().getBuckets(planBucket.id).buildRequest();
//        req.addHeader("If-Match", getEtag(planBucket.getRawObject()));
//
//        req.patch(patchBucket);
//        PlannerBucket updatedBucket = testBase.graphClient.getPlanner().getBuckets(planBucket.id).buildRequest().get();
//
//        assertEquals(patchBucket.name, updatedBucket.name);
//
//        patchBucket.name = "Test Bucket";
//        IPlannerBucketRequest req2 = testBase.graphClient.getPlanner().getBuckets(planBucket.id).buildRequest();
//        req2.addHeader("If-Match", getEtag(updatedBucket.getRawObject()));
//        req2.patch(patchBucket);
//    }
//
//    @Test
//    public void testDeleteBucket() {
//        PlannerBucket newBucket = new PlannerBucket();
//        newBucket.name = "Delete Me";
//        newBucket.planId = planId;
//
//        PlannerBucket createdBucket = testBase.graphClient.getPlanner().getBuckets().buildRequest().post(newBucket);
//
//        IPlannerBucketRequest req = testBase.graphClient.getPlanner().getBuckets(createdBucket.id).buildRequest();
//        req.addHeader("If-Match", getEtag(createdBucket.getRawObject()));
//        req.delete();
//    }
//
//    @After
//    public void tearDown() throws InterruptedException {
//    	
//    	Thread.sleep(4000);
//    	
//        //This may have updated since we last saw it
//        PlannerTask task = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest().get();
//        IPlannerTaskRequest taskReq = testBase.graphClient.getPlanner().getTasks(planTask.id).buildRequest();
//        taskReq.addHeader("If-Match", getEtag(task.getRawObject()));
//        taskReq.delete();
//
//        PlannerBucket bucket = testBase.graphClient.getPlanner().getBuckets(planBucket.id).buildRequest().get();
//        IPlannerBucketRequest bucketReq = testBase.graphClient.getPlanner().getBuckets(planBucket.id).buildRequest();
//        bucketReq.addHeader("If-Match", getEtag(bucket.getRawObject()));
//        bucketReq.delete();
//
//        //Fails with 403 Forbidden
//        // PlannerPlan plan = testBase.graphClient.getPlanner().getPlans(planId).buildRequest().get();
//        // IPlannerPlanRequest planReq = testBase.graphClient.getPlanner().getPlans(planId).buildRequest();
//        // planReq.addHeader("If-Match", getEtag(plan.getRawObject()));
//        // planReq.delete();
//    }
//
//    public String getEtag(JsonObject obj) {
//        String etag = obj.get("@odata.etag").toString();
//        etag = etag.substring(1, etag.length()-1);
//        etag = etag.replace("\\", "");;
//        return etag;
//    }
//}