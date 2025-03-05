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
public class AuthenticationAttributeCollectionInputConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AuthenticationAttributeCollectionInputConfiguration} and sets the default values.
     */
    public AuthenticationAttributeCollectionInputConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationAttributeCollectionInputConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationAttributeCollectionInputConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationAttributeCollectionInputConfiguration();
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
     * Gets the attribute property value. The built-in or custom attribute for which a value is being collected.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttribute() {
        return this.backingStore.get("attribute");
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
     * Gets the defaultValue property value. The default value of the attribute displayed to the end user. The capability to set the default value isn&apos;t available through the Microsoft Entra admin center.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * Gets the editable property value. Defines whether the attribute is editable by the end user.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEditable() {
        return this.backingStore.get("editable");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("attribute", (n) -> { this.setAttribute(n.getStringValue()); });
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("editable", (n) -> { this.setEditable(n.getBooleanValue()); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("inputType", (n) -> { this.setInputType(n.getEnumValue(AuthenticationAttributeCollectionInputType::forValue)); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(AuthenticationAttributeCollectionOptionConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        deserializerMap.put("validationRegEx", (n) -> { this.setValidationRegEx(n.getStringValue()); });
        deserializerMap.put("writeToDirectory", (n) -> { this.setWriteToDirectory(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. Defines whether the attribute is displayed to the end user. The capability to hide isn&apos;t available through the Microsoft Entra admin center.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.backingStore.get("hidden");
    }
    /**
     * Gets the inputType property value. The inputType property
     * @return a {@link AuthenticationAttributeCollectionInputType}
     */
    @jakarta.annotation.Nullable
    public AuthenticationAttributeCollectionInputType getInputType() {
        return this.backingStore.get("inputType");
    }
    /**
     * Gets the label property value. The label of the attribute field that&apos;s displayed to end user, unless overridden.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.backingStore.get("label");
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
     * Gets the options property value. The option values for certain multiple-option input types.
     * @return a {@link java.util.List<AuthenticationAttributeCollectionOptionConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationAttributeCollectionOptionConfiguration> getOptions() {
        return this.backingStore.get("options");
    }
    /**
     * Gets the required property value. Defines whether the field is required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.backingStore.get("required");
    }
    /**
     * Gets the validationRegEx property value. The regex for the value of the field. For more information about the supported regexes, see validationRegEx values for inputType objects. To understand how to specify regexes, see the Regular expressions cheat sheet.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValidationRegEx() {
        return this.backingStore.get("validationRegEx");
    }
    /**
     * Gets the writeToDirectory property value. Defines whether Microsoft Entra ID stores the value that it collects.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWriteToDirectory() {
        return this.backingStore.get("writeToDirectory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attribute", this.getAttribute());
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeEnumValue("inputType", this.getInputType());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("options", this.getOptions());
        writer.writeBooleanValue("required", this.getRequired());
        writer.writeStringValue("validationRegEx", this.getValidationRegEx());
        writer.writeBooleanValue("writeToDirectory", this.getWriteToDirectory());
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
     * Sets the attribute property value. The built-in or custom attribute for which a value is being collected.
     * @param value Value to set for the attribute property.
     */
    public void setAttribute(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attribute", value);
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
     * Sets the defaultValue property value. The default value of the attribute displayed to the end user. The capability to set the default value isn&apos;t available through the Microsoft Entra admin center.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the editable property value. Defines whether the attribute is editable by the end user.
     * @param value Value to set for the editable property.
     */
    public void setEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("editable", value);
    }
    /**
     * Sets the hidden property value. Defines whether the attribute is displayed to the end user. The capability to hide isn&apos;t available through the Microsoft Entra admin center.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hidden", value);
    }
    /**
     * Sets the inputType property value. The inputType property
     * @param value Value to set for the inputType property.
     */
    public void setInputType(@jakarta.annotation.Nullable final AuthenticationAttributeCollectionInputType value) {
        this.backingStore.set("inputType", value);
    }
    /**
     * Sets the label property value. The label of the attribute field that&apos;s displayed to end user, unless overridden.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("label", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the options property value. The option values for certain multiple-option input types.
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final java.util.List<AuthenticationAttributeCollectionOptionConfiguration> value) {
        this.backingStore.set("options", value);
    }
    /**
     * Sets the required property value. Defines whether the field is required.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("required", value);
    }
    /**
     * Sets the validationRegEx property value. The regex for the value of the field. For more information about the supported regexes, see validationRegEx values for inputType objects. To understand how to specify regexes, see the Regular expressions cheat sheet.
     * @param value Value to set for the validationRegEx property.
     */
    public void setValidationRegEx(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("validationRegEx", value);
    }
    /**
     * Sets the writeToDirectory property value. Defines whether Microsoft Entra ID stores the value that it collects.
     * @param value Value to set for the writeToDirectory property.
     */
    public void setWriteToDirectory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("writeToDirectory", value);
    }
}
