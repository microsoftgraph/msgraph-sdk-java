package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetManager extends SubjectSet implements Parsable {
    /**
     * Instantiates a new TargetManager and sets the default values.
     */
    public TargetManager() {
        super();
        this.setOdataType("#microsoft.graph.targetManager");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TargetManager
     */
    @jakarta.annotation.Nonnull
    public static TargetManager createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetManager();
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
     * Gets the managerLevel property value. Manager level, between 1 and 4. The direct manager is 1.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getManagerLevel() {
        return this.BackingStore.get("managerLevel");
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
     * Sets the managerLevel property value. Manager level, between 1 and 4. The direct manager is 1.
     * @param value Value to set for the managerLevel property.
     */
    public void setManagerLevel(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("managerLevel", value);
    }
}
