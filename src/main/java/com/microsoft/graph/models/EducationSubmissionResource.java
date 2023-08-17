package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSubmissionResource extends Entity implements Parsable {
    /**
     * Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
     */
    private String assignmentResourceUrl;
    /**
     * Resource object.
     */
    private EducationResource resource;
    /**
     * Instantiates a new educationSubmissionResource and sets the default values.
     */
    public EducationSubmissionResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSubmissionResource
     */
    @jakarta.annotation.Nonnull
    public static EducationSubmissionResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSubmissionResource();
    }
    /**
     * Gets the assignmentResourceUrl property value. Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentResourceUrl() {
        return this.assignmentResourceUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentResourceUrl", (n) -> { this.setAssignmentResourceUrl(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource property value. Resource object.
     * @return a educationResource
     */
    @jakarta.annotation.Nullable
    public EducationResource getResource() {
        return this.resource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentResourceUrl", this.getAssignmentResourceUrl());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the assignmentResourceUrl property value. Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
     * @param value Value to set for the assignmentResourceUrl property.
     */
    public void setAssignmentResourceUrl(@jakarta.annotation.Nullable final String value) {
        this.assignmentResourceUrl = value;
    }
    /**
     * Sets the resource property value. Resource object.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final EducationResource value) {
        this.resource = value;
    }
}
