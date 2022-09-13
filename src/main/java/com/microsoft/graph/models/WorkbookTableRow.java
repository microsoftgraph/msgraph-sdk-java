package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class WorkbookTableRow extends Entity implements Parsable {
    /** Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only. */
    private Integer _index;
    /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
    private Json _values;
    /**
     * Instantiates a new workbookTableRow and sets the default values.
     * @return a void
     */
    public WorkbookTableRow() {
        super();
        this.setOdataType("#microsoft.graph.workbookTableRow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookTableRow
     */
    @javax.annotation.Nonnull
    public static WorkbookTableRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableRow();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookTableRow currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("index", (n) -> { currentObject.setIndex(n.getIntegerValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the index property value. Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return this._index;
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeObjectValue("values", this.getValues());
    }
    /**
     * Sets the index property value. Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
     * @param value Value to set for the index property.
     * @return a void
     */
    public void setIndex(@javax.annotation.Nullable final Integer value) {
        this._index = value;
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final Json value) {
        this._values = value;
    }
}
