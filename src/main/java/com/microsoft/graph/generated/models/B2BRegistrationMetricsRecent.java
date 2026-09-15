package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2BRegistrationMetricsRecent extends B2BRegistrationMetricsBase implements Parsable {
    /**
     * Instantiates a new {@link B2BRegistrationMetricsRecent} and sets the default values.
     */
    public B2BRegistrationMetricsRecent() {
        super();
        this.setOdataType("#microsoft.graph.b2BRegistrationMetricsRecent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link B2BRegistrationMetricsRecent}
     */
    @jakarta.annotation.Nonnull
    public static B2BRegistrationMetricsRecent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2BRegistrationMetricsRecent();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("updateDateTime", (n) -> { this.setUpdateDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the updateDateTime property value. The updateDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdateDateTime() {
        return this.backingStore.get("updateDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("updateDateTime", this.getUpdateDateTime());
    }
    /**
     * Sets the updateDateTime property value. The updateDateTime property
     * @param value Value to set for the updateDateTime property.
     */
    public void setUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("updateDateTime", value);
    }
}
