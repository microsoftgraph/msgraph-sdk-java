package com.microsoft.graph.communications.calls.item.participants.invite;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InvitePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The clientContext property
     */
    private String clientContext;
    /**
     * The participants property
     */
    private java.util.List<InvitationParticipantInfo> participants;
    /**
     * Instantiates a new invitePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InvitePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a invitePostRequestBody
     */
    @javax.annotation.Nonnull
    public static InvitePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitePostRequestBody();
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
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this.clientContext;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("clientContext", (n) -> { this.setClientContext(n.getStringValue()); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the participants property value. The participants property
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getParticipants() {
        return this.participants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this.clientContext = value;
    }
    /**
     * Sets the participants property value. The participants property
     * @param value Value to set for the participants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipants(@javax.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this.participants = value;
    }
}
