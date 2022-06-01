package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the educationRoot singleton. */
public class EducationSubmissionResource extends Entity implements Parsable {
    /** Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource. */
    private String _assignmentResourceUrl;
    /** Resource object. */
    private EducationResource _resource;
    /**
     * Instantiates a new educationSubmissionResource and sets the default values.
     * @return a void
     */
    public EducationSubmissionResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSubmissionResource
     */
    @javax.annotation.Nonnull
    public static EducationSubmissionResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSubmissionResource();
    }
    /**
     * Gets the assignmentResourceUrl property value. Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentResourceUrl() {
        return this._assignmentResourceUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSubmissionResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignmentResourceUrl", (n) -> { currentObject.setAssignmentResourceUrl(n.getStringValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resource property value. Resource object.
     * @return a educationResource
     */
    @javax.annotation.Nullable
    public EducationResource getResource() {
        return this._resource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentResourceUrl", this.getAssignmentResourceUrl());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the assignmentResourceUrl property value. Pointer to the assignment from which this resource was copied. If this is null, the student uploaded the resource.
     * @param value Value to set for the assignmentResourceUrl property.
     * @return a void
     */
    public void setAssignmentResourceUrl(@javax.annotation.Nullable final String value) {
        this._assignmentResourceUrl = value;
    }
    /**
     * Sets the resource property value. Resource object.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final EducationResource value) {
        this._resource = value;
    }
}
