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
public class LoginPageLayoutConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new LoginPageLayoutConfiguration and sets the default values.
     */
    public LoginPageLayoutConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LoginPageLayoutConfiguration
     */
    @jakarta.annotation.Nonnull
    public static LoginPageLayoutConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginPageLayoutConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isFooterShown", (n) -> { this.setIsFooterShown(n.getBooleanValue()); });
        deserializerMap.put("isHeaderShown", (n) -> { this.setIsHeaderShown(n.getBooleanValue()); });
        deserializerMap.put("layoutTemplateType", (n) -> { this.setLayoutTemplateType(n.getEnumValue(LayoutTemplateType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFooterShown property value. Option to show the footer on the sign-in page.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFooterShown() {
        return this.BackingStore.get("isFooterShown");
    }
    /**
     * Gets the isHeaderShown property value. Option to show the header on the sign-in page.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHeaderShown() {
        return this.BackingStore.get("isHeaderShown");
    }
    /**
     * Gets the layoutTemplateType property value. Represents the layout template to be displayed on the login page for a tenant. The possible values are  default - Represents the default Microsoft layout with a centered lightbox.  verticalSplit - Represents a layout with a background on the left side and a full-height lightbox to the right.  unknownFutureValue - Evolvable enumeration sentinel value. Don't use.
     * @return a LayoutTemplateType
     */
    @jakarta.annotation.Nullable
    public LayoutTemplateType getLayoutTemplateType() {
        return this.BackingStore.get("layoutTemplateType");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isFooterShown", this.getIsFooterShown());
        writer.writeBooleanValue("isHeaderShown", this.getIsHeaderShown());
        writer.writeEnumValue("layoutTemplateType", this.getLayoutTemplateType());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isFooterShown property value. Option to show the footer on the sign-in page.
     * @param value Value to set for the isFooterShown property.
     */
    public void setIsFooterShown(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isFooterShown", value);
    }
    /**
     * Sets the isHeaderShown property value. Option to show the header on the sign-in page.
     * @param value Value to set for the isHeaderShown property.
     */
    public void setIsHeaderShown(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isHeaderShown", value);
    }
    /**
     * Sets the layoutTemplateType property value. Represents the layout template to be displayed on the login page for a tenant. The possible values are  default - Represents the default Microsoft layout with a centered lightbox.  verticalSplit - Represents a layout with a background on the left side and a full-height lightbox to the right.  unknownFutureValue - Evolvable enumeration sentinel value. Don't use.
     * @param value Value to set for the layoutTemplateType property.
     */
    public void setLayoutTemplateType(@jakarta.annotation.Nullable final LayoutTemplateType value) {
        this.BackingStore.set("layoutTemplateType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
