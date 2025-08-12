package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomAuthenticationExtension extends CustomCalloutExtension implements Parsable {
    /**
     * Instantiates a new {@link CustomAuthenticationExtension} and sets the default values.
     */
    public CustomAuthenticationExtension() {
        super();
        this.setOdataType("#microsoft.graph.customAuthenticationExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomAuthenticationExtension}
     */
    @jakarta.annotation.Nonnull
    public static CustomAuthenticationExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.onAttributeCollectionStartCustomExtension": return new OnAttributeCollectionStartCustomExtension();
                case "#microsoft.graph.onAttributeCollectionSubmitCustomExtension": return new OnAttributeCollectionSubmitCustomExtension();
                case "#microsoft.graph.onOtpSendCustomExtension": return new OnOtpSendCustomExtension();
                case "#microsoft.graph.onTokenIssuanceStartCustomExtension": return new OnTokenIssuanceStartCustomExtension();
            }
        }
        return new CustomAuthenticationExtension();
    }
    /**
     * Gets the behaviorOnError property value. The behaviour on error for the custom authentication extension.
     * @return a {@link CustomExtensionBehaviorOnError}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionBehaviorOnError getBehaviorOnError() {
        return this.backingStore.get("behaviorOnError");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("behaviorOnError", (n) -> { this.setBehaviorOnError(n.getObjectValue(CustomExtensionBehaviorOnError::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("behaviorOnError", this.getBehaviorOnError());
    }
    /**
     * Sets the behaviorOnError property value. The behaviour on error for the custom authentication extension.
     * @param value Value to set for the behaviorOnError property.
     */
    public void setBehaviorOnError(@jakarta.annotation.Nullable final CustomExtensionBehaviorOnError value) {
        this.backingStore.set("behaviorOnError", value);
    }
}
