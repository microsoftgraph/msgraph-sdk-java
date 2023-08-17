package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessagePolicyViolationPolicyTip implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats)
     */
    private String complianceUrl;
    /**
     * Explanatory text shown to the sender of the message.
     */
    private String generalText;
    /**
     * The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     */
    private java.util.List<String> matchedConditionDescriptions;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new chatMessagePolicyViolationPolicyTip and sets the default values.
     */
    public ChatMessagePolicyViolationPolicyTip() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessagePolicyViolationPolicyTip
     */
    @jakarta.annotation.Nonnull
    public static ChatMessagePolicyViolationPolicyTip createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessagePolicyViolationPolicyTip();
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
     * Gets the complianceUrl property value. The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComplianceUrl() {
        return this.complianceUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("complianceUrl", (n) -> { this.setComplianceUrl(n.getStringValue()); });
        deserializerMap.put("generalText", (n) -> { this.setGeneralText(n.getStringValue()); });
        deserializerMap.put("matchedConditionDescriptions", (n) -> { this.setMatchedConditionDescriptions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generalText property value. Explanatory text shown to the sender of the message.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGeneralText() {
        return this.generalText;
    }
    /**
     * Gets the matchedConditionDescriptions property value. The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMatchedConditionDescriptions() {
        return this.matchedConditionDescriptions;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("complianceUrl", this.getComplianceUrl());
        writer.writeStringValue("generalText", this.getGeneralText());
        writer.writeCollectionOfPrimitiveValues("matchedConditionDescriptions", this.getMatchedConditionDescriptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the complianceUrl property value. The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats)
     * @param value Value to set for the complianceUrl property.
     */
    public void setComplianceUrl(@jakarta.annotation.Nullable final String value) {
        this.complianceUrl = value;
    }
    /**
     * Sets the generalText property value. Explanatory text shown to the sender of the message.
     * @param value Value to set for the generalText property.
     */
    public void setGeneralText(@jakarta.annotation.Nullable final String value) {
        this.generalText = value;
    }
    /**
     * Sets the matchedConditionDescriptions property value. The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     * @param value Value to set for the matchedConditionDescriptions property.
     */
    public void setMatchedConditionDescriptions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.matchedConditionDescriptions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
