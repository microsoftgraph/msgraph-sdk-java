package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlternativeSecurityId implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * For internal use only.
     */
    private String identityProvider;
    /**
     * For internal use only.
     */
    private byte[] key;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * For internal use only.
     */
    private Integer type;
    /**
     * Instantiates a new alternativeSecurityId and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlternativeSecurityId() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alternativeSecurityId
     */
    @javax.annotation.Nonnull
    public static AlternativeSecurityId createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlternativeSecurityId();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("identityProvider", (n) -> { this.setIdentityProvider(n.getStringValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getByteArrayValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityProvider property value. For internal use only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityProvider() {
        return this.identityProvider;
    }
    /**
     * Gets the key property value. For internal use only.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getKey() {
        return this.key;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. For internal use only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identityProvider", this.getIdentityProvider());
        writer.writeByteArrayValue("key", this.getKey());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("type", this.getType());
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
     * Sets the identityProvider property value. For internal use only.
     * @param value Value to set for the identityProvider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityProvider(@javax.annotation.Nullable final String value) {
        this.identityProvider = value;
    }
    /**
     * Sets the key property value. For internal use only.
     * @param value Value to set for the key property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKey(@javax.annotation.Nullable final byte[] value) {
        this.key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. For internal use only.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final Integer value) {
        this.type = value;
    }
}
