package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileAssessmentRequest extends ThreatAssessmentRequest implements Parsable {
    /**
     * Base64 encoded file content. The file content cannot fetch back because it isn't stored.
     */
    private String contentData;
    /**
     * The file name.
     */
    private String fileName;
    /**
     * Instantiates a new fileAssessmentRequest and sets the default values.
     */
    public FileAssessmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.fileAssessmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileAssessmentRequest
     */
    @jakarta.annotation.Nonnull
    public static FileAssessmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileAssessmentRequest();
    }
    /**
     * Gets the contentData property value. Base64 encoded file content. The file content cannot fetch back because it isn't stored.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentData() {
        return this.contentData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contentData", (n) -> { this.setContentData(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. The file name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentData", this.getContentData());
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the contentData property value. Base64 encoded file content. The file content cannot fetch back because it isn't stored.
     * @param value Value to set for the contentData property.
     */
    public void setContentData(@jakarta.annotation.Nullable final String value) {
        this.contentData = value;
    }
    /**
     * Sets the fileName property value. The file name.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
}
