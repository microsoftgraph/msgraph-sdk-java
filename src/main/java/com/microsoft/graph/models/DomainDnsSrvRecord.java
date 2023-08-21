package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainDnsSrvRecord extends DomainDnsRecord implements Parsable {
    /**
     * Value to use when configuring the Target property of the SRV record at the DNS host.
     */
    private String nameTarget;
    /**
     * Value to use when configuring the port property of the SRV record at the DNS host.
     */
    private Integer port;
    /**
     * Value to use when configuring the priority property of the SRV record at the DNS host.
     */
    private Integer priority;
    /**
     * Value to use when configuring the protocol property of the SRV record at the DNS host.
     */
    private String protocol;
    /**
     * Value to use when configuring the service property of the SRV record at the DNS host.
     */
    private String service;
    /**
     * Value to use when configuring the weight property of the SRV record at the DNS host.
     */
    private Integer weight;
    /**
     * Instantiates a new domainDnsSrvRecord and sets the default values.
     */
    public DomainDnsSrvRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainDnsSrvRecord
     */
    @jakarta.annotation.Nonnull
    public static DomainDnsSrvRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsSrvRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("nameTarget", (n) -> { this.setNameTarget(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nameTarget property value. Value to use when configuring the Target property of the SRV record at the DNS host.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNameTarget() {
        return this.nameTarget;
    }
    /**
     * Gets the port property value. Value to use when configuring the port property of the SRV record at the DNS host.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the priority property value. Value to use when configuring the priority property of the SRV record at the DNS host.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the protocol property value. Value to use when configuring the protocol property of the SRV record at the DNS host.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the service property value. Value to use when configuring the service property of the SRV record at the DNS host.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the weight property value. Value to use when configuring the weight property of the SRV record at the DNS host.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("nameTarget", this.getNameTarget());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeStringValue("protocol", this.getProtocol());
        writer.writeStringValue("service", this.getService());
        writer.writeIntegerValue("weight", this.getWeight());
    }
    /**
     * Sets the nameTarget property value. Value to use when configuring the Target property of the SRV record at the DNS host.
     * @param value Value to set for the nameTarget property.
     */
    public void setNameTarget(@jakarta.annotation.Nullable final String value) {
        this.nameTarget = value;
    }
    /**
     * Sets the port property value. Value to use when configuring the port property of the SRV record at the DNS host.
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the priority property value. Value to use when configuring the priority property of the SRV record at the DNS host.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the protocol property value. Value to use when configuring the protocol property of the SRV record at the DNS host.
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final String value) {
        this.protocol = value;
    }
    /**
     * Sets the service property value. Value to use when configuring the service property of the SRV record at the DNS host.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the weight property value. Value to use when configuring the weight property of the SRV record at the DNS host.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Integer value) {
        this.weight = value;
    }
}
