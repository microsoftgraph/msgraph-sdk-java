package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the androidCustomConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidCustomConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * OMA settings. This collection can contain a maximum of 1000 elements.
     */
    private java.util.List<OmaSetting> omaSettings;
    /**
     * Instantiates a new androidCustomConfiguration and sets the default values.
     */
    public AndroidCustomConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidCustomConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidCustomConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidCustomConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidCustomConfiguration();
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
     * Gets the omaSettings property value. OMA settings. This collection can contain a maximum of 1000 elements.
     * @return a omaSetting
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
     * Sets the omaSettings property value. OMA settings. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the omaSettings property.
     */
    public void setOmaSettings(@jakarta.annotation.Nullable final java.util.List<OmaSetting> value) {
        this.omaSettings = value;
    }
}
