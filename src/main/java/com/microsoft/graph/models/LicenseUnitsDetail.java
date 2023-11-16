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
public class LicenseUnitsDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new LicenseUnitsDetail and sets the default values.
     */
    public LicenseUnitsDetail() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LicenseUnitsDetail
     */
    @jakarta.annotation.Nonnull
    public static LicenseUnitsDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseUnitsDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnabled() {
        return this.BackingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getIntegerValue()); });
        deserializerMap.put("lockedOut", (n) -> { this.setLockedOut(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("suspended", (n) -> { this.setSuspended(n.getIntegerValue()); });
        deserializerMap.put("warning", (n) -> { this.setWarning(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lockedOut property value. The number of units that are locked out because the customer canceled their subscription of the service SKU.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLockedOut() {
        return this.BackingStore.get("lockedOut");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been canceled. The units can't be assigned but can still be reactivated before they're deleted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuspended() {
        return this.BackingStore.get("suspended");
    }
    /**
     * Gets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it's canceled (moved to a suspended state).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWarning() {
        return this.BackingStore.get("warning");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("enabled", this.getEnabled());
        writer.writeIntegerValue("lockedOut", this.getLockedOut());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("suspended", this.getSuspended());
        writer.writeIntegerValue("warning", this.getWarning());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the enabled property value. The number of units that are enabled for the active subscription of the service SKU.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("enabled", value);
    }
    /**
     * Sets the lockedOut property value. The number of units that are locked out because the customer canceled their subscription of the service SKU.
     * @param value Value to set for the lockedOut property.
     */
    public void setLockedOut(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("lockedOut", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the suspended property value. The number of units that are suspended because the subscription of the service SKU has been canceled. The units can't be assigned but can still be reactivated before they're deleted.
     * @param value Value to set for the suspended property.
     */
    public void setSuspended(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("suspended", value);
    }
    /**
     * Sets the warning property value. The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has a grace period to renew their subscription before it's canceled (moved to a suspended state).
     * @param value Value to set for the warning property.
     */
    public void setWarning(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("warning", value);
    }
}
