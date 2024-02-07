package com.microsoft.graph.applications.item.addkey;

import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddKeyPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AddKeyPostRequestBody and sets the default values.
     */
    public AddKeyPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddKeyPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AddKeyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddKeyPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("keyCredential", (n) -> { this.setKeyCredential(n.getObjectValue(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordCredential", (n) -> { this.setPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("proof", (n) -> { this.setProof(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyCredential property value. The keyCredential property
     * @return a KeyCredential
     */
    @jakarta.annotation.Nullable
    public KeyCredential getKeyCredential() {
        return this.backingStore.get("keyCredential");
    }
    /**
     * Gets the passwordCredential property value. The passwordCredential property
     * @return a PasswordCredential
     */
    @jakarta.annotation.Nullable
    public PasswordCredential getPasswordCredential() {
        return this.backingStore.get("passwordCredential");
    }
    /**
     * Gets the proof property value. The proof property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProof() {
        return this.backingStore.get("proof");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("keyCredential", this.getKeyCredential());
        writer.writeObjectValue("passwordCredential", this.getPasswordCredential());
        writer.writeStringValue("proof", this.getProof());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the keyCredential property value. The keyCredential property
     * @param value Value to set for the keyCredential property.
     */
    public void setKeyCredential(@jakarta.annotation.Nullable final KeyCredential value) {
        this.backingStore.set("keyCredential", value);
    }
    /**
     * Sets the passwordCredential property value. The passwordCredential property
     * @param value Value to set for the passwordCredential property.
     */
    public void setPasswordCredential(@jakarta.annotation.Nullable final PasswordCredential value) {
        this.backingStore.set("passwordCredential", value);
    }
    /**
     * Sets the proof property value. The proof property
     * @param value Value to set for the proof property.
     */
    public void setProof(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("proof", value);
    }
}
