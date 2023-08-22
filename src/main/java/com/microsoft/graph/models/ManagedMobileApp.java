package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The identifier for the deployment an app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedMobileApp extends Entity implements Parsable {
    /**
     * The identifier for an app with it's operating system type.
     */
    private MobileAppIdentifier mobileAppIdentifier;
    /**
     * Version of the entity.
     */
    private String version;
    /**
     * Instantiates a new managedMobileApp and sets the default values.
     */
    public ManagedMobileApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedMobileApp
     */
    @jakarta.annotation.Nonnull
    public static ManagedMobileApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedMobileApp();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mobileAppIdentifier", (n) -> { this.setMobileAppIdentifier(n.getObjectValue(MobileAppIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mobileAppIdentifier property value. The identifier for an app with it's operating system type.
     * @return a mobileAppIdentifier
     */
    @jakarta.annotation.Nullable
    public MobileAppIdentifier getMobileAppIdentifier() {
        return this.mobileAppIdentifier;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("mobileAppIdentifier", this.getMobileAppIdentifier());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the mobileAppIdentifier property value. The identifier for an app with it's operating system type.
     * @param value Value to set for the mobileAppIdentifier property.
     */
    public void setMobileAppIdentifier(@jakarta.annotation.Nullable final MobileAppIdentifier value) {
        this.mobileAppIdentifier = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
