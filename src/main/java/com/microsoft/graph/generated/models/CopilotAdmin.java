package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotAdmin extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotAdmin} and sets the default values.
     */
    public CopilotAdmin() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotAdmin}
     */
    @jakarta.annotation.Nonnull
    public static CopilotAdmin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotAdmin();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(CopilotAdminSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. Set of Microsoft 365 Copilot settings that can be added or modified. Read-only. Nullable.
     * @return a {@link CopilotAdminSetting}
     */
    @jakarta.annotation.Nullable
    public CopilotAdminSetting getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the settings property value. Set of Microsoft 365 Copilot settings that can be added or modified. Read-only. Nullable.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final CopilotAdminSetting value) {
        this.backingStore.set("settings", value);
    }
}
