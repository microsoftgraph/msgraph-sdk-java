package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of domainDnsRecord entities. */
public class DomainDnsRecord extends Entity implements Parsable {
    /** If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain. */
    private Boolean _isOptional;
    /** Value used when configuring the name of the DNS record at the DNS host. */
    private String _label;
    /** Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt. */
    private String _recordType;
    /** Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune. */
    private String _supportedService;
    /** Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable. */
    private Integer _ttl;
    /**
     * Instantiates a new domainDnsRecord and sets the default values.
     * @return a void
     */
    public DomainDnsRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainDnsRecord
     */
    @javax.annotation.Nonnull
    public static DomainDnsRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.domainDnsCnameRecord": return new DomainDnsCnameRecord();
                case "#microsoft.graph.domainDnsMxRecord": return new DomainDnsMxRecord();
                case "#microsoft.graph.domainDnsSrvRecord": return new DomainDnsSrvRecord();
                case "#microsoft.graph.domainDnsTxtRecord": return new DomainDnsTxtRecord();
                case "#microsoft.graph.domainDnsUnavailableRecord": return new DomainDnsUnavailableRecord();
            }
        }
        return new DomainDnsRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DomainDnsRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isOptional", (n) -> { currentObject.setIsOptional(n.getBooleanValue()); });
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("recordType", (n) -> { currentObject.setRecordType(n.getStringValue()); });
            this.put("supportedService", (n) -> { currentObject.setSupportedService(n.getStringValue()); });
            this.put("ttl", (n) -> { currentObject.setTtl(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the isOptional property value. If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOptional() {
        return this._isOptional;
    }
    /**
     * Gets the label property value. Value used when configuring the name of the DNS record at the DNS host.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the recordType property value. Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordType() {
        return this._recordType;
    }
    /**
     * Gets the supportedService property value. Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportedService() {
        return this._supportedService;
    }
    /**
     * Gets the ttl property value. Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTtl() {
        return this._ttl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isOptional", this.getIsOptional());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("recordType", this.getRecordType());
        writer.writeStringValue("supportedService", this.getSupportedService());
        writer.writeIntegerValue("ttl", this.getTtl());
    }
    /**
     * Sets the isOptional property value. If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     * @param value Value to set for the isOptional property.
     * @return a void
     */
    public void setIsOptional(@javax.annotation.Nullable final Boolean value) {
        this._isOptional = value;
    }
    /**
     * Sets the label property value. Value used when configuring the name of the DNS record at the DNS host.
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the recordType property value. Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
     * @param value Value to set for the recordType property.
     * @return a void
     */
    public void setRecordType(@javax.annotation.Nullable final String value) {
        this._recordType = value;
    }
    /**
     * Sets the supportedService property value. Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune.
     * @param value Value to set for the supportedService property.
     * @return a void
     */
    public void setSupportedService(@javax.annotation.Nullable final String value) {
        this._supportedService = value;
    }
    /**
     * Sets the ttl property value. Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
     * @param value Value to set for the ttl property.
     * @return a void
     */
    public void setTtl(@javax.annotation.Nullable final Integer value) {
        this._ttl = value;
    }
}
