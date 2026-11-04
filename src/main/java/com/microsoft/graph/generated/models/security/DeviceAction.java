package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAction extends AutomatedAction implements Parsable {
    /**
     * Instantiates a new {@link DeviceAction} and sets the default values.
     */
    public DeviceAction() {
        super();
        this.setOdataType("#microsoft.graph.security.deviceAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceAction}
     */
    @jakarta.annotation.Nonnull
    public static DeviceAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.isolateDeviceAction": return new IsolateDeviceAction();
            }
        }
        return new DeviceAction();
    }
    /**
     * Gets the deviceIdColumn property value. Name of the hunting-query result column that contains the device ID for the targeted device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceIdColumn() {
        return this.backingStore.get("deviceIdColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceIdColumn", (n) -> { this.setDeviceIdColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceIdColumn", this.getDeviceIdColumn());
    }
    /**
     * Sets the deviceIdColumn property value. Name of the hunting-query result column that contains the device ID for the targeted device.
     * @param value Value to set for the deviceIdColumn property.
     */
    public void setDeviceIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceIdColumn", value);
    }
}
