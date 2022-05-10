package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiedDomain implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** For example, Email, OfficeCommunicationsOnline. */
    private String _capabilities;
    /** true if this is the default domain associated with the tenant; otherwise, false. */
    private Boolean _isDefault;
    /** true if this is the initial domain associated with the tenant; otherwise, false. */
    private Boolean _isInitial;
    /** The domain name; for example, contoso.onmicrosoft.com. */
    private String _name;
    /** For example, Managed. */
    private String _type;
    /**
     * Instantiates a new verifiedDomain and sets the default values.
     * @return a void
     */
    public VerifiedDomain() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiedDomain
     */
    @javax.annotation.Nonnull
    public static VerifiedDomain createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedDomain();
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
     * Gets the capabilities property value. For example, Email, OfficeCommunicationsOnline.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCapabilities() {
        return this._capabilities;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VerifiedDomain currentObject = this;
        return new HashMap<>(5) {{
            this.put("capabilities", (n) -> { currentObject.setCapabilities(n.getStringValue()); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("isInitial", (n) -> { currentObject.setIsInitial(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefault property value. true if this is the default domain associated with the tenant; otherwise, false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the isInitial property value. true if this is the initial domain associated with the tenant; otherwise, false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInitial() {
        return this._isInitial;
    }
    /**
     * Gets the name property value. The domain name; for example, contoso.onmicrosoft.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the type property value. For example, Managed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("capabilities", this.getCapabilities());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isInitial", this.getIsInitial());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("type", this.getType());
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
     * Sets the capabilities property value. For example, Email, OfficeCommunicationsOnline.
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    public void setCapabilities(@javax.annotation.Nullable final String value) {
        this._capabilities = value;
    }
    /**
     * Sets the isDefault property value. true if this is the default domain associated with the tenant; otherwise, false.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the isInitial property value. true if this is the initial domain associated with the tenant; otherwise, false.
     * @param value Value to set for the isInitial property.
     * @return a void
     */
    public void setIsInitial(@javax.annotation.Nullable final Boolean value) {
        this._isInitial = value;
    }
    /**
     * Sets the name property value. The domain name; for example, contoso.onmicrosoft.com.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the type property value. For example, Managed.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
