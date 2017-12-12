// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.JsonElement;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.serializer.*;

import java.security.InvalidParameterException;
// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Planner External References.
 */
public class PlannerExternalReferences extends BasePlannerExternalReferences {
	/*
	 * Specifies the character - encoding pairs to apply on the external reference URLs
	 */
	private static String[][] conversions = { { "%", "%25" }, { "@", "%40" }, { ".", "%2E" }, { ":", "%3A" } };
	
	/**
	 * Gets external reference data for a given reference URL
	 * @param url The external reference URL
	 * @return The external reference
	 */
	public PlannerExternalReference reference(String url) {
		if (url == null || url.isEmpty()) {
			throw new InvalidParameterException("URL cannot be empty");
		}
		if (this.additionalDataManager().containsKey(encode(url))) {
			JsonElement refObject = this.additionalDataManager().get(encode(url));
			ISerializer serializer = this.getSerializer();
			return serializer.deserializeObject(
					refObject.getAsString(), 
					PlannerExternalReference.class
				);
		} else {
			return null;
		}
	}
	
	/**
	 * Adds a new external reference with the given URL and short name
	 * @param url URL of the external reference
	 * @param alias Short name for the external reference
	 * @return The created external reference
	 */
	public PlannerExternalReference addReference(String url, String alias) {
		if (url == null || url.isEmpty()) {
			throw new InvalidParameterException("URL cannot be empty");
		}
		if (alias == null || alias.isEmpty()) {
			throw new InvalidParameterException("Alias cannot be empty");
		}
		
		PlannerExternalReference plannerExternalReference = new PlannerExternalReference();
		plannerExternalReference.alias = alias;
		this.additionalDataManager().put(encode(url), plannerExternalReference.getRawObject());
		return plannerExternalReference;
	}
	
	/**
	 * Encodes the URL of an external reference to be compatible with OData property naming requirements
	 * @param externalReferenceUrl URL to encode
	 * @return Encoded URL
	 */
	private static String encode(String externalReferenceUrl) {
		if (externalReferenceUrl == null || externalReferenceUrl.isEmpty()) {
			throw new InvalidParameterException("URL cannot be empty");
		}
		
		for (int i = 0; i < conversions.length; i++)
		{
			externalReferenceUrl = externalReferenceUrl.replace(conversions[i][0], conversions[i][1]);
		}
		return externalReferenceUrl;
	}
	
	/**
	 * Decodes an encoded URL of an external reference
	 * @param externalReferenceUrl URL to encode
	 * @return Decoded URL
	 */
	private static String decode(String externalReferenceUrl) {
		if (externalReferenceUrl == null || externalReferenceUrl.isEmpty()) {
			throw new InvalidParameterException("URL cannot be empty");
		}
		
		for (int i = conversions.length - 1; i >= 0; i--) {
			externalReferenceUrl = externalReferenceUrl.replace(conversions[i][1], conversions[i][0]);
		}
		return externalReferenceUrl;
	}
}
