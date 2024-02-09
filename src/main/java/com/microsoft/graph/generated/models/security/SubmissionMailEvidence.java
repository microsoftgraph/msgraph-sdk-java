package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmissionMailEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link SubmissionMailEvidence} and sets the default values.
     */
    public SubmissionMailEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.submissionMailEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SubmissionMailEvidence}
     */
    @jakarta.annotation.Nonnull
    public static SubmissionMailEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmissionMailEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("networkMessageId", (n) -> { this.setNetworkMessageId(n.getStringValue()); });
        deserializerMap.put("recipient", (n) -> { this.setRecipient(n.getStringValue()); });
        deserializerMap.put("reportType", (n) -> { this.setReportType(n.getStringValue()); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getStringValue()); });
        deserializerMap.put("senderIp", (n) -> { this.setSenderIp(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("submissionDateTime", (n) -> { this.setSubmissionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("submissionId", (n) -> { this.setSubmissionId(n.getStringValue()); });
        deserializerMap.put("submitter", (n) -> { this.setSubmitter(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkMessageId property value. The networkMessageId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkMessageId() {
        return this.backingStore.get("networkMessageId");
    }
    /**
     * Gets the recipient property value. The recipient property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipient() {
        return this.backingStore.get("recipient");
    }
    /**
     * Gets the reportType property value. The reportType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportType() {
        return this.backingStore.get("reportType");
    }
    /**
     * Gets the sender property value. The sender property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSender() {
        return this.backingStore.get("sender");
    }
    /**
     * Gets the senderIp property value. The senderIp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderIp() {
        return this.backingStore.get("senderIp");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the submissionDateTime property value. The submissionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubmissionDateTime() {
        return this.backingStore.get("submissionDateTime");
    }
    /**
     * Gets the submissionId property value. The submissionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubmissionId() {
        return this.backingStore.get("submissionId");
    }
    /**
     * Gets the submitter property value. The submitter property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubmitter() {
        return this.backingStore.get("submitter");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("networkMessageId", this.getNetworkMessageId());
        writer.writeStringValue("recipient", this.getRecipient());
        writer.writeStringValue("reportType", this.getReportType());
        writer.writeStringValue("sender", this.getSender());
        writer.writeStringValue("senderIp", this.getSenderIp());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeOffsetDateTimeValue("submissionDateTime", this.getSubmissionDateTime());
        writer.writeStringValue("submissionId", this.getSubmissionId());
        writer.writeStringValue("submitter", this.getSubmitter());
    }
    /**
     * Sets the networkMessageId property value. The networkMessageId property
     * @param value Value to set for the networkMessageId property.
     */
    public void setNetworkMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkMessageId", value);
    }
    /**
     * Sets the recipient property value. The recipient property
     * @param value Value to set for the recipient property.
     */
    public void setRecipient(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipient", value);
    }
    /**
     * Sets the reportType property value. The reportType property
     * @param value Value to set for the reportType property.
     */
    public void setReportType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reportType", value);
    }
    /**
     * Sets the sender property value. The sender property
     * @param value Value to set for the sender property.
     */
    public void setSender(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sender", value);
    }
    /**
     * Sets the senderIp property value. The senderIp property
     * @param value Value to set for the senderIp property.
     */
    public void setSenderIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderIp", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the submissionDateTime property value. The submissionDateTime property
     * @param value Value to set for the submissionDateTime property.
     */
    public void setSubmissionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("submissionDateTime", value);
    }
    /**
     * Sets the submissionId property value. The submissionId property
     * @param value Value to set for the submissionId property.
     */
    public void setSubmissionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("submissionId", value);
    }
    /**
     * Sets the submitter property value. The submitter property
     * @param value Value to set for the submitter property.
     */
    public void setSubmitter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("submitter", value);
    }
}
