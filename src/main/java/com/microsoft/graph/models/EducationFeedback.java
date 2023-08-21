package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationFeedback implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * User who created the feedback.
     */
    private IdentitySet feedbackBy;
    /**
     * Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime feedbackDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Feedback.
     */
    private EducationItemBody text;
    /**
     * Instantiates a new educationFeedback and sets the default values.
     */
    public EducationFeedback() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationFeedback
     */
    @jakarta.annotation.Nonnull
    public static EducationFeedback createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFeedback();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the feedbackBy property value. User who created the feedback.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getFeedbackBy() {
        return this.feedbackBy;
    }
    /**
     * Gets the feedbackDateTime property value. Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFeedbackDateTime() {
        return this.feedbackDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("feedbackBy", (n) -> { this.setFeedbackBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("feedbackDateTime", (n) -> { this.setFeedbackDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the text property value. Feedback.
     * @return a educationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("feedbackBy", this.getFeedbackBy());
        writer.writeOffsetDateTimeValue("feedbackDateTime", this.getFeedbackDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("text", this.getText());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the feedbackBy property value. User who created the feedback.
     * @param value Value to set for the feedbackBy property.
     */
    public void setFeedbackBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.feedbackBy = value;
    }
    /**
     * Sets the feedbackDateTime property value. Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the feedbackDateTime property.
     */
    public void setFeedbackDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.feedbackDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the text property value. Feedback.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.text = value;
    }
}
