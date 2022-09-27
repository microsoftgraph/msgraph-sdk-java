package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicy extends PolicyBase implements Parsable {
    /** Defines the default configuration for how your organization interacts with external Azure Active Directory organizations. */
    private CrossTenantAccessPolicyConfigurationDefault _default_escaped;
    /** Defines partner-specific configurations for external Azure Active Directory organizations. */
    private java.util.List<CrossTenantAccessPolicyConfigurationPartner> _partners;
    /**
     * Instantiates a new CrossTenantAccessPolicy and sets the default values.
     * @return a void
     */
    public CrossTenantAccessPolicy() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessPolicy
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicy();
    }
    /**
     * Gets the default property value. Defines the default configuration for how your organization interacts with external Azure Active Directory organizations.
     * @return a crossTenantAccessPolicyConfigurationDefault
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault getDefault() {
        return this._default_escaped;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CrossTenantAccessPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("default", (n) -> { currentObject.setDefault(n.getObjectValue(CrossTenantAccessPolicyConfigurationDefault::createFromDiscriminatorValue)); });
            this.put("partners", (n) -> { currentObject.setPartners(n.getCollectionOfObjectValues(CrossTenantAccessPolicyConfigurationPartner::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the partners property value. Defines partner-specific configurations for external Azure Active Directory organizations.
     * @return a crossTenantAccessPolicyConfigurationPartner
     */
    @javax.annotation.Nullable
    public java.util.List<CrossTenantAccessPolicyConfigurationPartner> getPartners() {
        return this._partners;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("default", this.getDefault());
        writer.writeCollectionOfObjectValues("partners", this.getPartners());
    }
    /**
     * Sets the default property value. Defines the default configuration for how your organization interacts with external Azure Active Directory organizations.
     * @param value Value to set for the default property.
     * @return a void
     */
    public void setDefault(@javax.annotation.Nullable final CrossTenantAccessPolicyConfigurationDefault value) {
        this._default_escaped = value;
    }
    /**
     * Sets the partners property value. Defines partner-specific configurations for external Azure Active Directory organizations.
     * @param value Value to set for the partners property.
     * @return a void
     */
    public void setPartners(@javax.annotation.Nullable final java.util.List<CrossTenantAccessPolicyConfigurationPartner> value) {
        this._partners = value;
    }
}
