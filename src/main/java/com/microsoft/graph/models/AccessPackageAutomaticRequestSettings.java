package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
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
public class AccessPackageAutomaticRequestSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AccessPackageAutomaticRequestSettings and sets the default values.
     */
    public AccessPackageAutomaticRequestSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAutomaticRequestSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAutomaticRequestSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAutomaticRequestSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("gracePeriodBeforeAccessRemoval", (n) -> { this.setGracePeriodBeforeAccessRemoval(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeAccessWhenTargetLeavesAllowedTargets", (n) -> { this.setRemoveAccessWhenTargetLeavesAllowedTargets(n.getBooleanValue()); });
        deserializerMap.put("requestAccessForAllowedTargets", (n) -> { this.setRequestAccessForAllowedTargets(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodBeforeAccessRemoval property value. The duration for which access must be retained before the target's access is revoked once they leave the allowed target scope.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getGracePeriodBeforeAccessRemoval() {
        return this.backingStore.get("gracePeriodBeforeAccessRemoval");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the removeAccessWhenTargetLeavesAllowedTargets property value. Indicates whether automatic assignment must be removed for targets who move out of the allowed target scope.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRemoveAccessWhenTargetLeavesAllowedTargets() {
        return this.backingStore.get("removeAccessWhenTargetLeavesAllowedTargets");
    }
    /**
     * Gets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequestAccessForAllowedTargets() {
        return this.backingStore.get("requestAccessForAllowedTargets");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writePeriodAndDurationValue("gracePeriodBeforeAccessRemoval", this.getGracePeriodBeforeAccessRemoval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("removeAccessWhenTargetLeavesAllowedTargets", this.getRemoveAccessWhenTargetLeavesAllowedTargets());
        writer.writeBooleanValue("requestAccessForAllowedTargets", this.getRequestAccessForAllowedTargets());
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
     * Sets the gracePeriodBeforeAccessRemoval property value. The duration for which access must be retained before the target's access is revoked once they leave the allowed target scope.
     * @param value Value to set for the gracePeriodBeforeAccessRemoval property.
     */
    public void setGracePeriodBeforeAccessRemoval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("gracePeriodBeforeAccessRemoval", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the removeAccessWhenTargetLeavesAllowedTargets property value. Indicates whether automatic assignment must be removed for targets who move out of the allowed target scope.
     * @param value Value to set for the removeAccessWhenTargetLeavesAllowedTargets property.
     */
    public void setRemoveAccessWhenTargetLeavesAllowedTargets(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("removeAccessWhenTargetLeavesAllowedTargets", value);
    }
    /**
     * Sets the requestAccessForAllowedTargets property value. If set to true, automatic assignments will be created for targets in the allowed target scope.
     * @param value Value to set for the requestAccessForAllowedTargets property.
     */
    public void setRequestAccessForAllowedTargets(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requestAccessForAllowedTargets", value);
    }
}
