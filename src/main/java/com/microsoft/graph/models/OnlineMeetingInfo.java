package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnlineMeetingInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the conference.
     */
    private String conferenceId;
    /**
     * The external link that launches the online meeting. This is a URL that clients will launch into a browser and will redirect the user to join the meeting.
     */
    private String joinUrl;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * All of the phone numbers associated with this conference.
     */
    private java.util.List<Phone> phones;
    /**
     * The pre-formatted quickdial for this call.
     */
    private String quickDial;
    /**
     * The toll free numbers that can be used to join the conference.
     */
    private java.util.List<String> tollFreeNumbers;
    /**
     * The toll number that can be used to join the conference.
     */
    private String tollNumber;
    /**
     * Instantiates a new onlineMeetingInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnlineMeetingInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onlineMeetingInfo
     */
    @javax.annotation.Nonnull
    public static OnlineMeetingInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeetingInfo();
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
     * Gets the conferenceId property value. The ID of the conference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConferenceId() {
        return this.conferenceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("conferenceId", (n) -> { this.setConferenceId(n.getStringValue()); });
        deserializerMap.put("joinUrl", (n) -> { this.setJoinUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("quickDial", (n) -> { this.setQuickDial(n.getStringValue()); });
        deserializerMap.put("tollFreeNumbers", (n) -> { this.setTollFreeNumbers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tollNumber", (n) -> { this.setTollNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinUrl property value. The external link that launches the online meeting. This is a URL that clients will launch into a browser and will redirect the user to join the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinUrl() {
        return this.joinUrl;
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
     * Gets the phones property value. All of the phone numbers associated with this conference.
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.phones;
    }
    /**
     * Gets the quickDial property value. The pre-formatted quickdial for this call.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuickDial() {
        return this.quickDial;
    }
    /**
     * Gets the tollFreeNumbers property value. The toll free numbers that can be used to join the conference.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTollFreeNumbers() {
        return this.tollFreeNumbers;
    }
    /**
     * Gets the tollNumber property value. The toll number that can be used to join the conference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTollNumber() {
        return this.tollNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conferenceId", this.getConferenceId());
        writer.writeStringValue("joinUrl", this.getJoinUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeStringValue("quickDial", this.getQuickDial());
        writer.writeCollectionOfPrimitiveValues("tollFreeNumbers", this.getTollFreeNumbers());
        writer.writeStringValue("tollNumber", this.getTollNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the conferenceId property value. The ID of the conference.
     * @param value Value to set for the conferenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConferenceId(@javax.annotation.Nullable final String value) {
        this.conferenceId = value;
    }
    /**
     * Sets the joinUrl property value. The external link that launches the online meeting. This is a URL that clients will launch into a browser and will redirect the user to join the meeting.
     * @param value Value to set for the joinUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinUrl(@javax.annotation.Nullable final String value) {
        this.joinUrl = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the phones property value. All of the phone numbers associated with this conference.
     * @param value Value to set for the phones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this.phones = value;
    }
    /**
     * Sets the quickDial property value. The pre-formatted quickdial for this call.
     * @param value Value to set for the quickDial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuickDial(@javax.annotation.Nullable final String value) {
        this.quickDial = value;
    }
    /**
     * Sets the tollFreeNumbers property value. The toll free numbers that can be used to join the conference.
     * @param value Value to set for the tollFreeNumbers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollFreeNumbers(@javax.annotation.Nullable final java.util.List<String> value) {
        this.tollFreeNumbers = value;
    }
    /**
     * Sets the tollNumber property value. The toll number that can be used to join the conference.
     * @param value Value to set for the tollNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTollNumber(@javax.annotation.Nullable final String value) {
        this.tollNumber = value;
    }
}
