package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExtensionProperty extends DirectoryObject implements Parsable {
    /** Display name of the application object on which this extension property is defined. Read-only. */
    private String appDisplayName;
    /** Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum */
    private String dataType;
    /** Indicates if this extension property was synced from on-premises active directory using Azure AD Connect. Read-only. */
    private Boolean isSyncedFromOnPremises;
    /** Name of the extension property. Not nullable. Supports $filter (eq). */
    private String name;
    /** Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization */
    private java.util.List<String> targetObjects;
    /**
     * Instantiates a new extensionProperty and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExtensionProperty() {
        super();
        this.setOdataType("#microsoft.graph.extensionProperty");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a extensionProperty
     */
    @javax.annotation.Nonnull
    public static ExtensionProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtensionProperty();
    }
    /**
     * Gets the appDisplayName property value. Display name of the application object on which this extension property is defined. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataType() {
        return this.dataType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getStringValue()); });
        deserializerMap.put("isSyncedFromOnPremises", (n) -> { this.setIsSyncedFromOnPremises(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("targetObjects", (n) -> { this.setTargetObjects(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Azure AD Connect. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncedFromOnPremises() {
        return this.isSyncedFromOnPremises;
    }
    /**
     * Gets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTargetObjects() {
        return this.targetObjects;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("dataType", this.getDataType());
        writer.writeBooleanValue("isSyncedFromOnPremises", this.getIsSyncedFromOnPremises());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("targetObjects", this.getTargetObjects());
    }
    /**
     * Sets the appDisplayName property value. Display name of the application object on which this extension property is defined. Read-only.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the dataType property value. Specifies the data type of the value the extension property can hold. Following values are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum
     * @param value Value to set for the dataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataType(@javax.annotation.Nullable final String value) {
        this.dataType = value;
    }
    /**
     * Sets the isSyncedFromOnPremises property value. Indicates if this extension property was synced from on-premises active directory using Azure AD Connect. Read-only.
     * @param value Value to set for the isSyncedFromOnPremises property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSyncedFromOnPremises(@javax.annotation.Nullable final Boolean value) {
        this.isSyncedFromOnPremises = value;
    }
    /**
     * Sets the name property value. Name of the extension property. Not nullable. Supports $filter (eq).
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the targetObjects property value. Following values are supported. Not nullable. UserGroupAdministrativeUnitApplicationDeviceOrganization
     * @param value Value to set for the targetObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetObjects(@javax.annotation.Nullable final java.util.List<String> value) {
        this.targetObjects = value;
    }
}
