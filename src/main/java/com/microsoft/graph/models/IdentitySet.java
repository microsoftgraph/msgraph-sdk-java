package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentitySet implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Optional. The application associated with this action.  */
    private Identity _application;
    /** Optional. The device associated with this action.  */
    private Identity _device;
    /** Optional. The user associated with this action.  */
    private Identity _user;
    /**
     * Instantiates a new identitySet and sets the default values.
     * @return a void
     */
    public IdentitySet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identitySet
     */
    @javax.annotation.Nonnull
    public static IdentitySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentitySet();
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
     * Gets the application property value. Optional. The application associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getApplication() {
        return this._application;
    }
    /**
     * Gets the device property value. Optional. The device associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getDevice() {
        return this._device;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IdentitySet currentObject = this;
        return new HashMap<>(3) {{
            this.put("application", (n) -> { currentObject.setApplication(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("device", (n) -> { currentObject.setDevice(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
            this.put("user", (n) -> { currentObject.setUser(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the user property value. Optional. The user associated with this action.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getUser() {
        return this._user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeObjectValue("device", this.getDevice());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the application property value. Optional. The application associated with this action.
     * @param value Value to set for the application property.
     * @return a void
     */
    public void setApplication(@javax.annotation.Nullable final Identity value) {
        this._application = value;
    }
    /**
     * Sets the device property value. Optional. The device associated with this action.
     * @param value Value to set for the device property.
     * @return a void
     */
    public void setDevice(@javax.annotation.Nullable final Identity value) {
        this._device = value;
    }
    /**
     * Sets the user property value. Optional. The user associated with this action.
     * @param value Value to set for the user property.
     * @return a void
     */
    public void setUser(@javax.annotation.Nullable final Identity value) {
        this._user = value;
    }
}
