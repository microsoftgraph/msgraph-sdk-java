package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtensionProperty extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link ExtensionProperty} and sets the default values.
     */
    public ExtensionProperty() {
        super();
        this.setOdataType("#microsoft.graph.extensionProperty");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtensionProperty}
     */
    @jakarta.annotation.Nonnull
    public static ExtensionProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtensionProperty();
    }
    /**
     * Gets the appDisplayName property value. Display name of the application object on which this extension property is defined. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximumNot nullable. For multivalued directory extensions, these limits apply per value in the collection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.backingStore.get("dataType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("isMultiValued", (n) -> { this.setIsMultiValued(n.getBooleanValue()); });
        deserializerMap.put("isSyncedFromOnPremises", (n) -> { this.setIsSyncedFromOnPremises(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("targetObjects", (n) -> { this.setTargetObjects(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isMultiValued property value. Defines the directory extension as a multi-valued property. When true, the directory extension property can store a collection of objects of the dataType; for example, a collection of string types such as 'extensionb7b1c57b532f40b8b5ed4b7a7ba67401jobGroupTracker': ['String 1', 'String 2']. The default value is false. Supports $filter (eq).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMultiValued() {
        return this.backingStore.get("isMultiValued");
    }
    /**
     * Gets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Microsoft Entra Connect. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSyncedFromOnPremises() {
        return this.backingStore.get("isSyncedFromOnPremises");
    }
    /**
     * Gets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetObjects() {
        return this.backingStore.get("targetObjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeBooleanValue("isMultiValued", this.getIsMultiValued());
        writer.writeBooleanValue("isSyncedFromOnPremises", this.getIsSyncedFromOnPremises());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("targetObjects", this.getTargetObjects());
    }
    /**
     * Sets the appDisplayName property value. Display name of the application object on which this extension property is defined. Read-only.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximumNot nullable. For multivalued directory extensions, these limits apply per value in the collection.
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataType", value);
    }
    /**
     * Sets the isMultiValued property value. Defines the directory extension as a multi-valued property. When true, the directory extension property can store a collection of objects of the dataType; for example, a collection of string types such as 'extensionb7b1c57b532f40b8b5ed4b7a7ba67401jobGroupTracker': ['String 1', 'String 2']. The default value is false. Supports $filter (eq).
     * @param value Value to set for the isMultiValued property.
     */
    public void setIsMultiValued(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMultiValued", value);
    }
    /**
     * Sets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Microsoft Entra Connect. Read-only.
     * @param value Value to set for the isSyncedFromOnPremises property.
     */
    public void setIsSyncedFromOnPremises(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSyncedFromOnPremises", value);
    }
    /**
     * Sets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @param value Value to set for the targetObjects property.
     */
    public void setTargetObjects(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("targetObjects", value);
    }
}
