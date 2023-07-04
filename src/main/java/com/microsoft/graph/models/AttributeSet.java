package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AttributeSet extends Entity implements Parsable {
    /**
     * Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     */
    private String description;
    /**
     * Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
     */
    private Integer maxAttributesPerSet;
    /**
     * Instantiates a new AttributeSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AttributeSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttributeSet
     */
    @javax.annotation.Nonnull
    public static AttributeSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttributeSet();
    }
    /**
     * Gets the description property value. Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed later.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("maxAttributesPerSet", (n) -> { this.setMaxAttributesPerSet(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxAttributesPerSet property value. Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxAttributesPerSet() {
        return this.maxAttributesPerSet;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeIntegerValue("maxAttributesPerSet", this.getMaxAttributesPerSet());
    }
    /**
     * Sets the description property value. Description of the attribute set. Can be up to 128 characters long and include Unicode characters. Can be changed later.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the maxAttributesPerSet property value. Maximum number of custom security attributes that can be defined in this attribute set. Default value is null. If not specified, the administrator can add up to the maximum of 500 active attributes per tenant. Can be changed later.
     * @param value Value to set for the maxAttributesPerSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxAttributesPerSet(@javax.annotation.Nullable final Integer value) {
        this.maxAttributesPerSet = value;
    }
}
