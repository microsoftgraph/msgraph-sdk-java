package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnAttributeCollectionSubmitListener extends AuthenticationEventListener implements Parsable {
    /**
     * Instantiates a new {@link OnAttributeCollectionSubmitListener} and sets the default values.
     */
    public OnAttributeCollectionSubmitListener() {
        super();
        this.setOdataType("#microsoft.graph.onAttributeCollectionSubmitListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnAttributeCollectionSubmitListener}
     */
    @jakarta.annotation.Nonnull
    public static OnAttributeCollectionSubmitListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnAttributeCollectionSubmitListener();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getObjectValue(OnAttributeCollectionSubmitHandler::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the handler property value. Configuration for what to invoke if the event resolves to this listener.
     * @return a {@link OnAttributeCollectionSubmitHandler}
     */
    @jakarta.annotation.Nullable
    public OnAttributeCollectionSubmitHandler getHandler() {
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
     * Sets the handler property value. Configuration for what to invoke if the event resolves to this listener.
     * @param value Value to set for the handler property.
     */
    public void setHandler(@jakarta.annotation.Nullable final OnAttributeCollectionSubmitHandler value) {
        this.backingStore.set("handler", value);
    }
}
