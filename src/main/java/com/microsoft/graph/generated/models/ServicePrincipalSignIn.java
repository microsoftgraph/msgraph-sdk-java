package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalSignIn extends SignInIdentity implements Parsable {
    /**
     * Instantiates a new {@link ServicePrincipalSignIn} and sets the default values.
     */
    public ServicePrincipalSignIn() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipalSignIn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServicePrincipalSignIn}
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalSignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalSignIn();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the servicePrincipalId property value. appId of the service principal that is signing in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.backingStore.get("servicePrincipalId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
    }
    /**
     * Sets the servicePrincipalId property value. appId of the service principal that is signing in.
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalId", value);
    }
}
