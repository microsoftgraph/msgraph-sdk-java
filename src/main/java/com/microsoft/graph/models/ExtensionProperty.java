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
     * Instantiates a new ExtensionProperty and sets the default values.
     */
    public ExtensionProperty() {
        super();
        this.setOdataType("#microsoft.graph.extensionProperty");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExtensionProperty
     */
    @jakarta.annotation.Nonnull
    public static ExtensionProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtensionProperty();
    }
    /**
     * Gets the appDisplayName property value. Display name of the application object on which this extension property is defined. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.BackingStore.get("appDisplayName");
    }
    /**
     * Gets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDataType() {
        return this.BackingStore.get("dataType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the isMultiValued property value. Defines the directory extension as a multi-valued property. When true, the directory extension property can store a collection of objects of the dataType; for example, a collection of integers. The default value is false. Supports $filter (eq).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMultiValued() {
        return this.BackingStore.get("isMultiValued");
    }
    /**
     * Gets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Microsoft Entra Connect. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSyncedFromOnPremises() {
        return this.BackingStore.get("isSyncedFromOnPremises");
    }
    /**
     * Gets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetObjects() {
        return this.BackingStore.get("targetObjects");
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
        this.BackingStore.set("appDisplayName", value);
    }
    /**
     * Sets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("dataType", value);
    }
    /**
     * Sets the isMultiValued property value. Defines the directory extension as a multi-valued property. When true, the directory extension property can store a collection of objects of the dataType; for example, a collection of integers. The default value is false. Supports $filter (eq).
     * @param value Value to set for the isMultiValued property.
     */
    public void setIsMultiValued(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isMultiValued", value);
    }
    /**
     * Sets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Microsoft Entra Connect. Read-only.
     * @param value Value to set for the isSyncedFromOnPremises property.
     */
    public void setIsSyncedFromOnPremises(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isSyncedFromOnPremises", value);
    }
    /**
     * Sets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @param value Value to set for the targetObjects property.
     */
    public void setTargetObjects(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("targetObjects", value);
    }
}
