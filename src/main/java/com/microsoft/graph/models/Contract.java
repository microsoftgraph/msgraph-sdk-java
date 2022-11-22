package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Contract extends DirectoryObject implements Parsable {
    /** Type of contract. Possible values are:  SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table below. */
    private String _contractType;
    /** The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the customer tenant's organization resource. */
    private String _customerId;
    /** A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's default domain name changes. */
    private String _defaultDomainName;
    /** A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's display name changes. */
    private String _displayName;
    /**
     * Instantiates a new Contract and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Contract() {
        super();
        this.setOdataType("#microsoft.graph.contract");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Contract
     */
    @javax.annotation.Nonnull
    public static Contract createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contract();
    }
    /**
     * Gets the contractType property value. Type of contract. Possible values are:  SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table below.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContractType() {
        return this._contractType;
    }
    /**
     * Gets the customerId property value. The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the customer tenant's organization resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerId() {
        return this._customerId;
    }
    /**
     * Gets the defaultDomainName property value. A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's default domain name changes.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainName() {
        return this._defaultDomainName;
    }
    /**
     * Gets the displayName property value. A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's display name changes.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contractType", (n) -> { this.setContractType(n.getStringValue()); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("contractType", this.getContractType());
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the contractType property value. Type of contract. Possible values are:  SyndicationPartner, BreadthPartner, ResellerPartner. See more in the table below.
     * @param value Value to set for the contractType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContractType(@javax.annotation.Nullable final String value) {
        this._contractType = value;
    }
    /**
     * Sets the customerId property value. The unique identifier for the customer tenant referenced by this partnership. Corresponds to the id property of the customer tenant's organization resource.
     * @param value Value to set for the customerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerId(@javax.annotation.Nullable final String value) {
        this._customerId = value;
    }
    /**
     * Sets the defaultDomainName property value. A copy of the customer tenant's default domain name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's default domain name changes.
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultDomainName(@javax.annotation.Nullable final String value) {
        this._defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. A copy of the customer tenant's display name. The copy is made when the partnership with the customer is established. It is not automatically updated if the customer tenant's display name changes.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}
