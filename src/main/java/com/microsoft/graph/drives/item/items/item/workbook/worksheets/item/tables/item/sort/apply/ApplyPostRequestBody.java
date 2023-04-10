package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.sort.apply;

import com.microsoft.graph.models.WorkbookSortField;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplyPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The fields property */
    private java.util.List<WorkbookSortField> fields;
    /** The matchCase property */
    private Boolean matchCase;
    /** The method property */
    private String method;
    /**
     * Instantiates a new applyPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applyPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ApplyPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplyPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("fields", (n) -> { this.setFields(n.getCollectionOfObjectValues(WorkbookSortField::createFromDiscriminatorValue)); });
        deserializerMap.put("matchCase", (n) -> { this.setMatchCase(n.getBooleanValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fields property value. The fields property
     * @return a workbookSortField
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookSortField> getFields() {
        return this.fields;
    }
    /**
     * Gets the matchCase property value. The matchCase property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMatchCase() {
        return this.matchCase;
    }
    /**
     * Gets the method property value. The method property
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
        writer.writeCollectionOfObjectValues("fields", this.getFields());
        writer.writeBooleanValue("matchCase", this.getMatchCase());
        writer.writeStringValue("method", this.getMethod());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the fields property value. The fields property
     * @param value Value to set for the fields property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFields(@javax.annotation.Nullable final java.util.List<WorkbookSortField> value) {
        this.fields = value;
    }
    /**
     * Sets the matchCase property value. The matchCase property
     * @param value Value to set for the matchCase property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMatchCase(@javax.annotation.Nullable final Boolean value) {
        this.matchCase = value;
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethod(@javax.annotation.Nullable final String value) {
        this.method = value;
    }
}
