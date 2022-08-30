package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemAzureRoleResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /** Details of the scope this role is associated with. */
    private AccessReviewInstanceDecisionItemResource _scope;
    /**
     * Instantiates a new AccessReviewInstanceDecisionItemAzureRoleResource and sets the default values.
     * @return a void
     */
    public AccessReviewInstanceDecisionItemAzureRoleResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemAzureRoleResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstanceDecisionItemAzureRoleResource
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemAzureRoleResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemAzureRoleResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInstanceDecisionItemAzureRoleResource currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("scope", (n) -> { currentObject.setScope(n.getObjectValue(AccessReviewInstanceDecisionItemResource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the scope property value. Details of the scope this role is associated with.
     * @return a accessReviewInstanceDecisionItemResource
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceDecisionItemResource getScope() {
        return this._scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("scope", this.getScope());
    }
    /**
     * Sets the scope property value. Details of the scope this role is associated with.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final AccessReviewInstanceDecisionItemResource value) {
        this._scope = value;
    }
}
