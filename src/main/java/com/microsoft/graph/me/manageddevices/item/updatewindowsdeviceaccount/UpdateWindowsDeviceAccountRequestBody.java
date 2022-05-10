package microsoft.graph.me.manageddevices.item.updatewindowsdeviceaccount;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
/** Provides operations to call the updateWindowsDeviceAccount method. */
public class UpdateWindowsDeviceAccountRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The updateWindowsDeviceAccountActionParameter property */
    private UpdateWindowsDeviceAccountActionParameter _updateWindowsDeviceAccountActionParameter;
    /**
     * Instantiates a new updateWindowsDeviceAccountRequestBody and sets the default values.
     * @return a void
     */
    public UpdateWindowsDeviceAccountRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateWindowsDeviceAccountRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateWindowsDeviceAccountRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindowsDeviceAccountRequestBody();
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
        final UpdateWindowsDeviceAccountRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("updateWindowsDeviceAccountActionParameter", (n) -> { currentObject.setUpdateWindowsDeviceAccountActionParameter(n.getObjectValue(UpdateWindowsDeviceAccountActionParameter::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the updateWindowsDeviceAccountActionParameter property value. The updateWindowsDeviceAccountActionParameter property
     * @return a updateWindowsDeviceAccountActionParameter
     */
    @javax.annotation.Nullable
    public UpdateWindowsDeviceAccountActionParameter getUpdateWindowsDeviceAccountActionParameter() {
        return this._updateWindowsDeviceAccountActionParameter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("updateWindowsDeviceAccountActionParameter", this.getUpdateWindowsDeviceAccountActionParameter());
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
     * Sets the updateWindowsDeviceAccountActionParameter property value. The updateWindowsDeviceAccountActionParameter property
     * @param value Value to set for the updateWindowsDeviceAccountActionParameter property.
     * @return a void
     */
    public void setUpdateWindowsDeviceAccountActionParameter(@javax.annotation.Nullable final UpdateWindowsDeviceAccountActionParameter value) {
        this._updateWindowsDeviceAccountActionParameter = value;
    }
}
