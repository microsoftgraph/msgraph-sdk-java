package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationExcelResource extends EducationResource implements Parsable {
    /**
     * Pointer to the Excel file object.
     */
    private String fileUrl;
    /**
     * Instantiates a new EducationExcelResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationExcelResource() {
        super();
        this.setOdataType("#microsoft.graph.educationExcelResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationExcelResource
     */
    @javax.annotation.Nonnull
    public static EducationExcelResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationExcelResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileUrl", (n) -> { this.setFileUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileUrl property value. Pointer to the Excel file object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileUrl() {
        return this.fileUrl;
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
        writer.writeStringValue("fileUrl", this.getFileUrl());
    }
    /**
     * Sets the fileUrl property value. Pointer to the Excel file object.
     * @param value Value to set for the fileUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileUrl(@javax.annotation.Nullable final String value) {
        this.fileUrl = value;
    }
}
