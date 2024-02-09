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
public class SharingInvitation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SharingInvitation} and sets the default values.
     */
    public SharingInvitation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharingInvitation}
     */
    @jakarta.annotation.Nonnull
    public static SharingInvitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharingInvitation();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("invitedBy", (n) -> { this.setInvitedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("redeemedBy", (n) -> { this.setRedeemedBy(n.getStringValue()); });
        deserializerMap.put("signInRequired", (n) -> { this.setSignInRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getInvitedBy() {
        return this.backingStore.get("invitedBy");
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
     * Gets the redeemedBy property value. The redeemedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRedeemedBy() {
        return this.backingStore.get("redeemedBy");
    }
    /**
     * Gets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSignInRequired() {
        return this.backingStore.get("signInRequired");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("invitedBy", this.getInvitedBy());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("redeemedBy", this.getRedeemedBy());
        writer.writeBooleanValue("signInRequired", this.getSignInRequired());
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
     * Sets the email property value. The email address provided for the recipient of the sharing invitation. Read-only.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the invitedBy property value. Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     * @param value Value to set for the invitedBy property.
     */
    public void setInvitedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("invitedBy", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the redeemedBy property value. The redeemedBy property
     * @param value Value to set for the redeemedBy property.
     */
    public void setRedeemedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("redeemedBy", value);
    }
    /**
     * Sets the signInRequired property value. If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     * @param value Value to set for the signInRequired property.
     */
    public void setSignInRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("signInRequired", value);
    }
}
