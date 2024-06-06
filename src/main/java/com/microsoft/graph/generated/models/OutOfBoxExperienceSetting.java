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
/**
 * The Windows Autopilot Deployment Profile settings used by the device for the out-of-box experience. Supports: $select, $top, $skip. $Search, $orderBy and $filter are not supported.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutOfBoxExperienceSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OutOfBoxExperienceSetting} and sets the default values.
     */
    public OutOfBoxExperienceSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutOfBoxExperienceSetting}
     */
    @jakarta.annotation.Nonnull
    public static OutOfBoxExperienceSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutOfBoxExperienceSetting();
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
     * Gets the deviceUsageType property value. The deviceUsageType property
     * @return a {@link WindowsDeviceUsageType}
     */
    @jakarta.annotation.Nullable
    public WindowsDeviceUsageType getDeviceUsageType() {
        return this.backingStore.get("deviceUsageType");
    }
    /**
     * Gets the escapeLinkHidden property value. When TRUE, the link that allows user to start over with a different account on company sign-in is hidden. When false, the link that allows user to start over with a different account on company sign-in is available. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEscapeLinkHidden() {
        return this.backingStore.get("escapeLinkHidden");
    }
    /**
     * Gets the eulaHidden property value. When TRUE, EULA is hidden to the end user during OOBE. When FALSE, EULA is shown to the end user during OOBE. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEulaHidden() {
        return this.backingStore.get("eulaHidden");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("deviceUsageType", (n) -> { this.setDeviceUsageType(n.getEnumValue(WindowsDeviceUsageType::forValue)); });
        deserializerMap.put("escapeLinkHidden", (n) -> { this.setEscapeLinkHidden(n.getBooleanValue()); });
        deserializerMap.put("eulaHidden", (n) -> { this.setEulaHidden(n.getBooleanValue()); });
        deserializerMap.put("keyboardSelectionPageSkipped", (n) -> { this.setKeyboardSelectionPageSkipped(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privacySettingsHidden", (n) -> { this.setPrivacySettingsHidden(n.getBooleanValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(WindowsUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keyboardSelectionPageSkipped property value. When TRUE, the keyboard selection page is hidden to the end user during OOBE if Language and Region are set. When FALSE, the keyboard selection page is skipped during OOBE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardSelectionPageSkipped() {
        return this.backingStore.get("keyboardSelectionPageSkipped");
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
     * Gets the privacySettingsHidden property value. When TRUE, privacy settings is hidden to the end user during OOBE. When FALSE, privacy settings is shown to the end user during OOBE. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacySettingsHidden() {
        return this.backingStore.get("privacySettingsHidden");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link WindowsUserType}
     */
    @jakarta.annotation.Nullable
    public WindowsUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deviceUsageType", this.getDeviceUsageType());
        writer.writeBooleanValue("escapeLinkHidden", this.getEscapeLinkHidden());
        writer.writeBooleanValue("eulaHidden", this.getEulaHidden());
        writer.writeBooleanValue("keyboardSelectionPageSkipped", this.getKeyboardSelectionPageSkipped());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("privacySettingsHidden", this.getPrivacySettingsHidden());
        writer.writeEnumValue("userType", this.getUserType());
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
     * Sets the deviceUsageType property value. The deviceUsageType property
     * @param value Value to set for the deviceUsageType property.
     */
    public void setDeviceUsageType(@jakarta.annotation.Nullable final WindowsDeviceUsageType value) {
        this.backingStore.set("deviceUsageType", value);
    }
    /**
     * Sets the escapeLinkHidden property value. When TRUE, the link that allows user to start over with a different account on company sign-in is hidden. When false, the link that allows user to start over with a different account on company sign-in is available. Default value is FALSE.
     * @param value Value to set for the escapeLinkHidden property.
     */
    public void setEscapeLinkHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("escapeLinkHidden", value);
    }
    /**
     * Sets the eulaHidden property value. When TRUE, EULA is hidden to the end user during OOBE. When FALSE, EULA is shown to the end user during OOBE. Default value is FALSE.
     * @param value Value to set for the eulaHidden property.
     */
    public void setEulaHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("eulaHidden", value);
    }
    /**
     * Sets the keyboardSelectionPageSkipped property value. When TRUE, the keyboard selection page is hidden to the end user during OOBE if Language and Region are set. When FALSE, the keyboard selection page is skipped during OOBE.
     * @param value Value to set for the keyboardSelectionPageSkipped property.
     */
    public void setKeyboardSelectionPageSkipped(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keyboardSelectionPageSkipped", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the privacySettingsHidden property value. When TRUE, privacy settings is hidden to the end user during OOBE. When FALSE, privacy settings is shown to the end user during OOBE. Default value is FALSE.
     * @param value Value to set for the privacySettingsHidden property.
     */
    public void setPrivacySettingsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacySettingsHidden", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final WindowsUserType value) {
        this.backingStore.set("userType", value);
    }
}
