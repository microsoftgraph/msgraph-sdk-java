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
public class CloudPcLaunchDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcLaunchDetail} and sets the default values.
     */
    public CloudPcLaunchDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcLaunchDetail}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcLaunchDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcLaunchDetail();
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
     * Gets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcId() {
        return this.backingStore.get("cloudPcId");
    }
    /**
     * Gets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcLaunchUrl() {
        return this.backingStore.get("cloudPcLaunchUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("cloudPcLaunchUrl", (n) -> { this.setCloudPcLaunchUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("windows365SwitchCompatibilityFailureReasonType", (n) -> { this.setWindows365SwitchCompatibilityFailureReasonType(n.getEnumValue(Windows365SwitchCompatibilityFailureReasonType::forValue)); });
        deserializerMap.put("windows365SwitchCompatible", (n) -> { this.setWindows365SwitchCompatible(n.getBooleanValue()); });
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
     * Gets the windows365SwitchCompatibilityFailureReasonType property value. Indicates the reason the Cloud PC isn&apos;t compatible with Windows 365 Switch. Possible values are: osVersionNotSupported, hardwareNotSupported, unknownFutureValue. osVersionNotSupported indicates that the user needs to update their Cloud PC operating system version. hardwareNotSupported indicates that the Cloud PC needs more CPUs or RAM to support the functionality.
     * @return a {@link Windows365SwitchCompatibilityFailureReasonType}
     */
    @jakarta.annotation.Nullable
    public Windows365SwitchCompatibilityFailureReasonType getWindows365SwitchCompatibilityFailureReasonType() {
        return this.backingStore.get("windows365SwitchCompatibilityFailureReasonType");
    }
    /**
     * Gets the windows365SwitchCompatible property value. Indicates whether the Cloud PC supports switch functionality. If the value is true, it supports switch functionality; otherwise, false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWindows365SwitchCompatible() {
        return this.backingStore.get("windows365SwitchCompatible");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeStringValue("cloudPcLaunchUrl", this.getCloudPcLaunchUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("windows365SwitchCompatibilityFailureReasonType", this.getWindows365SwitchCompatibilityFailureReasonType());
        writer.writeBooleanValue("windows365SwitchCompatible", this.getWindows365SwitchCompatible());
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
     * Sets the cloudPcId property value. The unique identifier of the Cloud PC.
     * @param value Value to set for the cloudPcId property.
     */
    public void setCloudPcId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcId", value);
    }
    /**
     * Sets the cloudPcLaunchUrl property value. The connect URL of the Cloud PC.
     * @param value Value to set for the cloudPcLaunchUrl property.
     */
    public void setCloudPcLaunchUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcLaunchUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the windows365SwitchCompatibilityFailureReasonType property value. Indicates the reason the Cloud PC isn&apos;t compatible with Windows 365 Switch. Possible values are: osVersionNotSupported, hardwareNotSupported, unknownFutureValue. osVersionNotSupported indicates that the user needs to update their Cloud PC operating system version. hardwareNotSupported indicates that the Cloud PC needs more CPUs or RAM to support the functionality.
     * @param value Value to set for the windows365SwitchCompatibilityFailureReasonType property.
     */
    public void setWindows365SwitchCompatibilityFailureReasonType(@jakarta.annotation.Nullable final Windows365SwitchCompatibilityFailureReasonType value) {
        this.backingStore.set("windows365SwitchCompatibilityFailureReasonType", value);
    }
    /**
     * Sets the windows365SwitchCompatible property value. Indicates whether the Cloud PC supports switch functionality. If the value is true, it supports switch functionality; otherwise, false.
     * @param value Value to set for the windows365SwitchCompatible property.
     */
    public void setWindows365SwitchCompatible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windows365SwitchCompatible", value);
    }
}
