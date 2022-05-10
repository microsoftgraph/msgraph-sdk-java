package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProvisionedPlan implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** For example, 'Enabled'. */
    private String _capabilityStatus;
    /** For example, 'Success'. */
    private String _provisioningStatus;
    /** The name of the service; for example, 'AccessControlS2S' */
    private String _service;
    /**
     * Instantiates a new provisionedPlan and sets the default values.
     * @return a void
     */
    public ProvisionedPlan() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisionedPlan
     */
    @javax.annotation.Nonnull
    public static ProvisionedPlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionedPlan();
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
     * Gets the capabilityStatus property value. For example, 'Enabled'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCapabilityStatus() {
        return this._capabilityStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProvisionedPlan currentObject = this;
        return new HashMap<>(3) {{
            this.put("capabilityStatus", (n) -> { currentObject.setCapabilityStatus(n.getStringValue()); });
            this.put("provisioningStatus", (n) -> { currentObject.setProvisioningStatus(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
        }};
    }
    /**
     * Gets the provisioningStatus property value. For example, 'Success'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningStatus() {
        return this._provisioningStatus;
    }
    /**
     * Gets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("capabilityStatus", this.getCapabilityStatus());
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
        writer.writeStringValue("service", this.getService());
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
     * Sets the capabilityStatus property value. For example, 'Enabled'.
     * @param value Value to set for the capabilityStatus property.
     * @return a void
     */
    public void setCapabilityStatus(@javax.annotation.Nullable final String value) {
        this._capabilityStatus = value;
    }
    /**
     * Sets the provisioningStatus property value. For example, 'Success'.
     * @param value Value to set for the provisioningStatus property.
     * @return a void
     */
    public void setProvisioningStatus(@javax.annotation.Nullable final String value) {
        this._provisioningStatus = value;
    }
    /**
     * Sets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
}
