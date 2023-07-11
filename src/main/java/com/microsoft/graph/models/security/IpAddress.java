package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpAddress extends Host implements Parsable {
    /**
     * The details about the autonomous system to which this IP address belongs.
     */
    private AutonomousSystem autonomousSystem;
    /**
     * The country or region for this IP address.
     */
    private String countryOrRegion;
    /**
     * The hosting company listed for this host.
     */
    private String hostingProvider;
    /**
     * The block of IP addresses this IP address belongs to.
     */
    private String netblock;
    /**
     * Instantiates a new ipAddress and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpAddress() {
        super();
        this.setOdataType("#microsoft.graph.security.ipAddress");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipAddress
     */
    @javax.annotation.Nonnull
    public static IpAddress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpAddress();
    }
    /**
     * Gets the autonomousSystem property value. The details about the autonomous system to which this IP address belongs.
     * @return a autonomousSystem
     */
    @javax.annotation.Nullable
    public AutonomousSystem getAutonomousSystem() {
        return this.autonomousSystem;
    }
    /**
     * Gets the countryOrRegion property value. The country or region for this IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryOrRegion() {
        return this.countryOrRegion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostingProvider() {
        return this.hostingProvider;
    }
    /**
     * Gets the netblock property value. The block of IP addresses this IP address belongs to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetblock() {
        return this.netblock;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutonomousSystem(@javax.annotation.Nullable final AutonomousSystem value) {
        this.autonomousSystem = value;
    }
    /**
     * Sets the countryOrRegion property value. The country or region for this IP address.
     * @param value Value to set for the countryOrRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryOrRegion(@javax.annotation.Nullable final String value) {
        this.countryOrRegion = value;
    }
    /**
     * Sets the hostingProvider property value. The hosting company listed for this host.
     * @param value Value to set for the hostingProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostingProvider(@javax.annotation.Nullable final String value) {
        this.hostingProvider = value;
    }
    /**
     * Sets the netblock property value. The block of IP addresses this IP address belongs to.
     * @param value Value to set for the netblock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetblock(@javax.annotation.Nullable final String value) {
        this.netblock = value;
    }
}
