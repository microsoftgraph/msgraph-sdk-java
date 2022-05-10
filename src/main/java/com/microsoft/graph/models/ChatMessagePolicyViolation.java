package microsoft.graph.models;

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
    /** The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message. */
    private ChatMessagePolicyViolationDlpActionTypes _dlpAction;
    /** Justification text provided by the sender of the message when overriding a policy violation. */
    private String _justificationText;
    /** Information to display to the message sender about why the message was flagged as a violation. */
    private ChatMessagePolicyViolationPolicyTip _policyTip;
    /** Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required. */
    private ChatMessagePolicyViolationUserActionTypes _userAction;
    /** Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive. */
    private ChatMessagePolicyViolationVerdictDetailsTypes _verdictDetails;
    /**
     * Instantiates a new chatMessagePolicyViolation and sets the default values.
     * @return a void
     */
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
     * Gets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
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
        return new HashMap<>(5) {{
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
     * Gets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @return a chatMessagePolicyViolationPolicyTip
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationPolicyTip getPolicyTip() {
        return this._policyTip;
    }
    /**
     * Gets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     * @return a chatMessagePolicyViolationUserActionTypes
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationUserActionTypes getUserAction() {
        return this._userAction;
    }
    /**
     * Gets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     * @param value Value to set for the dlpAction property.
     * @return a void
     */
    public void setDlpAction(@javax.annotation.Nullable final ChatMessagePolicyViolationDlpActionTypes value) {
        this._dlpAction = value;
    }
    /**
     * Sets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @param value Value to set for the justificationText property.
     * @return a void
     */
    public void setJustificationText(@javax.annotation.Nullable final String value) {
        this._justificationText = value;
    }
    /**
     * Sets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @param value Value to set for the policyTip property.
     * @return a void
     */
    public void setPolicyTip(@javax.annotation.Nullable final ChatMessagePolicyViolationPolicyTip value) {
        this._policyTip = value;
    }
    /**
     * Sets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     * @param value Value to set for the userAction property.
     * @return a void
     */
    public void setUserAction(@javax.annotation.Nullable final ChatMessagePolicyViolationUserActionTypes value) {
        this._userAction = value;
    }
    /**
     * Sets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     * @param value Value to set for the verdictDetails property.
     * @return a void
     */
    public void setVerdictDetails(@javax.annotation.Nullable final ChatMessagePolicyViolationVerdictDetailsTypes value) {
        this._verdictDetails = value;
    }
}
