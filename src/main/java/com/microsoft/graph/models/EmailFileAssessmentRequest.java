package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailFileAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /**
     * Instantiates a new EmailFileAssessmentRequest and sets the default values.
     */
    public EmailFileAssessmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.emailFileAssessmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailFileAssessmentRequest
     */
    @jakarta.annotation.Nonnull
    public static EmailFileAssessmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailFileAssessmentRequest();
    }
    /**
     * Gets the contentData property value. Base64 encoded .eml email file content. The file content can't fetch back because it isn't stored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentData() {
        return this.backingStore.get("contentData");
    }
    /**
     * Gets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @return a MailDestinationRoutingReason
     */
    @jakarta.annotation.Nullable
    public MailDestinationRoutingReason getDestinationRoutingReason() {
        return this.backingStore.get("destinationRoutingReason");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentData", (n) -> { this.setContentData(n.getStringValue()); });
        deserializerMap.put("destinationRoutingReason", (n) -> { this.setDestinationRoutingReason(n.getEnumValue(MailDestinationRoutingReason::forValue)); });
        deserializerMap.put("recipientEmail", (n) -> { this.setRecipientEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmail() {
        return this.backingStore.get("recipientEmail");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentData", this.getContentData());
        writer.writeEnumValue("destinationRoutingReason", this.getDestinationRoutingReason());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
    }
    /**
     * Sets the contentData property value. Base64 encoded .eml email file content. The file content can't fetch back because it isn't stored.
     * @param value Value to set for the contentData property.
     */
    public void setContentData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentData", value);
    }
    /**
     * Sets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @param value Value to set for the destinationRoutingReason property.
     */
    public void setDestinationRoutingReason(@jakarta.annotation.Nullable final MailDestinationRoutingReason value) {
        this.backingStore.set("destinationRoutingReason", value);
    }
    /**
     * Sets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @param value Value to set for the recipientEmail property.
     */
    public void setRecipientEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientEmail", value);
    }
}
