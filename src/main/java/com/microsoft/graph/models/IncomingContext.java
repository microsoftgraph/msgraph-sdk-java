package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IncomingContext implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The id of the participant that is under observation. Read-only. */
    private String _observedParticipantId;
    /** The identity that the call is happening on behalf of. */
    private IdentitySet _onBehalfOf;
    /** The id of the participant that triggered the incoming call. Read-only. */
    private String _sourceParticipantId;
    /** The identity that transferred the call. */
    private IdentitySet _transferor;
    /**
     * Instantiates a new incomingContext and sets the default values.
     * @return a void
     */
    public IncomingContext() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a incomingContext
     */
    @javax.annotation.Nonnull
    public static IncomingContext createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncomingContext();
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
        final IncomingContext currentObject = this;
        return new HashMap<>(4) {{
            this.put("observedParticipantId", (n) -> { currentObject.setObservedParticipantId(n.getStringValue()); });
            this.put("onBehalfOf", (n) -> { currentObject.setOnBehalfOf(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("sourceParticipantId", (n) -> { currentObject.setSourceParticipantId(n.getStringValue()); });
            this.put("transferor", (n) -> { currentObject.setTransferor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the observedParticipantId property value. The id of the participant that is under observation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObservedParticipantId() {
        return this._observedParticipantId;
    }
    /**
     * Gets the onBehalfOf property value. The identity that the call is happening on behalf of.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOnBehalfOf() {
        return this._onBehalfOf;
    }
    /**
     * Gets the sourceParticipantId property value. The id of the participant that triggered the incoming call. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceParticipantId() {
        return this._sourceParticipantId;
    }
    /**
     * Gets the transferor property value. The identity that transferred the call.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getTransferor() {
        return this._transferor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("observedParticipantId", this.getObservedParticipantId());
        writer.writeObjectValue("onBehalfOf", this.getOnBehalfOf());
        writer.writeStringValue("sourceParticipantId", this.getSourceParticipantId());
        writer.writeObjectValue("transferor", this.getTransferor());
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
     * Sets the observedParticipantId property value. The id of the participant that is under observation. Read-only.
     * @param value Value to set for the observedParticipantId property.
     * @return a void
     */
    public void setObservedParticipantId(@javax.annotation.Nullable final String value) {
        this._observedParticipantId = value;
    }
    /**
     * Sets the onBehalfOf property value. The identity that the call is happening on behalf of.
     * @param value Value to set for the onBehalfOf property.
     * @return a void
     */
    public void setOnBehalfOf(@javax.annotation.Nullable final IdentitySet value) {
        this._onBehalfOf = value;
    }
    /**
     * Sets the sourceParticipantId property value. The id of the participant that triggered the incoming call. Read-only.
     * @param value Value to set for the sourceParticipantId property.
     * @return a void
     */
    public void setSourceParticipantId(@javax.annotation.Nullable final String value) {
        this._sourceParticipantId = value;
    }
    /**
     * Sets the transferor property value. The identity that transferred the call.
     * @param value Value to set for the transferor property.
     * @return a void
     */
    public void setTransferor(@javax.annotation.Nullable final IdentitySet value) {
        this._transferor = value;
    }
}
