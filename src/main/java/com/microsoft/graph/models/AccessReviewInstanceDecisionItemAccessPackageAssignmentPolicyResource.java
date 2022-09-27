package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /** Display name of the access package to which access has been granted. */
    private String _accessPackageDisplayName;
    /** Identifier of the access package to which access has been granted. */
    private String _accessPackageId;
    /**
     * Instantiates a new AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource and sets the default values.
     * @return a void
     */
    public AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource();
    }
    /**
     * Gets the accessPackageDisplayName property value. Display name of the access package to which access has been granted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessPackageDisplayName() {
        return this._accessPackageDisplayName;
    }
    /**
     * Gets the accessPackageId property value. Identifier of the access package to which access has been granted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessPackageId() {
        return this._accessPackageId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackageDisplayName", (n) -> { currentObject.setAccessPackageDisplayName(n.getStringValue()); });
            this.put("accessPackageId", (n) -> { currentObject.setAccessPackageId(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessPackageDisplayName", this.getAccessPackageDisplayName());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
    }
    /**
     * Sets the accessPackageDisplayName property value. Display name of the access package to which access has been granted.
     * @param value Value to set for the accessPackageDisplayName property.
     * @return a void
     */
    public void setAccessPackageDisplayName(@javax.annotation.Nullable final String value) {
        this._accessPackageDisplayName = value;
    }
    /**
     * Sets the accessPackageId property value. Identifier of the access package to which access has been granted.
     * @param value Value to set for the accessPackageId property.
     * @return a void
     */
    public void setAccessPackageId(@javax.annotation.Nullable final String value) {
        this._accessPackageId = value;
    }
}
