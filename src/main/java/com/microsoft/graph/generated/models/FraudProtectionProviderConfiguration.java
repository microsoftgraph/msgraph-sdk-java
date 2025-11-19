package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FraudProtectionProviderConfiguration extends FraudProtectionConfiguration implements Parsable {
    /**
     * Instantiates a new {@link FraudProtectionProviderConfiguration} and sets the default values.
     */
    public FraudProtectionProviderConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.fraudProtectionProviderConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FraudProtectionProviderConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static FraudProtectionProviderConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FraudProtectionProviderConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fraudProtectionProvider", (n) -> { this.setFraudProtectionProvider(n.getObjectValue(FraudProtectionProvider::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fraudProtectionProvider property value. The fraudProtectionProvider property
     * @return a {@link FraudProtectionProvider}
     */
    @jakarta.annotation.Nullable
    public FraudProtectionProvider getFraudProtectionProvider() {
        return this.backingStore.get("fraudProtectionProvider");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fraudProtectionProvider", this.getFraudProtectionProvider());
    }
    /**
     * Sets the fraudProtectionProvider property value. The fraudProtectionProvider property
     * @param value Value to set for the fraudProtectionProvider property.
     */
    public void setFraudProtectionProvider(@jakarta.annotation.Nullable final FraudProtectionProvider value) {
        this.backingStore.set("fraudProtectionProvider", value);
    }
}
