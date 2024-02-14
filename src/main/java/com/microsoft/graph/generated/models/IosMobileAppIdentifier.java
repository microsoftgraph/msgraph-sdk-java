package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The identifier for an iOS app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosMobileAppIdentifier extends MobileAppIdentifier implements Parsable {
    /**
     * Instantiates a new {@link IosMobileAppIdentifier} and sets the default values.
     */
    public IosMobileAppIdentifier() {
        super();
        this.setOdataType("#microsoft.graph.iosMobileAppIdentifier");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosMobileAppIdentifier}
     */
    @jakarta.annotation.Nonnull
    public static IosMobileAppIdentifier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosMobileAppIdentifier();
    }
    /**
     * Gets the bundleId property value. The identifier for an app, as specified in the app store.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("bundleId", this.getBundleId());
    }
    /**
     * Sets the bundleId property value. The identifier for an app, as specified in the app store.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
}
