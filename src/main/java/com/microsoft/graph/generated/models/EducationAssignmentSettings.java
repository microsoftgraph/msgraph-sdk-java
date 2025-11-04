package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationAssignmentSettings} and sets the default values.
     */
    public EducationAssignmentSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentSettings();
    }
    /**
     * Gets the defaultGradingScheme property value. The default grading scheme for assignments created in this class.
     * @return a {@link EducationGradingScheme}
     */
    @jakarta.annotation.Nullable
    public EducationGradingScheme getDefaultGradingScheme() {
        return this.backingStore.get("defaultGradingScheme");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultGradingScheme", (n) -> { this.setDefaultGradingScheme(n.getObjectValue(EducationGradingScheme::createFromDiscriminatorValue)); });
        deserializerMap.put("gradingCategories", (n) -> { this.setGradingCategories(n.getCollectionOfObjectValues(EducationGradingCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("gradingSchemes", (n) -> { this.setGradingSchemes(n.getCollectionOfObjectValues(EducationGradingScheme::createFromDiscriminatorValue)); });
        deserializerMap.put("submissionAnimationDisabled", (n) -> { this.setSubmissionAnimationDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gradingCategories property value. When set, enables users to weight assignments differently when computing a class average grade.
     * @return a {@link java.util.List<EducationGradingCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationGradingCategory> getGradingCategories() {
        return this.backingStore.get("gradingCategories");
    }
    /**
     * Gets the gradingSchemes property value. The grading schemes that can be attached to assignments created in this class.
     * @return a {@link java.util.List<EducationGradingScheme>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationGradingScheme> getGradingSchemes() {
        return this.backingStore.get("gradingSchemes");
    }
    /**
     * Gets the submissionAnimationDisabled property value. Indicates whether to show the turn-in celebration animation. If true, indicates to skip the animation. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubmissionAnimationDisabled() {
        return this.backingStore.get("submissionAnimationDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultGradingScheme", this.getDefaultGradingScheme());
        writer.writeCollectionOfObjectValues("gradingCategories", this.getGradingCategories());
        writer.writeCollectionOfObjectValues("gradingSchemes", this.getGradingSchemes());
        writer.writeBooleanValue("submissionAnimationDisabled", this.getSubmissionAnimationDisabled());
    }
    /**
     * Sets the defaultGradingScheme property value. The default grading scheme for assignments created in this class.
     * @param value Value to set for the defaultGradingScheme property.
     */
    public void setDefaultGradingScheme(@jakarta.annotation.Nullable final EducationGradingScheme value) {
        this.backingStore.set("defaultGradingScheme", value);
    }
    /**
     * Sets the gradingCategories property value. When set, enables users to weight assignments differently when computing a class average grade.
     * @param value Value to set for the gradingCategories property.
     */
    public void setGradingCategories(@jakarta.annotation.Nullable final java.util.List<EducationGradingCategory> value) {
        this.backingStore.set("gradingCategories", value);
    }
    /**
     * Sets the gradingSchemes property value. The grading schemes that can be attached to assignments created in this class.
     * @param value Value to set for the gradingSchemes property.
     */
    public void setGradingSchemes(@jakarta.annotation.Nullable final java.util.List<EducationGradingScheme> value) {
        this.backingStore.set("gradingSchemes", value);
    }
    /**
     * Sets the submissionAnimationDisabled property value. Indicates whether to show the turn-in celebration animation. If true, indicates to skip the animation. The default value is false.
     * @param value Value to set for the submissionAnimationDisabled property.
     */
    public void setSubmissionAnimationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("submissionAnimationDisabled", value);
    }
}
