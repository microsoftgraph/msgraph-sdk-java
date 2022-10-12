package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListItemVersion extends BaseItemVersion implements Parsable {
    /** The fields property */
    private FieldValueSet _fields;
    /**
     * Instantiates a new listItemVersion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ListItemVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a listItemVersion
     */
    @javax.annotation.Nonnull
    public static ListItemVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
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
     * Gets the fields property value. The fields property
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fields", this.getFields());
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final FieldValueSet value) {
        this._fields = value;
    }
}
