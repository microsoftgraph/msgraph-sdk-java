package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the Microsoft Edge app on Windows.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsMicrosoftEdgeApp extends MobileApp implements Parsable {
    /**
     * The enum to specify the channels for Microsoft Edge apps.
     */
    private MicrosoftEdgeChannel channel;
    /**
     * The language locale to use when the Edge app displays text to the user.
     */
    private String displayLanguageLocale;
    /**
     * Instantiates a new WindowsMicrosoftEdgeApp and sets the default values.
     */
    public WindowsMicrosoftEdgeApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsMicrosoftEdgeApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsMicrosoftEdgeApp
     */
    @jakarta.annotation.Nonnull
    public static WindowsMicrosoftEdgeApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMicrosoftEdgeApp();
    }
    /**
     * Gets the channel property value. The enum to specify the channels for Microsoft Edge apps.
     * @return a MicrosoftEdgeChannel
     */
    @jakarta.annotation.Nullable
    public MicrosoftEdgeChannel getChannel() {
        return this.channel;
    }
    /**
     * Gets the displayLanguageLocale property value. The language locale to use when the Edge app displays text to the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayLanguageLocale() {
        return this.displayLanguageLocale;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(MicrosoftEdgeChannel.class)); });
        deserializerMap.put("displayLanguageLocale", (n) -> { this.setDisplayLanguageLocale(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("displayLanguageLocale", this.getDisplayLanguageLocale());
    }
    /**
     * Sets the channel property value. The enum to specify the channels for Microsoft Edge apps.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final MicrosoftEdgeChannel value) {
        this.channel = value;
    }
    /**
     * Sets the displayLanguageLocale property value. The language locale to use when the Edge app displays text to the user.
     * @param value Value to set for the displayLanguageLocale property.
     */
    public void setDisplayLanguageLocale(@jakarta.annotation.Nullable final String value) {
        this.displayLanguageLocale = value;
    }
}
