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
public class AppsInstallationOptionsForMac implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppsInstallationOptionsForMac} and sets the default values.
     */
    public AppsInstallationOptionsForMac() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppsInstallationOptionsForMac}
     */
    @jakarta.annotation.Nonnull
    public static AppsInstallationOptionsForMac createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppsInstallationOptionsForMac();
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
        deserializerMap.put("isMicrosoft365AppsEnabled", (n) -> { this.setIsMicrosoft365AppsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSkypeForBusinessEnabled", (n) -> { this.setIsSkypeForBusinessEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMicrosoft365AppsEnabled property value. Specifies whether users can install Microsoft 365 apps on their MAC devices. The default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMicrosoft365AppsEnabled() {
        return this.backingStore.get("isMicrosoft365AppsEnabled");
    }
    /**
     * Gets the isSkypeForBusinessEnabled property value. Specifies whether users can install Skype for Business on their MAC devices running OS X El Capitan 10.11 or later. The default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSkypeForBusinessEnabled() {
        return this.backingStore.get("isSkypeForBusinessEnabled");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isMicrosoft365AppsEnabled", this.getIsMicrosoft365AppsEnabled());
        writer.writeBooleanValue("isSkypeForBusinessEnabled", this.getIsSkypeForBusinessEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isMicrosoft365AppsEnabled property value. Specifies whether users can install Microsoft 365 apps on their MAC devices. The default value is true.
     * @param value Value to set for the isMicrosoft365AppsEnabled property.
     */
    public void setIsMicrosoft365AppsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMicrosoft365AppsEnabled", value);
    }
    /**
     * Sets the isSkypeForBusinessEnabled property value. Specifies whether users can install Skype for Business on their MAC devices running OS X El Capitan 10.11 or later. The default value is true.
     * @param value Value to set for the isSkypeForBusinessEnabled property.
     */
    public void setIsSkypeForBusinessEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSkypeForBusinessEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
