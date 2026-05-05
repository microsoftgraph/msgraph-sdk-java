package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityVerifiedIdRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityVerifiedIdRoot} and sets the default values.
     */
    public IdentityVerifiedIdRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityVerifiedIdRoot}
     */
    @jakarta.annotation.Nonnull
    public static IdentityVerifiedIdRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityVerifiedIdRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("profiles", (n) -> { this.setProfiles(n.getCollectionOfObjectValues(VerifiedIdProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the profiles property value. Profile containing properties about a Verified ID provider and purpose
     * @return a {@link java.util.List<VerifiedIdProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<VerifiedIdProfile> getProfiles() {
        return this.backingStore.get("profiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("profiles", this.getProfiles());
    }
    /**
     * Sets the profiles property value. Profile containing properties about a Verified ID provider and purpose
     * @param value Value to set for the profiles property.
     */
    public void setProfiles(@jakarta.annotation.Nullable final java.util.List<VerifiedIdProfile> value) {
        this.backingStore.set("profiles", value);
    }
}
