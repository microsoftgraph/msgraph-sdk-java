package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.CustomExtensionCallbackConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomTaskExtensionCallbackConfiguration extends CustomExtensionCallbackConfiguration implements Parsable {
    /**
     * Instantiates a new CustomTaskExtensionCallbackConfiguration and sets the default values.
     */
    public CustomTaskExtensionCallbackConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionCallbackConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomTaskExtensionCallbackConfiguration
     */
    @jakarta.annotation.Nonnull
    public static CustomTaskExtensionCallbackConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionCallbackConfiguration();
    }
    /**
     * Gets the authorizedApps property value. The authorizedApps property
     * @return a java.util.List<Application>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Application> getAuthorizedApps() {
        return this.BackingStore.get("authorizedApps");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizedApps", (n) -> { this.setAuthorizedApps(n.getCollectionOfObjectValues(Application::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("authorizedApps", this.getAuthorizedApps());
    }
    /**
     * Sets the authorizedApps property value. The authorizedApps property
     * @param value Value to set for the authorizedApps property.
     */
    public void setAuthorizedApps(@jakarta.annotation.Nullable final java.util.List<Application> value) {
        this.BackingStore.set("authorizedApps", value);
    }
}
