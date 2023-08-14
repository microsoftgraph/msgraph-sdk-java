package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationPowerPointResource extends EducationResource implements Parsable {
    /**
     * Location of the file on disk.
     */
    private String fileUrl;
    /**
     * Instantiates a new educationPowerPointResource and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public EducationPowerPointResource() {
        super();
        this.setOdataType("#microsoft.graph.educationPowerPointResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationPowerPointResource
     */
    @jakarta.annotation.Nonnull
    public static EducationPowerPointResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationPowerPointResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileUrl", (n) -> { this.setFileUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileUrl property value. Location of the file on disk.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileUrl() {
        return this.fileUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fileUrl", this.getFileUrl());
    }
    /**
     * Sets the fileUrl property value. Location of the file on disk.
     * @param value Value to set for the fileUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileUrl(@jakarta.annotation.Nullable final String value) {
        this.fileUrl = value;
    }
}
