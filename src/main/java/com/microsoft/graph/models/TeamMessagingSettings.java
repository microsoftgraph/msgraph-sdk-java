package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamMessagingSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If set to true, @channel mentions are allowed. */
    private Boolean _allowChannelMentions;
    /** If set to true, owners can delete any message. */
    private Boolean _allowOwnerDeleteMessages;
    /** If set to true, @team mentions are allowed. */
    private Boolean _allowTeamMentions;
    /** If set to true, users can delete their messages. */
    private Boolean _allowUserDeleteMessages;
    /** If set to true, users can edit their messages. */
    private Boolean _allowUserEditMessages;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new teamMessagingSettings and sets the default values.
     * @return a void
     */
    public TeamMessagingSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamMessagingSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamMessagingSettings
     */
    @javax.annotation.Nonnull
    public static TeamMessagingSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamMessagingSettings();
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
     * Gets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowChannelMentions() {
        return this._allowChannelMentions;
    }
    /**
     * Gets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowOwnerDeleteMessages() {
        return this._allowOwnerDeleteMessages;
    }
    /**
     * Gets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTeamMentions() {
        return this._allowTeamMentions;
    }
    /**
     * Gets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUserDeleteMessages() {
        return this._allowUserDeleteMessages;
    }
    /**
     * Gets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUserEditMessages() {
        return this._allowUserEditMessages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamMessagingSettings currentObject = this;
        return new HashMap<>(6) {{
            this.put("allowChannelMentions", (n) -> { currentObject.setAllowChannelMentions(n.getBooleanValue()); });
            this.put("allowOwnerDeleteMessages", (n) -> { currentObject.setAllowOwnerDeleteMessages(n.getBooleanValue()); });
            this.put("allowTeamMentions", (n) -> { currentObject.setAllowTeamMentions(n.getBooleanValue()); });
            this.put("allowUserDeleteMessages", (n) -> { currentObject.setAllowUserDeleteMessages(n.getBooleanValue()); });
            this.put("allowUserEditMessages", (n) -> { currentObject.setAllowUserEditMessages(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowChannelMentions property value. If set to true, @channel mentions are allowed.
     * @param value Value to set for the allowChannelMentions property.
     * @return a void
     */
    public void setAllowChannelMentions(@javax.annotation.Nullable final Boolean value) {
        this._allowChannelMentions = value;
    }
    /**
     * Sets the allowOwnerDeleteMessages property value. If set to true, owners can delete any message.
     * @param value Value to set for the allowOwnerDeleteMessages property.
     * @return a void
     */
    public void setAllowOwnerDeleteMessages(@javax.annotation.Nullable final Boolean value) {
        this._allowOwnerDeleteMessages = value;
    }
    /**
     * Sets the allowTeamMentions property value. If set to true, @team mentions are allowed.
     * @param value Value to set for the allowTeamMentions property.
     * @return a void
     */
    public void setAllowTeamMentions(@javax.annotation.Nullable final Boolean value) {
        this._allowTeamMentions = value;
    }
    /**
     * Sets the allowUserDeleteMessages property value. If set to true, users can delete their messages.
     * @param value Value to set for the allowUserDeleteMessages property.
     * @return a void
     */
    public void setAllowUserDeleteMessages(@javax.annotation.Nullable final Boolean value) {
        this._allowUserDeleteMessages = value;
    }
    /**
     * Sets the allowUserEditMessages property value. If set to true, users can edit their messages.
     * @param value Value to set for the allowUserEditMessages property.
     * @return a void
     */
    public void setAllowUserEditMessages(@javax.annotation.Nullable final Boolean value) {
        this._allowUserEditMessages = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
