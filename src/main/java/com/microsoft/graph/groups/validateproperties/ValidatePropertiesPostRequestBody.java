package com.microsoft.graph.groups.validateproperties;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class ValidatePropertiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The entityType property
     */
    private String entityType;
    /**
     * The mailNickname property
     */
    private String mailNickname;
    /**
     * The onBehalfOfUserId property
     */
    private UUID onBehalfOfUserId;
    /**
     * Instantiates a new validatePropertiesPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ValidatePropertiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validatePropertiesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ValidatePropertiesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidatePropertiesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the entityType property value. The entityType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("entityType", (n) -> { this.setEntityType(n.getStringValue()); });
        deserializerMap.put("mailNickname", (n) -> { this.setMailNickname(n.getStringValue()); });
        deserializerMap.put("onBehalfOfUserId", (n) -> { this.setOnBehalfOfUserId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailNickname property value. The mailNickname property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMailNickname() {
        return this.mailNickname;
    }
    /**
     * Gets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getOnBehalfOfUserId() {
        return this.onBehalfOfUserId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("entityType", this.getEntityType());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeUUIDValue("onBehalfOfUserId", this.getOnBehalfOfUserId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the entityType property value. The entityType property
     * @param value Value to set for the entityType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEntityType(@jakarta.annotation.Nullable final String value) {
        this.entityType = value;
    }
    /**
     * Sets the mailNickname property value. The mailNickname property
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMailNickname(@jakarta.annotation.Nullable final String value) {
        this.mailNickname = value;
    }
    /**
     * Sets the onBehalfOfUserId property value. The onBehalfOfUserId property
     * @param value Value to set for the onBehalfOfUserId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOnBehalfOfUserId(@jakarta.annotation.Nullable final UUID value) {
        this.onBehalfOfUserId = value;
    }
}
