package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDeviceADAccount extends WindowsDeviceAccount implements Parsable {
    /**
     * Instantiates a new {@link WindowsDeviceADAccount} and sets the default values.
     */
    public WindowsDeviceADAccount() {
        super();
        this.setOdataType("#microsoft.graph.windowsDeviceADAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsDeviceADAccount}
     */
    @jakarta.annotation.Nonnull
    public static WindowsDeviceADAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDeviceADAccount();
    }
    /**
     * Gets the domainName property value. Not yet documented
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userName property value. Not yet documented
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the domainName property value. Not yet documented
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the userName property value. Not yet documented
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}
