package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessagePolicyViolation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     */
    private ChatMessagePolicyViolationDlpActionTypes dlpAction;
    /**
     * Justification text provided by the sender of the message when overriding a policy violation.
     */
    private String justificationText;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Information to display to the message sender about why the message was flagged as a violation.
     */
    private ChatMessagePolicyViolationPolicyTip policyTip;
    /**
     * Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     */
    private ChatMessagePolicyViolationUserActionTypes userAction;
    /**
     * Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     */
    private ChatMessagePolicyViolationVerdictDetailsTypes verdictDetails;
    /**
     * Instantiates a new chatMessagePolicyViolation and sets the default values.
     */
    public ChatMessagePolicyViolation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessagePolicyViolation
     */
    @jakarta.annotation.Nonnull
    public static ChatMessagePolicyViolation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessagePolicyViolation();
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
     * Gets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     * @return a chatMessagePolicyViolationDlpActionTypes
     */
    @jakarta.annotation.Nullable
    public ChatMessagePolicyViolationDlpActionTypes getDlpAction() {
        return this.dlpAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dlpAction", (n) -> { this.setDlpAction(n.getEnumValue(ChatMessagePolicyViolationDlpActionTypes.class)); });
        deserializerMap.put("justificationText", (n) -> { this.setJustificationText(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyTip", (n) -> { this.setPolicyTip(n.getObjectValue(ChatMessagePolicyViolationPolicyTip::createFromDiscriminatorValue)); });
        deserializerMap.put("userAction", (n) -> { this.setUserAction(n.getEnumValue(ChatMessagePolicyViolationUserActionTypes.class)); });
        deserializerMap.put("verdictDetails", (n) -> { this.setVerdictDetails(n.getEnumValue(ChatMessagePolicyViolationVerdictDetailsTypes.class)); });
        return deserializerMap;
    }
    /**
     * Gets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJustificationText() {
        return this.justificationText;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @return a chatMessagePolicyViolationPolicyTip
     */
    @jakarta.annotation.Nullable
    public ChatMessagePolicyViolationPolicyTip getPolicyTip() {
        return this.policyTip;
    }
    /**
     * Gets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     * @return a chatMessagePolicyViolationUserActionTypes
     */
    @jakarta.annotation.Nullable
    public ChatMessagePolicyViolationUserActionTypes getUserAction() {
        return this.userAction;
    }
    /**
     * Gets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     * @return a chatMessagePolicyViolationVerdictDetailsTypes
     */
    @jakarta.annotation.Nullable
    public ChatMessagePolicyViolationVerdictDetailsTypes getVerdictDetails() {
        return this.verdictDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("dlpAction", this.getDlpAction());
        writer.writeStringValue("justificationText", this.getJustificationText());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("policyTip", this.getPolicyTip());
        writer.writeEnumValue("userAction", this.getUserAction());
        writer.writeEnumValue("verdictDetails", this.getVerdictDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     * @param value Value to set for the dlpAction property.
     */
    public void setDlpAction(@jakarta.annotation.Nullable final ChatMessagePolicyViolationDlpActionTypes value) {
        this.dlpAction = value;
    }
    /**
     * Sets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @param value Value to set for the justificationText property.
     */
    public void setJustificationText(@jakarta.annotation.Nullable final String value) {
        this.justificationText = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @param value Value to set for the policyTip property.
     */
    public void setPolicyTip(@jakarta.annotation.Nullable final ChatMessagePolicyViolationPolicyTip value) {
        this.policyTip = value;
    }
    /**
     * Sets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction is not required.
     * @param value Value to set for the userAction property.
     */
    public void setUserAction(@jakarta.annotation.Nullable final ChatMessagePolicyViolationUserActionTypes value) {
        this.userAction = value;
    }
    /**
     * Sets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     * @param value Value to set for the verdictDetails property.
     */
    public void setVerdictDetails(@jakarta.annotation.Nullable final ChatMessagePolicyViolationVerdictDetailsTypes value) {
        this.verdictDetails = value;
    }
}
