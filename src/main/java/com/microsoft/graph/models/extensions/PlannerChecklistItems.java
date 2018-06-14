// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import java.util.UUID;

import com.google.gson.JsonPrimitive;
import com.microsoft.graph.models.generated.BasePlannerChecklistItems;
import com.microsoft.graph.serializer.ISerializer;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Checklist Items.
 */
public class PlannerChecklistItems extends BasePlannerChecklistItems {
	/**
	 * Create a new checklist item with the given title
	 * @param title Title of the checklist item
	 * @return The ID of the checklist item
	 */
	public String addChecklistItem(String title) {
		PlannerChecklistItem plannerChecklistItem = new PlannerChecklistItem();
		plannerChecklistItem.title = title;
		String newChecklistItemId = UUID.randomUUID().toString();
		
		ISerializer serializer = this.getSerializer();
		String serializedItem = serializer.serializeObject(plannerChecklistItem);

		this.additionalDataManager().put(newChecklistItemId, new JsonPrimitive(serializedItem));
		
		return newChecklistItemId;
	}
}
