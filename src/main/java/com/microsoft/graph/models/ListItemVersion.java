package com.microsoft.graph.models;

import com.microsoft.graph.models.DocumentSetVersion;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListItemVersion extends BaseItemVersion implements Parsable {
    /** A collection of the fields and values for this version of the list item. */
    private FieldValueSet _fields;
    /**
     * Instantiates a new ListItemVersion and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static ListItemVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ListItemVersion currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fields", (n) -> { currentObject.setFields(n.getObjectValue(FieldValueSet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fields property value. A collection of the fields and values for this version of the list item.
     * @return a fieldValueSet
     */
    @javax.annotation.Nullable
    public FieldValueSet getFields() {
        return this._fields;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fields", this.getFields());
    }
    /**
     * Sets the fields property value. A collection of the fields and values for this version of the list item.
     * @param value Value to set for the fields property.
     * @return a void
     */
    public void setFields(@javax.annotation.Nullable final FieldValueSet value) {
        this._fields = value;
    }
}
