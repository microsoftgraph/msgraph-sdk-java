package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationBehaviors implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AuthenticationBehaviors} and sets the default values.
     */
    public AuthenticationBehaviors() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationBehaviors}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationBehaviors createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationBehaviors();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the blockAzureADGraphAccess property value. If false, allows the app to have extended access to Azure AD Graph until August 31, 2025 when Azure AD Graph is fully retired. For more information on Azure AD retirement updates, see June 2024 update on Azure AD Graph API retirement.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockAzureADGraphAccess() {
        return this.backingStore.get("blockAzureADGraphAccess");
    }
    /**
     * Gets the coopEnforcement property value. Indicates whether Cross-Origin-Opener-Policy (COOP) headers are enforced on browser-based authentication responses for the application. Set to true to enable enforcement, false to temporarily suppress enforcement, or null to use the service default. For how-to guidance, see Control Cross-Origin-Opener-Policy enforcement.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCoopEnforcement() {
        return this.backingStore.get("coopEnforcement");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("blockAzureADGraphAccess", (n) -> { this.setBlockAzureADGraphAccess(n.getBooleanValue()); });
        deserializerMap.put("coopEnforcement", (n) -> { this.setCoopEnforcement(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeUnverifiedEmailClaim", (n) -> { this.setRemoveUnverifiedEmailClaim(n.getBooleanValue()); });
        deserializerMap.put("requireClientServicePrincipal", (n) -> { this.setRequireClientServicePrincipal(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the removeUnverifiedEmailClaim property value. If true, removes the email claim from tokens sent to an application when the email address&apos;s domain can&apos;t be verified.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoveUnverifiedEmailClaim() {
        return this.backingStore.get("removeUnverifiedEmailClaim");
    }
    /**
     * Gets the requireClientServicePrincipal property value. If true, requires multitenant applications to have a service principal in the resource tenant as part of authorization checks before they&apos;re granted access tokens. This property is only modifiable for multitenant resource applications that rely on access from clients without a service principal and had this behavior as set to false by Microsoft. Tenant administrators should respond to security advisories sent through Azure Health Service events and the Microsoft 365 message center.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireClientServicePrincipal() {
        return this.backingStore.get("requireClientServicePrincipal");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockAzureADGraphAccess", this.getBlockAzureADGraphAccess());
        writer.writeBooleanValue("coopEnforcement", this.getCoopEnforcement());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("removeUnverifiedEmailClaim", this.getRemoveUnverifiedEmailClaim());
        writer.writeBooleanValue("requireClientServicePrincipal", this.getRequireClientServicePrincipal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the blockAzureADGraphAccess property value. If false, allows the app to have extended access to Azure AD Graph until August 31, 2025 when Azure AD Graph is fully retired. For more information on Azure AD retirement updates, see June 2024 update on Azure AD Graph API retirement.
     * @param value Value to set for the blockAzureADGraphAccess property.
     */
    public void setBlockAzureADGraphAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockAzureADGraphAccess", value);
    }
    /**
     * Sets the coopEnforcement property value. Indicates whether Cross-Origin-Opener-Policy (COOP) headers are enforced on browser-based authentication responses for the application. Set to true to enable enforcement, false to temporarily suppress enforcement, or null to use the service default. For how-to guidance, see Control Cross-Origin-Opener-Policy enforcement.
     * @param value Value to set for the coopEnforcement property.
     */
    public void setCoopEnforcement(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("coopEnforcement", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the removeUnverifiedEmailClaim property value. If true, removes the email claim from tokens sent to an application when the email address&apos;s domain can&apos;t be verified.
     * @param value Value to set for the removeUnverifiedEmailClaim property.
     */
    public void setRemoveUnverifiedEmailClaim(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("removeUnverifiedEmailClaim", value);
    }
    /**
     * Sets the requireClientServicePrincipal property value. If true, requires multitenant applications to have a service principal in the resource tenant as part of authorization checks before they&apos;re granted access tokens. This property is only modifiable for multitenant resource applications that rely on access from clients without a service principal and had this behavior as set to false by Microsoft. Tenant administrators should respond to security advisories sent through Azure Health Service events and the Microsoft 365 message center.
     * @param value Value to set for the requireClientServicePrincipal property.
     */
    public void setRequireClientServicePrincipal(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireClientServicePrincipal", value);
    }
}
