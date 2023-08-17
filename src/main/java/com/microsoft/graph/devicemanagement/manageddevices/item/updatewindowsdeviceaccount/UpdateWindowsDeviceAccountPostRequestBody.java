package com.microsoft.graph.devicemanagement.manageddevices.item.updatewindowsdeviceaccount;

import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateWindowsDeviceAccountPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The updateWindowsDeviceAccountActionParameter property
     */
    private UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter;
    /**
     * Instantiates a new updateWindowsDeviceAccountPostRequestBody and sets the default values.
     */
    public UpdateWindowsDeviceAccountPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateWindowsDeviceAccountPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateWindowsDeviceAccountPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateWindowsDeviceAccountPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("updateWindowsDeviceAccountActionParameter", (n) -> { this.setUpdateWindowsDeviceAccountActionParameter(n.getObjectValue(UpdateWindowsDeviceAccountActionParameter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the updateWindowsDeviceAccountActionParameter property value. The updateWindowsDeviceAccountActionParameter property
     * @return a updateWindowsDeviceAccountActionParameter
     */
    @jakarta.annotation.Nullable
    public UpdateWindowsDeviceAccountActionParameter getUpdateWindowsDeviceAccountActionParameter() {
        return this.updateWindowsDeviceAccountActionParameter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("updateWindowsDeviceAccountActionParameter", this.getUpdateWindowsDeviceAccountActionParameter());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the updateWindowsDeviceAccountActionParameter property value. The updateWindowsDeviceAccountActionParameter property
     * @param value Value to set for the updateWindowsDeviceAccountActionParameter property.
     */
    public void setUpdateWindowsDeviceAccountActionParameter(@jakarta.annotation.Nullable final UpdateWindowsDeviceAccountActionParameter value) {
        this.updateWindowsDeviceAccountActionParameter = value;
    }
}
