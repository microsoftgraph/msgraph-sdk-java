package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomAppManagementConfiguration extends AppManagementConfiguration implements Parsable {
    /**
     * Instantiates a new {@link CustomAppManagementConfiguration} and sets the default values.
     */
    public CustomAppManagementConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.customAppManagementConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomAppManagementConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CustomAppManagementConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomAppManagementConfiguration();
    }
    /**
     * Gets the applicationRestrictions property value. Restrictions that are applicable only to application objects to which the policy is attached.
     * @return a {@link CustomAppManagementApplicationConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomAppManagementApplicationConfiguration getApplicationRestrictions() {
        return this.backingStore.get("applicationRestrictions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationRestrictions", (n) -> { this.setApplicationRestrictions(n.getObjectValue(CustomAppManagementApplicationConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationRestrictions", this.getApplicationRestrictions());
    }
    /**
     * Sets the applicationRestrictions property value. Restrictions that are applicable only to application objects to which the policy is attached.
     * @param value Value to set for the applicationRestrictions property.
     */
    public void setApplicationRestrictions(@jakarta.annotation.Nullable final CustomAppManagementApplicationConfiguration value) {
        this.backingStore.set("applicationRestrictions", value);
    }
}
