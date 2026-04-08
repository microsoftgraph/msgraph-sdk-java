package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPasswordSubmitListener extends AuthenticationEventListener implements Parsable {
    /**
     * Instantiates a new {@link OnPasswordSubmitListener} and sets the default values.
     */
    public OnPasswordSubmitListener() {
        super();
        this.setOdataType("#microsoft.graph.onPasswordSubmitListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPasswordSubmitListener}
     */
    @jakarta.annotation.Nonnull
    public static OnPasswordSubmitListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPasswordSubmitListener();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getObjectValue(OnPasswordSubmitHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handler property value. Configuration for the handler to invoke when this listener is triggered. For JIT migration scenarios, this is typically an onPasswordMigrationCustomExtensionHandler.
     * @return a {@link OnPasswordSubmitHandler}
     */
    @jakarta.annotation.Nullable
    public OnPasswordSubmitHandler getHandler() {
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
     * Sets the handler property value. Configuration for the handler to invoke when this listener is triggered. For JIT migration scenarios, this is typically an onPasswordMigrationCustomExtensionHandler.
     * @param value Value to set for the handler property.
     */
    public void setHandler(@jakarta.annotation.Nullable final OnPasswordSubmitHandler value) {
        this.backingStore.set("handler", value);
    }
}
