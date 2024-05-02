package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnTokenIssuanceStartCustomExtension extends CustomAuthenticationExtension implements Parsable {
    /**
     * Instantiates a new {@link OnTokenIssuanceStartCustomExtension} and sets the default values.
     */
    public OnTokenIssuanceStartCustomExtension() {
        super();
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartCustomExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnTokenIssuanceStartCustomExtension}
     */
    @jakarta.annotation.Nonnull
    public static OnTokenIssuanceStartCustomExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartCustomExtension();
    }
    /**
     * Gets the claimsForTokenConfiguration property value. Collection of claims to be returned by the API called by this custom authentication extension. Used to populate claims mapping experience in Microsoft Entra admin center. Optional.
     * @return a {@link java.util.List<OnTokenIssuanceStartReturnClaim>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnTokenIssuanceStartReturnClaim> getClaimsForTokenConfiguration() {
        return this.backingStore.get("claimsForTokenConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("claimsForTokenConfiguration", (n) -> { this.setClaimsForTokenConfiguration(n.getCollectionOfObjectValues(OnTokenIssuanceStartReturnClaim::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("claimsForTokenConfiguration", this.getClaimsForTokenConfiguration());
    }
    /**
     * Sets the claimsForTokenConfiguration property value. Collection of claims to be returned by the API called by this custom authentication extension. Used to populate claims mapping experience in Microsoft Entra admin center. Optional.
     * @param value Value to set for the claimsForTokenConfiguration property.
     */
    public void setClaimsForTokenConfiguration(@jakarta.annotation.Nullable final java.util.List<OnTokenIssuanceStartReturnClaim> value) {
        this.backingStore.set("claimsForTokenConfiguration", value);
    }
}
