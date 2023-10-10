package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamMessagingSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If set to true, @channel mentions are allowed.
     */
    private Boolean allowChannelMentions;
    /**
     * If set to true, owners can delete any message.
     */
    private Boolean allowOwnerDeleteMessages;
    /**
     * If set to true, @team mentions are allowed.
     */
    private Boolean allowTeamMentions;
    /**
     * If set to true, users can delete their messages.
     */
    private Boolean allowUserDeleteMessages;
    /**
     * If set to true, users can edit their messages.
     */
    private Boolean allowUserEditMessages;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new TeamMessagingSettings and sets the default values.
     */
    public TeamMessagingSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamMessagingSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamMessagingSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMessagingSettings();
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
     * Gets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowChannelMentions() {
        return this.allowChannelMentions;
    }
    /**
     * Gets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowOwnerDeleteMessages() {
        return this.allowOwnerDeleteMessages;
    }
    /**
     * Gets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowTeamMentions() {
        return this.allowTeamMentions;
    }
    /**
     * Gets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserDeleteMessages() {
        return this.allowUserDeleteMessages;
    }
    /**
     * Gets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserEditMessages() {
        return this.allowUserEditMessages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowChannelMentions", (n) -> { this.setAllowChannelMentions(n.getBooleanValue()); });
        deserializerMap.put("allowOwnerDeleteMessages", (n) -> { this.setAllowOwnerDeleteMessages(n.getBooleanValue()); });
        deserializerMap.put("allowTeamMentions", (n) -> { this.setAllowTeamMentions(n.getBooleanValue()); });
        deserializerMap.put("allowUserDeleteMessages", (n) -> { this.setAllowUserDeleteMessages(n.getBooleanValue()); });
        deserializerMap.put("allowUserEditMessages", (n) -> { this.setAllowUserEditMessages(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowChannelMentions", this.getAllowChannelMentions());
        writer.writeBooleanValue("allowOwnerDeleteMessages", this.getAllowOwnerDeleteMessages());
        writer.writeBooleanValue("allowTeamMentions", this.getAllowTeamMentions());
        writer.writeBooleanValue("allowUserDeleteMessages", this.getAllowUserDeleteMessages());
        writer.writeBooleanValue("allowUserEditMessages", this.getAllowUserEditMessages());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @param value Value to set for the allowChannelMentions property.
     */
    public void setAllowChannelMentions(@jakarta.annotation.Nullable final Boolean value) {
        this.allowChannelMentions = value;
    }
    /**
     * Sets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @param value Value to set for the allowOwnerDeleteMessages property.
     */
    public void setAllowOwnerDeleteMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.allowOwnerDeleteMessages = value;
    }
    /**
     * Sets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @param value Value to set for the allowTeamMentions property.
     */
    public void setAllowTeamMentions(@jakarta.annotation.Nullable final Boolean value) {
        this.allowTeamMentions = value;
    }
    /**
     * Sets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @param value Value to set for the allowUserDeleteMessages property.
     */
    public void setAllowUserDeleteMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.allowUserDeleteMessages = value;
    }
    /**
     * Sets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @param value Value to set for the allowUserEditMessages property.
     */
    public void setAllowUserEditMessages(@jakarta.annotation.Nullable final Boolean value) {
        this.allowUserEditMessages = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
