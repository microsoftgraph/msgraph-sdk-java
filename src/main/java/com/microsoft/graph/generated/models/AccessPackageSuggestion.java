package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageSuggestion extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageSuggestion} and sets the default values.
     */
    public AccessPackageSuggestion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageSuggestion}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageSuggestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSuggestion();
    }
    /**
     * Gets the accessPackage property value. The access package information for the suggested package.
     * @return a {@link AvailableAccessPackage}
     */
    @jakarta.annotation.Nullable
    public AvailableAccessPackage getAccessPackage() {
        return this.backingStore.get("accessPackage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AvailableAccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("reasons", (n) -> { this.setReasons(n.getCollectionOfObjectValues(AccessPackageSuggestionReason::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reasons property value. A collection of reasons why this access package is being suggested to the user.
     * @return a {@link java.util.List<AccessPackageSuggestionReason>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageSuggestionReason> getReasons() {
        return this.backingStore.get("reasons");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeCollectionOfObjectValues("reasons", this.getReasons());
    }
    /**
     * Sets the accessPackage property value. The access package information for the suggested package.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AvailableAccessPackage value) {
        this.backingStore.set("accessPackage", value);
    }
    /**
     * Sets the reasons property value. A collection of reasons why this access package is being suggested to the user.
     * @param value Value to set for the reasons property.
     */
    public void setReasons(@jakarta.annotation.Nullable final java.util.List<AccessPackageSuggestionReason> value) {
        this.backingStore.set("reasons", value);
    }
}
