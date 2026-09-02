package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalTokenBasedSapIagConnectionInfo extends ConnectionInfo implements Parsable {
    /**
     * Instantiates a new {@link ExternalTokenBasedSapIagConnectionInfo} and sets the default values.
     */
    public ExternalTokenBasedSapIagConnectionInfo() {
        super();
        this.setOdataType("#microsoft.graph.externalTokenBasedSapIagConnectionInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalTokenBasedSapIagConnectionInfo}
     */
    @jakarta.annotation.Nonnull
    public static ExternalTokenBasedSapIagConnectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalTokenBasedSapIagConnectionInfo();
    }
    /**
     * Gets the accessTokenUrl property value. The URL endpoint used to obtain access tokens for authentication with the SAP IAG system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessTokenUrl() {
        return this.backingStore.get("accessTokenUrl");
    }
    /**
     * Gets the clientId property value. The client identifier used for authentication with the SAP IAG system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTokenUrl", (n) -> { this.setAccessTokenUrl(n.getStringValue()); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("keyVaultName", (n) -> { this.setKeyVaultName(n.getStringValue()); });
        deserializerMap.put("resourceGroup", (n) -> { this.setResourceGroup(n.getStringValue()); });
        deserializerMap.put("secretName", (n) -> { this.setSecretName(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyVaultName property value. The name of the Azure Key Vault that stores the client secret for authentication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKeyVaultName() {
        return this.backingStore.get("keyVaultName");
    }
    /**
     * Gets the resourceGroup property value. The Azure resource group that contains the Key Vault.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroup() {
        return this.backingStore.get("resourceGroup");
    }
    /**
     * Gets the secretName property value. The name of the secret in Azure Key Vault that contains the client secret.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecretName() {
        return this.backingStore.get("secretName");
    }
    /**
     * Gets the subscriptionId property value. The Azure subscription ID that contains the Key Vault.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessTokenUrl", this.getAccessTokenUrl());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("keyVaultName", this.getKeyVaultName());
        writer.writeStringValue("resourceGroup", this.getResourceGroup());
        writer.writeStringValue("secretName", this.getSecretName());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
    }
    /**
     * Sets the accessTokenUrl property value. The URL endpoint used to obtain access tokens for authentication with the SAP IAG system.
     * @param value Value to set for the accessTokenUrl property.
     */
    public void setAccessTokenUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessTokenUrl", value);
    }
    /**
     * Sets the clientId property value. The client identifier used for authentication with the SAP IAG system.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the keyVaultName property value. The name of the Azure Key Vault that stores the client secret for authentication.
     * @param value Value to set for the keyVaultName property.
     */
    public void setKeyVaultName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keyVaultName", value);
    }
    /**
     * Sets the resourceGroup property value. The Azure resource group that contains the Key Vault.
     * @param value Value to set for the resourceGroup property.
     */
    public void setResourceGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroup", value);
    }
    /**
     * Sets the secretName property value. The name of the secret in Azure Key Vault that contains the client secret.
     * @param value Value to set for the secretName property.
     */
    public void setSecretName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secretName", value);
    }
    /**
     * Sets the subscriptionId property value. The Azure subscription ID that contains the Key Vault.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
}
