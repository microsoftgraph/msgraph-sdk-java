package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookTableColumn extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookTableColumn} and sets the default values.
     */
    public WorkbookTableColumn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookTableColumn}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookTableColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableColumn();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("filter", (n) -> { this.setFilter(n.getObjectValue(WorkbookFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filter property value. Retrieve the filter applied to the column. Read-only.
     * @return a {@link WorkbookFilter}
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter getFilter() {
        return this.backingStore.get("filter");
    }
    /**
     * Gets the index property value. Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the name property value. Returns the name of the table column.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("filter", this.getFilter());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("values", this.getValues());
    }
    /**
     * Sets the filter property value. Retrieve the filter applied to the column. Read-only.
     * @param value Value to set for the filter property.
     */
    public void setFilter(@jakarta.annotation.Nullable final WorkbookFilter value) {
        this.backingStore.set("filter", value);
    }
    /**
     * Sets the index property value. Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("index", value);
    }
    /**
     * Sets the name property value. Returns the name of the table column.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("values", value);
    }
}
