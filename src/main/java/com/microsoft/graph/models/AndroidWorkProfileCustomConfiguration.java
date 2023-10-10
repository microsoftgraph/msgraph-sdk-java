package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Work Profile custom configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWorkProfileCustomConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * OMA settings. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<OmaSetting> omaSettings;
    /**
     * Instantiates a new AndroidWorkProfileCustomConfiguration and sets the default values.
     */
    public AndroidWorkProfileCustomConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileCustomConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileCustomConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileCustomConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileCustomConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("omaSettings", (n) -> { this.setOmaSettings(n.getCollectionOfObjectValues(OmaSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the omaSettings property value. OMA settings. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<OmaSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OmaSetting> getOmaSettings() {
        return this.omaSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("omaSettings", this.getOmaSettings());
    }
    /**
     * Sets the omaSettings property value. OMA settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the omaSettings property.
     */
    public void setOmaSettings(@jakarta.annotation.Nullable final java.util.List<OmaSetting> value) {
        this.omaSettings = value;
    }
}
