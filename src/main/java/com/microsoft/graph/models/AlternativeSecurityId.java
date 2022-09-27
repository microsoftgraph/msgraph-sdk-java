package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlternativeSecurityId implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** For internal use only */
    private String _identityProvider;
    /** For internal use only */
    private byte[] _key;
    /** The OdataType property */
    private String _odataType;
    /** For internal use only */
    private Integer _type;
    /**
     * Instantiates a new alternativeSecurityId and sets the default values.
     * @return a void
     */
    public AlternativeSecurityId() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.alternativeSecurityId");
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlternativeSecurityId currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("identityProvider", (n) -> { currentObject.setIdentityProvider(n.getStringValue()); });
            this.put("key", (n) -> { currentObject.setKey(n.getByteArrayValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the identityProvider property value. For internal use only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityProvider() {
        return this._identityProvider;
    }
    /**
     * Gets the key property value. For internal use only
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getKey() {
        return this._key;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the type property value. For internal use only
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the identityProvider property value. For internal use only
     * @param value Value to set for the identityProvider property.
     * @return a void
     */
    public void setIdentityProvider(@javax.annotation.Nullable final String value) {
        this._identityProvider = value;
    }
    /**
     * Sets the key property value. For internal use only
     * @param value Value to set for the key property.
     * @return a void
     */
    public void setKey(@javax.annotation.Nullable final byte[] value) {
        this._key = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the type property value. For internal use only
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final Integer value) {
        this._type = value;
    }
}
