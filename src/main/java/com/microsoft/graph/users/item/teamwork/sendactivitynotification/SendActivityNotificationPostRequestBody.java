package com.microsoft.graph.users.item.teamwork.sendactivitynotification;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendActivityNotificationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * The activityType property
     */
    private String activityType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The chainId property
     */
    private Long chainId;
    /**
     * The previewText property
     */
    private ItemBody previewText;
    /**
     * The templateParameters property
     */
    private java.util.List<KeyValuePair> templateParameters;
    /**
     * The topic property
     */
    private TeamworkActivityTopic topic;
    /**
     * Instantiates a new SendActivityNotificationPostRequestBody and sets the default values.
     */
    public SendActivityNotificationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SendActivityNotificationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SendActivityNotificationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendActivityNotificationPostRequestBody();
    }
    /**
     * Gets the activityType property value. The activityType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivityType() {
        return this.activityType;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the chainId property value. The chainId property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getChainId() {
        return this.chainId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("chainId", (n) -> { this.setChainId(n.getLongValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("templateParameters", (n) -> { this.setTemplateParameters(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getObjectValue(TeamworkActivityTopic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the previewText property value. The previewText property
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getPreviewText() {
        return this.previewText;
    }
    /**
     * Gets the templateParameters property value. The templateParameters property
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getTemplateParameters() {
        return this.templateParameters;
    }
    /**
     * Gets the topic property value. The topic property
     * @return a TeamworkActivityTopic
     */
    @jakarta.annotation.Nullable
    public TeamworkActivityTopic getTopic() {
        return this.topic;
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
        writer.writeCollectionOfObjectValues("templateParameters", this.getTemplateParameters());
        writer.writeObjectValue("topic", this.getTopic());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityType property value. The activityType property
     * @param value Value to set for the activityType property.
     */
    public void setActivityType(@jakarta.annotation.Nullable final String value) {
        this.activityType = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the chainId property value. The chainId property
     * @param value Value to set for the chainId property.
     */
    public void setChainId(@jakarta.annotation.Nullable final Long value) {
        this.chainId = value;
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     */
    public void setPreviewText(@jakarta.annotation.Nullable final ItemBody value) {
        this.previewText = value;
    }
    /**
     * Sets the templateParameters property value. The templateParameters property
     * @param value Value to set for the templateParameters property.
     */
    public void setTemplateParameters(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.templateParameters = value;
    }
    /**
     * Sets the topic property value. The topic property
     * @param value Value to set for the topic property.
     */
    public void setTopic(@jakarta.annotation.Nullable final TeamworkActivityTopic value) {
        this.topic = value;
    }
}
