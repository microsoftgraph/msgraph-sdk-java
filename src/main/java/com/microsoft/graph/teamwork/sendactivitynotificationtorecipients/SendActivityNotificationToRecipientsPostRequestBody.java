package com.microsoft.graph.teamwork.sendactivitynotificationtorecipients;

import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SendActivityNotificationToRecipientsPostRequestBody implements AdditionalDataHolder, Parsable {
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
     * The recipients property
     */
    private java.util.List<TeamworkNotificationRecipient> recipients;
    /**
     * The teamsAppId property
     */
    private String teamsAppId;
    /**
     * The templateParameters property
     */
    private java.util.List<KeyValuePair> templateParameters;
    /**
     * The topic property
     */
    private TeamworkActivityTopic topic;
    /**
     * Instantiates a new sendActivityNotificationToRecipientsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SendActivityNotificationToRecipientsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sendActivityNotificationToRecipientsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SendActivityNotificationToRecipientsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendActivityNotificationToRecipientsPostRequestBody();
    }
    /**
     * Gets the activityType property value. The activityType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityType() {
        return this.activityType;
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
     * Gets the chainId property value. The chainId property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getChainId() {
        return this.chainId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("activityType", (n) -> { this.setActivityType(n.getStringValue()); });
        deserializerMap.put("chainId", (n) -> { this.setChainId(n.getLongValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfObjectValues(TeamworkNotificationRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsAppId", (n) -> { this.setTeamsAppId(n.getStringValue()); });
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
        return this.previewText;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a teamworkNotificationRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkNotificationRecipient> getRecipients() {
        return this.recipients;
    }
    /**
     * Gets the teamsAppId property value. The teamsAppId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamsAppId() {
        return this.teamsAppId;
    }
    /**
     * Gets the templateParameters property value. The templateParameters property
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getTemplateParameters() {
        return this.templateParameters;
    }
    /**
     * Gets the topic property value. The topic property
     * @return a teamworkActivityTopic
     */
    @javax.annotation.Nullable
    public TeamworkActivityTopic getTopic() {
        return this.topic;
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
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeStringValue("teamsAppId", this.getTeamsAppId());
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
        this.activityType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the chainId property value. The chainId property
     * @param value Value to set for the chainId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChainId(@javax.annotation.Nullable final Long value) {
        this.chainId = value;
    }
    /**
     * Sets the previewText property value. The previewText property
     * @param value Value to set for the previewText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewText(@javax.annotation.Nullable final ItemBody value) {
        this.previewText = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipients(@javax.annotation.Nullable final java.util.List<TeamworkNotificationRecipient> value) {
        this.recipients = value;
    }
    /**
     * Sets the teamsAppId property value. The teamsAppId property
     * @param value Value to set for the teamsAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsAppId(@javax.annotation.Nullable final String value) {
        this.teamsAppId = value;
    }
    /**
     * Sets the templateParameters property value. The templateParameters property
     * @param value Value to set for the templateParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateParameters(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.templateParameters = value;
    }
    /**
     * Sets the topic property value. The topic property
     * @param value Value to set for the topic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopic(@javax.annotation.Nullable final TeamworkActivityTopic value) {
        this.topic = value;
    }
}
