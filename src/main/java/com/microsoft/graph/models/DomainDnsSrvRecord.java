package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainDnsSrvRecord extends DomainDnsRecord implements Parsable {
    /** Value to use when configuring the Target property of the SRV record at the DNS host. */
    private String _nameTarget;
    /** Value to use when configuring the port property of the SRV record at the DNS host. */
    private Integer _port;
    /** Value to use when configuring the priority property of the SRV record at the DNS host. */
    private Integer _priority;
    /** Value to use when configuring the protocol property of the SRV record at the DNS host. */
    private String _protocol;
    /** Value to use when configuring the service property of the SRV record at the DNS host. */
    private String _service;
    /** Value to use when configuring the weight property of the SRV record at the DNS host. */
    private Integer _weight;
    /**
     * Instantiates a new DomainDnsSrvRecord and sets the default values.
     * @return a void
     */
    public DomainDnsSrvRecord() {
        super();
        this.setOdataType("#microsoft.graph.domainDnsSrvRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainDnsSrvRecord
     */
    @javax.annotation.Nonnull
    public static DomainDnsSrvRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainDnsSrvRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DomainDnsSrvRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("nameTarget", (n) -> { currentObject.setNameTarget(n.getStringValue()); });
            this.put("port", (n) -> { currentObject.setPort(n.getIntegerValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("protocol", (n) -> { currentObject.setProtocol(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("weight", (n) -> { currentObject.setWeight(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the nameTarget property value. Value to use when configuring the Target property of the SRV record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNameTarget() {
        return this._nameTarget;
    }
    /**
     * Gets the port property value. Value to use when configuring the port property of the SRV record at the DNS host.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPort() {
        return this._port;
    }
    /**
     * Gets the priority property value. Value to use when configuring the priority property of the SRV record at the DNS host.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the protocol property value. Value to use when configuring the protocol property of the SRV record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProtocol() {
        return this._protocol;
    }
    /**
     * Gets the service property value. Value to use when configuring the service property of the SRV record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the weight property value. Value to use when configuring the weight property of the SRV record at the DNS host.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWeight() {
        return this._weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setNameTarget(@javax.annotation.Nullable final String value) {
        this._nameTarget = value;
    }
    /**
     * Sets the port property value. Value to use when configuring the port property of the SRV record at the DNS host.
     * @param value Value to set for the port property.
     * @return a void
     */
    public void setPort(@javax.annotation.Nullable final Integer value) {
        this._port = value;
    }
    /**
     * Sets the priority property value. Value to use when configuring the priority property of the SRV record at the DNS host.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the protocol property value. Value to use when configuring the protocol property of the SRV record at the DNS host.
     * @param value Value to set for the protocol property.
     * @return a void
     */
    public void setProtocol(@javax.annotation.Nullable final String value) {
        this._protocol = value;
    }
    /**
     * Sets the service property value. Value to use when configuring the service property of the SRV record at the DNS host.
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the weight property value. Value to use when configuring the weight property of the SRV record at the DNS host.
     * @param value Value to set for the weight property.
     * @return a void
     */
    public void setWeight(@javax.annotation.Nullable final Integer value) {
        this._weight = value;
    }
}
