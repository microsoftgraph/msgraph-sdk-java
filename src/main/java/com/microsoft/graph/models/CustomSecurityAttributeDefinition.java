package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomSecurityAttributeDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new CustomSecurityAttributeDefinition and sets the default values.
     */
    public CustomSecurityAttributeDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomSecurityAttributeDefinition
     */
    @jakarta.annotation.Nonnull
    public static CustomSecurityAttributeDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomSecurityAttributeDefinition();
    }
    /**
     * Gets the allowedValues property value. Values that are predefined for this custom security attribute. This navigation property is not returned by default and must be specified in an $expand query. For example, /directory/customSecurityAttributeDefinitions?$expand=allowedValues.
     * @return a java.util.List<AllowedValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AllowedValue> getAllowedValues() {
        return this.BackingStore.get("allowedValues");
    }
    /**
     * Gets the attributeSet property value. Name of the attribute set. Case insensitive.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAttributeSet() {
        return this.BackingStore.get("attributeSet");
    }
    /**
     * Gets the description property value. Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedValues", (n) -> { this.setAllowedValues(n.getCollectionOfObjectValues(AllowedValue::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeSet", (n) -> { this.setAttributeSet(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isCollection", (n) -> { this.setIsCollection(n.getBooleanValue()); });
        deserializerMap.put("isSearchable", (n) -> { this.setIsSearchable(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("usePreDefinedValuesOnly", (n) -> { this.setUsePreDefinedValuesOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isCollection property value. Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is set to Boolean, isCollection cannot be set to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCollection() {
        return this.BackingStore.get("isCollection");
    }
    /**
     * Gets the isSearchable property value. Indicates whether custom security attribute values are indexed for searching on objects that are assigned attribute values. Cannot be changed later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.BackingStore.get("isSearchable");
    }
    /**
     * Gets the name property value. Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the status property value. Specifies whether the custom security attribute is active or deactivated. Acceptable values are: Available and Deprecated. Can be changed later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the type property value. Data type for the custom security attribute values. Supported types are: Boolean, Integer, and String. Cannot be changed later.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.BackingStore.get("type");
    }
    /**
     * Gets the usePreDefinedValuesOnly property value. Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set to Boolean, usePreDefinedValuesOnly cannot be set to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUsePreDefinedValuesOnly() {
        return this.BackingStore.get("usePreDefinedValuesOnly");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("allowedValues", this.getAllowedValues());
        writer.writeStringValue("attributeSet", this.getAttributeSet());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("isCollection", this.getIsCollection());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
        writer.writeBooleanValue("usePreDefinedValuesOnly", this.getUsePreDefinedValuesOnly());
    }
    /**
     * Sets the allowedValues property value. Values that are predefined for this custom security attribute. This navigation property is not returned by default and must be specified in an $expand query. For example, /directory/customSecurityAttributeDefinitions?$expand=allowedValues.
     * @param value Value to set for the allowedValues property.
     */
    public void setAllowedValues(@jakarta.annotation.Nullable final java.util.List<AllowedValue> value) {
        this.BackingStore.set("allowedValues", value);
    }
    /**
     * Sets the attributeSet property value. Name of the attribute set. Case insensitive.
     * @param value Value to set for the attributeSet property.
     */
    public void setAttributeSet(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("attributeSet", value);
    }
    /**
     * Sets the description property value. Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the isCollection property value. Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is set to Boolean, isCollection cannot be set to true.
     * @param value Value to set for the isCollection property.
     */
    public void setIsCollection(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isCollection", value);
    }
    /**
     * Sets the isSearchable property value. Indicates whether custom security attribute values are indexed for searching on objects that are assigned attribute values. Cannot be changed later.
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isSearchable", value);
    }
    /**
     * Sets the name property value. Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the status property value. Specifies whether the custom security attribute is active or deactivated. Acceptable values are: Available and Deprecated. Can be changed later.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the type property value. Data type for the custom security attribute values. Supported types are: Boolean, Integer, and String. Cannot be changed later.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("type", value);
    }
    /**
     * Sets the usePreDefinedValuesOnly property value. Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set to Boolean, usePreDefinedValuesOnly cannot be set to true.
     * @param value Value to set for the usePreDefinedValuesOnly property.
     */
    public void setUsePreDefinedValuesOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("usePreDefinedValuesOnly", value);
    }
}
