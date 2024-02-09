package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignmentResource extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationAssignmentResource} and sets the default values.
     */
    public EducationAssignmentResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationAssignmentResource}
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignmentResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentResource();
    }
    /**
     * Gets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDistributeForStudentWork() {
        return this.backingStore.get("distributeForStudentWork");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("distributeForStudentWork", (n) -> { this.setDistributeForStudentWork(n.getBooleanValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Resource object that has been associated with this assignment.
     * @return a {@link EducationResource}
     */
    @jakarta.annotation.Nullable
    public EducationResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("distributeForStudentWork", this.getDistributeForStudentWork());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @param value Value to set for the distributeForStudentWork property.
     */
    public void setDistributeForStudentWork(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("distributeForStudentWork", value);
    }
    /**
     * Sets the resource property value. Resource object that has been associated with this assignment.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final EducationResource value) {
        this.backingStore.set("resource", value);
    }
}
