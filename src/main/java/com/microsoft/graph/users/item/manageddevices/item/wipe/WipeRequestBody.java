package microsoft.graph.users.item.manageddevices.item.wipe;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the wipe method. */
public class WipeRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The keepEnrollmentData property */
    private Boolean _keepEnrollmentData;
    /** The keepUserData property */
    private Boolean _keepUserData;
    /** The macOsUnlockCode property */
    private String _macOsUnlockCode;
    /** The persistEsimDataPlan property */
    private Boolean _persistEsimDataPlan;
    /**
     * Instantiates a new wipeRequestBody and sets the default values.
     * @return a void
     */
    public WipeRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipeRequestBody
     */
    @javax.annotation.Nonnull
    public static WipeRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipeRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WipeRequestBody currentObject = this;
        return new HashMap<>(4) {{
            this.put("keepEnrollmentData", (n) -> { currentObject.setKeepEnrollmentData(n.getBooleanValue()); });
            this.put("keepUserData", (n) -> { currentObject.setKeepUserData(n.getBooleanValue()); });
            this.put("macOsUnlockCode", (n) -> { currentObject.setMacOsUnlockCode(n.getStringValue()); });
            this.put("persistEsimDataPlan", (n) -> { currentObject.setPersistEsimDataPlan(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the keepEnrollmentData property value. The keepEnrollmentData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepEnrollmentData() {
        return this._keepEnrollmentData;
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepUserData() {
        return this._keepUserData;
    }
    /**
     * Gets the macOsUnlockCode property value. The macOsUnlockCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacOsUnlockCode() {
        return this._macOsUnlockCode;
    }
    /**
     * Gets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersistEsimDataPlan() {
        return this._persistEsimDataPlan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("keepEnrollmentData", this.getKeepEnrollmentData());
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeStringValue("macOsUnlockCode", this.getMacOsUnlockCode());
        writer.writeBooleanValue("persistEsimDataPlan", this.getPersistEsimDataPlan());
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
     * Sets the keepEnrollmentData property value. The keepEnrollmentData property
     * @param value Value to set for the keepEnrollmentData property.
     * @return a void
     */
    public void setKeepEnrollmentData(@javax.annotation.Nullable final Boolean value) {
        this._keepEnrollmentData = value;
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     * @return a void
     */
    public void setKeepUserData(@javax.annotation.Nullable final Boolean value) {
        this._keepUserData = value;
    }
    /**
     * Sets the macOsUnlockCode property value. The macOsUnlockCode property
     * @param value Value to set for the macOsUnlockCode property.
     * @return a void
     */
    public void setMacOsUnlockCode(@javax.annotation.Nullable final String value) {
        this._macOsUnlockCode = value;
    }
    /**
     * Sets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @param value Value to set for the persistEsimDataPlan property.
     * @return a void
     */
    public void setPersistEsimDataPlan(@javax.annotation.Nullable final Boolean value) {
        this._persistEsimDataPlan = value;
    }
}
