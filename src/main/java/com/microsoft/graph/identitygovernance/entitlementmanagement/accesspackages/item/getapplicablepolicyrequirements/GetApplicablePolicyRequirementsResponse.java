package com.microsoft.graph.identitygovernance.entitlementmanagement.accesspackages.item.getapplicablepolicyrequirements;

import com.microsoft.graph.models.AccessPackageAssignmentRequestRequirements;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getApplicablePolicyRequirements method. */
public class GetApplicablePolicyRequirementsResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The value property */
    private java.util.List<AccessPackageAssignmentRequestRequirements> _value;
    /**
     * Instantiates a new getApplicablePolicyRequirementsResponse and sets the default values.
     * @return a void
     */
    public GetApplicablePolicyRequirementsResponse() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetApplicablePolicyRequirementsResponse currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(1) {{
            this.put("value", (n) -> { currentObject.setValue(n.getCollectionOfObjectValues(AccessPackageAssignmentRequestRequirements::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the value property value. The value property
     * @return a accessPackageAssignmentRequestRequirements
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentRequestRequirements> getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
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
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentRequestRequirements> value) {
        this._value = value;
    }
}
