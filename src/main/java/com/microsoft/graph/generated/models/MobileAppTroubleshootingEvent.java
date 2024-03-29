package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppTroubleshootingEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileAppTroubleshootingEvent} and sets the default values.
     */
    public MobileAppTroubleshootingEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppTroubleshootingEvent}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingEvent();
    }
    /**
     * Gets the appLogCollectionRequests property value. Indicates collection of App Log Upload Request.
     * @return a {@link java.util.List<AppLogCollectionRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppLogCollectionRequest> getAppLogCollectionRequests() {
        return this.backingStore.get("appLogCollectionRequests");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appLogCollectionRequests", (n) -> { this.setAppLogCollectionRequests(n.getCollectionOfObjectValues(AppLogCollectionRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appLogCollectionRequests", this.getAppLogCollectionRequests());
    }
    /**
     * Sets the appLogCollectionRequests property value. Indicates collection of App Log Upload Request.
     * @param value Value to set for the appLogCollectionRequests property.
     */
    public void setAppLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<AppLogCollectionRequest> value) {
        this.backingStore.set("appLogCollectionRequests", value);
    }
}
