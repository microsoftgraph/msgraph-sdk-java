package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationGradingScheme extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationGradingScheme} and sets the default values.
     */
    public EducationGradingScheme() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationGradingScheme}
     */
    @jakarta.annotation.Nonnull
    public static EducationGradingScheme createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationGradingScheme();
    }
    /**
     * Gets the displayName property value. The name of the grading scheme.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("grades", (n) -> { this.setGrades(n.getCollectionOfObjectValues(EducationGradingSchemeGrade::createFromDiscriminatorValue)); });
        deserializerMap.put("hidePointsDuringGrading", (n) -> { this.setHidePointsDuringGrading(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grades property value. The grades that make up the scheme.
     * @return a {@link java.util.List<EducationGradingSchemeGrade>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationGradingSchemeGrade> getGrades() {
        return this.backingStore.get("grades");
    }
    /**
     * Gets the hidePointsDuringGrading property value. The display setting for the UI. Indicates whether teachers can grade with points in addition to letter grades.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHidePointsDuringGrading() {
        return this.backingStore.get("hidePointsDuringGrading");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("grades", this.getGrades());
        writer.writeBooleanValue("hidePointsDuringGrading", this.getHidePointsDuringGrading());
    }
    /**
     * Sets the displayName property value. The name of the grading scheme.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the grades property value. The grades that make up the scheme.
     * @param value Value to set for the grades property.
     */
    public void setGrades(@jakarta.annotation.Nullable final java.util.List<EducationGradingSchemeGrade> value) {
        this.backingStore.set("grades", value);
    }
    /**
     * Sets the hidePointsDuringGrading property value. The display setting for the UI. Indicates whether teachers can grade with points in addition to letter grades.
     * @param value Value to set for the hidePointsDuringGrading property.
     */
    public void setHidePointsDuringGrading(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hidePointsDuringGrading", value);
    }
}
