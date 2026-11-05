package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupEntityMapping extends EntityMapping implements Parsable {
    /**
     * Instantiates a new {@link SecurityGroupEntityMapping} and sets the default values.
     */
    public SecurityGroupEntityMapping() {
        super();
        this.setOdataType("#microsoft.graph.security.securityGroupEntityMapping");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityGroupEntityMapping}
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroupEntityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupEntityMapping();
    }
    /**
     * Gets the distinguishedNameColumn property value. Name of the detection query column that maps to the distinguished name of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistinguishedNameColumn() {
        return this.backingStore.get("distinguishedNameColumn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("distinguishedNameColumn", (n) -> { this.setDistinguishedNameColumn(n.getStringValue()); });
        deserializerMap.put("objectIdColumn", (n) -> { this.setObjectIdColumn(n.getStringValue()); });
        deserializerMap.put("sidColumn", (n) -> { this.setSidColumn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectIdColumn property value. Name of the detection query column that maps to the object ID of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getObjectIdColumn() {
        return this.backingStore.get("objectIdColumn");
    }
    /**
     * Gets the sidColumn property value. Name of the detection query column that maps to the security identifier (SID) of the alert entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSidColumn() {
        return this.backingStore.get("sidColumn");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("distinguishedNameColumn", this.getDistinguishedNameColumn());
        writer.writeStringValue("objectIdColumn", this.getObjectIdColumn());
        writer.writeStringValue("sidColumn", this.getSidColumn());
    }
    /**
     * Sets the distinguishedNameColumn property value. Name of the detection query column that maps to the distinguished name of the alert entity.
     * @param value Value to set for the distinguishedNameColumn property.
     */
    public void setDistinguishedNameColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("distinguishedNameColumn", value);
    }
    /**
     * Sets the objectIdColumn property value. Name of the detection query column that maps to the object ID of the alert entity.
     * @param value Value to set for the objectIdColumn property.
     */
    public void setObjectIdColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectIdColumn", value);
    }
    /**
     * Sets the sidColumn property value. Name of the detection query column that maps to the security identifier (SID) of the alert entity.
     * @param value Value to set for the sidColumn property.
     */
    public void setSidColumn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sidColumn", value);
    }
}
