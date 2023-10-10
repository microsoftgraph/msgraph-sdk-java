package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityUserFlowAttribute extends Entity implements Parsable {
    /**
     * The dataType property
     */
    private IdentityUserFlowAttributeDataType dataType;
    /**
     * The description of the user flow attribute that's shown to the user at the time of sign-up.
     */
    private String description;
    /**
     * The display name of the user flow attribute.  Supports $filter (eq, ne).
     */
    private String displayName;
    /**
     * The userFlowAttributeType property
     */
    private IdentityUserFlowAttributeType userFlowAttributeType;
    /**
     * Instantiates a new IdentityUserFlowAttribute and sets the default values.
     */
    public IdentityUserFlowAttribute() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityUserFlowAttribute
     */
    @jakarta.annotation.Nonnull
    public static IdentityUserFlowAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityBuiltInUserFlowAttribute": return new IdentityBuiltInUserFlowAttribute();
                case "#microsoft.graph.identityCustomUserFlowAttribute": return new IdentityCustomUserFlowAttribute();
            }
        }
        return new IdentityUserFlowAttribute();
    }
    /**
     * Gets the dataType property value. The dataType property
     * @return a IdentityUserFlowAttributeDataType
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeDataType getDataType() {
        return this.dataType;
    }
    /**
     * Gets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the user flow attribute.  Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataType", (n) -> { this.setDataType(n.getEnumValue(IdentityUserFlowAttributeDataType.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("userFlowAttributeType", (n) -> { this.setUserFlowAttributeType(n.getEnumValue(IdentityUserFlowAttributeType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the userFlowAttributeType property value. The userFlowAttributeType property
     * @return a IdentityUserFlowAttributeType
     */
    @jakarta.annotation.Nullable
    public IdentityUserFlowAttributeType getUserFlowAttributeType() {
        return this.userFlowAttributeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("userFlowAttributeType", this.getUserFlowAttributeType());
    }
    /**
     * Sets the dataType property value. The dataType property
     * @param value Value to set for the dataType property.
     */
    public void setDataType(@jakarta.annotation.Nullable final IdentityUserFlowAttributeDataType value) {
        this.dataType = value;
    }
    /**
     * Sets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the user flow attribute.  Supports $filter (eq, ne).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the userFlowAttributeType property value. The userFlowAttributeType property
     * @param value Value to set for the userFlowAttributeType property.
     */
    public void setUserFlowAttributeType(@jakarta.annotation.Nullable final IdentityUserFlowAttributeType value) {
        this.userFlowAttributeType = value;
    }
}
