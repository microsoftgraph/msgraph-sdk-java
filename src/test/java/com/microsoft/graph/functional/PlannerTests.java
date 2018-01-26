package com.microsoft.graph.functional;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequest;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequest;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskDetailsRequest;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequest;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerAssignment;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerCategoryDescriptions;
import com.microsoft.graph.models.extensions.PlannerChecklistItem;
import com.microsoft.graph.models.extensions.PlannerExternalReference;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.serializer.AdditionalDataManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.UUID;

//@Ignore
public class PlannerTests {
    private static TestBase testBase;
    // For now, you must specify a specific plan ID since the test cannot
    // clean up after itself
    private static String planId = "f1WS2LJ4_k2G-KXzHwH-lGUABSKq";
    private static PlannerBucket planBucket;
    private static PlannerTask planTask;
    private static IPlannerRequestBuilder prb;

    @BeforeClass
    public static void setUp() {
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

    @Test
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
        AdditionalDataManager assignmentAdditionalData = assignment.additionalDataManager();
        assignmentAdditionalData.put("@odata.type", new JsonPrimitive("#microsoft.graph.plannerAssignment"));
        //assignment.oDataType = "#microsoft.graph.plannerAssignment";

        PlannerAssignments a2 = new PlannerAssignments();
        a2.put(me.id, assignment);
        task.assignments = a2;

        IPlannerTaskRequest req = prb
        		.tasks(planTask.id)
        		.buildRequest();
        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
        req.patch(task);
        
        Thread.sleep(4000);

        PlannerTask updatedTask = prb
        		.tasks(planTask.id)
        		.buildRequest()
        		.get();
        JsonElement createdAssignment = updatedTask.getRawObject().get("assignments").getAsJsonObject().get(me.id);

        assertNotNull(createdAssignment);
    }

    @Test
    public void testUpdateTaskDetailsChecklist() throws InterruptedException {
        PlannerTaskDetails details = new PlannerTaskDetails();
        String uuid = UUID.randomUUID().toString();
        JsonObject data = new JsonObject();
        Gson gson = new Gson();

        PlannerChecklistItem checklistItem1 = new PlannerChecklistItem();
        checklistItem1.orderHint = "  !!";
        checklistItem1.isChecked = true;
        checklistItem1.title = "C1";
        checklistItem1.additionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
        JsonElement checklist1Json = gson.toJsonTree(checklistItem1);
        data.add(uuid, checklist1Json);

        PlannerChecklistItem checklistItem2 = new PlannerChecklistItem();
        checklistItem2.orderHint = " !";
        checklistItem2.isChecked = false;
        checklistItem2.title = "C2";
        checklistItem2.additionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
        JsonElement checklist2Json = gson.toJsonTree(checklistItem2);
        data.add(UUID.randomUUID().toString(), checklist2Json);

        PlannerChecklistItem checklistItem3 = new PlannerChecklistItem();
        checklistItem3.orderHint = "   !!!";
        checklistItem3.isChecked = false;
        checklistItem3.title = "C3";
        checklistItem3.additionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerChecklistItem"));
        JsonElement checklist3Json = gson.toJsonTree(checklistItem3);
        data.add(UUID.randomUUID().toString(), checklist3Json);

        AdditionalDataManager dataManager = details.additionalDataManager();
        details.oDataType = "#microsoft.graph.plannerTaskDetails";
        dataManager.put("checklist", data);

        PlannerTaskDetails d = prb
        		.tasks(planTask.id)
        		.details()
        		.buildRequest()
        		.get();
        IPlannerTaskDetailsRequest req = prb
        		.tasks(planTask.id)
        		.details()
        		.buildRequest();
        req.addHeader("If-Match", getEtag(d.getRawObject()));
        req.addHeader("If-None-Match", getEtag(d.getRawObject()));
        req.patch(details);

        Thread.sleep(4000);
        
        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();
        int checklistItemCount = updatedTask.getRawObject().get("checklistItemCount").getAsInt();

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

            reference.additionalDataManager().put("@odata.type", new JsonPrimitive("microsoft.graph.plannerExternalReference"));
            reference.alias = "Msn";
            reference.previewPriority = " !";
            reference.type = "Other";
            JsonElement referenceJson = gson.toJsonTree(reference);

            data.add("http%3A//www%2Emsn%2Ecom", referenceJson);

            AdditionalDataManager dataManager = details.additionalDataManager();
            details.oDataType = "#microsoft.graph.plannerTaskDetails";
            dataManager.put("references", data);

            PlannerTaskDetails d = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest()
            		.get();
            IPlannerTaskDetailsRequest req = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest();
            req.addHeader("If-Match", getEtag(d.getRawObject()));
            req.addHeader("If-None-Match", getEtag(d.getRawObject()));
            req.addHeader("Prefer", "return=representation");
            PlannerTaskDetails updatedTaskDetails = req.patch(details);
            
            Thread.sleep(4000);
            
            updatedTaskDetails = prb
            		.tasks(planTask.id)
            		.details()
            		.buildRequest()
            		.get();
            JsonElement obj = updatedTaskDetails.getRawObject().get("references");
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

        IPlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
        req.patch(task);
        
        Thread.sleep(4000);

        PlannerTask updatedTask = prb.tasks(planTask.id).buildRequest().get();

        assertEquals(task.percentComplete, updatedTask.percentComplete);
    }

