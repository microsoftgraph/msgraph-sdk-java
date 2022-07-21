package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConfigurationManagerCollectionAssignmentTarget extends DeviceAndAppManagementAssignmentTarget implements Parsable {
    /** The collection Id that is the target of the assignment. */
    private String _collectionId;
    /**
     * Instantiates a new ConfigurationManagerCollectionAssignmentTarget and sets the default values.
     * @return a void
     */
    public ConfigurationManagerCollectionAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.configurationManagerCollectionAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigurationManagerCollectionAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerCollectionAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerCollectionAssignmentTarget();
    }
    /**
     * Gets the collectionId property value. The collection Id that is the target of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCollectionId() {
        return this._collectionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigurationManagerCollectionAssignmentTarget currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("collectionId", (n) -> { currentObject.setCollectionId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("collectionId", this.getCollectionId());
    }
    /**
     * Sets the collectionId property value. The collection Id that is the target of the assignment.
     * @param value Value to set for the collectionId property.
     * @return a void
     */
    public void setCollectionId(@javax.annotation.Nullable final String value) {
        this._collectionId = value;
    }
}
