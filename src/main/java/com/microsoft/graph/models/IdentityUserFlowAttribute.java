package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * The display name of the user flow attribute.
     */
    private String displayName;
    /**
     * The userFlowAttributeType property
     */
    private IdentityUserFlowAttributeType userFlowAttributeType;
    /**
     * Instantiates a new identityUserFlowAttribute and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttribute() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityUserFlowAttribute
     */
    @javax.annotation.Nonnull
    public static IdentityUserFlowAttribute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a identityUserFlowAttributeDataType
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttributeDataType getDataType() {
        return this.dataType;
    }
    /**
     * Gets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the user flow attribute.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a identityUserFlowAttributeType
     */
    @javax.annotation.Nullable
    public IdentityUserFlowAttributeType getUserFlowAttributeType() {
        return this.userFlowAttributeType;
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
        writer.writeEnumValue("dataType", this.getDataType());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("userFlowAttributeType", this.getUserFlowAttributeType());
    }
    /**
     * Sets the dataType property value. The dataType property
     * @param value Value to set for the dataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataType(@javax.annotation.Nullable final IdentityUserFlowAttributeDataType value) {
        this.dataType = value;
    }
    /**
     * Sets the description property value. The description of the user flow attribute that's shown to the user at the time of sign-up.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the user flow attribute.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the userFlowAttributeType property value. The userFlowAttributeType property
     * @param value Value to set for the userFlowAttributeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserFlowAttributeType(@javax.annotation.Nullable final IdentityUserFlowAttributeType value) {
        this.userFlowAttributeType = value;
    }
}
