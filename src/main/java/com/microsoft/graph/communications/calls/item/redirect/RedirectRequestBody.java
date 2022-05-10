package microsoft.graph.communications.calls.item.redirect;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.InvitationParticipantInfo;
/** Provides operations to call the redirect method. */
public class RedirectRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The callbackUri property */
    private String _callbackUri;
    /** The targets property */
    private java.util.List<InvitationParticipantInfo> _targets;
    /** The timeout property */
    private Integer _timeout;
    /**
     * Instantiates a new redirectRequestBody and sets the default values.
     * @return a void
     */
    public RedirectRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redirectRequestBody
     */
    @javax.annotation.Nonnull
    public static RedirectRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectRequestBody();
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
     * Gets the callbackUri property value. The callbackUri property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCallbackUri() {
        return this._callbackUri;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RedirectRequestBody currentObject = this;
        return new HashMap<>(3) {{
            this.put("callbackUri", (n) -> { currentObject.setCallbackUri(n.getStringValue()); });
            this.put("targets", (n) -> { currentObject.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
            this.put("timeout", (n) -> { currentObject.setTimeout(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the targets property value. The targets property
     * @return a invitationParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this._targets;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTimeout() {
        return this._timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeIntegerValue("timeout", this.getTimeout());
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    public void setCallbackUri(@javax.annotation.Nullable final String value) {
        this._callbackUri = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    public void setTargets(@javax.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this._targets = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     * @return a void
     */
    public void setTimeout(@javax.annotation.Nullable final Integer value) {
        this._timeout = value;
    }
}
