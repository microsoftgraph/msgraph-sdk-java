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
public class RiskPreventionContainer implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RiskPreventionContainer} and sets the default values.
     */
    public RiskPreventionContainer() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RiskPreventionContainer}
     */
    @jakarta.annotation.Nonnull
    public static RiskPreventionContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskPreventionContainer();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("fraudProtectionProviders", (n) -> { this.setFraudProtectionProviders(n.getCollectionOfObjectValues(FraudProtectionProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webApplicationFirewallProviders", (n) -> { this.setWebApplicationFirewallProviders(n.getCollectionOfObjectValues(WebApplicationFirewallProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("webApplicationFirewallVerifications", (n) -> { this.setWebApplicationFirewallVerifications(n.getCollectionOfObjectValues(WebApplicationFirewallVerificationModel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fraudProtectionProviders property value. Represents entry point for fraud protection provider configurations for Microsoft Entra External ID tenants.
     * @return a {@link java.util.List<FraudProtectionProvider>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FraudProtectionProvider> getFraudProtectionProviders() {
        return this.backingStore.get("fraudProtectionProviders");
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
     * Gets the webApplicationFirewallProviders property value. Collection of WAF provider configurations registered in the External ID tenant.
     * @return a {@link java.util.List<WebApplicationFirewallProvider>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebApplicationFirewallProvider> getWebApplicationFirewallProviders() {
        return this.backingStore.get("webApplicationFirewallProviders");
    }
    /**
     * Gets the webApplicationFirewallVerifications property value. Collection of verification operations performed for domains or hosts with WAF providers registered in the External ID tenant.
     * @return a {@link java.util.List<WebApplicationFirewallVerificationModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebApplicationFirewallVerificationModel> getWebApplicationFirewallVerifications() {
        return this.backingStore.get("webApplicationFirewallVerifications");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("fraudProtectionProviders", this.getFraudProtectionProviders());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("webApplicationFirewallProviders", this.getWebApplicationFirewallProviders());
        writer.writeCollectionOfObjectValues("webApplicationFirewallVerifications", this.getWebApplicationFirewallVerifications());
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
     * Sets the fraudProtectionProviders property value. Represents entry point for fraud protection provider configurations for Microsoft Entra External ID tenants.
     * @param value Value to set for the fraudProtectionProviders property.
     */
    public void setFraudProtectionProviders(@jakarta.annotation.Nullable final java.util.List<FraudProtectionProvider> value) {
        this.backingStore.set("fraudProtectionProviders", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the webApplicationFirewallProviders property value. Collection of WAF provider configurations registered in the External ID tenant.
     * @param value Value to set for the webApplicationFirewallProviders property.
     */
    public void setWebApplicationFirewallProviders(@jakarta.annotation.Nullable final java.util.List<WebApplicationFirewallProvider> value) {
        this.backingStore.set("webApplicationFirewallProviders", value);
    }
    /**
     * Sets the webApplicationFirewallVerifications property value. Collection of verification operations performed for domains or hosts with WAF providers registered in the External ID tenant.
     * @param value Value to set for the webApplicationFirewallVerifications property.
     */
    public void setWebApplicationFirewallVerifications(@jakarta.annotation.Nullable final java.util.List<WebApplicationFirewallVerificationModel> value) {
        this.backingStore.set("webApplicationFirewallVerifications", value);
    }
}
