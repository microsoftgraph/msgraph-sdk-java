package com.microsoft.graph.models;

import com.microsoft.graph.models.callrecords.CallRecord;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudCommunications implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The callRecords property */
    private java.util.List<CallRecord> callRecords;
    /** The calls property */
    private java.util.List<Call> calls;
    /** The OdataType property */
    private String odataType;
    /** The onlineMeetings property */
    private java.util.List<OnlineMeeting> onlineMeetings;
    /** The presences property */
    private java.util.List<Presence> presences;
    /**
     * Instantiates a new CloudCommunications and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudCommunications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudCommunications
     */
    @javax.annotation.Nonnull
    public static CloudCommunications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudCommunications();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the callRecords property value. The callRecords property
     * @return a callRecord
     */
    @javax.annotation.Nullable
    public java.util.List<CallRecord> getCallRecords() {
        return this.callRecords;
    }
    /**
     * Gets the calls property value. The calls property
     * @return a call
     */
    @javax.annotation.Nullable
    public java.util.List<Call> getCalls() {
        return this.calls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("callRecords", (n) -> { this.setCallRecords(n.getCollectionOfObjectValues(CallRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("calls", (n) -> { this.setCalls(n.getCollectionOfObjectValues(Call::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onlineMeetings", (n) -> { this.setOnlineMeetings(n.getCollectionOfObjectValues(OnlineMeeting::createFromDiscriminatorValue)); });
        deserializerMap.put("presences", (n) -> { this.setPresences(n.getCollectionOfObjectValues(Presence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the onlineMeetings property value. The onlineMeetings property
     * @return a onlineMeeting
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeeting> getOnlineMeetings() {
        return this.onlineMeetings;
    }
    /**
     * Gets the presences property value. The presences property
     * @return a presence
     */
    @javax.annotation.Nullable
    public java.util.List<Presence> getPresences() {
        return this.presences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("callRecords", this.getCallRecords());
        writer.writeCollectionOfObjectValues("calls", this.getCalls());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("onlineMeetings", this.getOnlineMeetings());
        writer.writeCollectionOfObjectValues("presences", this.getPresences());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the callRecords property value. The callRecords property
     * @param value Value to set for the callRecords property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCallRecords(@javax.annotation.Nullable final java.util.List<CallRecord> value) {
        this.callRecords = value;
    }
    /**
     * Sets the calls property value. The calls property
     * @param value Value to set for the calls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalls(@javax.annotation.Nullable final java.util.List<Call> value) {
        this.calls = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the onlineMeetings property value. The onlineMeetings property
     * @param value Value to set for the onlineMeetings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnlineMeetings(@javax.annotation.Nullable final java.util.List<OnlineMeeting> value) {
        this.onlineMeetings = value;
    }
    /**
     * Sets the presences property value. The presences property
     * @param value Value to set for the presences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresences(@javax.annotation.Nullable final java.util.List<Presence> value) {
        this.presences = value;
    }
}
