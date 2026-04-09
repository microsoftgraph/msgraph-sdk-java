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
public class OidcAddressInboundClaims implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OidcAddressInboundClaims} and sets the default values.
     */
    public OidcAddressInboundClaims() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OidcAddressInboundClaims}
     */
    @jakarta.annotation.Nonnull
    public static OidcAddressInboundClaims createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OidcAddressInboundClaims();
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
     * Gets the country property value. The country property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.backingStore.get("country");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("locality", (n) -> { this.setLocality(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postal_code", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("street_address", (n) -> { this.setStreetAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the locality property value. The locality property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocality() {
        return this.backingStore.get("locality");
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
     * Gets the postal_code property value. The postal_code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.backingStore.get("postalCode");
    }
    /**
     * Gets the region property value. The region property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Gets the street_address property value. The street_address property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreetAddress() {
        return this.backingStore.get("streetAddress");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("locality", this.getLocality());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("postal_code", this.getPostalCode());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("street_address", this.getStreetAddress());
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
     * Sets the country property value. The country property
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("country", value);
    }
    /**
     * Sets the locality property value. The locality property
     * @param value Value to set for the locality property.
     */
    public void setLocality(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locality", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the postal_code property value. The postal_code property
     * @param value Value to set for the postal_code property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("postalCode", value);
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("region", value);
    }
    /**
     * Sets the street_address property value. The street_address property
     * @param value Value to set for the street_address property.
     */
    public void setStreetAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("streetAddress", value);
    }
}
