package com.microsoft.graph.communications.calls.item.redirect;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RedirectPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The callbackUri property
     */
    private String callbackUri;
    /**
     * The targets property
     */
    private java.util.List<InvitationParticipantInfo> targets;
    /**
     * The timeout property
     */
    private Integer timeout;
    /**
     * Instantiates a new redirectPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public RedirectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redirectPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RedirectPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectPostRequestBody();
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
     * Gets the callbackUri property value. The callbackUri property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCallbackUri() {
        return this.callbackUri;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("callbackUri", (n) -> { this.setCallbackUri(n.getStringValue()); });
        deserializerMap.put("targets", (n) -> { this.setTargets(n.getCollectionOfObjectValues(InvitationParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targets property value. The targets property
     * @return a invitationParticipantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<InvitationParticipantInfo> getTargets() {
        return this.targets;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callbackUri", this.getCallbackUri());
        writer.writeCollectionOfObjectValues("targets", this.getTargets());
        writer.writeIntegerValue("timeout", this.getTimeout());
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
     * Sets the callbackUri property value. The callbackUri property
     * @param value Value to set for the callbackUri property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCallbackUri(@jakarta.annotation.Nullable final String value) {
        this.callbackUri = value;
    }
    /**
     * Sets the targets property value. The targets property
     * @param value Value to set for the targets property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTargets(@jakarta.annotation.Nullable final java.util.List<InvitationParticipantInfo> value) {
        this.targets = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.timeout = value;
    }
}
