package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessagePolicyViolation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The dlpAction property */
    private ChatMessagePolicyViolationDlpActionTypes _dlpAction;
    /** Justification text provided by the sender of the message when overriding a policy violation. */
    private String _justificationText;
    /** The policyTip property */
    private ChatMessagePolicyViolationPolicyTip _policyTip;
    /** The userAction property */
    private ChatMessagePolicyViolationUserActionTypes _userAction;
    /** The verdictDetails property */
    private ChatMessagePolicyViolationVerdictDetailsTypes _verdictDetails;
    /**
     * Instantiates a new chatMessagePolicyViolation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessagePolicyViolation
     */
    @javax.annotation.Nonnull
    public static ChatMessagePolicyViolation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessagePolicyViolation();
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
     * Gets the dlpAction property value. The dlpAction property
     * @return a chatMessagePolicyViolationDlpActionTypes
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationDlpActionTypes getDlpAction() {
        return this._dlpAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatMessagePolicyViolation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("dlpAction", (n) -> { currentObject.setDlpAction(n.getEnumValue(ChatMessagePolicyViolationDlpActionTypes.class)); });
            this.put("justificationText", (n) -> { currentObject.setJustificationText(n.getStringValue()); });
            this.put("policyTip", (n) -> { currentObject.setPolicyTip(n.getObjectValue(ChatMessagePolicyViolationPolicyTip::createFromDiscriminatorValue)); });
            this.put("userAction", (n) -> { currentObject.setUserAction(n.getEnumValue(ChatMessagePolicyViolationUserActionTypes.class)); });
            this.put("verdictDetails", (n) -> { currentObject.setVerdictDetails(n.getEnumValue(ChatMessagePolicyViolationVerdictDetailsTypes.class)); });
        }};
    }
    /**
     * Gets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustificationText() {
        return this._justificationText;
    }
    /**
     * Gets the policyTip property value. The policyTip property
     * @return a chatMessagePolicyViolationPolicyTip
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationPolicyTip getPolicyTip() {
        return this._policyTip;
    }
    /**
     * Gets the userAction property value. The userAction property
     * @return a chatMessagePolicyViolationUserActionTypes
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationUserActionTypes getUserAction() {
        return this._userAction;
    }
    /**
     * Gets the verdictDetails property value. The verdictDetails property
     * @return a chatMessagePolicyViolationVerdictDetailsTypes
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationVerdictDetailsTypes getVerdictDetails() {
        return this._verdictDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dlpAction", this.getDlpAction());
        writer.writeStringValue("justificationText", this.getJustificationText());
        writer.writeObjectValue("policyTip", this.getPolicyTip());
        writer.writeEnumValue("userAction", this.getUserAction());
        writer.writeEnumValue("verdictDetails", this.getVerdictDetails());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the dlpAction property value. The dlpAction property
     * @param value Value to set for the dlpAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDlpAction(@javax.annotation.Nullable final ChatMessagePolicyViolationDlpActionTypes value) {
        this._dlpAction = value;
    }
    /**
     * Sets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @param value Value to set for the justificationText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustificationText(@javax.annotation.Nullable final String value) {
        this._justificationText = value;
    }
    /**
     * Sets the policyTip property value. The policyTip property
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyTip(@javax.annotation.Nullable final ChatMessagePolicyViolationPolicyTip value) {
        this._policyTip = value;
    }
    /**
     * Sets the userAction property value. The userAction property
     * @param value Value to set for the userAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAction(@javax.annotation.Nullable final ChatMessagePolicyViolationUserActionTypes value) {
        this._userAction = value;
    }
    /**
     * Sets the verdictDetails property value. The verdictDetails property
     * @param value Value to set for the verdictDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerdictDetails(@javax.annotation.Nullable final ChatMessagePolicyViolationVerdictDetailsTypes value) {
        this._verdictDetails = value;
    }
}
