package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewPrincipalScope extends AccessReviewScope implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewPrincipalScope} and sets the default values.
     */
    public AccessReviewPrincipalScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewPrincipalScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewPrincipalScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewPrincipalScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewPrincipalScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getEnumValue(AccessReviewPrincipalScopeType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scopeType property value. The scopeType property
     * @return a {@link AccessReviewPrincipalScopeType}
     */
    @jakarta.annotation.Nullable
    public AccessReviewPrincipalScopeType getScopeType() {
        return this.backingStore.get("scopeType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the scopeType property value. The scopeType property
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final AccessReviewPrincipalScopeType value) {
        this.backingStore.set("scopeType", value);
    }
}
