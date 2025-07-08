package com.microsoft.graph.security.datasecurityandgovernance.protectionscopes.compute;

import com.microsoft.graph.models.DeviceMetadata;
import com.microsoft.graph.models.IntegratedApplicationMetadata;
import com.microsoft.graph.models.PolicyLocation;
import com.microsoft.graph.models.PolicyPivotProperty;
import com.microsoft.graph.models.UserActivityTypes;
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
public class ComputePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ComputePostRequestBody} and sets the default values.
     */
    public ComputePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComputePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ComputePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComputePostRequestBody();
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
     * Gets the deviceMetadata property value. The deviceMetadata property
     * @return a {@link DeviceMetadata}
     */
    @jakarta.annotation.Nullable
    public DeviceMetadata getDeviceMetadata() {
        return this.backingStore.get("deviceMetadata");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activities", (n) -> { this.setActivities(n.getEnumSetValue(UserActivityTypes::forValue)); });
        deserializerMap.put("deviceMetadata", (n) -> { this.setDeviceMetadata(n.getObjectValue(DeviceMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("integratedAppMetadata", (n) -> { this.setIntegratedAppMetadata(n.getObjectValue(IntegratedApplicationMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("locations", (n) -> { this.setLocations(n.getCollectionOfObjectValues(PolicyLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("pivotOn", (n) -> { this.setPivotOn(n.getEnumValue(PolicyPivotProperty::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the integratedAppMetadata property value. The integratedAppMetadata property
     * @return a {@link IntegratedApplicationMetadata}
     */
    @jakarta.annotation.Nullable
    public IntegratedApplicationMetadata getIntegratedAppMetadata() {
        return this.backingStore.get("integratedAppMetadata");
    }
    /**
     * Gets the locations property value. The locations property
     * @return a {@link java.util.List<PolicyLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyLocation> getLocations() {
        return this.backingStore.get("locations");
    }
    /**
     * Gets the pivotOn property value. The pivotOn property
     * @return a {@link PolicyPivotProperty}
     */
    @jakarta.annotation.Nullable
    public PolicyPivotProperty getPivotOn() {
        return this.backingStore.get("pivotOn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("activities", this.getActivities());
        writer.writeObjectValue("deviceMetadata", this.getDeviceMetadata());
        writer.writeObjectValue("integratedAppMetadata", this.getIntegratedAppMetadata());
        writer.writeCollectionOfObjectValues("locations", this.getLocations());
        writer.writeEnumValue("pivotOn", this.getPivotOn());
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
     * Sets the deviceMetadata property value. The deviceMetadata property
     * @param value Value to set for the deviceMetadata property.
     */
    public void setDeviceMetadata(@jakarta.annotation.Nullable final DeviceMetadata value) {
        this.backingStore.set("deviceMetadata", value);
    }
    /**
     * Sets the integratedAppMetadata property value. The integratedAppMetadata property
     * @param value Value to set for the integratedAppMetadata property.
     */
    public void setIntegratedAppMetadata(@jakarta.annotation.Nullable final IntegratedApplicationMetadata value) {
        this.backingStore.set("integratedAppMetadata", value);
    }
    /**
     * Sets the locations property value. The locations property
     * @param value Value to set for the locations property.
     */
    public void setLocations(@jakarta.annotation.Nullable final java.util.List<PolicyLocation> value) {
        this.backingStore.set("locations", value);
    }
    /**
     * Sets the pivotOn property value. The pivotOn property
     * @param value Value to set for the pivotOn property.
     */
    public void setPivotOn(@jakarta.annotation.Nullable final PolicyPivotProperty value) {
        this.backingStore.set("pivotOn", value);
    }
}
