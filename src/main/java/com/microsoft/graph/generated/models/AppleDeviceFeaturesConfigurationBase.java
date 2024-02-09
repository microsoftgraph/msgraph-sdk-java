package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Apple device features configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleDeviceFeaturesConfigurationBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AppleDeviceFeaturesConfigurationBase} and sets the default values.
     */
    public AppleDeviceFeaturesConfigurationBase() {
        super();
        this.setOdataType("#microsoft.graph.appleDeviceFeaturesConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppleDeviceFeaturesConfigurationBase}
     */
    @jakarta.annotation.Nonnull
    public static AppleDeviceFeaturesConfigurationBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosDeviceFeaturesConfiguration": return new IosDeviceFeaturesConfiguration();
                case "#microsoft.graph.macOSDeviceFeaturesConfiguration": return new MacOSDeviceFeaturesConfiguration();
            }
        }
        return new AppleDeviceFeaturesConfigurationBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
