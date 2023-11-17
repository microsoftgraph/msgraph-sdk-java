package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListItemVersion extends BaseItemVersion implements Parsable {
    /**
     * Instantiates a new ListItemVersion and sets the default values.
     */
    public ListItemVersion() {
        super();
        this.setOdataType("#microsoft.graph.listItemVersion");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListItemVersion
     */
    @jakarta.annotation.Nonnull
    public static ListItemVersion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.documentSetVersion": return new DocumentSetVersion();
            }
        }
        return new ListItemVersion();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fields", (n) -> { this.setFields(n.getObjectValue(FieldValueSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. A collection of the fields and values for this version of the list item.
     * @return a FieldValueSet
     */
    @jakarta.annotation.Nullable
    public FieldValueSet getFields() {
        return this.backingStore.get("fields");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fields", this.getFields());
    }
    /**
     * Sets the fields property value. A collection of the fields and values for this version of the list item.
     * @param value Value to set for the fields property.
     */
    public void setFields(@jakarta.annotation.Nullable final FieldValueSet value) {
        this.backingStore.set("fields", value);
    }
}
