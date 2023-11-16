package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAppSettings extends Entity implements Parsable {
    /**
     * Instantiates a new TeamsAppSettings and sets the default values.
     */
    public TeamsAppSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAppSettings
     */
    @jakarta.annotation.Nonnull
    public static TeamsAppSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAppSettings();
    }
    /**
     * Gets the allowUserRequestsForAppAccess property value. Indicates whether users are allowed to request access to the unavailable Teams apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserRequestsForAppAccess() {
        return this.backingStore.get("allowUserRequestsForAppAccess");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUserRequestsForAppAccess", (n) -> { this.setAllowUserRequestsForAppAccess(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUserRequestsForAppAccess", this.getAllowUserRequestsForAppAccess());
    }
    /**
     * Sets the allowUserRequestsForAppAccess property value. Indicates whether users are allowed to request access to the unavailable Teams apps.
     * @param value Value to set for the allowUserRequestsForAppAccess property.
     */
    public void setAllowUserRequestsForAppAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUserRequestsForAppAccess", value);
    }
}
