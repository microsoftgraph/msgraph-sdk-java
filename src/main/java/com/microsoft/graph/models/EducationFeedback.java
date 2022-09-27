package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationFeedback implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** User who created the feedback. */
    private IdentitySet _feedbackBy;
    /** Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _feedbackDateTime;
    /** The OdataType property */
    private String _odataType;
    /** Feedback. */
    private EducationItemBody _text;
    /**
     * Instantiates a new educationFeedback and sets the default values.
     * @return a void
     */
    public EducationFeedback() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.educationFeedback");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationFeedback
     */
    @javax.annotation.Nonnull
    public static EducationFeedback createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFeedback();
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
     * Gets the feedbackBy property value. User who created the feedback.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getFeedbackBy() {
        return this._feedbackBy;
    }
    /**
     * Gets the feedbackDateTime property value. Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFeedbackDateTime() {
        return this._feedbackDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationFeedback currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("feedbackBy", (n) -> { currentObject.setFeedbackBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("feedbackDateTime", (n) -> { currentObject.setFeedbackDateTime(n.getOffsetDateTimeValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("text", (n) -> { currentObject.setText(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        }};
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
     * Gets the text property value. Feedback.
     * @return a educationItemBody
     */
    @javax.annotation.Nullable
    public EducationItemBody getText() {
        return this._text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("feedbackBy", this.getFeedbackBy());
        writer.writeOffsetDateTimeValue("feedbackDateTime", this.getFeedbackDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("text", this.getText());
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
     * Sets the feedbackBy property value. User who created the feedback.
     * @param value Value to set for the feedbackBy property.
     * @return a void
     */
    public void setFeedbackBy(@javax.annotation.Nullable final IdentitySet value) {
        this._feedbackBy = value;
    }
    /**
     * Sets the feedbackDateTime property value. Moment in time when the feedback was given. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the feedbackDateTime property.
     * @return a void
     */
    public void setFeedbackDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._feedbackDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the text property value. Feedback.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final EducationItemBody value) {
        this._text = value;
    }
}
