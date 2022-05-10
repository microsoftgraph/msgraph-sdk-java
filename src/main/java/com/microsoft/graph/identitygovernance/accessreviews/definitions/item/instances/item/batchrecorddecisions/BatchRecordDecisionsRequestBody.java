package microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.batchrecorddecisions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the batchRecordDecisions method. */
public class BatchRecordDecisionsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The decision property */
    private String _decision;
    /** The justification property */
    private String _justification;
    /** The principalId property */
    private String _principalId;
    /** The resourceId property */
    private String _resourceId;
    /**
     * Instantiates a new batchRecordDecisionsRequestBody and sets the default values.
     * @return a void
     */
    public BatchRecordDecisionsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a batchRecordDecisionsRequestBody
     */
    @javax.annotation.Nonnull
    public static BatchRecordDecisionsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BatchRecordDecisionsRequestBody();
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
     * Gets the decision property value. The decision property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecision() {
        return this._decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BatchRecordDecisionsRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("decision", (n) -> { currentObject.setDecision(n.getStringValue()); });
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("principalId", (n) -> { currentObject.setPrincipalId(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the justification property value. The justification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the principalId property value. The principalId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalId() {
        return this._principalId;
    }
    /**
     * Gets the resourceId property value. The resourceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the decision property value. The decision property
     * @param value Value to set for the decision property.
     * @return a void
     */
    public void setDecision(@javax.annotation.Nullable final String value) {
        this._decision = value;
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the principalId property value. The principalId property
     * @param value Value to set for the principalId property.
     * @return a void
     */
    public void setPrincipalId(@javax.annotation.Nullable final String value) {
        this._principalId = value;
    }
    /**
     * Sets the resourceId property value. The resourceId property
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
}
