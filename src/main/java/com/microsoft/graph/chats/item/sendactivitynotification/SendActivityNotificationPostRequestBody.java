package com.microsoft.graph.chats.item.sendactivitynotification;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the sendActivityNotification method. */
public class SendActivityNotificationPostRequestBody implements AdditionalDataHolder, Parsable {
    /** The activityType property */
    private String _activityType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The chainId property */
    private Long _chainId;
    /** The previewText property */
    private ItemBody _previewText;
    /** The recipient property */
    private TeamworkNotificationRecipient _recipient;
    /** The templateParameters property */
    private java.util.List<KeyValuePair> _templateParameters;
    /** The topic property */
    private TeamworkActivityTopic _topic;
    /**
     * Instantiates a new sendActivityNotificationPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SendActivityNotificationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sendActivityNotificationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SendActivityNotificationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendActivityNotificationPostRequestBody();
    }
    /**
     * Gets the activityType property value. The activityType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityType() {
        return this._activityType;
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
     * Gets the chainId property value. The chainId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getChainId() {
        return this._chainId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("chainId", (n) -> { this.setChainId(n.getLongValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getObjectValue(TeamworkNotificationRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("templateParameters", (n) -> { this.setTemplateParameters(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("topic", (n) -> { this.setTopic(n.getObjectValue(TeamworkActivityTopic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the previewText property value. The previewText property
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getPreviewText() {
        return this._previewText;
    }
    /**
     * Gets the recipient property value. The recipient property
     * @return a teamworkNotificationRecipient
     */
    @javax.annotation.Nullable
    public TeamworkNotificationRecipient getRecipient() {
        return this._recipient;
    }
    /**
     * Gets the templateParameters property value. The templateParameters property
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getTemplateParameters() {
        return this._templateParameters;
    }
    /**
     * Gets the topic property value. The topic property
     * @return a teamworkActivityTopic
     */
    @javax.annotation.Nullable
    public TeamworkActivityTopic getTopic() {
        return this._topic;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activityType", this.getActivityType());
        writer.writeLongValue("chainId", this.getChainId());
        writer.writeObjectValue("previewText", this.getPreviewText());
        writer.writeObjectValue("recipient", this.getRecipient());
        writer.writeCollectionOfObjectValues("templateParameters", this.getTemplateParameters());
        writer.writeObjectValue("topic", this.getTopic());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityType property value. The activityType property
     * @param value Value to set for the activityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityType(@javax.annotation.Nullable final String value) {
        this._activityType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the chainId property value. The chainId property
     * @param value Value to set for the chainId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChainId(@javax.annotation.Nullable final Long value) {
        this._chainId = value;
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewText(@javax.annotation.Nullable final ItemBody value) {
        this._previewText = value;
    }
    /**
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipient(@javax.annotation.Nullable final TeamworkNotificationRecipient value) {
        this._recipient = value;
    }
    /**
     * Sets the templateParameters property value. The templateParameters property
     * @param value Value to set for the templateParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateParameters(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._templateParameters = value;
    }
    /**
     * Sets the topic property value. The topic property
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final TeamworkActivityTopic value) {
        this._topic = value;
    }
}
