package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FederatedTokenValidationPolicy extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link FederatedTokenValidationPolicy} and sets the default values.
     */
    public FederatedTokenValidationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.federatedTokenValidationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FederatedTokenValidationPolicy}
     */
    @jakarta.annotation.Nonnull
    public static FederatedTokenValidationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FederatedTokenValidationPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("validatingDomains", (n) -> { this.setValidatingDomains(n.getObjectValue(ValidatingDomains::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the validatingDomains property value. The validatingDomains property
     * @return a {@link ValidatingDomains}
     */
    @jakarta.annotation.Nullable
    public ValidatingDomains getValidatingDomains() {
        return this.backingStore.get("validatingDomains");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("validatingDomains", this.getValidatingDomains());
    }
    /**
     * Sets the validatingDomains property value. The validatingDomains property
     * @param value Value to set for the validatingDomains property.
     */
    public void setValidatingDomains(@jakarta.annotation.Nullable final ValidatingDomains value) {
        this.backingStore.set("validatingDomains", value);
    }
}
