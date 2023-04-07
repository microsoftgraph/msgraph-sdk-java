package com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.batchrecorddecisions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BatchRecordDecisionsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The decision property */
    private String decision;
    /** The justification property */
    private String justification;
    /** The principalId property */
    private String principalId;
    /** The resourceId property */
    private String resourceId;
    /**
     * Instantiates a new batchRecordDecisionsPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BatchRecordDecisionsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a batchRecordDecisionsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static BatchRecordDecisionsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchRecordDecisionsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the decision property value. The decision property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecision() {
        return this.decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getStringValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The justification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the principalId property value. The principalId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Gets the resourceId property value. The resourceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("decision", this.getDecision());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the decision property value. The decision property
     * @param value Value to set for the decision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecision(@javax.annotation.Nullable final String value) {
        this.decision = value;
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustification(@javax.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the principalId property value. The principalId property
     * @param value Value to set for the principalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this.principalId = value;
    }
    /**
     * Sets the resourceId property value. The resourceId property
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this.resourceId = value;
    }
}
