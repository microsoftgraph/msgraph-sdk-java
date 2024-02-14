package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccessPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new {@link CrossTenantAccessPolicy} and sets the default values.
     */
    public CrossTenantAccessPolicy() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantAccessPolicy}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicy();
    }
    /**
     * Gets the allowedCloudEndpoints property value. Used to specify which Microsoft clouds an organization would like to collaborate with. By default, this value is empty. Supported values for this field are: microsoftonline.com, microsoftonline.us, and partner.microsoftonline.cn.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedCloudEndpoints() {
        return this.backingStore.get("allowedCloudEndpoints");
    }
    /**
     * Gets the default property value. Defines the default configuration for how your organization interacts with external Microsoft Entra organizations.
     * @return a {@link CrossTenantAccessPolicyConfigurationDefault}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyConfigurationDefault getDefault() {
        return this.backingStore.get("default");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedCloudEndpoints", (n) -> { this.setAllowedCloudEndpoints(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("default", (n) -> { this.setDefault(n.getObjectValue(CrossTenantAccessPolicyConfigurationDefault::createFromDiscriminatorValue)); });
        deserializerMap.put("partners", (n) -> { this.setPartners(n.getCollectionOfObjectValues(CrossTenantAccessPolicyConfigurationPartner::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the partners property value. Defines partner-specific configurations for external Microsoft Entra organizations.
     * @return a {@link java.util.List<CrossTenantAccessPolicyConfigurationPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CrossTenantAccessPolicyConfigurationPartner> getPartners() {
        return this.backingStore.get("partners");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedCloudEndpoints", this.getAllowedCloudEndpoints());
        writer.writeObjectValue("default", this.getDefault());
        writer.writeCollectionOfObjectValues("partners", this.getPartners());
    }
    /**
     * Sets the allowedCloudEndpoints property value. Used to specify which Microsoft clouds an organization would like to collaborate with. By default, this value is empty. Supported values for this field are: microsoftonline.com, microsoftonline.us, and partner.microsoftonline.cn.
     * @param value Value to set for the allowedCloudEndpoints property.
     */
    public void setAllowedCloudEndpoints(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedCloudEndpoints", value);
    }
    /**
     * Sets the default property value. Defines the default configuration for how your organization interacts with external Microsoft Entra organizations.
     * @param value Value to set for the default property.
     */
    public void setDefault(@jakarta.annotation.Nullable final CrossTenantAccessPolicyConfigurationDefault value) {
        this.backingStore.set("default", value);
    }
    /**
     * Sets the partners property value. Defines partner-specific configurations for external Microsoft Entra organizations.
     * @param value Value to set for the partners property.
     */
    public void setPartners(@jakarta.annotation.Nullable final java.util.List<CrossTenantAccessPolicyConfigurationPartner> value) {
        this.backingStore.set("partners", value);
    }
}
