package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessagePolicyViolation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ChatMessagePolicyViolation and sets the default values.
     */
    public ChatMessagePolicyViolation() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatMessagePolicyViolation
     */
    @jakarta.annotation.Nonnull
    public static ChatMessagePolicyViolation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessagePolicyViolation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     * @return a EnumSet<ChatMessagePolicyViolationDlpActionTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ChatMessagePolicyViolationDlpActionTypes> getDlpAction() {
        return this.getBackingStore().get("dlpAction");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dlpAction", (n) -> { this.setDlpAction(n.getEnumSetValue(ChatMessagePolicyViolationDlpActionTypes.class)); });
        deserializerMap.put("justificationText", (n) -> { this.setJustificationText(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyTip", (n) -> { this.setPolicyTip(n.getObjectValue(ChatMessagePolicyViolationPolicyTip::createFromDiscriminatorValue)); });
        deserializerMap.put("userAction", (n) -> { this.setUserAction(n.getEnumSetValue(ChatMessagePolicyViolationUserActionTypes.class)); });
        deserializerMap.put("verdictDetails", (n) -> { this.setVerdictDetails(n.getEnumSetValue(ChatMessagePolicyViolationVerdictDetailsTypes.class)); });
        return deserializerMap;
    }
    /**
     * Gets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustificationText() {
        return this.getBackingStore().get("justificationText");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @return a ChatMessagePolicyViolationPolicyTip
     */
    @jakarta.annotation.Nullable
    public ChatMessagePolicyViolationPolicyTip getPolicyTip() {
        return this.getBackingStore().get("policyTip");
    }
    /**
     * Gets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction isn't required.
     * @return a EnumSet<ChatMessagePolicyViolationUserActionTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ChatMessagePolicyViolationUserActionTypes> getUserAction() {
        return this.getBackingStore().get("userAction");
    }
    /**
     * Gets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction hides it.AllowOverrideWithoutJustification -- Allows the sender to override the DLP violation and allow readers to see the message again if the dlpAction hides it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to override the DLP violation and allow readers to see the message again if the dlpAction hides it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     * @return a EnumSet<ChatMessagePolicyViolationVerdictDetailsTypes>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ChatMessagePolicyViolationVerdictDetailsTypes> getVerdictDetails() {
        return this.getBackingStore().get("verdictDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("dlpAction", this.getDlpAction());
        writer.writeStringValue("justificationText", this.getJustificationText());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("policyTip", this.getPolicyTip());
        writer.writeEnumSetValue("userAction", this.getUserAction());
        writer.writeEnumSetValue("verdictDetails", this.getVerdictDetails());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the dlpAction property value. The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender -- Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users within the organization to read the message.
     * @param value Value to set for the dlpAction property.
     */
    public void setDlpAction(@jakarta.annotation.Nullable final EnumSet<ChatMessagePolicyViolationDlpActionTypes> value) {
        this.getBackingStore().set("dlpAction", value);
    }
    /**
     * Sets the justificationText property value. Justification text provided by the sender of the message when overriding a policy violation.
     * @param value Value to set for the justificationText property.
     */
    public void setJustificationText(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("justificationText", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the policyTip property value. Information to display to the message sender about why the message was flagged as a violation.
     * @param value Value to set for the policyTip property.
     */
    public void setPolicyTip(@jakarta.annotation.Nullable final ChatMessagePolicyViolationPolicyTip value) {
        this.getBackingStore().set("policyTip", value);
    }
    /**
     * Sets the userAction property value. Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are: NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction isn't required.
     * @param value Value to set for the userAction property.
     */
    public void setUserAction(@jakarta.annotation.Nullable final EnumSet<ChatMessagePolicyViolationUserActionTypes> value) {
        this.getBackingStore().set("userAction", value);
    }
    /**
     * Sets the verdictDetails property value. Indicates what actions the sender may take in response to the policy violation. Supported values are: NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and its rules, and allow readers to see the message again if the dlpAction hides it.AllowOverrideWithoutJustification -- Allows the sender to override the DLP violation and allow readers to see the message again if the dlpAction hides it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender to override the DLP violation and allow readers to see the message again if the dlpAction hides it, after providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually exclusive.
     * @param value Value to set for the verdictDetails property.
     */
    public void setVerdictDetails(@jakarta.annotation.Nullable final EnumSet<ChatMessagePolicyViolationVerdictDetailsTypes> value) {
        this.getBackingStore().set("verdictDetails", value);
    }
}
