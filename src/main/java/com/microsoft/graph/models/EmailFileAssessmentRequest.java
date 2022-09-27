package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailFileAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /** Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored. */
    private String _contentData;
    /** The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk. */
    private MailDestinationRoutingReason _destinationRoutingReason;
    /** The mail recipient whose policies are used to assess the mail. */
    private String _recipientEmail;
    /**
     * Instantiates a new EmailFileAssessmentRequest and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static EmailFileAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailFileAssessmentRequest();
    }
    /**
     * Gets the contentData property value. Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentData() {
        return this._contentData;
    }
    /**
     * Gets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @return a mailDestinationRoutingReason
     */
    @javax.annotation.Nullable
    public MailDestinationRoutingReason getDestinationRoutingReason() {
        return this._destinationRoutingReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmailFileAssessmentRequest currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contentData", (n) -> { currentObject.setContentData(n.getStringValue()); });
            this.put("destinationRoutingReason", (n) -> { currentObject.setDestinationRoutingReason(n.getEnumValue(MailDestinationRoutingReason.class)); });
            this.put("recipientEmail", (n) -> { currentObject.setRecipientEmail(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmail() {
        return this._recipientEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentData", this.getContentData());
        writer.writeEnumValue("destinationRoutingReason", this.getDestinationRoutingReason());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
    }
    /**
     * Sets the contentData property value. Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored.
     * @param value Value to set for the contentData property.
     * @return a void
     */
    public void setContentData(@javax.annotation.Nullable final String value) {
        this._contentData = value;
    }
    /**
     * Sets the destinationRoutingReason property value. The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender, advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox, autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
     * @param value Value to set for the destinationRoutingReason property.
     * @return a void
     */
    public void setDestinationRoutingReason(@javax.annotation.Nullable final MailDestinationRoutingReason value) {
        this._destinationRoutingReason = value;
    }
    /**
     * Sets the recipientEmail property value. The mail recipient whose policies are used to assess the mail.
     * @param value Value to set for the recipientEmail property.
     * @return a void
     */
    public void setRecipientEmail(@javax.annotation.Nullable final String value) {
        this._recipientEmail = value;
    }
}
