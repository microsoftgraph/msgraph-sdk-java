package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationAssignmentResource extends Entity implements Parsable {
    /** Indicates whether this resource should be copied to each student submission for modification and submission. Required  */
    private Boolean _distributeForStudentWork;
    /** Resource object that has been associated with this assignment.  */
    private EducationResource _resource;
    /**
     * Instantiates a new educationAssignmentResource and sets the default values.
     * @return a void
     */
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
        return this._distributeForStudentWork;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationAssignmentResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("distributeForStudentWork", (n) -> { currentObject.setDistributeForStudentWork(n.getBooleanValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(EducationResource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resource property value. Resource object that has been associated with this assignment.
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
        writer.writeBooleanValue("distributeForStudentWork", this.getDistributeForStudentWork());
        writer.writeObjectValue("resource", this.getResource());
    }
    /**
     * Sets the distributeForStudentWork property value. Indicates whether this resource should be copied to each student submission for modification and submission. Required
     * @param value Value to set for the distributeForStudentWork property.
     * @return a void
     */
    public void setDistributeForStudentWork(@javax.annotation.Nullable final Boolean value) {
        this._distributeForStudentWork = value;
    }
    /**
     * Sets the resource property value. Resource object that has been associated with this assignment.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final EducationResource value) {
        this._resource = value;
    }
}
