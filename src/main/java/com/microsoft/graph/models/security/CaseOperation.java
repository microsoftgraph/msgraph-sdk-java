package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.ResultInfo;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseOperation extends Entity implements Parsable {
    /**
     * The type of action the operation represents. Possible values are: addToReviewSet,applyTags,contentExport,convertToPdf,estimateStatistics, purgeData
     */
    private CaseAction action;
    /**
     * The date and time the operation was completed.
     */
    private OffsetDateTime completedDateTime;
    /**
     * The user that created the operation.
     */
    private IdentitySet createdBy;
    /**
     * The date and time the operation was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The progress of the operation.
     */
    private Integer percentProgress;
    /**
     * Contains success and failure-specific result information.
     */
    private ResultInfo resultInfo;
    /**
     * The status of the case operation. Possible values are: notStarted, submissionFailed, running, succeeded, partiallySucceeded, failed.
     */
    private CaseOperationStatus status;
    /**
     * Instantiates a new caseOperation and sets the default values.
     */
    public CaseOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a caseOperation
     */
    @jakarta.annotation.Nonnull
    public static CaseOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.ediscoveryAddToReviewSetOperation": return new EdiscoveryAddToReviewSetOperation();
                case "#microsoft.graph.security.ediscoveryEstimateOperation": return new EdiscoveryEstimateOperation();
                case "#microsoft.graph.security.ediscoveryExportOperation": return new EdiscoveryExportOperation();
                case "#microsoft.graph.security.ediscoveryHoldOperation": return new EdiscoveryHoldOperation();
                case "#microsoft.graph.security.ediscoveryIndexOperation": return new EdiscoveryIndexOperation();
                case "#microsoft.graph.security.ediscoveryPurgeDataOperation": return new EdiscoveryPurgeDataOperation();
                case "#microsoft.graph.security.ediscoveryTagOperation": return new EdiscoveryTagOperation();
            }
        }
        return new CaseOperation();
    }
    /**
     * Gets the action property value. The type of action the operation represents. Possible values are: addToReviewSet,applyTags,contentExport,convertToPdf,estimateStatistics, purgeData
     * @return a caseAction
     */
    @jakarta.annotation.Nullable
    public CaseAction getAction() {
        return this.action;
    }
    /**
     * Gets the completedDateTime property value. The date and time the operation was completed.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the createdBy property value. The user that created the operation.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time the operation was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(CaseAction.class)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("percentProgress", (n) -> { this.setPercentProgress(n.getIntegerValue()); });
        deserializerMap.put("resultInfo", (n) -> { this.setResultInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CaseOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the percentProgress property value. The progress of the operation.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentProgress() {
        return this.percentProgress;
    }
    /**
     * Gets the resultInfo property value. Contains success and failure-specific result information.
     * @return a resultInfo
     */
    @jakarta.annotation.Nullable
    public ResultInfo getResultInfo() {
        return this.resultInfo;
    }
    /**
     * Gets the status property value. The status of the case operation. Possible values are: notStarted, submissionFailed, running, succeeded, partiallySucceeded, failed.
     * @return a caseOperationStatus
     */
    @jakarta.annotation.Nullable
    public CaseOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("percentProgress", this.getPercentProgress());
        writer.writeObjectValue("resultInfo", this.getResultInfo());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the action property value. The type of action the operation represents. Possible values are: addToReviewSet,applyTags,contentExport,convertToPdf,estimateStatistics, purgeData
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final CaseAction value) {
        this.action = value;
    }
    /**
     * Sets the completedDateTime property value. The date and time the operation was completed.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. The user that created the operation.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the operation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the percentProgress property value. The progress of the operation.
     * @param value Value to set for the percentProgress property.
     */
    public void setPercentProgress(@jakarta.annotation.Nullable final Integer value) {
        this.percentProgress = value;
    }
    /**
     * Sets the resultInfo property value. Contains success and failure-specific result information.
     * @param value Value to set for the resultInfo property.
     */
    public void setResultInfo(@jakarta.annotation.Nullable final ResultInfo value) {
        this.resultInfo = value;
    }
    /**
     * Sets the status property value. The status of the case operation. Possible values are: notStarted, submissionFailed, running, succeeded, partiallySucceeded, failed.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CaseOperationStatus value) {
        this.status = value;
    }
}
