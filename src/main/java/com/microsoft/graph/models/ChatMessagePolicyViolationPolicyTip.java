package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessagePolicyViolationPolicyTip implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats) */
    private String _complianceUrl;
    /** Explanatory text shown to the sender of the message. */
    private String _generalText;
    /** The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'. */
    private java.util.List<String> _matchedConditionDescriptions;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new chatMessagePolicyViolationPolicyTip and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ChatMessagePolicyViolationPolicyTip() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a chatMessagePolicyViolationPolicyTip
     */
    @javax.annotation.Nonnull
    public static ChatMessagePolicyViolationPolicyTip createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessagePolicyViolationPolicyTip();
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
     * Gets the complianceUrl property value. The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComplianceUrl() {
        return this._complianceUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
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
    @javax.annotation.Nullable
    public String getGeneralText() {
        return this._generalText;
    }
    /**
     * Gets the matchedConditionDescriptions property value. The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMatchedConditionDescriptions() {
        return this._matchedConditionDescriptions;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("complianceUrl", this.getComplianceUrl());
        writer.writeStringValue("generalText", this.getGeneralText());
        writer.writeCollectionOfPrimitiveValues("matchedConditionDescriptions", this.getMatchedConditionDescriptions());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the complianceUrl property value. The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what users shouldn't say in chats)
     * @param value Value to set for the complianceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceUrl(@javax.annotation.Nullable final String value) {
        this._complianceUrl = value;
    }
    /**
     * Sets the generalText property value. Explanatory text shown to the sender of the message.
     * @param value Value to set for the generalText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGeneralText(@javax.annotation.Nullable final String value) {
        this._generalText = value;
    }
    /**
     * Sets the matchedConditionDescriptions property value. The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     * @param value Value to set for the matchedConditionDescriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchedConditionDescriptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._matchedConditionDescriptions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
