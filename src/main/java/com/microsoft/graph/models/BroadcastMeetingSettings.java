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
public class BroadcastMeetingSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new BroadcastMeetingSettings and sets the default values.
     */
    public BroadcastMeetingSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BroadcastMeetingSettings
     */
    @jakarta.annotation.Nonnull
    public static BroadcastMeetingSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BroadcastMeetingSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowedAudience property value. Defines who can join the Teams live event. Possible values are listed in the following table.
     * @return a BroadcastMeetingAudience
     */
    @jakarta.annotation.Nullable
    public BroadcastMeetingAudience getAllowedAudience() {
        return this.backingStore.get("allowedAudience");
    }
    /**
     * Gets the captions property value. Caption settings of a Teams live event.
     * @return a BroadcastMeetingCaptionSettings
     */
    @jakarta.annotation.Nullable
    public BroadcastMeetingCaptionSettings getCaptions() {
        return this.backingStore.get("captions");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("allowedAudience", (n) -> { this.setAllowedAudience(n.getEnumValue(BroadcastMeetingAudience.class)); });
        deserializerMap.put("captions", (n) -> { this.setCaptions(n.getObjectValue(BroadcastMeetingCaptionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("isAttendeeReportEnabled", (n) -> { this.setIsAttendeeReportEnabled(n.getBooleanValue()); });
        deserializerMap.put("isQuestionAndAnswerEnabled", (n) -> { this.setIsQuestionAndAnswerEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRecordingEnabled", (n) -> { this.setIsRecordingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isVideoOnDemandEnabled", (n) -> { this.setIsVideoOnDemandEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAttendeeReportEnabled property value. Indicates whether attendee report is enabled for this Teams live event. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAttendeeReportEnabled() {
        return this.backingStore.get("isAttendeeReportEnabled");
    }
    /**
     * Gets the isQuestionAndAnswerEnabled property value. Indicates whether Q&A is enabled for this Teams live event. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsQuestionAndAnswerEnabled() {
        return this.backingStore.get("isQuestionAndAnswerEnabled");
    }
    /**
     * Gets the isRecordingEnabled property value. Indicates whether recording is enabled for this Teams live event. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecordingEnabled() {
        return this.backingStore.get("isRecordingEnabled");
    }
    /**
     * Gets the isVideoOnDemandEnabled property value. Indicates whether video on demand is enabled for this Teams live event. Default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVideoOnDemandEnabled() {
        return this.backingStore.get("isVideoOnDemandEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("allowedAudience", this.getAllowedAudience());
        writer.writeObjectValue("captions", this.getCaptions());
        writer.writeBooleanValue("isAttendeeReportEnabled", this.getIsAttendeeReportEnabled());
        writer.writeBooleanValue("isQuestionAndAnswerEnabled", this.getIsQuestionAndAnswerEnabled());
        writer.writeBooleanValue("isRecordingEnabled", this.getIsRecordingEnabled());
        writer.writeBooleanValue("isVideoOnDemandEnabled", this.getIsVideoOnDemandEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the allowedAudience property value. Defines who can join the Teams live event. Possible values are listed in the following table.
     * @param value Value to set for the allowedAudience property.
     */
    public void setAllowedAudience(@jakarta.annotation.Nullable final BroadcastMeetingAudience value) {
        this.backingStore.set("allowedAudience", value);
    }
    /**
     * Sets the captions property value. Caption settings of a Teams live event.
     * @param value Value to set for the captions property.
     */
    public void setCaptions(@jakarta.annotation.Nullable final BroadcastMeetingCaptionSettings value) {
        this.backingStore.set("captions", value);
    }
    /**
     * Sets the isAttendeeReportEnabled property value. Indicates whether attendee report is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isAttendeeReportEnabled property.
     */
    public void setIsAttendeeReportEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAttendeeReportEnabled", value);
    }
    /**
     * Sets the isQuestionAndAnswerEnabled property value. Indicates whether Q&A is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isQuestionAndAnswerEnabled property.
     */
    public void setIsQuestionAndAnswerEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isQuestionAndAnswerEnabled", value);
    }
    /**
     * Sets the isRecordingEnabled property value. Indicates whether recording is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isRecordingEnabled property.
     */
    public void setIsRecordingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRecordingEnabled", value);
    }
    /**
     * Sets the isVideoOnDemandEnabled property value. Indicates whether video on demand is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isVideoOnDemandEnabled property.
     */
    public void setIsVideoOnDemandEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVideoOnDemandEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
