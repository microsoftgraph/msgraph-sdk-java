package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for the macOS Microsoft Edge App.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSMicrosoftEdgeApp extends MobileApp implements Parsable {
    /**
     * The enum to specify the channels for Microsoft Edge apps.
     */
    private MicrosoftEdgeChannel channel;
    /**
     * Instantiates a new macOSMicrosoftEdgeApp and sets the default values.
     */
    public MacOSMicrosoftEdgeApp() {
        super();
        this.setOdataType("#microsoft.graph.macOSMicrosoftEdgeApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSMicrosoftEdgeApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSMicrosoftEdgeApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSMicrosoftEdgeApp();
    }
    /**
     * Gets the channel property value. The enum to specify the channels for Microsoft Edge apps.
     * @return a microsoftEdgeChannel
     */
    @jakarta.annotation.Nullable
    public MicrosoftEdgeChannel getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(MicrosoftEdgeChannel.class)); });
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
    }
    /**
     * Sets the channel property value. The enum to specify the channels for Microsoft Edge apps.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final MicrosoftEdgeChannel value) {
        this.channel = value;
    }
}