    @Test
    public void testUpdateTaskStartDate() throws InterruptedException {
        PlannerTask task = new PlannerTask();
        task.startDateTime = Calendar.getInstance();

        IPlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
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
        task.dueDateTime = Calendar.getInstance();

        IPlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        planTask = prb.tasks(planTask.id).buildRequest().get();
        
        req.addHeader("If-Match", getEtag(planTask.getRawObject()));
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
        task.oDataType = "#microsoft.graph.plannerTask";
        dataManager.put("appliedCategories", data);

        PlannerTask newTask = prb.tasks(planTask.id).buildRequest().get();
        IPlannerTaskRequest req = prb.tasks(planTask.id).buildRequest();
        req.addHeader("If-Match", getEtag(newTask.getRawObject()));
        req.addHeader("If-None-Match", getEtag(newTask.getRawObject()));
        req.addHeader("Prefer", "return=representation");
        PlannerTask updatedTask = req.patch(task);

        JsonElement appliedCategories = updatedTask.getRawObject().get("appliedCategories");

        assertNotNull(appliedCategories);
    }

    @Test
    public void testUpdatePlanDetails() {
        PlannerPlanDetails planDetails = new PlannerPlanDetails();
        PlannerCategoryDescriptions descriptions = new PlannerCategoryDescriptions();
        descriptions.category2 = "Red";
        planDetails.categoryDescriptions = descriptions;

        PlannerPlanDetails newDetails = prb.plans(planId).details().buildRequest().get();
        IPlannerPlanDetailsRequest req = prb.plans(planId).details().buildRequest();
        req.addHeader("If-Match", getEtag(newDetails.getRawObject()));
        req.addHeader("If-None-Match", getEtag(newDetails.getRawObject()));
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

        IPlannerTaskRequest req = testBase.graphClient.planner().tasks(task.id).buildRequest();
        req.addHeader("If-Match", getEtag(task.getRawObject()));
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
        patchBucket.oDataType = "#microsoft.graph.plannerBucket";

        IPlannerBucketRequest req = prb.buckets(planBucket.id).buildRequest();
        req.addHeader("If-Match", getEtag(planBucket.getRawObject()));

        req.patch(patchBucket);
        PlannerBucket updatedBucket = prb.buckets(planBucket.id).buildRequest().get();

        assertEquals(patchBucket.name, updatedBucket.name);

        patchBucket.name = "Test Bucket";
        IPlannerBucketRequest req2 = testBase.graphClient.planner().buckets(planBucket.id).buildRequest();
        req2.addHeader("If-Match", getEtag(updatedBucket.getRawObject()));
        req2.patch(patchBucket);
    }

    @Test
    public void testDeleteBucket() {
        PlannerBucket newBucket = new PlannerBucket();
        newBucket.name = "Delete Me";
        newBucket.planId = planId;

        PlannerBucket createdBucket = testBase.graphClient.planner().buckets().buildRequest().post(newBucket);

        IPlannerBucketRequest req = testBase.graphClient.planner().buckets(createdBucket.id).buildRequest();
        req.addHeader("If-Match", getEtag(createdBucket.getRawObject()));
        req.delete();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
    	
    	Thread.sleep(4000);
    	
        //This may have updated since we last saw it
        PlannerTask task = testBase.graphClient.planner().tasks(planTask.id).buildRequest().get();
        IPlannerTaskRequest taskReq = testBase.graphClient.planner().tasks(planTask.id).buildRequest();
        taskReq.addHeader("If-Match", getEtag(task.getRawObject()));
        taskReq.delete();

        PlannerBucket bucket = testBase.graphClient.planner().buckets(planBucket.id).buildRequest().get();
        IPlannerBucketRequest bucketReq = testBase.graphClient.planner().buckets(planBucket.id).buildRequest();
        bucketReq.addHeader("If-Match", getEtag(bucket.getRawObject()));
        bucketReq.delete();

        //Fails with 403 Forbidden
        // PlannerPlan plan = testBase.graphClient.getPlanner().getPlans(planId).buildRequest().get();
        // IPlannerPlanRequest planReq = testBase.graphClient.getPlanner().getPlans(planId).buildRequest();
        // planReq.addHeader("If-Match", getEtag(plan.getRawObject()));
        // planReq.delete();
    }

    public static String getEtag(JsonObject obj) {
        String etag = obj.get("@odata.etag").toString();
        etag = etag.substring(1, etag.length()-1);
        etag = etag.replace("\\", "");;
        return etag;
    }
}