package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FollowupFlag implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The date and time that the follow-up was finished. */
    private DateTimeTimeZone completedDateTime;
    /** The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the startDateTime; otherwise, you will get a 400 Bad Request response. */
    private DateTimeTimeZone dueDateTime;
    /** The status for follow-up for an item. Possible values are notFlagged, complete, and flagged. */
    private FollowupFlagStatus flagStatus;
    /** The OdataType property */
    private String odataType;
    /** The date and time that the follow-up is to begin. */
    private DateTimeTimeZone startDateTime;
    /**
     * Instantiates a new followupFlag and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FollowupFlag() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a followupFlag
     */
    @javax.annotation.Nonnull
    public static FollowupFlag createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FollowupFlag();
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
     * Gets the completedDateTime property value. The date and time that the follow-up was finished.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the dueDateTime property value. The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the startDateTime; otherwise, you will get a 400 Bad Request response.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("flagStatus", (n) -> { this.setFlagStatus(n.getEnumValue(FollowupFlagStatus.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the flagStatus property value. The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
     * @return a followupFlagStatus
     */
    @javax.annotation.Nullable
    public FollowupFlagStatus getFlagStatus() {
        return this.flagStatus;
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
     * Gets the startDateTime property value. The date and time that the follow-up is to begin.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeEnumValue("flagStatus", this.getFlagStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
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
     * Sets the completedDateTime property value. The date and time that the follow-up was finished.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the startDateTime; otherwise, you will get a 400 Bad Request response.
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the flagStatus property value. The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
     * @param value Value to set for the flagStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFlagStatus(@javax.annotation.Nullable final FollowupFlagStatus value) {
        this.flagStatus = value;
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
     * Sets the startDateTime property value. The date and time that the follow-up is to begin.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
}
