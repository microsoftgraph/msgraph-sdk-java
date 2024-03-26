package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminMicrosoft365Apps extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AdminMicrosoft365Apps} and sets the default values.
     */
    public AdminMicrosoft365Apps() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminMicrosoft365Apps}
     */
    @jakarta.annotation.Nonnull
    public static AdminMicrosoft365Apps createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminMicrosoft365Apps();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("installationOptions", (n) -> { this.setInstallationOptions(n.getObjectValue(M365AppsInstallationOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installationOptions property value. A container for tenant-level settings for Microsoft 365 applications.
     * @return a {@link M365AppsInstallationOptions}
     */
    @jakarta.annotation.Nullable
    public M365AppsInstallationOptions getInstallationOptions() {
        return this.backingStore.get("installationOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("installationOptions", this.getInstallationOptions());
    }
    /**
     * Sets the installationOptions property value. A container for tenant-level settings for Microsoft 365 applications.
     * @param value Value to set for the installationOptions property.
     */
    public void setInstallationOptions(@jakarta.annotation.Nullable final M365AppsInstallationOptions value) {
        this.backingStore.set("installationOptions", value);
    }
}
