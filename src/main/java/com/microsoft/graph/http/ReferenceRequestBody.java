package com.microsoft.graph.http;


import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.serializer.AdditionalDataManager;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

public class ReferenceRequestBody implements IJsonBackedObject {

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @SerializedName("@odata.id")
    @Expose
    public String odataId;

    /**
     * The raw representation of this class
     */
    private transient JsonObject rawObject;

    /**
     * The serializer
     */
    private transient ISerializer serializer;

    public ReferenceRequestBody(final String payload) {
        odataId = payload;
    }

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json       The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        this.rawObject = json;
    }

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }
}
