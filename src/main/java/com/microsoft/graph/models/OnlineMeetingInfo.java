package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeetingInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new OnlineMeetingInfo and sets the default values.
     */
    public OnlineMeetingInfo() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnlineMeetingInfo
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeetingInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeetingInfo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the conferenceId property value. The ID of the conference.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConferenceId() {
        return this.getBackingStore().get("conferenceId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the joinUrl property value. The external link that launches the online meeting. This is a URL that clients launch into a browser and will redirect the user to join the meeting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinUrl() {
        return this.getBackingStore().get("joinUrl");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the phones property value. All of the phone numbers associated with this conference.
     * @return a java.util.List<Phone>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.getBackingStore().get("phones");
    }
    /**
     * Gets the quickDial property value. The preformatted quick dial for this call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuickDial() {
        return this.getBackingStore().get("quickDial");
    }
    /**
     * Gets the tollFreeNumbers property value. The toll free numbers that can be used to join the conference.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTollFreeNumbers() {
        return this.getBackingStore().get("tollFreeNumbers");
    }
    /**
     * Gets the tollNumber property value. The toll number that can be used to join the conference.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTollNumber() {
        return this.getBackingStore().get("tollNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the conferenceId property value. The ID of the conference.
     * @param value Value to set for the conferenceId property.
     */
    public void setConferenceId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("conferenceId", value);
    }
    /**
     * Sets the joinUrl property value. The external link that launches the online meeting. This is a URL that clients launch into a browser and will redirect the user to join the meeting.
     * @param value Value to set for the joinUrl property.
     */
    public void setJoinUrl(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("joinUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the phones property value. All of the phone numbers associated with this conference.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.getBackingStore().set("phones", value);
    }
    /**
     * Sets the quickDial property value. The preformatted quick dial for this call.
     * @param value Value to set for the quickDial property.
     */
    public void setQuickDial(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("quickDial", value);
    }
    /**
     * Sets the tollFreeNumbers property value. The toll free numbers that can be used to join the conference.
     * @param value Value to set for the tollFreeNumbers property.
     */
    public void setTollFreeNumbers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("tollFreeNumbers", value);
    }
    /**
     * Sets the tollNumber property value. The toll number that can be used to join the conference.
     * @param value Value to set for the tollNumber property.
     */
    public void setTollNumber(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("tollNumber", value);
    }
}
