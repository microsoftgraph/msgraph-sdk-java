package com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.getapplicablepolicyrequirements;

import com.microsoft.graph.models.AccessPackageAssignmentRequestRequirements;
import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetApplicablePolicyRequirementsResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /** The value property */
    private java.util.List<AccessPackageAssignmentRequestRequirements> value;
    /**
     * Instantiates a new getApplicablePolicyRequirementsResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetApplicablePolicyRequirementsResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getApplicablePolicyRequirementsResponse
     */
    @javax.annotation.Nonnull
    public static GetApplicablePolicyRequirementsResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetApplicablePolicyRequirementsResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(AccessPackageAssignmentRequestRequirements::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a accessPackageAssignmentRequestRequirements
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequestRequirements> getValue() {
        return this.value;
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
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentRequestRequirements> value) {
        this.value = value;
    }
}
