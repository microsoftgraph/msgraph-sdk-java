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
public class InvitationRedemptionIdentityProviderConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link InvitationRedemptionIdentityProviderConfiguration} and sets the default values.
     */
    public InvitationRedemptionIdentityProviderConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InvitationRedemptionIdentityProviderConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static InvitationRedemptionIdentityProviderConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.defaultInvitationRedemptionIdentityProviderConfiguration": return new DefaultInvitationRedemptionIdentityProviderConfiguration();
            }
        }
        return new InvitationRedemptionIdentityProviderConfiguration();
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
     * Gets the fallbackIdentityProvider property value. The fallback identity provider to be used in case no primary identity provider can be used for guest invitation redemption. The possible values are: defaultConfiguredIdp, emailOneTimePasscode, or microsoftAccount.
     * @return a {@link B2bIdentityProvidersType}
     */
    @jakarta.annotation.Nullable
    public B2bIdentityProvidersType getFallbackIdentityProvider() {
        return this.backingStore.get("fallbackIdentityProvider");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fallbackIdentityProvider", (n) -> { this.setFallbackIdentityProvider(n.getEnumValue(B2bIdentityProvidersType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryIdentityProviderPrecedenceOrder", (n) -> { this.setPrimaryIdentityProviderPrecedenceOrder(n.getCollectionOfEnumValues(B2bIdentityProvidersType::forValue)); });
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
     * Gets the primaryIdentityProviderPrecedenceOrder property value. Collection of identity providers in priority order of preference to be used for guest invitation redemption. The possible values are: azureActiveDirectory, externalFederation, or socialIdentityProviders.
     * @return a {@link java.util.List<B2bIdentityProvidersType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<B2bIdentityProvidersType> getPrimaryIdentityProviderPrecedenceOrder() {
        return this.backingStore.get("primaryIdentityProviderPrecedenceOrder");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("fallbackIdentityProvider", this.getFallbackIdentityProvider());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfEnumValues("primaryIdentityProviderPrecedenceOrder", this.getPrimaryIdentityProviderPrecedenceOrder());
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
     * Sets the fallbackIdentityProvider property value. The fallback identity provider to be used in case no primary identity provider can be used for guest invitation redemption. The possible values are: defaultConfiguredIdp, emailOneTimePasscode, or microsoftAccount.
     * @param value Value to set for the fallbackIdentityProvider property.
     */
    public void setFallbackIdentityProvider(@jakarta.annotation.Nullable final B2bIdentityProvidersType value) {
        this.backingStore.set("fallbackIdentityProvider", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryIdentityProviderPrecedenceOrder property value. Collection of identity providers in priority order of preference to be used for guest invitation redemption. The possible values are: azureActiveDirectory, externalFederation, or socialIdentityProviders.
     * @param value Value to set for the primaryIdentityProviderPrecedenceOrder property.
     */
    public void setPrimaryIdentityProviderPrecedenceOrder(@jakarta.annotation.Nullable final java.util.List<B2bIdentityProvidersType> value) {
        this.backingStore.set("primaryIdentityProviderPrecedenceOrder", value);
    }
}
