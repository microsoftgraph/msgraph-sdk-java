package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BroadcastMeetingSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Defines who can join the Teams live event. Possible values are listed in the following table. */
    private BroadcastMeetingAudience _allowedAudience;
    /** Caption settings of a Teams live event. */
    private BroadcastMeetingCaptionSettings _captions;
    /** Indicates whether attendee report is enabled for this Teams live event. Default value is false. */
    private Boolean _isAttendeeReportEnabled;
    /** Indicates whether Q&A is enabled for this Teams live event. Default value is false. */
    private Boolean _isQuestionAndAnswerEnabled;
    /** Indicates whether recording is enabled for this Teams live event. Default value is false. */
    private Boolean _isRecordingEnabled;
    /** Indicates whether video on demand is enabled for this Teams live event. Default value is false. */
    private Boolean _isVideoOnDemandEnabled;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new broadcastMeetingSettings and sets the default values.
     * @return a void
     */
    public BroadcastMeetingSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.broadcastMeetingSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a broadcastMeetingSettings
     */
    @javax.annotation.Nonnull
    public static BroadcastMeetingSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BroadcastMeetingSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowedAudience property value. Defines who can join the Teams live event. Possible values are listed in the following table.
     * @return a broadcastMeetingAudience
     */
    @javax.annotation.Nullable
    public BroadcastMeetingAudience getAllowedAudience() {
        return this._allowedAudience;
    }
    /**
     * Gets the captions property value. Caption settings of a Teams live event.
     * @return a broadcastMeetingCaptionSettings
     */
    @javax.annotation.Nullable
    public BroadcastMeetingCaptionSettings getCaptions() {
        return this._captions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BroadcastMeetingSettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(7) {{
            this.put("allowedAudience", (n) -> { currentObject.setAllowedAudience(n.getEnumValue(BroadcastMeetingAudience.class)); });
            this.put("captions", (n) -> { currentObject.setCaptions(n.getObjectValue(BroadcastMeetingCaptionSettings::createFromDiscriminatorValue)); });
            this.put("isAttendeeReportEnabled", (n) -> { currentObject.setIsAttendeeReportEnabled(n.getBooleanValue()); });
            this.put("isQuestionAndAnswerEnabled", (n) -> { currentObject.setIsQuestionAndAnswerEnabled(n.getBooleanValue()); });
            this.put("isRecordingEnabled", (n) -> { currentObject.setIsRecordingEnabled(n.getBooleanValue()); });
            this.put("isVideoOnDemandEnabled", (n) -> { currentObject.setIsVideoOnDemandEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isAttendeeReportEnabled property value. Indicates whether attendee report is enabled for this Teams live event. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAttendeeReportEnabled() {
        return this._isAttendeeReportEnabled;
    }
    /**
     * Gets the isQuestionAndAnswerEnabled property value. Indicates whether Q&A is enabled for this Teams live event. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsQuestionAndAnswerEnabled() {
        return this._isQuestionAndAnswerEnabled;
    }
    /**
     * Gets the isRecordingEnabled property value. Indicates whether recording is enabled for this Teams live event. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRecordingEnabled() {
        return this._isRecordingEnabled;
    }
    /**
     * Gets the isVideoOnDemandEnabled property value. Indicates whether video on demand is enabled for this Teams live event. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsVideoOnDemandEnabled() {
        return this._isVideoOnDemandEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowedAudience property value. Defines who can join the Teams live event. Possible values are listed in the following table.
     * @param value Value to set for the allowedAudience property.
     * @return a void
     */
    public void setAllowedAudience(@javax.annotation.Nullable final BroadcastMeetingAudience value) {
        this._allowedAudience = value;
    }
    /**
     * Sets the captions property value. Caption settings of a Teams live event.
     * @param value Value to set for the captions property.
     * @return a void
     */
    public void setCaptions(@javax.annotation.Nullable final BroadcastMeetingCaptionSettings value) {
        this._captions = value;
    }
    /**
     * Sets the isAttendeeReportEnabled property value. Indicates whether attendee report is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isAttendeeReportEnabled property.
     * @return a void
     */
    public void setIsAttendeeReportEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isAttendeeReportEnabled = value;
    }
    /**
     * Sets the isQuestionAndAnswerEnabled property value. Indicates whether Q&A is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isQuestionAndAnswerEnabled property.
     * @return a void
     */
    public void setIsQuestionAndAnswerEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isQuestionAndAnswerEnabled = value;
    }
    /**
     * Sets the isRecordingEnabled property value. Indicates whether recording is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isRecordingEnabled property.
     * @return a void
     */
    public void setIsRecordingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isRecordingEnabled = value;
    }
    /**
     * Sets the isVideoOnDemandEnabled property value. Indicates whether video on demand is enabled for this Teams live event. Default value is false.
     * @param value Value to set for the isVideoOnDemandEnabled property.
     * @return a void
     */
    public void setIsVideoOnDemandEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isVideoOnDemandEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
