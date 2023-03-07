package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsUniversalAppXContainedApp extends MobileContainedApp implements Parsable {
    /** The app user model ID of the contained app of a WindowsUniversalAppX app. */
    private String appUserModelId;
    /**
     * Instantiates a new WindowsUniversalAppXContainedApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsUniversalAppXContainedApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsUniversalAppXContainedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsUniversalAppXContainedApp
     */
    @javax.annotation.Nonnull
    public static WindowsUniversalAppXContainedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsUniversalAppXContainedApp();
    }
    /**
     * Gets the appUserModelId property value. The app user model ID of the contained app of a WindowsUniversalAppX app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUserModelId() {
        return this.appUserModelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUserModelId", (n) -> { this.setAppUserModelId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUserModelId", this.getAppUserModelId());
    }
    /**
     * Sets the appUserModelId property value. The app user model ID of the contained app of a WindowsUniversalAppX app.
     * @param value Value to set for the appUserModelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUserModelId(@javax.annotation.Nullable final String value) {
        this.appUserModelId = value;
    }
}
