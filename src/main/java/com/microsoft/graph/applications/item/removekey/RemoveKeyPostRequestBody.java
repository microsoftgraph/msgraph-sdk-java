package com.microsoft.graph.applications.item.removekey;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class RemoveKeyPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The keyId property
     */
    private UUID keyId;
    /**
     * The proof property
     */
    private String proof;
    /**
     * Instantiates a new removeKeyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RemoveKeyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a removeKeyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RemoveKeyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoveKeyPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("keyId", (n) -> { this.setKeyId(n.getUUIDValue()); });
        deserializerMap.put("proof", (n) -> { this.setProof(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyId property value. The keyId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getKeyId() {
        return this.keyId;
    }
    /**
     * Gets the proof property value. The proof property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProof() {
        return this.proof;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeUUIDValue("keyId", this.getKeyId());
        writer.writeStringValue("proof", this.getProof());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the keyId property value. The keyId property
     * @param value Value to set for the keyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyId(@javax.annotation.Nullable final UUID value) {
        this.keyId = value;
    }
    /**
     * Sets the proof property value. The proof property
     * @param value Value to set for the proof property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProof(@javax.annotation.Nullable final String value) {
        this.proof = value;
    }
}
