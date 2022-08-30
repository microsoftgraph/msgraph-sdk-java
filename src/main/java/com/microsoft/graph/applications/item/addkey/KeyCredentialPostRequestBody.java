package com.microsoft.graph.applications.item.addkey;

import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the addKey method. */
public class KeyCredentialPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The keyCredential property */
    private KeyCredential _keyCredential;
    /** The passwordCredential property */
    private PasswordCredential _passwordCredential;
    /** The proof property */
    private String _proof;
    /**
     * Instantiates a new KeyCredentialPostRequestBody and sets the default values.
     * @return a void
     */
    public KeyCredentialPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KeyCredentialPostRequestBody
     */
    @javax.annotation.Nonnull
    public static KeyCredentialPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeyCredentialPostRequestBody();
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
        final KeyCredentialPostRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("keyCredential", (n) -> { currentObject.setKeyCredential(n.getObjectValue(KeyCredential::createFromDiscriminatorValue)); });
            this.put("passwordCredential", (n) -> { currentObject.setPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
            this.put("proof", (n) -> { currentObject.setProof(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyCredential property value. The keyCredential property
     * @return a keyCredential
     */
    @javax.annotation.Nullable
    public KeyCredential getKeyCredential() {
        return this._keyCredential;
    }
    /**
     * Gets the passwordCredential property value. The passwordCredential property
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public PasswordCredential getPasswordCredential() {
        return this._passwordCredential;
    }
    /**
     * Gets the proof property value. The proof property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProof() {
        return this._proof;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("keyCredential", this.getKeyCredential());
        writer.writeObjectValue("passwordCredential", this.getPasswordCredential());
        writer.writeStringValue("proof", this.getProof());
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
     * Sets the keyCredential property value. The keyCredential property
     * @param value Value to set for the keyCredential property.
     * @return a void
     */
    public void setKeyCredential(@javax.annotation.Nullable final KeyCredential value) {
        this._keyCredential = value;
    }
    /**
     * Sets the passwordCredential property value. The passwordCredential property
     * @param value Value to set for the passwordCredential property.
     * @return a void
     */
    public void setPasswordCredential(@javax.annotation.Nullable final PasswordCredential value) {
        this._passwordCredential = value;
    }
    /**
     * Sets the proof property value. The proof property
     * @param value Value to set for the proof property.
     * @return a void
     */
    public void setProof(@javax.annotation.Nullable final String value) {
        this._proof = value;
    }
}
