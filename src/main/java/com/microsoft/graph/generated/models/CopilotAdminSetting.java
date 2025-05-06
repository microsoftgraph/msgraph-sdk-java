package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotAdminSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotAdminSetting} and sets the default values.
     */
    public CopilotAdminSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotAdminSetting}
     */
    @jakarta.annotation.Nonnull
    public static CopilotAdminSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotAdminSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("limitedMode", (n) -> { this.setLimitedMode(n.getObjectValue(CopilotAdminLimitedMode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the limitedMode property value. The limitedMode property
     * @return a {@link CopilotAdminLimitedMode}
     */
    @jakarta.annotation.Nullable
    public CopilotAdminLimitedMode getLimitedMode() {
        return this.backingStore.get("limitedMode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("limitedMode", this.getLimitedMode());
    }
    /**
     * Sets the limitedMode property value. The limitedMode property
     * @param value Value to set for the limitedMode property.
     */
    public void setLimitedMode(@jakarta.annotation.Nullable final CopilotAdminLimitedMode value) {
        this.backingStore.set("limitedMode", value);
    }
}
