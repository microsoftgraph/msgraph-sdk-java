package com.microsoft.graph.http;

import java.util.List;

import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

public class MockJsonObjectCollectionResponse implements ICollectionResponse<JsonObject>, IJsonBackedObject {

	@Override
	public void setRawObject(ISerializer serializer, JsonObject json) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdditionalDataManager additionalDataManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getRawObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISerializer getSerializer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JsonObject> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nextLink() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
