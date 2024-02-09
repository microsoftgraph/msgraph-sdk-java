package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Bitlocker extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Bitlocker} and sets the default values.
     */
    public Bitlocker() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Bitlocker}
     */
    @jakarta.annotation.Nonnull
    public static Bitlocker createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bitlocker();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recoveryKeys", (n) -> { this.setRecoveryKeys(n.getCollectionOfObjectValues(BitlockerRecoveryKey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recoveryKeys property value. The recovery keys associated with the bitlocker entity.
     * @return a {@link java.util.List<BitlockerRecoveryKey>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BitlockerRecoveryKey> getRecoveryKeys() {
        return this.backingStore.get("recoveryKeys");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("recoveryKeys", this.getRecoveryKeys());
    }
    /**
     * Sets the recoveryKeys property value. The recovery keys associated with the bitlocker entity.
     * @param value Value to set for the recoveryKeys property.
     */
    public void setRecoveryKeys(@jakarta.annotation.Nullable final java.util.List<BitlockerRecoveryKey> value) {
        this.backingStore.set("recoveryKeys", value);
    }
}
