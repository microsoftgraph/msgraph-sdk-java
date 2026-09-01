package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceDecisionItemAccessPackageResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewInstanceDecisionItemAccessPackageResource} and sets the default values.
     */
    public AccessReviewInstanceDecisionItemAccessPackageResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemAccessPackageResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewInstanceDecisionItemAccessPackageResource}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemAccessPackageResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemAccessPackageResource();
    }
    /**
     * Gets the accessPackageAssignmentPolicyDisplayName property value. Display name of the access package assignment policy through which access is granted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageAssignmentPolicyDisplayName() {
        return this.backingStore.get("accessPackageAssignmentPolicyDisplayName");
    }
    /**
     * Gets the accessPackageAssignmentPolicyId property value. Identifier of the access package assignment policy through which access is granted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageAssignmentPolicyId() {
        return this.backingStore.get("accessPackageAssignmentPolicyId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackageAssignmentPolicyDisplayName", (n) -> { this.setAccessPackageAssignmentPolicyDisplayName(n.getStringValue()); });
        deserializerMap.put("accessPackageAssignmentPolicyId", (n) -> { this.setAccessPackageAssignmentPolicyId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessPackageAssignmentPolicyDisplayName", this.getAccessPackageAssignmentPolicyDisplayName());
        writer.writeStringValue("accessPackageAssignmentPolicyId", this.getAccessPackageAssignmentPolicyId());
    }
    /**
     * Sets the accessPackageAssignmentPolicyDisplayName property value. Display name of the access package assignment policy through which access is granted.
     * @param value Value to set for the accessPackageAssignmentPolicyDisplayName property.
     */
    public void setAccessPackageAssignmentPolicyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageAssignmentPolicyDisplayName", value);
    }
    /**
     * Sets the accessPackageAssignmentPolicyId property value. Identifier of the access package assignment policy through which access is granted.
     * @param value Value to set for the accessPackageAssignmentPolicyId property.
     */
    public void setAccessPackageAssignmentPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessPackageAssignmentPolicyId", value);
    }
}
