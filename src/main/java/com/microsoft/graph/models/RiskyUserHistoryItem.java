package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyUserHistoryItem extends RiskyUser implements Parsable {
    /**
     * The activity related to user risk level change.
     */
    private RiskUserActivity activity;
    /**
     * The ID of actor that does the operation.
     */
    private String initiatedBy;
    /**
     * The ID of the user.
     */
    private String userId;
    /**
     * Instantiates a new RiskyUserHistoryItem and sets the default values.
     */
    public RiskyUserHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RiskyUserHistoryItem
     */
    @jakarta.annotation.Nonnull
    public static RiskyUserHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyUserHistoryItem();
    }
    /**
     * Gets the activity property value. The activity related to user risk level change.
     * @return a RiskUserActivity
     */
    @jakarta.annotation.Nullable
    public RiskUserActivity getActivity() {
        return this.activity;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getObjectValue(RiskUserActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("initiatedBy", (n) -> { this.setInitiatedBy(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatedBy property value. The ID of actor that does the operation.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedBy() {
        return this.initiatedBy;
    }
    /**
     * Gets the userId property value. The ID of the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the activity property value. The activity related to user risk level change.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final RiskUserActivity value) {
        this.activity = value;
    }
    /**
     * Sets the initiatedBy property value. The ID of actor that does the operation.
     * @param value Value to set for the initiatedBy property.
     */
    public void setInitiatedBy(@jakarta.annotation.Nullable final String value) {
        this.initiatedBy = value;
    }
    /**
     * Sets the userId property value. The ID of the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
