package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppConsentApprovalRoute extends Entity implements Parsable {
    /**
     * Instantiates a new AppConsentApprovalRoute and sets the default values.
     */
    public AppConsentApprovalRoute() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppConsentApprovalRoute
     */
    @jakarta.annotation.Nonnull
    public static AppConsentApprovalRoute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConsentApprovalRoute();
    }
    /**
     * Gets the appConsentRequests property value. A collection of appConsentRequest objects representing apps for which admin consent has been requested by one or more users.
     * @return a java.util.List<AppConsentRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppConsentRequest> getAppConsentRequests() {
        return this.backingStore.get("appConsentRequests");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appConsentRequests", (n) -> { this.setAppConsentRequests(n.getCollectionOfObjectValues(AppConsentRequest::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appConsentRequests", this.getAppConsentRequests());
    }
    /**
     * Sets the appConsentRequests property value. A collection of appConsentRequest objects representing apps for which admin consent has been requested by one or more users.
     * @param value Value to set for the appConsentRequests property.
     */
    public void setAppConsentRequests(@jakarta.annotation.Nullable final java.util.List<AppConsentRequest> value) {
        this.backingStore.set("appConsentRequests", value);
    }
}
