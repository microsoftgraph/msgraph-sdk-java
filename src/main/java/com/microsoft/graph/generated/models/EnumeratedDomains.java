package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnumeratedDomains extends ValidatingDomains implements Parsable {
    /**
     * Instantiates a new {@link EnumeratedDomains} and sets the default values.
     */
    public EnumeratedDomains() {
        super();
        this.setOdataType("#microsoft.graph.enumeratedDomains");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnumeratedDomains}
     */
    @jakarta.annotation.Nonnull
    public static EnumeratedDomains createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnumeratedDomains();
    }
    /**
     * Gets the domainNames property value. The domainNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainNames() {
        return this.backingStore.get("domainNames");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainNames", (n) -> { this.setDomainNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("domainNames", this.getDomainNames());
    }
    /**
     * Sets the domainNames property value. The domainNames property
     * @param value Value to set for the domainNames property.
     */
    public void setDomainNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domainNames", value);
    }
}
