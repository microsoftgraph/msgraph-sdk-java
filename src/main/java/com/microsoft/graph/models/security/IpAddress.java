package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpAddress extends Host implements Parsable {
    /**
     * Instantiates a new IpAddress and sets the default values.
     */
    public IpAddress() {
        super();
        this.setOdataType("#microsoft.graph.security.ipAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpAddress
     */
    @jakarta.annotation.Nonnull
    public static IpAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpAddress();
    }
    /**
     * Gets the autonomousSystem property value. The details about the autonomous system to which this IP address belongs.
     * @return a AutonomousSystem
     */
    @jakarta.annotation.Nullable
    public AutonomousSystem getAutonomousSystem() {
        return this.BackingStore.get("autonomousSystem");
    }
    /**
     * Gets the countryOrRegion property value. The country/region for this IP address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCountryOrRegion() {
        return this.BackingStore.get("countryOrRegion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autonomousSystem", (n) -> { this.setAutonomousSystem(n.getObjectValue(AutonomousSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("countryOrRegion", (n) -> { this.setCountryOrRegion(n.getStringValue()); });
        deserializerMap.put("hostingProvider", (n) -> { this.setHostingProvider(n.getStringValue()); });
        deserializerMap.put("netblock", (n) -> { this.setNetblock(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostingProvider property value. The hosting company listed for this host.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostingProvider() {
        return this.BackingStore.get("hostingProvider");
    }
    /**
     * Gets the netblock property value. The block of IP addresses this IP address belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetblock() {
        return this.BackingStore.get("netblock");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("autonomousSystem", this.getAutonomousSystem());
        writer.writeStringValue("countryOrRegion", this.getCountryOrRegion());
        writer.writeStringValue("hostingProvider", this.getHostingProvider());
        writer.writeStringValue("netblock", this.getNetblock());
    }
    /**
     * Sets the autonomousSystem property value. The details about the autonomous system to which this IP address belongs.
     * @param value Value to set for the autonomousSystem property.
     */
    public void setAutonomousSystem(@jakarta.annotation.Nullable final AutonomousSystem value) {
        this.BackingStore.set("autonomousSystem", value);
    }
    /**
     * Sets the countryOrRegion property value. The country/region for this IP address.
     * @param value Value to set for the countryOrRegion property.
     */
    public void setCountryOrRegion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("countryOrRegion", value);
    }
    /**
     * Sets the hostingProvider property value. The hosting company listed for this host.
     * @param value Value to set for the hostingProvider property.
     */
    public void setHostingProvider(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("hostingProvider", value);
    }
    /**
     * Sets the netblock property value. The block of IP addresses this IP address belongs to.
     * @param value Value to set for the netblock property.
     */
    public void setNetblock(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("netblock", value);
    }
}
