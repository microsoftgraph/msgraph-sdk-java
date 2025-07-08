package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestrictAccessActionBase extends DlpActionInfo implements Parsable {
    /**
     * Instantiates a new {@link RestrictAccessActionBase} and sets the default values.
     */
    public RestrictAccessActionBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestrictAccessActionBase}
     */
    @jakarta.annotation.Nonnull
    public static RestrictAccessActionBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.restrictAccessAction": return new RestrictAccessAction();
            }
        }
        return new RestrictAccessActionBase();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("restrictionAction", (n) -> { this.setRestrictionAction(n.getEnumValue(RestrictionAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the restrictionAction property value. Action for the app to take. The possible values are: warn, audit, block.
     * @return a {@link RestrictionAction}
     */
    @jakarta.annotation.Nullable
    public RestrictionAction getRestrictionAction() {
        return this.backingStore.get("restrictionAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("restrictionAction", this.getRestrictionAction());
    }
    /**
     * Sets the restrictionAction property value. Action for the app to take. The possible values are: warn, audit, block.
     * @param value Value to set for the restrictionAction property.
     */
    public void setRestrictionAction(@jakarta.annotation.Nullable final RestrictionAction value) {
        this.backingStore.set("restrictionAction", value);
    }
}
