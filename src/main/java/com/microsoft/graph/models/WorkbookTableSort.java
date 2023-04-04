package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookTableSort extends Entity implements Parsable {
    /** Represents the current conditions used to last sort the table. Read-only. */
    private java.util.List<WorkbookSortField> fields;
    /** Represents whether the casing impacted the last sort of the table. Read-only. */
    private Boolean matchCase;
    /** Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount. Read-only. */
    private String method;
    /**
     * Instantiates a new workbookTableSort and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookTableSort() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookTableSort
     */
    @javax.annotation.Nonnull
    public static WorkbookTableSort createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableSort();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfObjectValues(WorkbookSortField::createFromDiscriminatorValue)); });
        deserializerMap.put("matchCase", (n) -> { this.setMatchCase(n.getBooleanValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. Represents the current conditions used to last sort the table. Read-only.
     * @return a workbookSortField
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookSortField> getFields() {
        return this.fields;
    }
    /**
     * Gets the matchCase property value. Represents whether the casing impacted the last sort of the table. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMatchCase() {
        return this.matchCase;
    }
    /**
     * Gets the method property value. Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethod() {
        return this.method;
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
        writer.writeCollectionOfObjectValues("fields", this.getFields());
        writer.writeBooleanValue("matchCase", this.getMatchCase());
        writer.writeStringValue("method", this.getMethod());
    }
    /**
     * Sets the fields property value. Represents the current conditions used to last sort the table. Read-only.
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final java.util.List<WorkbookSortField> value) {
        this.fields = value;
    }
    /**
     * Sets the matchCase property value. Represents whether the casing impacted the last sort of the table. Read-only.
     * @param value Value to set for the matchCase property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchCase(@javax.annotation.Nullable final Boolean value) {
        this.matchCase = value;
    }
    /**
     * Sets the method property value. Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount. Read-only.
     * @param value Value to set for the method property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethod(@javax.annotation.Nullable final String value) {
        this.method = value;
    }
}
