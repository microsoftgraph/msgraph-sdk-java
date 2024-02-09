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
public class OnPremisesExtensionAttributes implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OnPremisesExtensionAttributes} and sets the default values.
     */
    public OnPremisesExtensionAttributes() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesExtensionAttributes}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesExtensionAttributes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesExtensionAttributes();
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
     * Gets the extensionAttribute1 property value. First customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute1() {
        return this.backingStore.get("extensionAttribute1");
    }
    /**
     * Gets the extensionAttribute10 property value. Tenth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute10() {
        return this.backingStore.get("extensionAttribute10");
    }
    /**
     * Gets the extensionAttribute11 property value. Eleventh customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute11() {
        return this.backingStore.get("extensionAttribute11");
    }
    /**
     * Gets the extensionAttribute12 property value. Twelfth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute12() {
        return this.backingStore.get("extensionAttribute12");
    }
    /**
     * Gets the extensionAttribute13 property value. Thirteenth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute13() {
        return this.backingStore.get("extensionAttribute13");
    }
    /**
     * Gets the extensionAttribute14 property value. Fourteenth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute14() {
        return this.backingStore.get("extensionAttribute14");
    }
    /**
     * Gets the extensionAttribute15 property value. Fifteenth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute15() {
        return this.backingStore.get("extensionAttribute15");
    }
    /**
     * Gets the extensionAttribute2 property value. Second customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute2() {
        return this.backingStore.get("extensionAttribute2");
    }
    /**
     * Gets the extensionAttribute3 property value. Third customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute3() {
        return this.backingStore.get("extensionAttribute3");
    }
    /**
     * Gets the extensionAttribute4 property value. Fourth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute4() {
        return this.backingStore.get("extensionAttribute4");
    }
    /**
     * Gets the extensionAttribute5 property value. Fifth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute5() {
        return this.backingStore.get("extensionAttribute5");
    }
    /**
     * Gets the extensionAttribute6 property value. Sixth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute6() {
        return this.backingStore.get("extensionAttribute6");
    }
    /**
     * Gets the extensionAttribute7 property value. Seventh customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute7() {
        return this.backingStore.get("extensionAttribute7");
    }
    /**
     * Gets the extensionAttribute8 property value. Eighth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute8() {
        return this.backingStore.get("extensionAttribute8");
    }
    /**
     * Gets the extensionAttribute9 property value. Ninth customizable extension attribute.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExtensionAttribute9() {
        return this.backingStore.get("extensionAttribute9");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("extensionAttribute1", (n) -> { this.setExtensionAttribute1(n.getStringValue()); });
        deserializerMap.put("extensionAttribute10", (n) -> { this.setExtensionAttribute10(n.getStringValue()); });
        deserializerMap.put("extensionAttribute11", (n) -> { this.setExtensionAttribute11(n.getStringValue()); });
        deserializerMap.put("extensionAttribute12", (n) -> { this.setExtensionAttribute12(n.getStringValue()); });
        deserializerMap.put("extensionAttribute13", (n) -> { this.setExtensionAttribute13(n.getStringValue()); });
        deserializerMap.put("extensionAttribute14", (n) -> { this.setExtensionAttribute14(n.getStringValue()); });
        deserializerMap.put("extensionAttribute15", (n) -> { this.setExtensionAttribute15(n.getStringValue()); });
        deserializerMap.put("extensionAttribute2", (n) -> { this.setExtensionAttribute2(n.getStringValue()); });
        deserializerMap.put("extensionAttribute3", (n) -> { this.setExtensionAttribute3(n.getStringValue()); });
        deserializerMap.put("extensionAttribute4", (n) -> { this.setExtensionAttribute4(n.getStringValue()); });
        deserializerMap.put("extensionAttribute5", (n) -> { this.setExtensionAttribute5(n.getStringValue()); });
        deserializerMap.put("extensionAttribute6", (n) -> { this.setExtensionAttribute6(n.getStringValue()); });
        deserializerMap.put("extensionAttribute7", (n) -> { this.setExtensionAttribute7(n.getStringValue()); });
        deserializerMap.put("extensionAttribute8", (n) -> { this.setExtensionAttribute8(n.getStringValue()); });
        deserializerMap.put("extensionAttribute9", (n) -> { this.setExtensionAttribute9(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("extensionAttribute1", this.getExtensionAttribute1());
        writer.writeStringValue("extensionAttribute10", this.getExtensionAttribute10());
        writer.writeStringValue("extensionAttribute11", this.getExtensionAttribute11());
        writer.writeStringValue("extensionAttribute12", this.getExtensionAttribute12());
        writer.writeStringValue("extensionAttribute13", this.getExtensionAttribute13());
        writer.writeStringValue("extensionAttribute14", this.getExtensionAttribute14());
        writer.writeStringValue("extensionAttribute15", this.getExtensionAttribute15());
        writer.writeStringValue("extensionAttribute2", this.getExtensionAttribute2());
        writer.writeStringValue("extensionAttribute3", this.getExtensionAttribute3());
        writer.writeStringValue("extensionAttribute4", this.getExtensionAttribute4());
        writer.writeStringValue("extensionAttribute5", this.getExtensionAttribute5());
        writer.writeStringValue("extensionAttribute6", this.getExtensionAttribute6());
        writer.writeStringValue("extensionAttribute7", this.getExtensionAttribute7());
        writer.writeStringValue("extensionAttribute8", this.getExtensionAttribute8());
        writer.writeStringValue("extensionAttribute9", this.getExtensionAttribute9());
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
     * Sets the extensionAttribute1 property value. First customizable extension attribute.
     * @param value Value to set for the extensionAttribute1 property.
     */
    public void setExtensionAttribute1(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute1", value);
    }
    /**
     * Sets the extensionAttribute10 property value. Tenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute10 property.
     */
    public void setExtensionAttribute10(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute10", value);
    }
    /**
     * Sets the extensionAttribute11 property value. Eleventh customizable extension attribute.
     * @param value Value to set for the extensionAttribute11 property.
     */
    public void setExtensionAttribute11(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute11", value);
    }
    /**
     * Sets the extensionAttribute12 property value. Twelfth customizable extension attribute.
     * @param value Value to set for the extensionAttribute12 property.
     */
    public void setExtensionAttribute12(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute12", value);
    }
    /**
     * Sets the extensionAttribute13 property value. Thirteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute13 property.
     */
    public void setExtensionAttribute13(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute13", value);
    }
    /**
     * Sets the extensionAttribute14 property value. Fourteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute14 property.
     */
    public void setExtensionAttribute14(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute14", value);
    }
    /**
     * Sets the extensionAttribute15 property value. Fifteenth customizable extension attribute.
     * @param value Value to set for the extensionAttribute15 property.
     */
    public void setExtensionAttribute15(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute15", value);
    }
    /**
     * Sets the extensionAttribute2 property value. Second customizable extension attribute.
     * @param value Value to set for the extensionAttribute2 property.
     */
    public void setExtensionAttribute2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute2", value);
    }
    /**
     * Sets the extensionAttribute3 property value. Third customizable extension attribute.
     * @param value Value to set for the extensionAttribute3 property.
     */
    public void setExtensionAttribute3(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute3", value);
    }
    /**
     * Sets the extensionAttribute4 property value. Fourth customizable extension attribute.
     * @param value Value to set for the extensionAttribute4 property.
     */
    public void setExtensionAttribute4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute4", value);
    }
    /**
     * Sets the extensionAttribute5 property value. Fifth customizable extension attribute.
     * @param value Value to set for the extensionAttribute5 property.
     */
    public void setExtensionAttribute5(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute5", value);
    }
    /**
     * Sets the extensionAttribute6 property value. Sixth customizable extension attribute.
     * @param value Value to set for the extensionAttribute6 property.
     */
    public void setExtensionAttribute6(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute6", value);
    }
    /**
     * Sets the extensionAttribute7 property value. Seventh customizable extension attribute.
     * @param value Value to set for the extensionAttribute7 property.
     */
    public void setExtensionAttribute7(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute7", value);
    }
    /**
     * Sets the extensionAttribute8 property value. Eighth customizable extension attribute.
     * @param value Value to set for the extensionAttribute8 property.
     */
    public void setExtensionAttribute8(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute8", value);
    }
    /**
     * Sets the extensionAttribute9 property value. Ninth customizable extension attribute.
     * @param value Value to set for the extensionAttribute9 property.
     */
    public void setExtensionAttribute9(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionAttribute9", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
