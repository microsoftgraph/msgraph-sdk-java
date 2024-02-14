package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrincipalResourceMembershipsScope extends AccessReviewScope implements Parsable {
    /**
     * Instantiates a new {@link PrincipalResourceMembershipsScope} and sets the default values.
     */
    public PrincipalResourceMembershipsScope() {
        super();
        this.setOdataType("#microsoft.graph.principalResourceMembershipsScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrincipalResourceMembershipsScope}
     */
    @jakarta.annotation.Nonnull
    public static PrincipalResourceMembershipsScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrincipalResourceMembershipsScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("principalScopes", (n) -> { this.setPrincipalScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the principalScopes property value. Defines the scopes of the principals whose access to resources are reviewed in the access review.
     * @return a {@link java.util.List<AccessReviewScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScope> getPrincipalScopes() {
        return this.backingStore.get("principalScopes");
    }
    /**
     * Gets the resourceScopes property value. Defines the scopes of the resources for which access is reviewed.
     * @return a {@link java.util.List<AccessReviewScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScope> getResourceScopes() {
        return this.backingStore.get("resourceScopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("principalScopes", this.getPrincipalScopes());
        writer.writeCollectionOfObjectValues("resourceScopes", this.getResourceScopes());
    }
    /**
     * Sets the principalScopes property value. Defines the scopes of the principals whose access to resources are reviewed in the access review.
     * @param value Value to set for the principalScopes property.
     */
    public void setPrincipalScopes(@jakarta.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.backingStore.set("principalScopes", value);
    }
    /**
     * Sets the resourceScopes property value. Defines the scopes of the resources for which access is reviewed.
     * @param value Value to set for the resourceScopes property.
     */
    public void setResourceScopes(@jakarta.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.backingStore.set("resourceScopes", value);
    }
}
