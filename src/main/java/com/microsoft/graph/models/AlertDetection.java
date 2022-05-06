package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlertDetection implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The detectionType property  */
    private String _detectionType;
    /** The method property  */
    private String _method;
    /** The name property  */
    private String _name;
    /**
     * Instantiates a new alertDetection and sets the default values.
     * @return a void
     */
    public AlertDetection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertDetection
     */
    @javax.annotation.Nonnull
    public static AlertDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertDetection();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the detectionType property value. The detectionType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionType() {
        return this._detectionType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlertDetection currentObject = this;
        return new HashMap<>(3) {{
            this.put("detectionType", (n) -> { currentObject.setDetectionType(n.getStringValue()); });
            this.put("method", (n) -> { currentObject.setMethod(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the method property value. The method property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMethod() {
        return this._method;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("detectionType", this.getDetectionType());
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("name", this.getName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the detectionType property value. The detectionType property
     * @param value Value to set for the detectionType property.
     * @return a void
     */
    public void setDetectionType(@javax.annotation.Nullable final String value) {
        this._detectionType = value;
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     * @return a void
     */
    public void setMethod(@javax.annotation.Nullable final String value) {
        this._method = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
}
