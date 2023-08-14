package com.microsoft.graph.communications.calls.item.transfer;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.ParticipantInfo;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TransferPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The transferee property
     */
    private ParticipantInfo transferee;
    /**
     * The transferTarget property
     */
    private InvitationParticipantInfo transferTarget;
    /**
     * Instantiates a new transferPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TransferPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a transferPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TransferPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransferPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("transferee", (n) -> { this.setTransferee(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("transferTarget", (n) -> { this.setTransferTarget(n.getObjectValue(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the transferee property value. The transferee property
     * @return a participantInfo
     */
    @jakarta.annotation.Nullable
    public ParticipantInfo getTransferee() {
        return this.transferee;
    }
    /**
     * Gets the transferTarget property value. The transferTarget property
     * @return a invitationParticipantInfo
     */
    @jakarta.annotation.Nullable
    public InvitationParticipantInfo getTransferTarget() {
        return this.transferTarget;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("transferee", this.getTransferee());
        writer.writeObjectValue("transferTarget", this.getTransferTarget());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the transferee property value. The transferee property
     * @param value Value to set for the transferee property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTransferee(@jakarta.annotation.Nullable final ParticipantInfo value) {
        this.transferee = value;
    }
    /**
     * Sets the transferTarget property value. The transferTarget property
     * @param value Value to set for the transferTarget property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTransferTarget(@jakarta.annotation.Nullable final InvitationParticipantInfo value) {
        this.transferTarget = value;
    }
}
