package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnVerifiedIdClaimValidationListener extends AuthenticationEventListener implements Parsable {
    /**
     * Instantiates a new {@link OnVerifiedIdClaimValidationListener} and sets the default values.
     */
    public OnVerifiedIdClaimValidationListener() {
        super();
        this.setOdataType("#microsoft.graph.onVerifiedIdClaimValidationListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnVerifiedIdClaimValidationListener}
     */
    @jakarta.annotation.Nonnull
    public static OnVerifiedIdClaimValidationListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnVerifiedIdClaimValidationListener();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getObjectValue(OnVerifiedIdClaimValidationHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handler property value. Configuration for the handler to invoke when this listener is triggered. For Verified ID claim validation scenarios, this is typically an onVerifiedIdClaimValidationCustomExtensionHandler.
     * @return a {@link OnVerifiedIdClaimValidationHandler}
     */
    @jakarta.annotation.Nullable
    public OnVerifiedIdClaimValidationHandler getHandler() {
        return this.backingStore.get("handler");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("handler", this.getHandler());
    }
    /**
     * Sets the handler property value. Configuration for the handler to invoke when this listener is triggered. For Verified ID claim validation scenarios, this is typically an onVerifiedIdClaimValidationCustomExtensionHandler.
     * @param value Value to set for the handler property.
     */
    public void setHandler(@jakarta.annotation.Nullable final OnVerifiedIdClaimValidationHandler value) {
        this.backingStore.set("handler", value);
    }
}
