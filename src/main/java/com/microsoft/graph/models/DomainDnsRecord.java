package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainDnsRecord extends Entity implements Parsable {
    /**
     * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     */
    private Boolean isOptional;
    /**
     * Value used when configuring the name of the DNS record at the DNS host.
     */
    private String label;
    /**
     * Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
     */
    private String recordType;
    /**
     * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune.
     */
    private String supportedService;
    /**
     * Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
     */
    private Integer ttl;
    /**
     * Instantiates a new domainDnsRecord and sets the default values.
     */
    public DomainDnsRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainDnsRecord
     */
    @jakarta.annotation.Nonnull
    public static DomainDnsRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isOptional", (n) -> { this.setIsOptional(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("recordType", (n) -> { this.setRecordType(n.getStringValue()); });
        deserializerMap.put("supportedService", (n) -> { this.setSupportedService(n.getStringValue()); });
        deserializerMap.put("ttl", (n) -> { this.setTtl(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isOptional property value. If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate correctly with the domain.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOptional() {
        return this.isOptional;
    }
    /**
     * Gets the label property value. Value used when configuring the name of the DNS record at the DNS host.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the recordType property value. Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecordType() {
        return this.recordType;
    }
    /**
     * Gets the supportedService property value. Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSupportedService() {
        return this.supportedService;
    }
    /**
     * Gets the ttl property value. Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTtl() {
        return this.ttl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setIsOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.isOptional = value;
    }
    /**
     * Sets the label property value. Value used when configuring the name of the DNS record at the DNS host.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the recordType property value. Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
     * @param value Value to set for the recordType property.
     */
    public void setRecordType(@jakarta.annotation.Nullable final String value) {
        this.recordType = value;
    }
    /**
     * Sets the supportedService property value. Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null, Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation, SharePointPublic, OrgIdAuthentication, Yammer, Intune.
     * @param value Value to set for the supportedService property.
     */
    public void setSupportedService(@jakarta.annotation.Nullable final String value) {
        this.supportedService = value;
    }
    /**
     * Sets the ttl property value. Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
     * @param value Value to set for the ttl property.
     */
    public void setTtl(@jakarta.annotation.Nullable final Integer value) {
        this.ttl = value;
    }
}
