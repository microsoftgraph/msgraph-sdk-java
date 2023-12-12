package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * Instantiates a new AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemAccessPackageAssignmentPolicyResource();
    }
    /**
     * Gets the accessPackageDisplayName property value. Display name of the access package to which access has been granted.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageDisplayName() {
        return this.backingStore.get("accessPackageDisplayName");
    }
    /**
     * Gets the accessPackageId property value. Identifier of the access package to which access has been granted.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageId() {
        return this.backingStore.get("accessPackageId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageDisplayName", (n) -> { this.setAccessPackageDisplayName(n.getStringValue()); });
        deserializerMap.put("accessPackageId", (n) -> { this.setAccessPackageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessPackageDisplayName", this.getAccessPackageDisplayName());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
    }
    /**
     * Sets the accessPackageDisplayName property value. Display name of the access package to which access has been granted.
     * @param value Value to set for the accessPackageDisplayName property.
     */
    public void setAccessPackageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageDisplayName", value);
    }
    /**
     * Sets the accessPackageId property value. Identifier of the access package to which access has been granted.
     * @param value Value to set for the accessPackageId property.
     */
    public void setAccessPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageId", value);
    }
}
