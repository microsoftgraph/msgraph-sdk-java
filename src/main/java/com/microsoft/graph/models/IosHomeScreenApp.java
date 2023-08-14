package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an icon for an app on the Home Screen
 */
public class IosHomeScreenApp extends IosHomeScreenItem implements Parsable {
    /**
     * BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.
     */
    private String bundleID;
    /**
     * Instantiates a new iosHomeScreenApp and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public IosHomeScreenApp() {
        super();
        this.setOdataType("#microsoft.graph.iosHomeScreenApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosHomeScreenApp
     */
    @jakarta.annotation.Nonnull
    public static IosHomeScreenApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosHomeScreenApp();
    }
    /**
     * Gets the bundleID property value. BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBundleID() {
        return this.bundleID;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleID", (n) -> { this.setBundleID(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("bundleID", this.getBundleID());
    }
    /**
     * Sets the bundleID property value. BundleID of the app if isWebClip is false or the URL of a web clip if isWebClip is true.
     * @param value Value to set for the bundleID property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBundleID(@jakarta.annotation.Nullable final String value) {
        this.bundleID = value;
    }
}
