package microsoft.graph.communications.calls.item.transfer;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.InvitationParticipantInfo;
import microsoft.graph.models.ParticipantInfo;
/** Provides operations to call the transfer method.  */
public class TransferRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The transferee property  */
    private ParticipantInfo _transferee;
    /** The transferTarget property  */
    private InvitationParticipantInfo _transferTarget;
    /**
     * Instantiates a new transferRequestBody and sets the default values.
     * @return a void
     */
    public TransferRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a transferRequestBody
     */
    @javax.annotation.Nonnull
    public static TransferRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransferRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TransferRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("transferee", (n) -> { currentObject.setTransferee(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
            this.put("transferTarget", (n) -> { currentObject.setTransferTarget(n.getObjectValue(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the transferee property value. The transferee property
     * @return a participantInfo
     */
    @javax.annotation.Nullable
    public ParticipantInfo getTransferee() {
        return this._transferee;
    }
    /**
     * Gets the transferTarget property value. The transferTarget property
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public InvitationParticipantInfo getTransferTarget() {
        return this._transferTarget;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("transferee", this.getTransferee());
        writer.writeObjectValue("transferTarget", this.getTransferTarget());
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
     * Sets the transferee property value. The transferee property
     * @param value Value to set for the transferee property.
     * @return a void
     */
    public void setTransferee(@javax.annotation.Nullable final ParticipantInfo value) {
        this._transferee = value;
    }
    /**
     * Sets the transferTarget property value. The transferTarget property
     * @param value Value to set for the transferTarget property.
     * @return a void
     */
    public void setTransferTarget(@javax.annotation.Nullable final InvitationParticipantInfo value) {
        this._transferTarget = value;
    }
}
