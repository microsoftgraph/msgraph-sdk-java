// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.generated.BasePlannerAppliedCategories;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner Applied Categories.
 */
public class PlannerAppliedCategories extends BasePlannerAppliedCategories {
	/**
	 * The Category1
	 */
	@SerializedName("category1")
	@Expose
	public boolean category1;
	
	/**
	 * The Category1
	 */
	@SerializedName("category2")
	@Expose
	public boolean category2;
	
	/**
	 * The Category1
	 */
	@SerializedName("category3")
	@Expose
	public boolean category3;
	
	/**
	 * The Category1
	 */
	@SerializedName("category4")
	@Expose
	public boolean category4;
	
	/**
	 * The Category1
	 */
	@SerializedName("category5")
	@Expose
	public boolean category5;
	
	/**
	 * The Category1
	 */
	@SerializedName("category6")
	@Expose
	public boolean category6;
}
