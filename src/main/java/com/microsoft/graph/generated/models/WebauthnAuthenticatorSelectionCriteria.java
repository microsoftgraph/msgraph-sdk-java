package com.microsoft.graph.models;

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
public class WebauthnAuthenticatorSelectionCriteria implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WebauthnAuthenticatorSelectionCriteria} and sets the default values.
     */
    public WebauthnAuthenticatorSelectionCriteria() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebauthnAuthenticatorSelectionCriteria}
     */
    @jakarta.annotation.Nonnull
    public static WebauthnAuthenticatorSelectionCriteria createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebauthnAuthenticatorSelectionCriteria();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the authenticatorAttachment property value. The authenticatorAttachment property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticatorAttachment() {
        return this.backingStore.get("authenticatorAttachment");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("authenticatorAttachment", (n) -> { this.setAuthenticatorAttachment(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("requireResidentKey", (n) -> { this.setRequireResidentKey(n.getBooleanValue()); });
        deserializerMap.put("userVerification", (n) -> { this.setUserVerification(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the requireResidentKey property value. The requireResidentKey property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireResidentKey() {
        return this.backingStore.get("requireResidentKey");
    }
    /**
     * Gets the userVerification property value. The userVerification property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserVerification() {
        return this.backingStore.get("userVerification");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authenticatorAttachment", this.getAuthenticatorAttachment());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("requireResidentKey", this.getRequireResidentKey());
        writer.writeStringValue("userVerification", this.getUserVerification());
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
     * Sets the authenticatorAttachment property value. The authenticatorAttachment property
     * @param value Value to set for the authenticatorAttachment property.
     */
    public void setAuthenticatorAttachment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticatorAttachment", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the requireResidentKey property value. The requireResidentKey property
     * @param value Value to set for the requireResidentKey property.
     */
    public void setRequireResidentKey(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireResidentKey", value);
    }
    /**
     * Sets the userVerification property value. The userVerification property
     * @param value Value to set for the userVerification property.
     */
    public void setUserVerification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userVerification", value);
    }
}
