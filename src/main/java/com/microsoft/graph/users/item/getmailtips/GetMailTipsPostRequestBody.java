package com.microsoft.graph.users.item.getmailtips;

import com.microsoft.graph.models.MailTipsType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMailTipsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new GetMailTipsPostRequestBody and sets the default values.
     */
    public GetMailTipsPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetMailTipsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetMailTipsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMailTipsPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the EmailAddresses property value. The EmailAddresses property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailAddresses() {
        return this.BackingStore.get("emailAddresses");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("EmailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("MailTipsOptions", (n) -> { this.setMailTipsOptions(n.getEnumSetValue(MailTipsType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the MailTipsOptions property value. The MailTipsOptions property
     * @return a EnumSet<MailTipsType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<MailTipsType> getMailTipsOptions() {
        return this.BackingStore.get("mailTipsOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("EmailAddresses", this.getEmailAddresses());
        writer.writeEnumSetValue("MailTipsOptions", this.getMailTipsOptions());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the EmailAddresses property value. The EmailAddresses property
     * @param value Value to set for the EmailAddresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("emailAddresses", value);
    }
    /**
     * Sets the MailTipsOptions property value. The MailTipsOptions property
     * @param value Value to set for the MailTipsOptions property.
     */
    public void setMailTipsOptions(@jakarta.annotation.Nullable final EnumSet<MailTipsType> value) {
        this.BackingStore.set("mailTipsOptions", value);
    }
}
