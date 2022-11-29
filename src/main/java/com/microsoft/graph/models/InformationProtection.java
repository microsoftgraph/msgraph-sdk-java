package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtection extends Entity implements Parsable {
    /** The bitlocker property */
    private Bitlocker _bitlocker;
    /** The threatAssessmentRequests property */
    private java.util.List<ThreatAssessmentRequest> _threatAssessmentRequests;
    /**
     * Instantiates a new InformationProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InformationProtection
     */
    @javax.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * Gets the bitlocker property value. The bitlocker property
     * @return a bitlocker
     */
    @javax.annotation.Nullable
    public Bitlocker getBitlocker() {
        return this._bitlocker;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtection currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("bitlocker", (n) -> { currentObject.setBitlocker(n.getObjectValue(Bitlocker::createFromDiscriminatorValue)); });
            this.put("threatAssessmentRequests", (n) -> { currentObject.setThreatAssessmentRequests(n.getCollectionOfObjectValues(ThreatAssessmentRequest::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @return a threatAssessmentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<ThreatAssessmentRequest> getThreatAssessmentRequests() {
        return this._threatAssessmentRequests;
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
        writer.writeObjectValue("bitlocker", this.getBitlocker());
        writer.writeCollectionOfObjectValues("threatAssessmentRequests", this.getThreatAssessmentRequests());
    }
    /**
     * Sets the bitlocker property value. The bitlocker property
     * @param value Value to set for the bitlocker property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitlocker(@javax.annotation.Nullable final Bitlocker value) {
        this._bitlocker = value;
    }
    /**
     * Sets the threatAssessmentRequests property value. The threatAssessmentRequests property
     * @param value Value to set for the threatAssessmentRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreatAssessmentRequests(@javax.annotation.Nullable final java.util.List<ThreatAssessmentRequest> value) {
        this._threatAssessmentRequests = value;
    }
}
