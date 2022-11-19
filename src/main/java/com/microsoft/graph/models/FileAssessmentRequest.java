package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /** Base64 encoded file content. The file content cannot fetch back because it isn't stored. */
    private String _contentData;
    /** The file name. */
    private String _fileName;
    /**
     * Instantiates a new FileAssessmentRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public FileAssessmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.fileAssessmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileAssessmentRequest
     */
    @javax.annotation.Nonnull
    public static FileAssessmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAssessmentRequest();
    }
    /**
     * Gets the contentData property value. Base64 encoded file content. The file content cannot fetch back because it isn't stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentData() {
        return this._contentData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileAssessmentRequest currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentData", (n) -> { currentObject.setContentData(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the fileName property value. The file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
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
        writer.writeStringValue("contentData", this.getContentData());
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the contentData property value. Base64 encoded file content. The file content cannot fetch back because it isn't stored.
     * @param value Value to set for the contentData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentData(@javax.annotation.Nullable final String value) {
        this._contentData = value;
    }
    /**
     * Sets the fileName property value. The file name.
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
}
