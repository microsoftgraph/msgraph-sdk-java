package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationMediaResource extends EducationResource implements Parsable {
    /** Location of the file on shared point folder. Required */
    private String _fileUrl;
    /**
     * Instantiates a new EducationMediaResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationMediaResource() {
        super();
        this.setOdataType("#microsoft.graph.educationMediaResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationMediaResource
     */
    @javax.annotation.Nonnull
    public static EducationMediaResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationMediaResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationMediaResource currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileUrl", (n) -> { currentObject.setFileUrl(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the fileUrl property value. Location of the file on shared point folder. Required
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
     * Sets the fileUrl property value. Location of the file on shared point folder. Required
     * @param value Value to set for the fileUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileUrl(@javax.annotation.Nullable final String value) {
        this._fileUrl = value;
    }
}
