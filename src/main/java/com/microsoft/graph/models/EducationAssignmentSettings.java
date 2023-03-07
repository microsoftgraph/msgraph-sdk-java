package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentSettings extends Entity implements Parsable {
    /** Indicates whether turn-in celebration animation will be shown. A value of true indicates that the animation will not be shown. Default value is false. */
    private Boolean submissionAnimationDisabled;
    /**
     * Instantiates a new EducationAssignmentSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationAssignmentSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignmentSettings
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("submissionAnimationDisabled", (n) -> { this.setSubmissionAnimationDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the submissionAnimationDisabled property value. Indicates whether turn-in celebration animation will be shown. A value of true indicates that the animation will not be shown. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSubmissionAnimationDisabled() {
        return this.submissionAnimationDisabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("submissionAnimationDisabled", this.getSubmissionAnimationDisabled());
    }
    /**
     * Sets the submissionAnimationDisabled property value. Indicates whether turn-in celebration animation will be shown. A value of true indicates that the animation will not be shown. Default value is false.
     * @param value Value to set for the submissionAnimationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubmissionAnimationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.submissionAnimationDisabled = value;
    }
}
