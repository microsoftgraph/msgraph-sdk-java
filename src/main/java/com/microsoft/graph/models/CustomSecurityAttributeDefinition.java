package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomSecurityAttributeDefinition extends Entity implements Parsable {
    /** The allowedValues property */
    private java.util.List<AllowedValue> allowedValues;
    /** The attributeSet property */
    private String attributeSet;
    /** The description property */
    private String description;
    /** The isCollection property */
    private Boolean isCollection;
    /** The isSearchable property */
    private Boolean isSearchable;
    /** The name property */
    private String name;
    /** The status property */
    private String status;
    /** The type property */
    private String type;
    /** The usePreDefinedValuesOnly property */
    private Boolean usePreDefinedValuesOnly;
    /**
     * Instantiates a new CustomSecurityAttributeDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomSecurityAttributeDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomSecurityAttributeDefinition
     */
    @javax.annotation.Nonnull
    public static CustomSecurityAttributeDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomSecurityAttributeDefinition();
    }
    /**
     * Gets the allowedValues property value. The allowedValues property
     * @return a allowedValue
     */
    @javax.annotation.Nullable
    public java.util.List<AllowedValue> getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * Gets the attributeSet property value. The attributeSet property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAttributeSet() {
        return this.attributeSet;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the isCollection property value. The isCollection property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCollection() {
        return this.isCollection;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the usePreDefinedValuesOnly property value. The usePreDefinedValuesOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsePreDefinedValuesOnly() {
        return this.usePreDefinedValuesOnly;
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
     * Sets the allowedValues property value. The allowedValues property
     * @param value Value to set for the allowedValues property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedValues(@javax.annotation.Nullable final java.util.List<AllowedValue> value) {
        this.allowedValues = value;
    }
    /**
     * Sets the attributeSet property value. The attributeSet property
     * @param value Value to set for the attributeSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttributeSet(@javax.annotation.Nullable final String value) {
        this.attributeSet = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the isCollection property value. The isCollection property
     * @param value Value to set for the isCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCollection(@javax.annotation.Nullable final Boolean value) {
        this.isCollection = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this.isSearchable = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the usePreDefinedValuesOnly property value. The usePreDefinedValuesOnly property
     * @param value Value to set for the usePreDefinedValuesOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsePreDefinedValuesOnly(@javax.annotation.Nullable final Boolean value) {
        this.usePreDefinedValuesOnly = value;
    }
}
