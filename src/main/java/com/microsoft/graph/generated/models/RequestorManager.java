package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RequestorManager extends SubjectSet implements Parsable {
    /**
     * Instantiates a new RequestorManager and sets the default values.
     */
    public RequestorManager() {
        super();
        this.setOdataType("#microsoft.graph.requestorManager");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RequestorManager
     */
    @jakarta.annotation.Nonnull
    public static RequestorManager createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RequestorManager();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("managerLevel", (n) -> { this.setManagerLevel(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managerLevel property value. The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default value for managerLevel is 1. Possible values for this property range from 1 to 2.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getManagerLevel() {
        return this.backingStore.get("managerLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("managerLevel", this.getManagerLevel());
    }
    /**
     * Sets the managerLevel property value. The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default value for managerLevel is 1. Possible values for this property range from 1 to 2.
     * @param value Value to set for the managerLevel property.
     */
    public void setManagerLevel(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("managerLevel", value);
    }
}
