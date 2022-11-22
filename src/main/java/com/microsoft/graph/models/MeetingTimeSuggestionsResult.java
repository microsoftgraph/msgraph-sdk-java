package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingTimeSuggestionsResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions. */
    private String _emptySuggestionsReason;
    /** An array of meeting suggestions. */
    private java.util.List<MeetingTimeSuggestion> _meetingTimeSuggestions;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new meetingTimeSuggestionsResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeetingTimeSuggestionsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingTimeSuggestionsResult
     */
    @javax.annotation.Nonnull
    public static MeetingTimeSuggestionsResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingTimeSuggestionsResult();
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
     * Gets the emptySuggestionsReason property value. A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmptySuggestionsReason() {
        return this._emptySuggestionsReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("emptySuggestionsReason", (n) -> { this.setEmptySuggestionsReason(n.getStringValue()); });
        deserializerMap.put("meetingTimeSuggestions", (n) -> { this.setMeetingTimeSuggestions(n.getCollectionOfObjectValues(MeetingTimeSuggestion::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingTimeSuggestions property value. An array of meeting suggestions.
     * @return a meetingTimeSuggestion
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingTimeSuggestion> getMeetingTimeSuggestions() {
        return this._meetingTimeSuggestions;
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("emptySuggestionsReason", this.getEmptySuggestionsReason());
        writer.writeCollectionOfObjectValues("meetingTimeSuggestions", this.getMeetingTimeSuggestions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the emptySuggestionsReason property value. A reason for not returning any meeting suggestions. The possible values are: attendeesUnavailable, attendeesUnavailableOrUnknown, locationsUnavailable, organizerUnavailable, or unknown. This property is an empty string if the meetingTimeSuggestions property does include any meeting suggestions.
     * @param value Value to set for the emptySuggestionsReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmptySuggestionsReason(@javax.annotation.Nullable final String value) {
        this._emptySuggestionsReason = value;
    }
    /**
     * Sets the meetingTimeSuggestions property value. An array of meeting suggestions.
     * @param value Value to set for the meetingTimeSuggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingTimeSuggestions(@javax.annotation.Nullable final java.util.List<MeetingTimeSuggestion> value) {
        this._meetingTimeSuggestions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
