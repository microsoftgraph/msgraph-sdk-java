package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link HostEntityMapping} and sets the default values.
     */
    public HostEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.hostEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HostEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static HostEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostEntityMapping();
    }
    /**
     * Gets the deviceIdColumn property value. Name of the detection query column that maps to the device ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceIdColumn() {
        return this.backingStore.get("deviceIdColumn");
    }
    /**
     * Gets the dnsDomainColumn property value. Name of the detection query column that maps to the DNS domain of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDnsDomainColumn() {
        return this.backingStore.get("dnsDomainColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceIdColumn", (n) -> { this.setDeviceIdColumn(n.getStringValue()); });
        deserializerMap.put("dnsDomainColumn", (n) -> { this.setDnsDomainColumn(n.getStringValue()); });
        deserializerMap.put("nameColumn", (n) -> { this.setNameColumn(n.getStringValue()); });
        deserializerMap.put("netBiosNameColumn", (n) -> { this.setNetBiosNameColumn(n.getStringValue()); });
        deserializerMap.put("ntDomainColumn", (n) -> { this.setNtDomainColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNameColumn() {
        return this.backingStore.get("nameColumn");
    }
    /**
     * Gets the netBiosNameColumn property value. Name of the detection query column that maps to the NetBIOS name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetBiosNameColumn() {
        return this.backingStore.get("netBiosNameColumn");
    }
    /**
     * Gets the ntDomainColumn property value. Name of the detection query column that maps to the NT domain of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNtDomainColumn() {
        return this.backingStore.get("ntDomainColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceIdColumn", this.getDeviceIdColumn());
        writer.writeStringValue("dnsDomainColumn", this.getDnsDomainColumn());
        writer.writeStringValue("nameColumn", this.getNameColumn());
        writer.writeStringValue("netBiosNameColumn", this.getNetBiosNameColumn());
        writer.writeStringValue("ntDomainColumn", this.getNtDomainColumn());
    }
    /**
     * Sets the deviceIdColumn property value. Name of the detection query column that maps to the device ID of the alert entity.
     * @param value Value to set for the deviceIdColumn property.
     */
    public void setDeviceIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceIdColumn", value);
    }
    /**
     * Sets the dnsDomainColumn property value. Name of the detection query column that maps to the DNS domain of the alert entity.
     * @param value Value to set for the dnsDomainColumn property.
     */
    public void setDnsDomainColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dnsDomainColumn", value);
    }
    /**
     * Sets the nameColumn property value. Name of the detection query column that maps to the name of the alert entity.
     * @param value Value to set for the nameColumn property.
     */
    public void setNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nameColumn", value);
    }
    /**
     * Sets the netBiosNameColumn property value. Name of the detection query column that maps to the NetBIOS name of the alert entity.
     * @param value Value to set for the netBiosNameColumn property.
     */
    public void setNetBiosNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("netBiosNameColumn", value);
    }
    /**
     * Sets the ntDomainColumn property value. Name of the detection query column that maps to the NT domain of the alert entity.
     * @param value Value to set for the ntDomainColumn property.
     */
    public void setNtDomainColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ntDomainColumn", value);
    }
}
