package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RequestorManager extends SubjectSet implements Parsable {
    /** The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default value for managerLevel is 1. Possible values for this property range from 1 to 2. */
    private Integer _managerLevel;
    /**
     * Instantiates a new RequestorManager and sets the default values.
     * @return a void
     */
    public RequestorManager() {
        super();
        this.setOdataType("#microsoft.graph.requestorManager");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RequestorManager
     */
    @javax.annotation.Nonnull
    public static RequestorManager createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestorManager();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RequestorManager currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("managerLevel", (n) -> { currentObject.setManagerLevel(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the managerLevel property value. The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default value for managerLevel is 1. Possible values for this property range from 1 to 2.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagerLevel() {
        return this._managerLevel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("managerLevel", this.getManagerLevel());
    }
    /**
     * Sets the managerLevel property value. The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default value for managerLevel is 1. Possible values for this property range from 1 to 2.
     * @param value Value to set for the managerLevel property.
     * @return a void
     */
    public void setManagerLevel(@javax.annotation.Nullable final Integer value) {
        this._managerLevel = value;
    }
}
