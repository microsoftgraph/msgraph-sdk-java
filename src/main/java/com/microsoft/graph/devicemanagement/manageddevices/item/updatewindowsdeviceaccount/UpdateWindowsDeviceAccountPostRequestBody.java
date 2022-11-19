package com.microsoft.graph.devicemanagement.manageddevices.item.updatewindowsdeviceaccount;

import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateWindowsDeviceAccount method. */
public class UpdateWindowsDeviceAccountPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The updateWindowsDeviceAccountActionParameter property */
    private UpdateWindowsDeviceAccountActionParameter _updateWindowsDeviceAccountActionParameter;
    /**
     * Instantiates a new updateWindowsDeviceAccountPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UpdateWindowsDeviceAccountPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateWindowsDeviceAccountPostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateWindowsDeviceAccountPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindowsDeviceAccountPostRequestBody();
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
        final UpdateWindowsDeviceAccountPostRequestBody currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("updateWindowsDeviceAccountActionParameter", (n) -> { currentObject.setUpdateWindowsDeviceAccountActionParameter(n.getObjectValue(UpdateWindowsDeviceAccountActionParameter::createFromDiscriminatorValue)); });
        return deserializerMap
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the updateWindowsDeviceAccountActionParameter property value. The updateWindowsDeviceAccountActionParameter property
     * @param value Value to set for the updateWindowsDeviceAccountActionParameter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateWindowsDeviceAccountActionParameter(@javax.annotation.Nullable final UpdateWindowsDeviceAccountActionParameter value) {
        this._updateWindowsDeviceAccountActionParameter = value;
    }
}
