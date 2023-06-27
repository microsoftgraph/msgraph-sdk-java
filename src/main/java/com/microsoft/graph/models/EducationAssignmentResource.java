package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentResource extends Entity implements Parsable {
    /**
     * Indicates whether this resource should be copied to each student submission for modification and submission. Required
     */
    private Boolean distributeForStudentWork;
    /**
     * Resource object that has been associated with this assignment.
     */
    private EducationResource resource;
    /**
     * Instantiates a new educationAssignmentResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationAssignmentResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationAssignmentResource
     */
    @javax.annotation.Nonnull
    public static EducationAssignmentResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignmentResource();
    }
    /**
     * Gets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDistributeForStudentWork() {
        return this.distributeForStudentWork;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("distributeForStudentWork", (n) -> { this.setDistributeForStudentWork(n.getBooleanValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Resource object that has been associated with this assignment.
     * @return a educationResource
     */
    @javax.annotation.Nullable
    public EducationResource getResource() {
        return this.resource;
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
        writer.writeBooleanValue("distributeForStudentWork", this.getDistributeForStudentWork());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @param value Value to set for the distributeForStudentWork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDistributeForStudentWork(@javax.annotation.Nullable final Boolean value) {
        this.distributeForStudentWork = value;
    }
    /**
     * Sets the resource property value. Resource object that has been associated with this assignment.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final EducationResource value) {
        this.resource = value;
    }
}
