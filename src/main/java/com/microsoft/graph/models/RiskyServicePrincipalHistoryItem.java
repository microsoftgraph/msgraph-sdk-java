package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyServicePrincipalHistoryItem extends RiskyServicePrincipal implements Parsable {
    /**
     * Instantiates a new RiskyServicePrincipalHistoryItem and sets the default values.
     */
    public RiskyServicePrincipalHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RiskyServicePrincipalHistoryItem
     */
    @jakarta.annotation.Nonnull
    public static RiskyServicePrincipalHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyServicePrincipalHistoryItem();
    }
    /**
     * Gets the activity property value. The activity related to service principal risk level change.
     * @return a RiskServicePrincipalActivity
     */
    @jakarta.annotation.Nullable
    public RiskServicePrincipalActivity getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(RiskServicePrincipalActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The identifier of the actor of the operation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedBy() {
        return this.backingStore.get("initiatedBy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activity", this.getActivity());
        writer.writeStringValue("initiatedBy", this.getInitiatedBy());
    }
    /**
     * Sets the activity property value. The activity related to service principal risk level change.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final RiskServicePrincipalActivity value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the initiatedBy property value. The identifier of the actor of the operation.
     * @param value Value to set for the initiatedBy property.
     */
    public void setInitiatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedBy", value);
    }
}
