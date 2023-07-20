package com.microsoft.graph.applications.item.addpassword;

import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddPasswordPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The passwordCredential property
     */
    private PasswordCredential passwordCredential;
    /**
     * Instantiates a new addPasswordPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AddPasswordPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addPasswordPostRequestBody
     */
    @javax.annotation.Nonnull
    public static AddPasswordPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddPasswordPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("passwordCredential", (n) -> { this.setPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the passwordCredential property value. The passwordCredential property
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public PasswordCredential getPasswordCredential() {
        return this.passwordCredential;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("passwordCredential", this.getPasswordCredential());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the passwordCredential property value. The passwordCredential property
     * @param value Value to set for the passwordCredential property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordCredential(@javax.annotation.Nullable final PasswordCredential value) {
        this.passwordCredential = value;
    }
}
