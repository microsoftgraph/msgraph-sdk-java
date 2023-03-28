package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleDeviceFeaturesConfigurationBase extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AppleDeviceFeaturesConfigurationBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppleDeviceFeaturesConfigurationBase() {
        super();
        this.setOdataType("#microsoft.graph.appleDeviceFeaturesConfigurationBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppleDeviceFeaturesConfigurationBase
     */
    @javax.annotation.Nonnull
    public static AppleDeviceFeaturesConfigurationBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    }
}
