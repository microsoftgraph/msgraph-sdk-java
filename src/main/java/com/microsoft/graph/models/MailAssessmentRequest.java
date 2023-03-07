package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /** The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk. */
    private MailDestinationRoutingReason destinationRoutingReason;
    /** The resource URI of the mail message for assessment. */
    private String messageUri;
    /** The mail recipient whose policies are used to assess the mail. */
    private String recipientEmail;
    /**
     * Instantiates a new MailAssessmentRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailAssessmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.mailAssessmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MailAssessmentRequest
     */
    @javax.annotation.Nonnull
    public static MailAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailAssessmentRequest();
    }
    /**
     * Gets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @return a mailDestinationRoutingReason
     */
    @javax.annotation.Nullable
    public MailDestinationRoutingReason getDestinationRoutingReason() {
        return this.destinationRoutingReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationRoutingReason", (n) -> { this.setDestinationRoutingReason(n.getEnumValue(MailDestinationRoutingReason.class)); });
        deserializerMap.put("messageUri", (n) -> { this.setMessageUri(n.getStringValue()); });
        deserializerMap.put("recipientEmail", (n) -> { this.setRecipientEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageUri property value. The resource URI of the mail message for assessment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageUri() {
        return this.messageUri;
    }
    /**
     * Gets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmail() {
        return this.recipientEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("destinationRoutingReason", this.getDestinationRoutingReason());
        writer.writeStringValue("messageUri", this.getMessageUri());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
    }
    /**
     * Sets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @param value Value to set for the destinationRoutingReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationRoutingReason(@javax.annotation.Nullable final MailDestinationRoutingReason value) {
        this.destinationRoutingReason = value;
    }
    /**
     * Sets the messageUri property value. The resource URI of the mail message for assessment.
     * @param value Value to set for the messageUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageUri(@javax.annotation.Nullable final String value) {
        this.messageUri = value;
    }
    /**
     * Sets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @param value Value to set for the recipientEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientEmail(@javax.annotation.Nullable final String value) {
        this.recipientEmail = value;
    }
}
