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
public class IdentifierUriConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdentifierUriConfiguration} and sets the default values.
     */
    public IdentifierUriConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentifierUriConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IdentifierUriConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentifierUriConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("nonDefaultUriAddition", (n) -> { this.setNonDefaultUriAddition(n.getObjectValue(IdentifierUriRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uriAdditionWithoutUniqueTenantIdentifier", (n) -> { this.setUriAdditionWithoutUniqueTenantIdentifier(n.getObjectValue(IdentifierUriRestriction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nonDefaultUriAddition property value. Block new identifier URIs for applications, unless they are the &apos;default&apos; URI of the format api://{appId} or api://{tenantId}/{appId}.
     * @return a {@link IdentifierUriRestriction}
     */
    @jakarta.annotation.Nullable
    public IdentifierUriRestriction getNonDefaultUriAddition() {
        return this.backingStore.get("nonDefaultUriAddition");
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
     * Gets the uriAdditionWithoutUniqueTenantIdentifier property value. Block new identifier URIs for applications, unless they contain a unique tenant identifier like the tenant ID, appId (client ID), or verified domain. For example, api://{tenantId}/string, api://{appId}/string, {scheme}://string/{tenantId}, {scheme}://string/{appId}, https://{verified-domain.com}/path, {scheme}://{subdomain}.{verified-domain.com}/path.
     * @return a {@link IdentifierUriRestriction}
     */
    @jakarta.annotation.Nullable
    public IdentifierUriRestriction getUriAdditionWithoutUniqueTenantIdentifier() {
        return this.backingStore.get("uriAdditionWithoutUniqueTenantIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("nonDefaultUriAddition", this.getNonDefaultUriAddition());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("uriAdditionWithoutUniqueTenantIdentifier", this.getUriAdditionWithoutUniqueTenantIdentifier());
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
     * Sets the nonDefaultUriAddition property value. Block new identifier URIs for applications, unless they are the &apos;default&apos; URI of the format api://{appId} or api://{tenantId}/{appId}.
     * @param value Value to set for the nonDefaultUriAddition property.
     */
    public void setNonDefaultUriAddition(@jakarta.annotation.Nullable final IdentifierUriRestriction value) {
        this.backingStore.set("nonDefaultUriAddition", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the uriAdditionWithoutUniqueTenantIdentifier property value. Block new identifier URIs for applications, unless they contain a unique tenant identifier like the tenant ID, appId (client ID), or verified domain. For example, api://{tenantId}/string, api://{appId}/string, {scheme}://string/{tenantId}, {scheme}://string/{appId}, https://{verified-domain.com}/path, {scheme}://{subdomain}.{verified-domain.com}/path.
     * @param value Value to set for the uriAdditionWithoutUniqueTenantIdentifier property.
     */
    public void setUriAdditionWithoutUniqueTenantIdentifier(@jakarta.annotation.Nullable final IdentifierUriRestriction value) {
        this.backingStore.set("uriAdditionWithoutUniqueTenantIdentifier", value);
    }
}
