package com.microsoft.graph.applications.item.addpassword;

import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the addPassword method. */
public class PasswordCredentialPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The passwordCredential property */
    private PasswordCredential _passwordCredential;
    /**
     * Instantiates a new PasswordCredentialPostRequestBody and sets the default values.
     * @return a void
     */
    public PasswordCredentialPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PasswordCredentialPostRequestBody
     */
    @javax.annotation.Nonnull
    public static PasswordCredentialPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordCredentialPostRequestBody();
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
        final PasswordCredentialPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("passwordCredential", (n) -> { currentObject.setPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
        }};
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("passwordCredential", this.getPasswordCredential());
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
     * Sets the passwordCredential property value. The passwordCredential property
     * @param value Value to set for the passwordCredential property.
     * @return a void
     */
    public void setPasswordCredential(@javax.annotation.Nullable final PasswordCredential value) {
        this._passwordCredential = value;
    }
}
