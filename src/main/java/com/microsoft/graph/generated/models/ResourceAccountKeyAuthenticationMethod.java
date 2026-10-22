package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourceAccountKeyAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link ResourceAccountKeyAuthenticationMethod} and sets the default values.
     */
    public ResourceAccountKeyAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.resourceAccountKeyAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourceAccountKeyAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static ResourceAccountKeyAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceAccountKeyAuthenticationMethod();
    }
    /**
     * Gets the device property value. The registered device on which this resource account key resides. Supports $expand.
     * @return a {@link Device}
     */
    @jakarta.annotation.Nullable
    public Device getDevice() {
        return this.backingStore.get("device");
    }
    /**
     * Gets the displayName property value. The display name of the resource account key credential as shown in the Teams Room interface.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("device", (n) -> { this.setDevice(n.getObjectValue(Device::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("device", this.getDevice());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the device property value. The registered device on which this resource account key resides. Supports $expand.
     * @param value Value to set for the device property.
     */
    public void setDevice(@jakarta.annotation.Nullable final Device value) {
        this.backingStore.set("device", value);
    }
    /**
     * Sets the displayName property value. The display name of the resource account key credential as shown in the Teams Room interface.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
}
