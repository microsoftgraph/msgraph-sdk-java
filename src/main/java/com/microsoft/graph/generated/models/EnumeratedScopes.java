package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnumeratedScopes extends InheritableScopes implements Parsable {
    /**
     * Instantiates a new {@link EnumeratedScopes} and sets the default values.
     */
    public EnumeratedScopes() {
        super();
        this.setOdataType("#microsoft.graph.enumeratedScopes");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnumeratedScopes}
     */
    @jakarta.annotation.Nonnull
    public static EnumeratedScopes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnumeratedScopes();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the scopes property value. Required. Nonempty list of delegated permission scope identifiers published by the resource application to inherit. Entries must be unique and must not include any globally blocked scopes.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopes() {
        return this.backingStore.get("scopes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("scopes", this.getScopes());
    }
    /**
     * Sets the scopes property value. Required. Nonempty list of delegated permission scope identifiers published by the resource application to inherit. Entries must be unique and must not include any globally blocked scopes.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scopes", value);
    }
}
