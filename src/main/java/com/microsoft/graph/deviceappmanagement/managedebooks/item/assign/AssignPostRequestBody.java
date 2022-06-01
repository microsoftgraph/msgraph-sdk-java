package microsoft.graph.deviceappmanagement.managedebooks.item.assign;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ManagedEBookAssignment;
/** Provides operations to call the assign method. */
public class AssignPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The managedEBookAssignments property */
    private java.util.List<ManagedEBookAssignment> _managedEBookAssignments;
    /**
     * Instantiates a new assignPostRequestBody and sets the default values.
     * @return a void
     */
    public AssignPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("managedEBookAssignments", (n) -> { currentObject.setManagedEBookAssignments(n.getCollectionOfObjectValues(ManagedEBookAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the managedEBookAssignments property value. The managedEBookAssignments property
     * @return a managedEBookAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedEBookAssignment> getManagedEBookAssignments() {
        return this._managedEBookAssignments;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("managedEBookAssignments", this.getManagedEBookAssignments());
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
     * Sets the managedEBookAssignments property value. The managedEBookAssignments property
     * @param value Value to set for the managedEBookAssignments property.
     * @return a void
     */
    public void setManagedEBookAssignments(@javax.annotation.Nullable final java.util.List<ManagedEBookAssignment> value) {
        this._managedEBookAssignments = value;
    }
}
