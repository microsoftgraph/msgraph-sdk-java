package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyScopeBase implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PolicyScopeBase} and sets the default values.
     */
    public PolicyScopeBase() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyScopeBase}
     */
    @jakarta.annotation.Nonnull
    public static PolicyScopeBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.policyTenantScope": return new PolicyTenantScope();
                case "#microsoft.graph.policyUserScope": return new PolicyUserScope();
            }
        }
        return new PolicyScopeBase();
    }
    /**
     * Gets the activities property value. The activities property
     * @return a {@link EnumSet<UserActivityTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<UserActivityTypes> getActivities() {
        return this.backingStore.get("activities");
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
     * Gets the executionMode property value. The executionMode property
     * @return a {@link ExecutionMode}
     */
    @jakarta.annotation.Nullable
    public ExecutionMode getExecutionMode() {
        return this.backingStore.get("executionMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getEnumSetValue(UserActivityTypes::forValue)); });
        deserializerMap.put("executionMode", (n) -> { this.setExecutionMode(n.getEnumValue(ExecutionMode::forValue)); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(PolicyLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyActions", (n) -> { this.setPolicyActions(n.getCollectionOfObjectValues(DlpActionInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the locations property value. The locations (like domains or URLs) to be protected. Required.
     * @return a {@link java.util.List<PolicyLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyLocation> getLocations() {
        return this.backingStore.get("locations");
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
     * Gets the policyActions property value. The enforcement actions to take if the policy conditions are met within this scope. Required.
     * @return a {@link java.util.List<DlpActionInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DlpActionInfo> getPolicyActions() {
        return this.backingStore.get("policyActions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("activities", this.getActivities());
        writer.writeEnumValue("executionMode", this.getExecutionMode());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("policyActions", this.getPolicyActions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activities property value. The activities property
     * @param value Value to set for the activities property.
     */
    public void setActivities(@jakarta.annotation.Nullable final EnumSet<UserActivityTypes> value) {
        this.backingStore.set("activities", value);
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
     * Sets the executionMode property value. The executionMode property
     * @param value Value to set for the executionMode property.
     */
    public void setExecutionMode(@jakarta.annotation.Nullable final ExecutionMode value) {
        this.backingStore.set("executionMode", value);
    }
    /**
     * Sets the locations property value. The locations (like domains or URLs) to be protected. Required.
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<PolicyLocation> value) {
        this.backingStore.set("locations", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyActions property value. The enforcement actions to take if the policy conditions are met within this scope. Required.
     * @param value Value to set for the policyActions property.
     */
    public void setPolicyActions(@jakarta.annotation.Nullable final java.util.List<DlpActionInfo> value) {
        this.backingStore.set("policyActions", value);
    }
}
