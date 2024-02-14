package com.microsoft.graph.chats.item.sendactivitynotification;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
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
public class SendActivityNotificationPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SendActivityNotificationPostRequestBody} and sets the default values.
     */
    public SendActivityNotificationPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendActivityNotificationPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SendActivityNotificationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendActivityNotificationPostRequestBody();
    }
    /**
     * Gets the activityType property value. The activityType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityType() {
        return this.backingStore.get("activityType");
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
     * Gets the chainId property value. The chainId property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getChainId() {
        return this.backingStore.get("chainId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("chainId", (n) -> { this.setChainId(n.getLongValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getObjectValue(TeamworkNotificationRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppId", (n) -> { this.setTeamsAppId(n.getStringValue()); });
        deserializerMap.put("templateParameters", (n) -> { this.setTemplateParameters(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getObjectValue(TeamworkActivityTopic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the previewText property value. The previewText property
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getPreviewText() {
        return this.backingStore.get("previewText");
    }
    /**
     * Gets the recipient property value. The recipient property
     * @return a {@link TeamworkNotificationRecipient}
     */
    @jakarta.annotation.Nullable
    public TeamworkNotificationRecipient getRecipient() {
        return this.backingStore.get("recipient");
    }
    /**
     * Gets the teamsAppId property value. The teamsAppId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTeamsAppId() {
        return this.backingStore.get("teamsAppId");
    }
    /**
     * Gets the templateParameters property value. The templateParameters property
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getTemplateParameters() {
        return this.backingStore.get("templateParameters");
    }
    /**
     * Gets the topic property value. The topic property
     * @return a {@link TeamworkActivityTopic}
     */
    @jakarta.annotation.Nullable
    public TeamworkActivityTopic getTopic() {
        return this.backingStore.get("topic");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityType", this.getActivityType());
        writer.writeLongValue("chainId", this.getChainId());
        writer.writeObjectValue("previewText", this.getPreviewText());
        writer.writeObjectValue("recipient", this.getRecipient());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
        writer.writeCollectionOfObjectValues("templateParameters", this.getTemplateParameters());
        writer.writeObjectValue("topic", this.getTopic());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityType property value. The activityType property
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityType", value);
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
     * Sets the chainId property value. The chainId property
     * @param value Value to set for the chainId property.
     */
    public void setChainId(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("chainId", value);
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     */
    public void setPreviewText(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("previewText", value);
    }
    /**
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     */
    public void setRecipient(@jakarta.annotation.Nullable final TeamworkNotificationRecipient value) {
        this.backingStore.set("recipient", value);
    }
    /**
     * Sets the teamsAppId property value. The teamsAppId property
     * @param value Value to set for the teamsAppId property.
     */
    public void setTeamsAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamsAppId", value);
    }
    /**
     * Sets the templateParameters property value. The templateParameters property
     * @param value Value to set for the templateParameters property.
     */
    public void setTemplateParameters(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("templateParameters", value);
    }
    /**
     * Sets the topic property value. The topic property
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final TeamworkActivityTopic value) {
        this.backingStore.set("topic", value);
    }
}
