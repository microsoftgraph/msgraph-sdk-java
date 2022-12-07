package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationFileResource extends EducationResource implements Parsable {
    /** Location on disk of the file resource. */
    private String _fileUrl;
    /**
     * Instantiates a new EducationFileResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationFileResource() {
        super();
        this.setOdataType("#microsoft.graph.educationFileResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationFileResource
     */
    @javax.annotation.Nonnull
    public static EducationFileResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationFileResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileUrl", (n) -> { this.setFileUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileUrl property value. Location on disk of the file resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileUrl() {
        return this._fileUrl;
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
     * Sets the fileUrl property value. Location on disk of the file resource.
     * @param value Value to set for the fileUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileUrl(@javax.annotation.Nullable final String value) {
        this._fileUrl = value;
    }
}
